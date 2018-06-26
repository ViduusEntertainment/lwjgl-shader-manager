/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jun 24, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.parsers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.viduus.lwjgl.graphics.shaders.parsers.glsl.GlslParser;

/**
 * @author ethan
 *
 */
public class Processor implements ParseTreeListener {

	/**
	 * A variable we are constructing.
	 */
	private Variable var = new Variable();
	
	public SymbolTable symbol_table = new SymbolTable();
	private ProcessorContext context = new ProcessorContext();
	
	/**
	 * 
	 */
	private void finalizeContext() {
		switch (context.mode) {
		case DECLARATION:
			var.value = context.curr_obj;
			symbol_table.set(var);
			System.out.println(var);
			break;
		}
		var = new Variable();
	}
	
	private void handleExpression() {
		
	}
	
	/**
	 * 
	 */
	private void handleConstant() {
		// process the text literal
		switch (context.type) {
		case GlslParser.BOOLCONSTANT:
			context.isBoolean();
			break;
		case GlslParser.INTCONSTANT:
			context.isInteger();
			break;
		case GlslParser.UINTCONSTANT:
			context.isUnsignedInteger();
			break;
		case GlslParser.FLOATCONSTANT:
			context.isFloat();
			break;
		case GlslParser.DOUBLECONSTANT:
			context.isDouble();
			break;
		}
		
		// handle the read value
		switch (context.mode) {
		case EXPRESSION:
			handleExpression();
			break;
		}
	}

	private void handleType() {
		var.type = context.type;
	}
	
	private void handleIdentifier() {
		switch (context.mode) {
		case DECLARATION:
			var.name = context.text;
			break;
		case EXPRESSION:
			handleExpression();
			break;
		}
	}
	
	private void handleVaraibleUseSpecifier() {
		switch (context.type) {
		case GlslParser.IN:
			var.usage_flag = VariableUseFlag.ATTRIBUTE;
			break;
		case GlslParser.UNIFORM:
			var.usage_flag = VariableUseFlag.UNIFORM;
			break;
		}
	}
	
	/* (non-Javadoc)
	 * @see org.antlr.v4.runtime.tree.ParseTreeListener#visitTerminal(org.antlr.v4.runtime.tree.TerminalNode)
	 */
	@Override
	public void visitTerminal(TerminalNode node) {
		// do not process if disabled
		if (context.mode == ProcessorMode.DISABLED)
			return;
		
		context.update(node);
		
		System.out.printf("%d - %s%n", context.type, context.text);
		
		switch (context.type) {
		// start of attribute variable
		case GlslParser.IN:
		case GlslParser.UNIFORM:
			handleVaraibleUseSpecifier();
			break;
		
		// start of layout definition
		case GlslParser.LAYOUT:
			break;
		
		// check for type
		case GlslParser.BOOL:
		case GlslParser.INT:
		case GlslParser.MAT4:
		case GlslParser.FLOAT:
		case GlslParser.VEC3:
		case GlslParser.VEC2:
			handleType();
			break;
		
		// keep track of active identifier
		case GlslParser.IDENTIFIER:
			handleIdentifier();
			break;
		
		// check for value
		case GlslParser.BOOLCONSTANT:
		case GlslParser.INTCONSTANT:
		case GlslParser.UINTCONSTANT:
		case GlslParser.FLOATCONSTANT:
		case GlslParser.DOUBLECONSTANT:
			handleConstant();
			break;
			
		case GlslParser.LEFT_BRACE:
			break;
			
		case GlslParser.RIGHT_BRACE:
			break;
		
		// reset parser on variable delimiter
		case GlslParser.SEMICOLON:
		case GlslParser.COMMA:
			finalizeContext();
			break;
		}
	}

	/* (non-Javadoc)
	 * @see org.antlr.v4.runtime.tree.ParseTreeListener#visitErrorNode(org.antlr.v4.runtime.tree.ErrorNode)
	 */
	@Override
	public void visitErrorNode(ErrorNode node) {}

	/* (non-Javadoc)
	 * @see org.antlr.v4.runtime.tree.ParseTreeListener#enterEveryRule(org.antlr.v4.runtime.ParserRuleContext)
	 */
	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		switch (ctx.getRuleIndex()) {
		case GlslParser.RULE_function_definition:
			context.pushMode(ProcessorMode.DISABLED);
			break;
		case GlslParser.RULE_declaration:
			context.pushMode(ProcessorMode.DECLARATION);
			break;
		case GlslParser.RULE_expression:
		case GlslParser.RULE_conditional_expression:
			context.pushMode(ProcessorMode.EXPRESSION);
			break;
		}
	}

	/* (non-Javadoc)
	 * @see org.antlr.v4.runtime.tree.ParseTreeListener#exitEveryRule(org.antlr.v4.runtime.ParserRuleContext)
	 */
	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		switch (ctx.getRuleIndex()) {
		// rules that exit the current processor mode
		case GlslParser.RULE_function_definition:
		case GlslParser.RULE_declaration:
		case GlslParser.RULE_expression:
		case GlslParser.RULE_conditional_expression:
			context.popMode();
			break;
		// finished parsing expression
		case GlslParser.RULE_primary_expression:
			// evaluate the arithmetic stack
			break;
		}
	}

}
