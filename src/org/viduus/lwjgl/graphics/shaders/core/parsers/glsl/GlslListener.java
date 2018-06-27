// Generated from org/viduus/lwjgl/graphics/shaders/parsers/glsl/Glsl.g4 by ANTLR 4.6

package org.viduus.lwjgl.graphics.shaders.core.parsers.glsl;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GlslParser}.
 */
public interface GlslListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GlslParser#glsl}.
	 * @param ctx the parse tree
	 */
	void enterGlsl(GlslParser.GlslContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#glsl}.
	 * @param ctx the parse tree
	 */
	void exitGlsl(GlslParser.GlslContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#top_statement}.
	 * @param ctx the parse tree
	 */
	void enterTop_statement(GlslParser.Top_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#top_statement}.
	 * @param ctx the parse tree
	 */
	void exitTop_statement(GlslParser.Top_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#version_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVersion_declaration(GlslParser.Version_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#version_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVersion_declaration(GlslParser.Version_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#variable_identifier}.
	 * @param ctx the parse tree
	 */
	void enterVariable_identifier(GlslParser.Variable_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#variable_identifier}.
	 * @param ctx the parse tree
	 */
	void exitVariable_identifier(GlslParser.Variable_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(GlslParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(GlslParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expression(GlslParser.Postfix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expression(GlslParser.Postfix_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#integer_expression}.
	 * @param ctx the parse tree
	 */
	void enterInteger_expression(GlslParser.Integer_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#integer_expression}.
	 * @param ctx the parse tree
	 */
	void exitInteger_expression(GlslParser.Integer_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(GlslParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(GlslParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#function_call_header_no_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_header_no_parameters(GlslParser.Function_call_header_no_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#function_call_header_no_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_header_no_parameters(GlslParser.Function_call_header_no_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#function_call_header_with_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_header_with_parameters(GlslParser.Function_call_header_with_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#function_call_header_with_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_header_with_parameters(GlslParser.Function_call_header_with_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#function_call_header}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_header(GlslParser.Function_call_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#function_call_header}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_header(GlslParser.Function_call_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#function_identifier}.
	 * @param ctx the parse tree
	 */
	void enterFunction_identifier(GlslParser.Function_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#function_identifier}.
	 * @param ctx the parse tree
	 */
	void exitFunction_identifier(GlslParser.Function_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(GlslParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(GlslParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(GlslParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(GlslParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(GlslParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(GlslParser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(GlslParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(GlslParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(GlslParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(GlslParser.Shift_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(GlslParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(GlslParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(GlslParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(GlslParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(GlslParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(GlslParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_or_expression(GlslParser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_or_expression(GlslParser.Exclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_or_expression(GlslParser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_or_expression(GlslParser.Inclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(GlslParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(GlslParser.Logical_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#logical_xor_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_xor_expression(GlslParser.Logical_xor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#logical_xor_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_xor_expression(GlslParser.Logical_xor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_expression(GlslParser.Logical_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_expression(GlslParser.Logical_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(GlslParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(GlslParser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(GlslParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(GlslParser.Assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(GlslParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(GlslParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GlslParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GlslParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(GlslParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(GlslParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GlslParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GlslParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(GlslParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(GlslParser.Identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#function_prototype}.
	 * @param ctx the parse tree
	 */
	void enterFunction_prototype(GlslParser.Function_prototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#function_prototype}.
	 * @param ctx the parse tree
	 */
	void exitFunction_prototype(GlslParser.Function_prototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#function_declarator}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declarator(GlslParser.Function_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#function_declarator}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declarator(GlslParser.Function_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#function_header_with_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_header_with_parameters(GlslParser.Function_header_with_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#function_header_with_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_header_with_parameters(GlslParser.Function_header_with_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#function_header}.
	 * @param ctx the parse tree
	 */
	void enterFunction_header(GlslParser.Function_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#function_header}.
	 * @param ctx the parse tree
	 */
	void exitFunction_header(GlslParser.Function_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#parameter_declarator}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declarator(GlslParser.Parameter_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#parameter_declarator}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declarator(GlslParser.Parameter_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(GlslParser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(GlslParser.Parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#parameter_type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterParameter_type_specifier(GlslParser.Parameter_type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#parameter_type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitParameter_type_specifier(GlslParser.Parameter_type_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator_list(GlslParser.Init_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator_list(GlslParser.Init_declarator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#single_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingle_declaration(GlslParser.Single_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#single_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingle_declaration(GlslParser.Single_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#fully_specified_type}.
	 * @param ctx the parse tree
	 */
	void enterFully_specified_type(GlslParser.Fully_specified_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#fully_specified_type}.
	 * @param ctx the parse tree
	 */
	void exitFully_specified_type(GlslParser.Fully_specified_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#invariant_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterInvariant_qualifier(GlslParser.Invariant_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#invariant_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitInvariant_qualifier(GlslParser.Invariant_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#interpolation_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation_qualifier(GlslParser.Interpolation_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#interpolation_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation_qualifier(GlslParser.Interpolation_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#layout_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterLayout_qualifier(GlslParser.Layout_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#layout_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitLayout_qualifier(GlslParser.Layout_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#layout_qualifier_id_list}.
	 * @param ctx the parse tree
	 */
	void enterLayout_qualifier_id_list(GlslParser.Layout_qualifier_id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#layout_qualifier_id_list}.
	 * @param ctx the parse tree
	 */
	void exitLayout_qualifier_id_list(GlslParser.Layout_qualifier_id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#layout_qualifier_id}.
	 * @param ctx the parse tree
	 */
	void enterLayout_qualifier_id(GlslParser.Layout_qualifier_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#layout_qualifier_id}.
	 * @param ctx the parse tree
	 */
	void exitLayout_qualifier_id(GlslParser.Layout_qualifier_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#precise_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterPrecise_qualifier(GlslParser.Precise_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#precise_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitPrecise_qualifier(GlslParser.Precise_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterType_qualifier(GlslParser.Type_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitType_qualifier(GlslParser.Type_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#single_type_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterSingle_type_qualifier(GlslParser.Single_type_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#single_type_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitSingle_type_qualifier(GlslParser.Single_type_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#storage_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterStorage_qualifier(GlslParser.Storage_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#storage_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitStorage_qualifier(GlslParser.Storage_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#type_name_list}.
	 * @param ctx the parse tree
	 */
	void enterType_name_list(GlslParser.Type_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#type_name_list}.
	 * @param ctx the parse tree
	 */
	void exitType_name_list(GlslParser.Type_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(GlslParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(GlslParser.Type_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#array_specifier}.
	 * @param ctx the parse tree
	 */
	void enterArray_specifier(GlslParser.Array_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#array_specifier}.
	 * @param ctx the parse tree
	 */
	void exitArray_specifier(GlslParser.Array_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#type_specifier_nonarray}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier_nonarray(GlslParser.Type_specifier_nonarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#type_specifier_nonarray}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier_nonarray(GlslParser.Type_specifier_nonarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#precision_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterPrecision_qualifier(GlslParser.Precision_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#precision_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitPrecision_qualifier(GlslParser.Precision_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#struct_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStruct_specifier(GlslParser.Struct_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#struct_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStruct_specifier(GlslParser.Struct_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#struct_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration_list(GlslParser.Struct_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#struct_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration_list(GlslParser.Struct_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(GlslParser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(GlslParser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declarator_list(GlslParser.Struct_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declarator_list(GlslParser.Struct_declarator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#struct_declarator}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declarator(GlslParser.Struct_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#struct_declarator}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declarator(GlslParser.Struct_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(GlslParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(GlslParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_list(GlslParser.Initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_list(GlslParser.Initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statement(GlslParser.Declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statement(GlslParser.Declaration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GlslParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GlslParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_statement(GlslParser.Simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_statement(GlslParser.Simple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(GlslParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(GlslParser.Compound_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#statement_no_new_scope}.
	 * @param ctx the parse tree
	 */
	void enterStatement_no_new_scope(GlslParser.Statement_no_new_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#statement_no_new_scope}.
	 * @param ctx the parse tree
	 */
	void exitStatement_no_new_scope(GlslParser.Statement_no_new_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#compound_statement_no_new_scope}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement_no_new_scope(GlslParser.Compound_statement_no_new_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#compound_statement_no_new_scope}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement_no_new_scope(GlslParser.Compound_statement_no_new_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(GlslParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(GlslParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(GlslParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(GlslParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(GlslParser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(GlslParser.Selection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#selection_rest_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_rest_statement(GlslParser.Selection_rest_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#selection_rest_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_rest_statement(GlslParser.Selection_rest_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(GlslParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(GlslParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(GlslParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(GlslParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#switch_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement_list(GlslParser.Switch_statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#switch_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement_list(GlslParser.Switch_statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#case_label}.
	 * @param ctx the parse tree
	 */
	void enterCase_label(GlslParser.Case_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#case_label}.
	 * @param ctx the parse tree
	 */
	void exitCase_label(GlslParser.Case_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement(GlslParser.Iteration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement(GlslParser.Iteration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#for_init_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_init_statement(GlslParser.For_init_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#for_init_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_init_statement(GlslParser.For_init_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#conditionopt}.
	 * @param ctx the parse tree
	 */
	void enterConditionopt(GlslParser.ConditionoptContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#conditionopt}.
	 * @param ctx the parse tree
	 */
	void exitConditionopt(GlslParser.ConditionoptContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#for_rest_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_rest_statement(GlslParser.For_rest_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#for_rest_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_rest_statement(GlslParser.For_rest_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(GlslParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(GlslParser.Jump_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_unit(GlslParser.Translation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_unit(GlslParser.Translation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExternal_declaration(GlslParser.External_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExternal_declaration(GlslParser.External_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlslParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(GlslParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlslParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(GlslParser.Function_definitionContext ctx);
}