/**
 * Copyright 2018 Viduus Entertainment LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Created on Jun 24, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.core.parsers.glsl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.viduus.lwjgl.graphics.shaders.core.ShaderType;
import org.viduus.lwjgl.graphics.shaders.core.parsers.ParserException;
import org.viduus.lwjgl.graphics.shaders.core.parsers.Processor;
import org.viduus.lwjgl.graphics.shaders.core.parsers.ProcessorContext;
import org.viduus.lwjgl.graphics.shaders.core.parsers.ProcessorMode;
import org.viduus.lwjgl.graphics.shaders.core.parsers.Variable;
import org.viduus.lwjgl.graphics.shaders.core.parsers.VariableUseFlag;
import org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.GlslContext;

/**
 * @author ethan
 *
 */
public class GlslProcessor extends Processor implements ParseTreeListener {

	/**
	 * A variable we are constructing.
	 */
	private Variable var = new Variable();
	
	private final ProcessorContext context = new ProcessorContext();
	private final ShaderType type;
	
	/**
	 * Processes the given source file as a GLSL file.
	 * 
	 * @param source_file
	 * @return
	 */
	public GlslProcessor(File source_file, ShaderType type) {
		this.type = type;
		
		// read the file
		try (InputStream source_stream = new FileInputStream(source_file)) {
			ByteArrayOutputStream result = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			int length;
			while ((length = source_stream.read(buffer)) != -1) {
			    result.write(buffer, 0, length);
			}
			source = result.toString(StandardCharsets.UTF_8.name());
			source_stream.close();
			
			// being parsing the file
			GlslLexer lexer = new GlslLexer(new ANTLRInputStream(source));
			GlslParser parser = new GlslParser(new CommonTokenStream(lexer));

			// process the file
			ParseTreeWalker walker = new ParseTreeWalker();
			GlslContext context = parser.glsl();
			walker.walk(this, context);
			exists = true;
			
		} catch (FileNotFoundException e) {
			// do nothing
			
		} catch (IOException e) {
			throw new ParserException(e);
		}
	}
	
	/**
	 * 
	 */
	private void finalizeContext() {
		switch (context.mode) {
		case DECLARATION:
			var.value = context.curr_obj;
			symbol_table.set(var);
			var = new Variable(var);
			var.name = null;
			break;
			
		// fall through case
		default:
			break;
		}
	}
	
	private void resetContext() {
		finalizeContext();
		var = new Variable();
	}
	
	private void handleExpression() {
		// TODO implement expression evaluation
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
			
		// fall through case
		default:
			break;
		}
		
		// handle the read value
		switch (context.mode) {
		case EXPRESSION:
			handleExpression();
			break;
			
		// fall through case
		default:
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
			
		// fall through case
		default:
			break;
		}
	}
	
	private void handleVaraibleUseSpecifier() {
		switch (context.type) {
		case GlslParser.IN:
			if (type == ShaderType.VERTEX) {
				var.usage_flag = VariableUseFlag.ATTRIBUTE;
			}
			break;
		case GlslParser.UNIFORM:
			var.usage_flag = VariableUseFlag.UNIFORM;
			break;
			
		// fall through case
		default:
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
		case GlslParser.FLOAT:
		case GlslParser.DOUBLE:
		case GlslParser.INT:
		case GlslParser.UINT:
		case GlslParser.BOOL:
		case GlslParser.VEC2:
		case GlslParser.VEC3:
		case GlslParser.VEC4:
		case GlslParser.DVEC2:
		case GlslParser.DVEC3:
		case GlslParser.DVEC4:
		case GlslParser.BVEC2:
		case GlslParser.BVEC3:
		case GlslParser.BVEC4:
		case GlslParser.IVEC2:
		case GlslParser.IVEC3:
		case GlslParser.IVEC4:
		case GlslParser.UVEC2:
		case GlslParser.UVEC3:
		case GlslParser.UVEC4:
		case GlslParser.MAT2:
		case GlslParser.MAT3:
		case GlslParser.MAT4:
		case GlslParser.MAT2X2:
		case GlslParser.MAT2X3:
		case GlslParser.MAT2X4:
		case GlslParser.MAT3X2:
		case GlslParser.MAT3X3:
		case GlslParser.MAT3X4:
		case GlslParser.MAT4X2:
		case GlslParser.MAT4X3:
		case GlslParser.MAT4X4:
		case GlslParser.DMAT2:
		case GlslParser.DMAT3:
		case GlslParser.DMAT4:
		case GlslParser.DMAT2X2:
		case GlslParser.DMAT2X3:
		case GlslParser.DMAT2X4:
		case GlslParser.DMAT3X2:
		case GlslParser.DMAT3X3:
		case GlslParser.DMAT3X4:
		case GlslParser.DMAT4X2:
		case GlslParser.DMAT4X3:
		case GlslParser.DMAT4X4:
		case GlslParser.ATOMIC_UINT:
		case GlslParser.SAMPLER1D:
		case GlslParser.SAMPLER2D:
		case GlslParser.SAMPLER3D:
		case GlslParser.SAMPLERCUBE:
		case GlslParser.SAMPLER1DSHADOW:
		case GlslParser.SAMPLER2DSHADOW:
		case GlslParser.SAMPLERCUBESHADOW:
		case GlslParser.SAMPLER1DARRAY:
		case GlslParser.SAMPLER2DARRAY:
		case GlslParser.SAMPLER1DARRAYSHADOW:
		case GlslParser.SAMPLER2DARRAYSHADOW:
		case GlslParser.SAMPLERCUBEARRAY:
		case GlslParser.SAMPLERCUBEARRAYSHADOW:
		case GlslParser.ISAMPLER1D:
		case GlslParser.ISAMPLER2D:
		case GlslParser.ISAMPLER3D:
		case GlslParser.ISAMPLERCUBE:
		case GlslParser.ISAMPLER1DARRAY:
		case GlslParser.ISAMPLER2DARRAY:
		case GlslParser.ISAMPLERCUBEARRAY:
		case GlslParser.USAMPLER1D:
		case GlslParser.USAMPLER2D:
		case GlslParser.USAMPLER3D:
		case GlslParser.USAMPLERCUBE:
		case GlslParser.USAMPLER1DARRAY:
		case GlslParser.USAMPLER2DARRAY:
		case GlslParser.USAMPLERCUBEARRAY:
		case GlslParser.SAMPLER2DRECT:
		case GlslParser.SAMPLER2DRECTSHADOW:
		case GlslParser.ISAMPLER2DRECT:
		case GlslParser.USAMPLER2DRECT:
		case GlslParser.SAMPLERBUFFER:
		case GlslParser.ISAMPLERBUFFER:
		case GlslParser.USAMPLERBUFFER:
		case GlslParser.SAMPLER2DMS:
		case GlslParser.ISAMPLER2DMS:
		case GlslParser.USAMPLER2DMS:
		case GlslParser.SAMPLER2DMSARRAY:
		case GlslParser.ISAMPLER2DMSARRAY:
		case GlslParser.USAMPLER2DMSARRAY:
		case GlslParser.IMAGE1D:
		case GlslParser.IIMAGE1D:
		case GlslParser.UIMAGE1D:
		case GlslParser.IMAGE2D:
		case GlslParser.IIMAGE2D:
		case GlslParser.UIMAGE2D:
		case GlslParser.IMAGE3D:
		case GlslParser.IIMAGE3D:
		case GlslParser.UIMAGE3D:
		case GlslParser.IMAGE2DRECT:
		case GlslParser.IIMAGE2DRECT:
		case GlslParser.UIMAGE2DRECT:
		case GlslParser.IMAGECUBE:
		case GlslParser.IIMAGECUBE:
		case GlslParser.UIMAGECUBE:
		case GlslParser.IMAGEBUFFER:
		case GlslParser.IIMAGEBUFFER:
		case GlslParser.UIMAGEBUFFER:
		case GlslParser.IMAGE1DARRAY:
		case GlslParser.IIMAGE1DARRAY:
		case GlslParser.UIMAGE1DARRAY:
		case GlslParser.IMAGE2DARRAY:
		case GlslParser.IIMAGE2DARRAY:
		case GlslParser.UIMAGE2DARRAY:
		case GlslParser.IMAGECUBEARRAY:
		case GlslParser.IIMAGECUBEARRAY:
		case GlslParser.UIMAGECUBEARRAY:
		case GlslParser.IMAGE2DMS:
		case GlslParser.IIMAGE2DMS:
		case GlslParser.UIMAGE2DMS:
		case GlslParser.IMAGE2DMSARRAY:
		case GlslParser.IIMAGE2DMSARRAY:
		case GlslParser.UIMAGE2DMSARRAY:
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
		
		// reset parser on variable delimiter
		case GlslParser.COMMA:
			finalizeContext();
			break;
		case GlslParser.SEMICOLON:
			resetContext();
			break;
			
		// fall through case
		default:
			break;
		}
	}

	/* (non-Javadoc)
	 * @see org.antlr.v4.runtime.tree.ParseTreeListener#visitErrorNode(org.antlr.v4.runtime.tree.ErrorNode)
	 */
	@Override
	public void visitErrorNode(ErrorNode node) {
		// do nothing
	}

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
			
		// fall through case
		default:
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
			
		// fall through case
		default:
			break;
		}
	}

}
