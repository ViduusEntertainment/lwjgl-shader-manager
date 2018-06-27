// Generated from org/viduus/lwjgl/graphics/shaders/parsers/glsl/Glsl.g4 by ANTLR 4.6

package org.viduus.lwjgl.graphics.shaders.core.parsers.glsl;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GlslParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LEFT_PAREN=1, RIGHT_PAREN=2, LEFT_BRACKET=3, RIGHT_BRACKET=4, LEFT_BRACE=5, 
		RIGHT_BRACE=6, DOT=7, COMMA=8, COLON=9, SEMICOLON=10, FIELD_SELECTION=11, 
		VERSION=12, DEFINE=13, INVARIANT=14, PRECISE=15, HIGH_PRECISION=16, MEDIUM_PRECISION=17, 
		LOW_PRECISION=18, PRECISION=19, STRUCT=20, VOID=21, WHILE=22, CARET=23, 
		QUESTION=24, CONST=25, BOOL=26, FLOAT=27, DOUBLE=28, INT=29, UINT=30, 
		BREAK=31, CONTINUE=32, DO=33, ELSE=34, FOR=35, IF=36, DISCARD=37, RETURN=38, 
		SWITCH=39, CASE=40, DEFAULT=41, SUBROUTINE=42, BVEC2=43, BVEC3=44, BVEC4=45, 
		IVEC2=46, IVEC3=47, IVEC4=48, UVEC2=49, UVEC3=50, UVEC4=51, VEC2=52, VEC3=53, 
		VEC4=54, MAT2=55, MAT3=56, MAT4=57, CENTROID=58, IN=59, OUT=60, INOUT=61, 
		UNIFORM=62, PATCH=63, SAMPLE=64, BUFFER=65, SHARED=66, COHERENT=67, VOLATILE=68, 
		RESTRICT=69, READONLY=70, WRITEONLY=71, DVEC2=72, DVEC3=73, DVEC4=74, 
		DMAT2=75, DMAT3=76, DMAT4=77, NOPERSPECTIVE=78, FLAT=79, SMOOTH=80, LAYOUT=81, 
		MAT2X2=82, MAT2X3=83, MAT2X4=84, MAT3X2=85, MAT3X3=86, MAT3X4=87, MAT4X2=88, 
		MAT4X3=89, MAT4X4=90, DMAT2X2=91, DMAT2X3=92, DMAT2X4=93, DMAT3X2=94, 
		DMAT3X3=95, DMAT3X4=96, DMAT4X2=97, DMAT4X3=98, DMAT4X4=99, ATOMIC_UINT=100, 
		SAMPLER1D=101, SAMPLER2D=102, SAMPLER3D=103, SAMPLERCUBE=104, SAMPLER1DSHADOW=105, 
		SAMPLER2DSHADOW=106, SAMPLERCUBESHADOW=107, SAMPLER1DARRAY=108, SAMPLER2DARRAY=109, 
		SAMPLER1DARRAYSHADOW=110, SAMPLER2DARRAYSHADOW=111, ISAMPLER1D=112, ISAMPLER2D=113, 
		ISAMPLER3D=114, ISAMPLERCUBE=115, ISAMPLER1DARRAY=116, ISAMPLER2DARRAY=117, 
		USAMPLER1D=118, USAMPLER2D=119, USAMPLER3D=120, USAMPLERCUBE=121, USAMPLER1DARRAY=122, 
		USAMPLER2DARRAY=123, SAMPLER2DRECT=124, SAMPLER2DRECTSHADOW=125, ISAMPLER2DRECT=126, 
		USAMPLER2DRECT=127, SAMPLERBUFFER=128, ISAMPLERBUFFER=129, USAMPLERBUFFER=130, 
		SAMPLERCUBEARRAY=131, SAMPLERCUBEARRAYSHADOW=132, ISAMPLERCUBEARRAY=133, 
		USAMPLERCUBEARRAY=134, SAMPLER2DMS=135, ISAMPLER2DMS=136, USAMPLER2DMS=137, 
		SAMPLER2DMSARRAY=138, ISAMPLER2DMSARRAY=139, USAMPLER2DMSARRAY=140, IMAGE1D=141, 
		IIMAGE1D=142, UIMAGE1D=143, IMAGE2D=144, IIMAGE2D=145, UIMAGE2D=146, IMAGE3D=147, 
		IIMAGE3D=148, UIMAGE3D=149, IMAGE2DRECT=150, IIMAGE2DRECT=151, UIMAGE2DRECT=152, 
		IMAGECUBE=153, IIMAGECUBE=154, UIMAGECUBE=155, IMAGEBUFFER=156, IIMAGEBUFFER=157, 
		UIMAGEBUFFER=158, IMAGE1DARRAY=159, IIMAGE1DARRAY=160, UIMAGE1DARRAY=161, 
		IMAGE2DARRAY=162, IIMAGE2DARRAY=163, UIMAGE2DARRAY=164, IMAGECUBEARRAY=165, 
		IIMAGECUBEARRAY=166, UIMAGECUBEARRAY=167, IMAGE2DMS=168, IIMAGE2DMS=169, 
		UIMAGE2DMS=170, IMAGE2DMSARRAY=171, IIMAGE2DMSARRAY=172, UIMAGE2DMSARRAY=173, 
		PLUS=174, DASH=175, STAR=176, SLASH=177, PERCENT=178, INC_OP=179, DEC_OP=180, 
		EQ_OP=181, NE_OP=182, RIGHT_ANGLE=183, LEFT_ANGLE=184, GE_OP=185, LE_OP=186, 
		AND_OP=187, OR_OP=188, BANG=189, AMPERSAND=190, VERTICAL_BAR=191, XOR_OP=192, 
		TILDE=193, LEFT_OP=194, RIGHT_OP=195, EQUAL=196, ADD_ASSIGN=197, SUB_ASSIGN=198, 
		MUL_ASSIGN=199, DIV_ASSIGN=200, MOD_ASSIGN=201, LEFT_ASSIGN=202, RIGHT_ASSIGN=203, 
		AND_ASSIGN=204, XOR_ASSIGN=205, OR_ASSIGN=206, FLOATCONSTANT=207, DOUBLECONSTANT=208, 
		INTCONSTANT=209, UINTCONSTANT=210, BOOLCONSTANT=211, IDENTIFIER=212, WS=213, 
		COMMENT=214, LINECOMMENT=215;
	public static final int
		RULE_glsl = 0, RULE_top_statement = 1, RULE_version_declaration = 2, RULE_variable_identifier = 3, 
		RULE_primary_expression = 4, RULE_postfix_expression = 5, RULE_integer_expression = 6, 
		RULE_function_call = 7, RULE_function_call_header_no_parameters = 8, RULE_function_call_header_with_parameters = 9, 
		RULE_function_call_header = 10, RULE_function_identifier = 11, RULE_unary_expression = 12, 
		RULE_unary_operator = 13, RULE_multiplicative_expression = 14, RULE_additive_expression = 15, 
		RULE_shift_expression = 16, RULE_relational_expression = 17, RULE_equality_expression = 18, 
		RULE_and_expression = 19, RULE_exclusive_or_expression = 20, RULE_inclusive_or_expression = 21, 
		RULE_logical_and_expression = 22, RULE_logical_xor_expression = 23, RULE_logical_or_expression = 24, 
		RULE_conditional_expression = 25, RULE_assignment_expression = 26, RULE_assignment_operator = 27, 
		RULE_expression = 28, RULE_constant_expression = 29, RULE_declaration = 30, 
		RULE_identifier_list = 31, RULE_function_prototype = 32, RULE_function_declarator = 33, 
		RULE_function_header_with_parameters = 34, RULE_function_header = 35, 
		RULE_parameter_declarator = 36, RULE_parameter_declaration = 37, RULE_parameter_type_specifier = 38, 
		RULE_init_declarator_list = 39, RULE_single_declaration = 40, RULE_fully_specified_type = 41, 
		RULE_invariant_qualifier = 42, RULE_interpolation_qualifier = 43, RULE_layout_qualifier = 44, 
		RULE_layout_qualifier_id_list = 45, RULE_layout_qualifier_id = 46, RULE_precise_qualifier = 47, 
		RULE_type_qualifier = 48, RULE_single_type_qualifier = 49, RULE_storage_qualifier = 50, 
		RULE_type_name_list = 51, RULE_type_specifier = 52, RULE_array_specifier = 53, 
		RULE_type_specifier_nonarray = 54, RULE_precision_qualifier = 55, RULE_struct_specifier = 56, 
		RULE_struct_declaration_list = 57, RULE_struct_declaration = 58, RULE_struct_declarator_list = 59, 
		RULE_struct_declarator = 60, RULE_initializer = 61, RULE_initializer_list = 62, 
		RULE_declaration_statement = 63, RULE_statement = 64, RULE_simple_statement = 65, 
		RULE_compound_statement = 66, RULE_statement_no_new_scope = 67, RULE_compound_statement_no_new_scope = 68, 
		RULE_statement_list = 69, RULE_expression_statement = 70, RULE_selection_statement = 71, 
		RULE_selection_rest_statement = 72, RULE_condition = 73, RULE_switch_statement = 74, 
		RULE_switch_statement_list = 75, RULE_case_label = 76, RULE_iteration_statement = 77, 
		RULE_for_init_statement = 78, RULE_conditionopt = 79, RULE_for_rest_statement = 80, 
		RULE_jump_statement = 81, RULE_translation_unit = 82, RULE_external_declaration = 83, 
		RULE_function_definition = 84;
	public static final String[] ruleNames = {
		"glsl", "top_statement", "version_declaration", "variable_identifier", 
		"primary_expression", "postfix_expression", "integer_expression", "function_call", 
		"function_call_header_no_parameters", "function_call_header_with_parameters", 
		"function_call_header", "function_identifier", "unary_expression", "unary_operator", 
		"multiplicative_expression", "additive_expression", "shift_expression", 
		"relational_expression", "equality_expression", "and_expression", "exclusive_or_expression", 
		"inclusive_or_expression", "logical_and_expression", "logical_xor_expression", 
		"logical_or_expression", "conditional_expression", "assignment_expression", 
		"assignment_operator", "expression", "constant_expression", "declaration", 
		"identifier_list", "function_prototype", "function_declarator", "function_header_with_parameters", 
		"function_header", "parameter_declarator", "parameter_declaration", "parameter_type_specifier", 
		"init_declarator_list", "single_declaration", "fully_specified_type", 
		"invariant_qualifier", "interpolation_qualifier", "layout_qualifier", 
		"layout_qualifier_id_list", "layout_qualifier_id", "precise_qualifier", 
		"type_qualifier", "single_type_qualifier", "storage_qualifier", "type_name_list", 
		"type_specifier", "array_specifier", "type_specifier_nonarray", "precision_qualifier", 
		"struct_specifier", "struct_declaration_list", "struct_declaration", "struct_declarator_list", 
		"struct_declarator", "initializer", "initializer_list", "declaration_statement", 
		"statement", "simple_statement", "compound_statement", "statement_no_new_scope", 
		"compound_statement_no_new_scope", "statement_list", "expression_statement", 
		"selection_statement", "selection_rest_statement", "condition", "switch_statement", 
		"switch_statement_list", "case_label", "iteration_statement", "for_init_statement", 
		"conditionopt", "for_rest_statement", "jump_statement", "translation_unit", 
		"external_declaration", "function_definition"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'['", "']'", "'{'", "'}'", null, "','", "':'", "';'", 
		null, "'#version'", "'#define'", "'invariant'", "'precise'", "'highp'", 
		"'mediump'", "'lowp'", "'precision'", "'struct'", "'void'", "'while'", 
		null, "'?'", "'const'", "'bool'", "'float'", "'double'", "'int'", "'uint'", 
		"'break'", "'continue'", "'do'", "'else'", "'for'", "'if'", "'discard'", 
		"'return'", "'switch'", "'case'", "'default'", "'subroutine'", "'bvec2'", 
		"'bvec3'", "'bvec4'", "'ivec2'", "'ivec3'", "'ivec4'", "'uvec2'", "'uvec3'", 
		"'uvec4'", "'vec2'", "'vec3'", "'vec4'", "'mat2'", "'mat3'", "'mat4'", 
		"'centroid'", "'in'", "'out'", "'inout'", "'uniform'", "'patch'", "'sample'", 
		"'buffer'", "'shared'", "'coherent'", "'volatile'", "'restrict'", "'readonly'", 
		"'writeonly'", "'dvec2'", "'dvec3'", "'dvec4'", "'dmat2'", "'dmat3'", 
		"'dmat4'", "'noperspective'", "'flat'", "'smooth'", "'layout'", "'mat2x2'", 
		"'mat2x3'", "'mat2x4'", "'mat3x2'", "'mat3x3'", "'mat3x4'", "'mat4x2'", 
		"'mat4x3'", "'mat4x4'", "'dmat2x2'", "'dmat2x3'", "'dmat2x4'", "'dmat3x2'", 
		"'dmat3x3'", "'dmat3x4'", "'dmat4x2'", "'dmat4x3'", "'dmat4x4'", "'atomic_unit'", 
		"'sampler1D'", "'sampler2D'", "'sampler3D'", "'samplerCube'", "'sampler1DShadow'", 
		"'sampler2DShadow'", "'samplerCubeShadow'", "'sampler1DArray'", "'sampler2DArray'", 
		"'sampler1DArrayShadow'", "'sampler2DArrayShadow'", "'isampelr1D'", "'isampler2D'", 
		"'isampler3D'", "'isamplerCube'", "'isampler1DArray'", "'isampler2DArray'", 
		"'usampler1D'", "'usampler2D'", "'usampler3D'", "'usamplerCube'", "'usampler1DArray'", 
		"'usampler2DArray'", "'sampler2DRect'", "'sampler2DRectShadow'", "'isampler2DRect'", 
		"'usampler2DRect'", "'samplerBuffer'", "'isamplerBuffer'", "'usamplerBuffer'", 
		"'samplerCubeArray'", "'samplerCubeArrayShadow'", "'isamplerCubeArray'", 
		"'usamplerCubeArray'", "'sampler2DMS'", "'isampler2DMS'", "'usampler2DMS'", 
		"'sampler2DMSArray'", "'isampler2DMSArray'", "'usamlper2DMSArray'", "'image1D'", 
		"'iimage1D'", "'uimage1D'", "'image2D'", "'iimage2D'", "'uimage2D'", "'image3D'", 
		"'iimage3D'", "'uimage3D'", "'image2DRect'", "'iimage2DRect'", "'uimage2DRect'", 
		"'imageCube'", "'iimageCube'", "'uimageCube'", "'imageBuffer'", "'iimageBuffer'", 
		"'uimageBuffer'", "'image1DArray'", "'iimage1DArray'", "'uimage1DArray'", 
		"'image2DArray'", "'iimage2DArray'", "'uimage2DArray'", "'imageCubeArray'", 
		"'iimageCubeArray'", "'uimageCubeArray'", "'image2DMS'", "'iimage2DMS'", 
		"'uimage2DMS'", "'image2DMSArray'", "'iimage2DMSArray'", "'uimage2DMSArray'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'=='", "'!='", "'>'", 
		"'<'", "'>='", "'<='", "'&&'", "'||'", "'!'", "'&'", "'|'", null, "'~'", 
		"'<<'", "'>>'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'<<='", 
		"'>>='", "'&='", "'^='", "'|='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_BRACE", 
		"RIGHT_BRACE", "DOT", "COMMA", "COLON", "SEMICOLON", "FIELD_SELECTION", 
		"VERSION", "DEFINE", "INVARIANT", "PRECISE", "HIGH_PRECISION", "MEDIUM_PRECISION", 
		"LOW_PRECISION", "PRECISION", "STRUCT", "VOID", "WHILE", "CARET", "QUESTION", 
		"CONST", "BOOL", "FLOAT", "DOUBLE", "INT", "UINT", "BREAK", "CONTINUE", 
		"DO", "ELSE", "FOR", "IF", "DISCARD", "RETURN", "SWITCH", "CASE", "DEFAULT", 
		"SUBROUTINE", "BVEC2", "BVEC3", "BVEC4", "IVEC2", "IVEC3", "IVEC4", "UVEC2", 
		"UVEC3", "UVEC4", "VEC2", "VEC3", "VEC4", "MAT2", "MAT3", "MAT4", "CENTROID", 
		"IN", "OUT", "INOUT", "UNIFORM", "PATCH", "SAMPLE", "BUFFER", "SHARED", 
		"COHERENT", "VOLATILE", "RESTRICT", "READONLY", "WRITEONLY", "DVEC2", 
		"DVEC3", "DVEC4", "DMAT2", "DMAT3", "DMAT4", "NOPERSPECTIVE", "FLAT", 
		"SMOOTH", "LAYOUT", "MAT2X2", "MAT2X3", "MAT2X4", "MAT3X2", "MAT3X3", 
		"MAT3X4", "MAT4X2", "MAT4X3", "MAT4X4", "DMAT2X2", "DMAT2X3", "DMAT2X4", 
		"DMAT3X2", "DMAT3X3", "DMAT3X4", "DMAT4X2", "DMAT4X3", "DMAT4X4", "ATOMIC_UINT", 
		"SAMPLER1D", "SAMPLER2D", "SAMPLER3D", "SAMPLERCUBE", "SAMPLER1DSHADOW", 
		"SAMPLER2DSHADOW", "SAMPLERCUBESHADOW", "SAMPLER1DARRAY", "SAMPLER2DARRAY", 
		"SAMPLER1DARRAYSHADOW", "SAMPLER2DARRAYSHADOW", "ISAMPLER1D", "ISAMPLER2D", 
		"ISAMPLER3D", "ISAMPLERCUBE", "ISAMPLER1DARRAY", "ISAMPLER2DARRAY", "USAMPLER1D", 
		"USAMPLER2D", "USAMPLER3D", "USAMPLERCUBE", "USAMPLER1DARRAY", "USAMPLER2DARRAY", 
		"SAMPLER2DRECT", "SAMPLER2DRECTSHADOW", "ISAMPLER2DRECT", "USAMPLER2DRECT", 
		"SAMPLERBUFFER", "ISAMPLERBUFFER", "USAMPLERBUFFER", "SAMPLERCUBEARRAY", 
		"SAMPLERCUBEARRAYSHADOW", "ISAMPLERCUBEARRAY", "USAMPLERCUBEARRAY", "SAMPLER2DMS", 
		"ISAMPLER2DMS", "USAMPLER2DMS", "SAMPLER2DMSARRAY", "ISAMPLER2DMSARRAY", 
		"USAMPLER2DMSARRAY", "IMAGE1D", "IIMAGE1D", "UIMAGE1D", "IMAGE2D", "IIMAGE2D", 
		"UIMAGE2D", "IMAGE3D", "IIMAGE3D", "UIMAGE3D", "IMAGE2DRECT", "IIMAGE2DRECT", 
		"UIMAGE2DRECT", "IMAGECUBE", "IIMAGECUBE", "UIMAGECUBE", "IMAGEBUFFER", 
		"IIMAGEBUFFER", "UIMAGEBUFFER", "IMAGE1DARRAY", "IIMAGE1DARRAY", "UIMAGE1DARRAY", 
		"IMAGE2DARRAY", "IIMAGE2DARRAY", "UIMAGE2DARRAY", "IMAGECUBEARRAY", "IIMAGECUBEARRAY", 
		"UIMAGECUBEARRAY", "IMAGE2DMS", "IIMAGE2DMS", "UIMAGE2DMS", "IMAGE2DMSARRAY", 
		"IIMAGE2DMSARRAY", "UIMAGE2DMSARRAY", "PLUS", "DASH", "STAR", "SLASH", 
		"PERCENT", "INC_OP", "DEC_OP", "EQ_OP", "NE_OP", "RIGHT_ANGLE", "LEFT_ANGLE", 
		"GE_OP", "LE_OP", "AND_OP", "OR_OP", "BANG", "AMPERSAND", "VERTICAL_BAR", 
		"XOR_OP", "TILDE", "LEFT_OP", "RIGHT_OP", "EQUAL", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "LEFT_ASSIGN", "RIGHT_ASSIGN", 
		"AND_ASSIGN", "XOR_ASSIGN", "OR_ASSIGN", "FLOATCONSTANT", "DOUBLECONSTANT", 
		"INTCONSTANT", "UINTCONSTANT", "BOOLCONSTANT", "IDENTIFIER", "WS", "COMMENT", 
		"LINECOMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Glsl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GlslParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GlslContext extends ParserRuleContext {
		public Version_declarationContext version_declaration() {
			return getRuleContext(Version_declarationContext.class,0);
		}
		public Top_statementContext top_statement() {
			return getRuleContext(Top_statementContext.class,0);
		}
		public GlslContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glsl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterGlsl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitGlsl(this);
		}
	}

	public final GlslContext glsl() throws RecognitionException {
		GlslContext _localctx = new GlslContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_glsl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			version_declaration();
			setState(171);
			top_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Top_statementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Top_statementContext top_statement() {
			return getRuleContext(Top_statementContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Top_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterTop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitTop_statement(this);
		}
	}

	public final Top_statementContext top_statement() throws RecognitionException {
		Top_statementContext _localctx = new Top_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_top_statement);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				declaration();
				setState(174);
				top_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				function_definition();
				setState(177);
				top_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Version_declarationContext extends ParserRuleContext {
		public TerminalNode VERSION() { return getToken(GlslParser.VERSION, 0); }
		public TerminalNode INTCONSTANT() { return getToken(GlslParser.INTCONSTANT, 0); }
		public Version_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterVersion_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitVersion_declaration(this);
		}
	}

	public final Version_declarationContext version_declaration() throws RecognitionException {
		Version_declarationContext _localctx = new Version_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_version_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(VERSION);
			setState(183);
			match(INTCONSTANT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_identifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GlslParser.IDENTIFIER, 0); }
		public Variable_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterVariable_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitVariable_identifier(this);
		}
	}

	public final Variable_identifierContext variable_identifier() throws RecognitionException {
		Variable_identifierContext _localctx = new Variable_identifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public TerminalNode INTCONSTANT() { return getToken(GlslParser.INTCONSTANT, 0); }
		public TerminalNode UINTCONSTANT() { return getToken(GlslParser.UINTCONSTANT, 0); }
		public TerminalNode FLOATCONSTANT() { return getToken(GlslParser.FLOATCONSTANT, 0); }
		public TerminalNode BOOLCONSTANT() { return getToken(GlslParser.BOOLCONSTANT, 0); }
		public TerminalNode DOUBLECONSTANT() { return getToken(GlslParser.DOUBLECONSTANT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GlslParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GlslParser.RIGHT_PAREN, 0); }
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primary_expression);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				variable_identifier();
				}
				break;
			case INTCONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(INTCONSTANT);
				}
				break;
			case UINTCONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(UINTCONSTANT);
				}
				break;
			case FLOATCONSTANT:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				match(FLOATCONSTANT);
				}
				break;
			case BOOLCONSTANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				match(BOOLCONSTANT);
				}
				break;
			case DOUBLECONSTANT:
				enterOuterAlt(_localctx, 6);
				{
				setState(192);
				match(DOUBLECONSTANT);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 7);
				{
				setState(193);
				match(LEFT_PAREN);
				setState(194);
				expression(0);
				setState(195);
				match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(GlslParser.LEFT_BRACKET, 0); }
		public Integer_expressionContext integer_expression() {
			return getRuleContext(Integer_expressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(GlslParser.RIGHT_BRACKET, 0); }
		public TerminalNode DOT() { return getToken(GlslParser.DOT, 0); }
		public TerminalNode FIELD_SELECTION() { return getToken(GlslParser.FIELD_SELECTION, 0); }
		public TerminalNode INC_OP() { return getToken(GlslParser.INC_OP, 0); }
		public TerminalNode DEC_OP() { return getToken(GlslParser.DEC_OP, 0); }
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterPostfix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitPostfix_expression(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		return postfix_expression(0);
	}

	private Postfix_expressionContext postfix_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, _parentState);
		Postfix_expressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_postfix_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(200);
				primary_expression();
				}
				break;
			case 2:
				{
				setState(201);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(204);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(205);
						match(LEFT_BRACKET);
						setState(206);
						integer_expression();
						setState(207);
						match(RIGHT_BRACKET);
						}
						break;
					case 2:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(209);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(210);
						match(DOT);
						setState(211);
						match(FIELD_SELECTION);
						}
						break;
					case 3:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(212);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(213);
						match(INC_OP);
						}
						break;
					case 4:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(214);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(215);
						match(DEC_OP);
						}
						break;
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Integer_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Integer_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterInteger_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitInteger_expression(this);
		}
	}

	public final Integer_expressionContext integer_expression() throws RecognitionException {
		Integer_expressionContext _localctx = new Integer_expressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_integer_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public Function_call_header_with_parametersContext function_call_header_with_parameters() {
			return getRuleContext(Function_call_header_with_parametersContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GlslParser.RIGHT_PAREN, 0); }
		public Function_call_header_no_parametersContext function_call_header_no_parameters() {
			return getRuleContext(Function_call_header_no_parametersContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_call);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				function_call_header_with_parameters(0);
				setState(224);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				function_call_header_no_parameters();
				setState(227);
				match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_header_no_parametersContext extends ParserRuleContext {
		public Function_call_headerContext function_call_header() {
			return getRuleContext(Function_call_headerContext.class,0);
		}
		public TerminalNode VOID() { return getToken(GlslParser.VOID, 0); }
		public Function_call_header_no_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_header_no_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterFunction_call_header_no_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitFunction_call_header_no_parameters(this);
		}
	}

	public final Function_call_header_no_parametersContext function_call_header_no_parameters() throws RecognitionException {
		Function_call_header_no_parametersContext _localctx = new Function_call_header_no_parametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_call_header_no_parameters);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				function_call_header();
				setState(232);
				match(VOID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				function_call_header();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_header_with_parametersContext extends ParserRuleContext {
		public Function_call_headerContext function_call_header() {
			return getRuleContext(Function_call_headerContext.class,0);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Function_call_header_with_parametersContext function_call_header_with_parameters() {
			return getRuleContext(Function_call_header_with_parametersContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GlslParser.COMMA, 0); }
		public Function_call_header_with_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_header_with_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterFunction_call_header_with_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitFunction_call_header_with_parameters(this);
		}
	}

	public final Function_call_header_with_parametersContext function_call_header_with_parameters() throws RecognitionException {
		return function_call_header_with_parameters(0);
	}

	private Function_call_header_with_parametersContext function_call_header_with_parameters(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_call_header_with_parametersContext _localctx = new Function_call_header_with_parametersContext(_ctx, _parentState);
		Function_call_header_with_parametersContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_function_call_header_with_parameters, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(238);
			function_call_header();
			setState(239);
			assignment_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_call_header_with_parametersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_call_header_with_parameters);
					setState(241);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(242);
					match(COMMA);
					setState(243);
					assignment_expression();
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Function_call_headerContext extends ParserRuleContext {
		public Function_identifierContext function_identifier() {
			return getRuleContext(Function_identifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(GlslParser.LEFT_PAREN, 0); }
		public Function_call_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterFunction_call_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitFunction_call_header(this);
		}
	}

	public final Function_call_headerContext function_call_header() throws RecognitionException {
		Function_call_headerContext _localctx = new Function_call_headerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_call_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			function_identifier();
			setState(250);
			match(LEFT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_identifierContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GlslParser.IDENTIFIER, 0); }
		public Function_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterFunction_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitFunction_identifier(this);
		}
	}

	public final Function_identifierContext function_identifier() throws RecognitionException {
		Function_identifierContext _localctx = new Function_identifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_identifier);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				type_specifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode INC_OP() { return getToken(GlslParser.INC_OP, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode DEC_OP() { return getToken(GlslParser.DEC_OP, 0); }
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitUnary_expression(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unary_expression);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
			case STRUCT:
			case VOID:
			case BOOL:
			case FLOAT:
			case DOUBLE:
			case INT:
			case UINT:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case IVEC2:
			case IVEC3:
			case IVEC4:
			case UVEC2:
			case UVEC3:
			case UVEC4:
			case VEC2:
			case VEC3:
			case VEC4:
			case MAT2:
			case MAT3:
			case MAT4:
			case DVEC2:
			case DVEC3:
			case DVEC4:
			case DMAT2:
			case DMAT3:
			case DMAT4:
			case MAT2X2:
			case MAT2X3:
			case MAT2X4:
			case MAT3X2:
			case MAT3X3:
			case MAT3X4:
			case MAT4X2:
			case MAT4X3:
			case MAT4X4:
			case DMAT2X2:
			case DMAT2X3:
			case DMAT2X4:
			case DMAT3X2:
			case DMAT3X3:
			case DMAT3X4:
			case DMAT4X2:
			case DMAT4X3:
			case DMAT4X4:
			case ATOMIC_UINT:
			case SAMPLER1D:
			case SAMPLER2D:
			case SAMPLER3D:
			case SAMPLERCUBE:
			case SAMPLER1DSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLERCUBESHADOW:
			case SAMPLER1DARRAY:
			case SAMPLER2DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER2DARRAYSHADOW:
			case ISAMPLER1D:
			case ISAMPLER2D:
			case ISAMPLER3D:
			case ISAMPLERCUBE:
			case ISAMPLER1DARRAY:
			case ISAMPLER2DARRAY:
			case USAMPLER1D:
			case USAMPLER2D:
			case USAMPLER3D:
			case USAMPLERCUBE:
			case USAMPLER1DARRAY:
			case USAMPLER2DARRAY:
			case SAMPLER2DRECT:
			case SAMPLER2DRECTSHADOW:
			case ISAMPLER2DRECT:
			case USAMPLER2DRECT:
			case SAMPLERBUFFER:
			case ISAMPLERBUFFER:
			case USAMPLERBUFFER:
			case SAMPLERCUBEARRAY:
			case SAMPLERCUBEARRAYSHADOW:
			case ISAMPLERCUBEARRAY:
			case USAMPLERCUBEARRAY:
			case SAMPLER2DMS:
			case ISAMPLER2DMS:
			case USAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case ISAMPLER2DMSARRAY:
			case USAMPLER2DMSARRAY:
			case IMAGE1D:
			case IIMAGE1D:
			case UIMAGE1D:
			case IMAGE2D:
			case IIMAGE2D:
			case UIMAGE2D:
			case IMAGE3D:
			case IIMAGE3D:
			case UIMAGE3D:
			case IMAGE2DRECT:
			case IIMAGE2DRECT:
			case UIMAGE2DRECT:
			case IMAGECUBE:
			case IIMAGECUBE:
			case UIMAGECUBE:
			case IMAGEBUFFER:
			case IIMAGEBUFFER:
			case UIMAGEBUFFER:
			case IMAGE1DARRAY:
			case IIMAGE1DARRAY:
			case UIMAGE1DARRAY:
			case IMAGE2DARRAY:
			case IIMAGE2DARRAY:
			case UIMAGE2DARRAY:
			case IMAGECUBEARRAY:
			case IIMAGECUBEARRAY:
			case UIMAGECUBEARRAY:
			case IMAGE2DMS:
			case IIMAGE2DMS:
			case UIMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IIMAGE2DMSARRAY:
			case UIMAGE2DMSARRAY:
			case FLOATCONSTANT:
			case DOUBLECONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
			case BOOLCONSTANT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				postfix_expression(0);
				}
				break;
			case INC_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(INC_OP);
				setState(258);
				unary_expression();
				}
				break;
			case DEC_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(DEC_OP);
				setState(260);
				unary_expression();
				}
				break;
			case PLUS:
			case DASH:
			case BANG:
			case TILDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				unary_operator();
				setState(262);
				unary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(GlslParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(GlslParser.DASH, 0); }
		public TerminalNode BANG() { return getToken(GlslParser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(GlslParser.TILDE, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !(((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (PLUS - 174)) | (1L << (DASH - 174)) | (1L << (BANG - 174)) | (1L << (TILDE - 174)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public TerminalNode STAR() { return getToken(GlslParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(GlslParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(GlslParser.PERCENT, 0); }
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitMultiplicative_expression(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		return multiplicative_expression(0);
	}

	private Multiplicative_expressionContext multiplicative_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, _parentState);
		Multiplicative_expressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_multiplicative_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(269);
			unary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(280);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(271);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(272);
						match(STAR);
						setState(273);
						unary_expression();
						}
						break;
					case 2:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(274);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(275);
						match(SLASH);
						setState(276);
						unary_expression();
						}
						break;
					case 3:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(277);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(278);
						match(PERCENT);
						setState(279);
						unary_expression();
						}
						break;
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Additive_expressionContext extends ParserRuleContext {
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(GlslParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(GlslParser.DASH, 0); }
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitAdditive_expression(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		return additive_expression(0);
	}

	private Additive_expressionContext additive_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, _parentState);
		Additive_expressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_additive_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(286);
			multiplicative_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(294);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(288);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(289);
						match(PLUS);
						setState(290);
						multiplicative_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(291);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(292);
						match(DASH);
						setState(293);
						multiplicative_expression(0);
						}
						break;
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Shift_expressionContext extends ParserRuleContext {
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public TerminalNode LEFT_OP() { return getToken(GlslParser.LEFT_OP, 0); }
		public TerminalNode RIGHT_OP() { return getToken(GlslParser.RIGHT_OP, 0); }
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitShift_expression(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		return shift_expression(0);
	}

	private Shift_expressionContext shift_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, _parentState);
		Shift_expressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_shift_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(300);
			additive_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(308);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new Shift_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shift_expression);
						setState(302);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(303);
						match(LEFT_OP);
						setState(304);
						additive_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Shift_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shift_expression);
						setState(305);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(306);
						match(RIGHT_OP);
						setState(307);
						additive_expression(0);
						}
						break;
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Relational_expressionContext extends ParserRuleContext {
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public TerminalNode LEFT_ANGLE() { return getToken(GlslParser.LEFT_ANGLE, 0); }
		public TerminalNode RIGHT_ANGLE() { return getToken(GlslParser.RIGHT_ANGLE, 0); }
		public TerminalNode LE_OP() { return getToken(GlslParser.LE_OP, 0); }
		public TerminalNode GE_OP() { return getToken(GlslParser.GE_OP, 0); }
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitRelational_expression(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		return relational_expression(0);
	}

	private Relational_expressionContext relational_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, _parentState);
		Relational_expressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_relational_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(314);
			shift_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(328);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(316);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(317);
						match(LEFT_ANGLE);
						setState(318);
						shift_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(319);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(320);
						match(RIGHT_ANGLE);
						setState(321);
						shift_expression(0);
						}
						break;
					case 3:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(322);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(323);
						match(LE_OP);
						setState(324);
						shift_expression(0);
						}
						break;
					case 4:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(325);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(326);
						match(GE_OP);
						setState(327);
						shift_expression(0);
						}
						break;
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Equality_expressionContext extends ParserRuleContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public TerminalNode EQ_OP() { return getToken(GlslParser.EQ_OP, 0); }
		public TerminalNode NE_OP() { return getToken(GlslParser.NE_OP, 0); }
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitEquality_expression(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		return equality_expression(0);
	}

	private Equality_expressionContext equality_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, _parentState);
		Equality_expressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_equality_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(334);
			relational_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(342);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new Equality_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
						setState(336);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(337);
						match(EQ_OP);
						setState(338);
						relational_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Equality_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
						setState(339);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(340);
						match(NE_OP);
						setState(341);
						relational_expression(0);
						}
						break;
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class And_expressionContext extends ParserRuleContext {
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public TerminalNode AMPERSAND() { return getToken(GlslParser.AMPERSAND, 0); }
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitAnd_expression(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		return and_expression(0);
	}

	private And_expressionContext and_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		And_expressionContext _localctx = new And_expressionContext(_ctx, _parentState);
		And_expressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_and_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(348);
			equality_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_and_expression);
					setState(350);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(351);
					match(AMPERSAND);
					setState(352);
					equality_expression(0);
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
		}
		public TerminalNode CARET() { return getToken(GlslParser.CARET, 0); }
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitExclusive_or_expression(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		return exclusive_or_expression(0);
	}

	private Exclusive_or_expressionContext exclusive_or_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, _parentState);
		Exclusive_or_expressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_exclusive_or_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(359);
			and_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exclusive_or_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusive_or_expression);
					setState(361);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(362);
					match(CARET);
					setState(363);
					and_expression(0);
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
		}
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public TerminalNode VERTICAL_BAR() { return getToken(GlslParser.VERTICAL_BAR, 0); }
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitInclusive_or_expression(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		return inclusive_or_expression(0);
	}

	private Inclusive_or_expressionContext inclusive_or_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, _parentState);
		Inclusive_or_expressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_inclusive_or_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(370);
			exclusive_or_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Inclusive_or_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusive_or_expression);
					setState(372);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(373);
					match(VERTICAL_BAR);
					setState(374);
					exclusive_or_expression(0);
					}
					} 
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Logical_and_expressionContext extends ParserRuleContext {
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public TerminalNode AND_OP() { return getToken(GlslParser.AND_OP, 0); }
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterLogical_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitLogical_and_expression(this);
		}
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		return logical_and_expression(0);
	}

	private Logical_and_expressionContext logical_and_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, _parentState);
		Logical_and_expressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_logical_and_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(381);
			inclusive_or_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_and_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_and_expression);
					setState(383);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(384);
					match(AND_OP);
					setState(385);
					inclusive_or_expression(0);
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Logical_xor_expressionContext extends ParserRuleContext {
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public Logical_xor_expressionContext logical_xor_expression() {
			return getRuleContext(Logical_xor_expressionContext.class,0);
		}
		public TerminalNode XOR_OP() { return getToken(GlslParser.XOR_OP, 0); }
		public Logical_xor_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_xor_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterLogical_xor_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitLogical_xor_expression(this);
		}
	}

	public final Logical_xor_expressionContext logical_xor_expression() throws RecognitionException {
		return logical_xor_expression(0);
	}

	private Logical_xor_expressionContext logical_xor_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_xor_expressionContext _localctx = new Logical_xor_expressionContext(_ctx, _parentState);
		Logical_xor_expressionContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_logical_xor_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(392);
			logical_and_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_xor_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_xor_expression);
					setState(394);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(395);
					match(XOR_OP);
					setState(396);
					logical_and_expression(0);
					}
					} 
				}
				setState(401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Logical_or_expressionContext extends ParserRuleContext {
		public Logical_xor_expressionContext logical_xor_expression() {
			return getRuleContext(Logical_xor_expressionContext.class,0);
		}
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public TerminalNode OR_OP() { return getToken(GlslParser.OR_OP, 0); }
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterLogical_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitLogical_or_expression(this);
		}
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		return logical_or_expression(0);
	}

	private Logical_or_expressionContext logical_or_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, _parentState);
		Logical_or_expressionContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_logical_or_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(403);
			logical_xor_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_or_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_or_expression);
					setState(405);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(406);
					match(OR_OP);
					setState(407);
					logical_xor_expression(0);
					}
					} 
				}
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Conditional_expressionContext extends ParserRuleContext {
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(GlslParser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GlslParser.COLON, 0); }
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitConditional_expression(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_conditional_expression);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				logical_or_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				logical_or_expression(0);
				setState(415);
				match(QUESTION);
				setState(416);
				expression(0);
				setState(417);
				match(COLON);
				setState(418);
				assignment_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitAssignment_expression(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignment_expression);
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				conditional_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				unary_expression();
				setState(424);
				assignment_operator();
				setState(425);
				assignment_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(GlslParser.EQUAL, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(GlslParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(GlslParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(GlslParser.MOD_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(GlslParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(GlslParser.SUB_ASSIGN, 0); }
		public TerminalNode LEFT_ASSIGN() { return getToken(GlslParser.LEFT_ASSIGN, 0); }
		public TerminalNode RIGHT_ASSIGN() { return getToken(GlslParser.RIGHT_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(GlslParser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(GlslParser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(GlslParser.OR_ASSIGN, 0); }
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitAssignment_operator(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if ( !(((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (EQUAL - 196)) | (1L << (ADD_ASSIGN - 196)) | (1L << (SUB_ASSIGN - 196)) | (1L << (MUL_ASSIGN - 196)) | (1L << (DIV_ASSIGN - 196)) | (1L << (MOD_ASSIGN - 196)) | (1L << (LEFT_ASSIGN - 196)) | (1L << (RIGHT_ASSIGN - 196)) | (1L << (AND_ASSIGN - 196)) | (1L << (XOR_ASSIGN - 196)) | (1L << (OR_ASSIGN - 196)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GlslParser.COMMA, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(432);
			assignment_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(434);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(435);
					match(COMMA);
					setState(436);
					assignment_expression();
					}
					} 
				}
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Constant_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitConstant_expression(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constant_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			conditional_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(GlslParser.DEFINE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(GlslParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GlslParser.IDENTIFIER, i);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Function_prototypeContext function_prototype() {
			return getRuleContext(Function_prototypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GlslParser.SEMICOLON, 0); }
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public TerminalNode PRECISION() { return getToken(GlslParser.PRECISION, 0); }
		public Precision_qualifierContext precision_qualifier() {
			return getRuleContext(Precision_qualifierContext.class,0);
		}
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Type_qualifierContext type_qualifier() {
			return getRuleContext(Type_qualifierContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(GlslParser.LEFT_BRACE, 0); }
		public Struct_declaration_listContext struct_declaration_list() {
			return getRuleContext(Struct_declaration_listContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GlslParser.RIGHT_BRACE, 0); }
		public Array_specifierContext array_specifier() {
			return getRuleContext(Array_specifierContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_declaration);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(DEFINE);
				setState(445);
				match(IDENTIFIER);
				setState(446);
				primary_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				function_prototype();
				setState(448);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				init_declarator_list(0);
				setState(451);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(453);
				match(PRECISION);
				setState(454);
				precision_qualifier();
				setState(455);
				type_specifier();
				setState(456);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(458);
				type_qualifier(0);
				setState(459);
				match(IDENTIFIER);
				setState(460);
				match(LEFT_BRACE);
				setState(461);
				struct_declaration_list(0);
				setState(462);
				match(RIGHT_BRACE);
				setState(463);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(465);
				type_qualifier(0);
				setState(466);
				match(IDENTIFIER);
				setState(467);
				match(LEFT_BRACE);
				setState(468);
				struct_declaration_list(0);
				setState(469);
				match(RIGHT_BRACE);
				setState(470);
				match(IDENTIFIER);
				setState(471);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(473);
				type_qualifier(0);
				setState(474);
				match(IDENTIFIER);
				setState(475);
				match(LEFT_BRACE);
				setState(476);
				struct_declaration_list(0);
				setState(477);
				match(RIGHT_BRACE);
				setState(478);
				match(IDENTIFIER);
				setState(479);
				array_specifier(0);
				setState(480);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(482);
				type_qualifier(0);
				setState(483);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(485);
				type_qualifier(0);
				setState(486);
				match(IDENTIFIER);
				setState(487);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(489);
				type_qualifier(0);
				setState(490);
				match(IDENTIFIER);
				setState(491);
				identifier_list(0);
				setState(492);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_listContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(GlslParser.COMMA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GlslParser.IDENTIFIER, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitIdentifier_list(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		return identifier_list(0);
	}

	private Identifier_listContext identifier_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, _parentState);
		Identifier_listContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_identifier_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(497);
			match(COMMA);
			setState(498);
			match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Identifier_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifier_list);
					setState(500);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(501);
					match(COMMA);
					setState(502);
					match(IDENTIFIER);
					}
					} 
				}
				setState(507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Function_prototypeContext extends ParserRuleContext {
		public Function_declaratorContext function_declarator() {
			return getRuleContext(Function_declaratorContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GlslParser.RIGHT_PAREN, 0); }
		public Function_prototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_prototype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterFunction_prototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitFunction_prototype(this);
		}
	}

	public final Function_prototypeContext function_prototype() throws RecognitionException {
		Function_prototypeContext _localctx = new Function_prototypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_function_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			function_declarator();
			setState(509);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declaratorContext extends ParserRuleContext {
		public Function_headerContext function_header() {
			return getRuleContext(Function_headerContext.class,0);
		}
		public Function_header_with_parametersContext function_header_with_parameters() {
			return getRuleContext(Function_header_with_parametersContext.class,0);
		}
		public Function_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterFunction_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitFunction_declarator(this);
		}
	}

	public final Function_declaratorContext function_declarator() throws RecognitionException {
		Function_declaratorContext _localctx = new Function_declaratorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_function_declarator);
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				function_header();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				function_header_with_parameters(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_header_with_parametersContext extends ParserRuleContext {
		public Function_headerContext function_header() {
			return getRuleContext(Function_headerContext.class,0);
		}
		public Parameter_declarationContext parameter_declaration() {
			return getRuleContext(Parameter_declarationContext.class,0);
		}
		public Function_header_with_parametersContext function_header_with_parameters() {
			return getRuleContext(Function_header_with_parametersContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GlslParser.COMMA, 0); }
		public Function_header_with_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_header_with_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterFunction_header_with_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitFunction_header_with_parameters(this);
		}
	}

	public final Function_header_with_parametersContext function_header_with_parameters() throws RecognitionException {
		return function_header_with_parameters(0);
	}

	private Function_header_with_parametersContext function_header_with_parameters(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_header_with_parametersContext _localctx = new Function_header_with_parametersContext(_ctx, _parentState);
		Function_header_with_parametersContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_function_header_with_parameters, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(516);
			function_header();
			setState(517);
			parameter_declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_header_with_parametersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_header_with_parameters);
					setState(519);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(520);
					match(COMMA);
					setState(521);
					parameter_declaration();
					}
					} 
				}
				setState(526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Function_headerContext extends ParserRuleContext {
		public Fully_specified_typeContext fully_specified_type() {
			return getRuleContext(Fully_specified_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GlslParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GlslParser.LEFT_PAREN, 0); }
		public Function_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterFunction_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitFunction_header(this);
		}
	}

	public final Function_headerContext function_header() throws RecognitionException {
		Function_headerContext _localctx = new Function_headerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_function_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			fully_specified_type();
			setState(528);
			match(IDENTIFIER);
			setState(529);
			match(LEFT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_declaratorContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GlslParser.IDENTIFIER, 0); }
		public Array_specifierContext array_specifier() {
			return getRuleContext(Array_specifierContext.class,0);
		}
		public Parameter_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterParameter_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitParameter_declarator(this);
		}
	}

	public final Parameter_declaratorContext parameter_declarator() throws RecognitionException {
		Parameter_declaratorContext _localctx = new Parameter_declaratorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parameter_declarator);
		try {
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				type_specifier();
				setState(532);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				type_specifier();
				setState(535);
				match(IDENTIFIER);
				setState(536);
				array_specifier(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_declarationContext extends ParserRuleContext {
		public Type_qualifierContext type_qualifier() {
			return getRuleContext(Type_qualifierContext.class,0);
		}
		public Parameter_declaratorContext parameter_declarator() {
			return getRuleContext(Parameter_declaratorContext.class,0);
		}
		public Parameter_type_specifierContext parameter_type_specifier() {
			return getRuleContext(Parameter_type_specifierContext.class,0);
		}
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterParameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitParameter_declaration(this);
		}
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parameter_declaration);
		try {
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				type_qualifier(0);
				setState(541);
				parameter_declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				parameter_declarator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				type_qualifier(0);
				setState(545);
				parameter_type_specifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(547);
				parameter_type_specifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_type_specifierContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Parameter_type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterParameter_type_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitParameter_type_specifier(this);
		}
	}

	public final Parameter_type_specifierContext parameter_type_specifier() throws RecognitionException {
		Parameter_type_specifierContext _localctx = new Parameter_type_specifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_parameter_type_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			type_specifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_declarator_listContext extends ParserRuleContext {
		public Single_declarationContext single_declaration() {
			return getRuleContext(Single_declarationContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GlslParser.COMMA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GlslParser.IDENTIFIER, 0); }
		public Array_specifierContext array_specifier() {
			return getRuleContext(Array_specifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(GlslParser.EQUAL, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterInit_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitInit_declarator_list(this);
		}
	}

	public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
		return init_declarator_list(0);
	}

	private Init_declarator_listContext init_declarator_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, _parentState);
		Init_declarator_listContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_init_declarator_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(553);
			single_declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(576);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(574);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new Init_declarator_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_init_declarator_list);
						setState(555);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(556);
						match(COMMA);
						setState(557);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						_localctx = new Init_declarator_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_init_declarator_list);
						setState(558);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(559);
						match(COMMA);
						setState(560);
						match(IDENTIFIER);
						setState(561);
						array_specifier(0);
						}
						break;
					case 3:
						{
						_localctx = new Init_declarator_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_init_declarator_list);
						setState(562);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(563);
						match(COMMA);
						setState(564);
						match(IDENTIFIER);
						setState(565);
						array_specifier(0);
						setState(566);
						match(EQUAL);
						setState(567);
						initializer();
						}
						break;
					case 4:
						{
						_localctx = new Init_declarator_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_init_declarator_list);
						setState(569);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(570);
						match(COMMA);
						setState(571);
						match(IDENTIFIER);
						setState(572);
						match(EQUAL);
						setState(573);
						initializer();
						}
						break;
					}
					} 
				}
				setState(578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Single_declarationContext extends ParserRuleContext {
		public Fully_specified_typeContext fully_specified_type() {
			return getRuleContext(Fully_specified_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GlslParser.IDENTIFIER, 0); }
		public Array_specifierContext array_specifier() {
			return getRuleContext(Array_specifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(GlslParser.EQUAL, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Single_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterSingle_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitSingle_declaration(this);
		}
	}

	public final Single_declarationContext single_declaration() throws RecognitionException {
		Single_declarationContext _localctx = new Single_declarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_single_declaration);
		try {
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				fully_specified_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				fully_specified_type();
				setState(581);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				fully_specified_type();
				setState(584);
				match(IDENTIFIER);
				setState(585);
				array_specifier(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(587);
				fully_specified_type();
				setState(588);
				match(IDENTIFIER);
				setState(589);
				array_specifier(0);
				setState(590);
				match(EQUAL);
				setState(591);
				initializer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(593);
				fully_specified_type();
				setState(594);
				match(IDENTIFIER);
				setState(595);
				match(EQUAL);
				setState(596);
				initializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fully_specified_typeContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Type_qualifierContext type_qualifier() {
			return getRuleContext(Type_qualifierContext.class,0);
		}
		public Fully_specified_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fully_specified_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterFully_specified_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitFully_specified_type(this);
		}
	}

	public final Fully_specified_typeContext fully_specified_type() throws RecognitionException {
		Fully_specified_typeContext _localctx = new Fully_specified_typeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_fully_specified_type);
		try {
			setState(604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case VOID:
			case BOOL:
			case FLOAT:
			case DOUBLE:
			case INT:
			case UINT:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case IVEC2:
			case IVEC3:
			case IVEC4:
			case UVEC2:
			case UVEC3:
			case UVEC4:
			case VEC2:
			case VEC3:
			case VEC4:
			case MAT2:
			case MAT3:
			case MAT4:
			case DVEC2:
			case DVEC3:
			case DVEC4:
			case DMAT2:
			case DMAT3:
			case DMAT4:
			case MAT2X2:
			case MAT2X3:
			case MAT2X4:
			case MAT3X2:
			case MAT3X3:
			case MAT3X4:
			case MAT4X2:
			case MAT4X3:
			case MAT4X4:
			case DMAT2X2:
			case DMAT2X3:
			case DMAT2X4:
			case DMAT3X2:
			case DMAT3X3:
			case DMAT3X4:
			case DMAT4X2:
			case DMAT4X3:
			case DMAT4X4:
			case ATOMIC_UINT:
			case SAMPLER1D:
			case SAMPLER2D:
			case SAMPLER3D:
			case SAMPLERCUBE:
			case SAMPLER1DSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLERCUBESHADOW:
			case SAMPLER1DARRAY:
			case SAMPLER2DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER2DARRAYSHADOW:
			case ISAMPLER1D:
			case ISAMPLER2D:
			case ISAMPLER3D:
			case ISAMPLERCUBE:
			case ISAMPLER1DARRAY:
			case ISAMPLER2DARRAY:
			case USAMPLER1D:
			case USAMPLER2D:
			case USAMPLER3D:
			case USAMPLERCUBE:
			case USAMPLER1DARRAY:
			case USAMPLER2DARRAY:
			case SAMPLER2DRECT:
			case SAMPLER2DRECTSHADOW:
			case ISAMPLER2DRECT:
			case USAMPLER2DRECT:
			case SAMPLERBUFFER:
			case ISAMPLERBUFFER:
			case USAMPLERBUFFER:
			case SAMPLERCUBEARRAY:
			case SAMPLERCUBEARRAYSHADOW:
			case ISAMPLERCUBEARRAY:
			case USAMPLERCUBEARRAY:
			case SAMPLER2DMS:
			case ISAMPLER2DMS:
			case USAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case ISAMPLER2DMSARRAY:
			case USAMPLER2DMSARRAY:
			case IMAGE1D:
			case IIMAGE1D:
			case UIMAGE1D:
			case IMAGE2D:
			case IIMAGE2D:
			case UIMAGE2D:
			case IMAGE3D:
			case IIMAGE3D:
			case UIMAGE3D:
			case IMAGE2DRECT:
			case IIMAGE2DRECT:
			case UIMAGE2DRECT:
			case IMAGECUBE:
			case IIMAGECUBE:
			case UIMAGECUBE:
			case IMAGEBUFFER:
			case IIMAGEBUFFER:
			case UIMAGEBUFFER:
			case IMAGE1DARRAY:
			case IIMAGE1DARRAY:
			case UIMAGE1DARRAY:
			case IMAGE2DARRAY:
			case IIMAGE2DARRAY:
			case UIMAGE2DARRAY:
			case IMAGECUBEARRAY:
			case IIMAGECUBEARRAY:
			case UIMAGECUBEARRAY:
			case IMAGE2DMS:
			case IIMAGE2DMS:
			case UIMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IIMAGE2DMSARRAY:
			case UIMAGE2DMSARRAY:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				type_specifier();
				}
				break;
			case INVARIANT:
			case PRECISE:
			case HIGH_PRECISION:
			case MEDIUM_PRECISION:
			case LOW_PRECISION:
			case CONST:
			case SUBROUTINE:
			case CENTROID:
			case IN:
			case OUT:
			case INOUT:
			case UNIFORM:
			case PATCH:
			case SAMPLE:
			case BUFFER:
			case SHARED:
			case COHERENT:
			case VOLATILE:
			case RESTRICT:
			case READONLY:
			case WRITEONLY:
			case NOPERSPECTIVE:
			case FLAT:
			case SMOOTH:
			case LAYOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				type_qualifier(0);
				setState(602);
				type_specifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Invariant_qualifierContext extends ParserRuleContext {
		public TerminalNode INVARIANT() { return getToken(GlslParser.INVARIANT, 0); }
		public Invariant_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariant_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterInvariant_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitInvariant_qualifier(this);
		}
	}

	public final Invariant_qualifierContext invariant_qualifier() throws RecognitionException {
		Invariant_qualifierContext _localctx = new Invariant_qualifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_invariant_qualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(INVARIANT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolation_qualifierContext extends ParserRuleContext {
		public TerminalNode SMOOTH() { return getToken(GlslParser.SMOOTH, 0); }
		public TerminalNode FLAT() { return getToken(GlslParser.FLAT, 0); }
		public TerminalNode NOPERSPECTIVE() { return getToken(GlslParser.NOPERSPECTIVE, 0); }
		public Interpolation_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterInterpolation_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitInterpolation_qualifier(this);
		}
	}

	public final Interpolation_qualifierContext interpolation_qualifier() throws RecognitionException {
		Interpolation_qualifierContext _localctx = new Interpolation_qualifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_interpolation_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (NOPERSPECTIVE - 78)) | (1L << (FLAT - 78)) | (1L << (SMOOTH - 78)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Layout_qualifierContext extends ParserRuleContext {
		public TerminalNode LAYOUT() { return getToken(GlslParser.LAYOUT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GlslParser.LEFT_PAREN, 0); }
		public Layout_qualifier_id_listContext layout_qualifier_id_list() {
			return getRuleContext(Layout_qualifier_id_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GlslParser.RIGHT_PAREN, 0); }
		public Layout_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterLayout_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitLayout_qualifier(this);
		}
	}

	public final Layout_qualifierContext layout_qualifier() throws RecognitionException {
		Layout_qualifierContext _localctx = new Layout_qualifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_layout_qualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(LAYOUT);
			setState(611);
			match(LEFT_PAREN);
			setState(612);
			layout_qualifier_id_list(0);
			setState(613);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Layout_qualifier_id_listContext extends ParserRuleContext {
		public Layout_qualifier_idContext layout_qualifier_id() {
			return getRuleContext(Layout_qualifier_idContext.class,0);
		}
		public Layout_qualifier_id_listContext layout_qualifier_id_list() {
			return getRuleContext(Layout_qualifier_id_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GlslParser.COMMA, 0); }
		public Layout_qualifier_id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout_qualifier_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterLayout_qualifier_id_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitLayout_qualifier_id_list(this);
		}
	}

	public final Layout_qualifier_id_listContext layout_qualifier_id_list() throws RecognitionException {
		return layout_qualifier_id_list(0);
	}

	private Layout_qualifier_id_listContext layout_qualifier_id_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Layout_qualifier_id_listContext _localctx = new Layout_qualifier_id_listContext(_ctx, _parentState);
		Layout_qualifier_id_listContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_layout_qualifier_id_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(616);
			layout_qualifier_id();
			}
			_ctx.stop = _input.LT(-1);
			setState(623);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Layout_qualifier_id_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_layout_qualifier_id_list);
					setState(618);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(619);
					match(COMMA);
					setState(620);
					layout_qualifier_id();
					}
					} 
				}
				setState(625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Layout_qualifier_idContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GlslParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(GlslParser.EQUAL, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public TerminalNode SHARED() { return getToken(GlslParser.SHARED, 0); }
		public Layout_qualifier_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout_qualifier_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterLayout_qualifier_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitLayout_qualifier_id(this);
		}
	}

	public final Layout_qualifier_idContext layout_qualifier_id() throws RecognitionException {
		Layout_qualifier_idContext _localctx = new Layout_qualifier_idContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_layout_qualifier_id);
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				match(IDENTIFIER);
				setState(628);
				match(EQUAL);
				setState(629);
				constant_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(630);
				match(SHARED);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precise_qualifierContext extends ParserRuleContext {
		public TerminalNode PRECISE() { return getToken(GlslParser.PRECISE, 0); }
		public Precise_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precise_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterPrecise_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitPrecise_qualifier(this);
		}
	}

	public final Precise_qualifierContext precise_qualifier() throws RecognitionException {
		Precise_qualifierContext _localctx = new Precise_qualifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_precise_qualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(PRECISE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_qualifierContext extends ParserRuleContext {
		public Single_type_qualifierContext single_type_qualifier() {
			return getRuleContext(Single_type_qualifierContext.class,0);
		}
		public Type_qualifierContext type_qualifier() {
			return getRuleContext(Type_qualifierContext.class,0);
		}
		public Type_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterType_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitType_qualifier(this);
		}
	}

	public final Type_qualifierContext type_qualifier() throws RecognitionException {
		return type_qualifier(0);
	}

	private Type_qualifierContext type_qualifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_qualifierContext _localctx = new Type_qualifierContext(_ctx, _parentState);
		Type_qualifierContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_type_qualifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(636);
			single_type_qualifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type_qualifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type_qualifier);
					setState(638);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(639);
					single_type_qualifier();
					}
					} 
				}
				setState(644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Single_type_qualifierContext extends ParserRuleContext {
		public Storage_qualifierContext storage_qualifier() {
			return getRuleContext(Storage_qualifierContext.class,0);
		}
		public Layout_qualifierContext layout_qualifier() {
			return getRuleContext(Layout_qualifierContext.class,0);
		}
		public Precision_qualifierContext precision_qualifier() {
			return getRuleContext(Precision_qualifierContext.class,0);
		}
		public Interpolation_qualifierContext interpolation_qualifier() {
			return getRuleContext(Interpolation_qualifierContext.class,0);
		}
		public Invariant_qualifierContext invariant_qualifier() {
			return getRuleContext(Invariant_qualifierContext.class,0);
		}
		public Precise_qualifierContext precise_qualifier() {
			return getRuleContext(Precise_qualifierContext.class,0);
		}
		public Single_type_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_type_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterSingle_type_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitSingle_type_qualifier(this);
		}
	}

	public final Single_type_qualifierContext single_type_qualifier() throws RecognitionException {
		Single_type_qualifierContext _localctx = new Single_type_qualifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_single_type_qualifier);
		try {
			setState(651);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case SUBROUTINE:
			case CENTROID:
			case IN:
			case OUT:
			case INOUT:
			case UNIFORM:
			case PATCH:
			case SAMPLE:
			case BUFFER:
			case SHARED:
			case COHERENT:
			case VOLATILE:
			case RESTRICT:
			case READONLY:
			case WRITEONLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				storage_qualifier();
				}
				break;
			case LAYOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				layout_qualifier();
				}
				break;
			case HIGH_PRECISION:
			case MEDIUM_PRECISION:
			case LOW_PRECISION:
				enterOuterAlt(_localctx, 3);
				{
				setState(647);
				precision_qualifier();
				}
				break;
			case NOPERSPECTIVE:
			case FLAT:
			case SMOOTH:
				enterOuterAlt(_localctx, 4);
				{
				setState(648);
				interpolation_qualifier();
				}
				break;
			case INVARIANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(649);
				invariant_qualifier();
				}
				break;
			case PRECISE:
				enterOuterAlt(_localctx, 6);
				{
				setState(650);
				precise_qualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Storage_qualifierContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(GlslParser.CONST, 0); }
		public TerminalNode INOUT() { return getToken(GlslParser.INOUT, 0); }
		public TerminalNode IN() { return getToken(GlslParser.IN, 0); }
		public TerminalNode OUT() { return getToken(GlslParser.OUT, 0); }
		public TerminalNode CENTROID() { return getToken(GlslParser.CENTROID, 0); }
		public TerminalNode PATCH() { return getToken(GlslParser.PATCH, 0); }
		public TerminalNode SAMPLE() { return getToken(GlslParser.SAMPLE, 0); }
		public TerminalNode UNIFORM() { return getToken(GlslParser.UNIFORM, 0); }
		public TerminalNode BUFFER() { return getToken(GlslParser.BUFFER, 0); }
		public TerminalNode SHARED() { return getToken(GlslParser.SHARED, 0); }
		public TerminalNode COHERENT() { return getToken(GlslParser.COHERENT, 0); }
		public TerminalNode VOLATILE() { return getToken(GlslParser.VOLATILE, 0); }
		public TerminalNode RESTRICT() { return getToken(GlslParser.RESTRICT, 0); }
		public TerminalNode READONLY() { return getToken(GlslParser.READONLY, 0); }
		public TerminalNode WRITEONLY() { return getToken(GlslParser.WRITEONLY, 0); }
		public TerminalNode SUBROUTINE() { return getToken(GlslParser.SUBROUTINE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GlslParser.LEFT_PAREN, 0); }
		public Type_name_listContext type_name_list() {
			return getRuleContext(Type_name_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GlslParser.RIGHT_PAREN, 0); }
		public Storage_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterStorage_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitStorage_qualifier(this);
		}
	}

	public final Storage_qualifierContext storage_qualifier() throws RecognitionException {
		Storage_qualifierContext _localctx = new Storage_qualifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_storage_qualifier);
		try {
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				match(CONST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				match(INOUT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(655);
				match(IN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(656);
				match(OUT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(657);
				match(CENTROID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(658);
				match(PATCH);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(659);
				match(SAMPLE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(660);
				match(UNIFORM);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(661);
				match(BUFFER);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(662);
				match(SHARED);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(663);
				match(COHERENT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(664);
				match(VOLATILE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(665);
				match(RESTRICT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(666);
				match(READONLY);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(667);
				match(WRITEONLY);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(668);
				match(SUBROUTINE);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(669);
				match(SUBROUTINE);
				setState(670);
				match(LEFT_PAREN);
				setState(671);
				type_name_list(0);
				setState(672);
				match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_name_listContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GlslParser.IDENTIFIER, 0); }
		public Type_name_listContext type_name_list() {
			return getRuleContext(Type_name_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GlslParser.COMMA, 0); }
		public Type_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterType_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitType_name_list(this);
		}
	}

	public final Type_name_listContext type_name_list() throws RecognitionException {
		return type_name_list(0);
	}

	private Type_name_listContext type_name_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_name_listContext _localctx = new Type_name_listContext(_ctx, _parentState);
		Type_name_listContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_type_name_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(677);
			match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(684);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type_name_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type_name_list);
					setState(679);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(680);
					match(COMMA);
					setState(681);
					match(IDENTIFIER);
					}
					} 
				}
				setState(686);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Type_specifierContext extends ParserRuleContext {
		public Type_specifier_nonarrayContext type_specifier_nonarray() {
			return getRuleContext(Type_specifier_nonarrayContext.class,0);
		}
		public Array_specifierContext array_specifier() {
			return getRuleContext(Array_specifierContext.class,0);
		}
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterType_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitType_specifier(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_type_specifier);
		try {
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
				type_specifier_nonarray();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
				type_specifier_nonarray();
				setState(689);
				array_specifier(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_specifierContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(GlslParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(GlslParser.RIGHT_BRACKET, 0); }
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Array_specifierContext array_specifier() {
			return getRuleContext(Array_specifierContext.class,0);
		}
		public Array_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterArray_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitArray_specifier(this);
		}
	}

	public final Array_specifierContext array_specifier() throws RecognitionException {
		return array_specifier(0);
	}

	private Array_specifierContext array_specifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Array_specifierContext _localctx = new Array_specifierContext(_ctx, _parentState);
		Array_specifierContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_array_specifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(694);
				match(LEFT_BRACKET);
				setState(695);
				match(RIGHT_BRACKET);
				}
				break;
			case 2:
				{
				setState(696);
				match(LEFT_BRACKET);
				setState(697);
				conditional_expression();
				setState(698);
				match(RIGHT_BRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(712);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(710);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new Array_specifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_array_specifier);
						setState(702);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(703);
						match(LEFT_BRACKET);
						setState(704);
						match(RIGHT_BRACKET);
						}
						break;
					case 2:
						{
						_localctx = new Array_specifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_array_specifier);
						setState(705);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(706);
						match(LEFT_BRACKET);
						setState(707);
						conditional_expression();
						setState(708);
						match(RIGHT_BRACKET);
						}
						break;
					}
					} 
				}
				setState(714);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Type_specifier_nonarrayContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(GlslParser.VOID, 0); }
		public TerminalNode FLOAT() { return getToken(GlslParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(GlslParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(GlslParser.INT, 0); }
		public TerminalNode UINT() { return getToken(GlslParser.UINT, 0); }
		public TerminalNode BOOL() { return getToken(GlslParser.BOOL, 0); }
		public TerminalNode VEC2() { return getToken(GlslParser.VEC2, 0); }
		public TerminalNode VEC3() { return getToken(GlslParser.VEC3, 0); }
		public TerminalNode VEC4() { return getToken(GlslParser.VEC4, 0); }
		public TerminalNode DVEC2() { return getToken(GlslParser.DVEC2, 0); }
		public TerminalNode DVEC3() { return getToken(GlslParser.DVEC3, 0); }
		public TerminalNode DVEC4() { return getToken(GlslParser.DVEC4, 0); }
		public TerminalNode BVEC2() { return getToken(GlslParser.BVEC2, 0); }
		public TerminalNode BVEC3() { return getToken(GlslParser.BVEC3, 0); }
		public TerminalNode BVEC4() { return getToken(GlslParser.BVEC4, 0); }
		public TerminalNode IVEC2() { return getToken(GlslParser.IVEC2, 0); }
		public TerminalNode IVEC3() { return getToken(GlslParser.IVEC3, 0); }
		public TerminalNode IVEC4() { return getToken(GlslParser.IVEC4, 0); }
		public TerminalNode UVEC2() { return getToken(GlslParser.UVEC2, 0); }
		public TerminalNode UVEC3() { return getToken(GlslParser.UVEC3, 0); }
		public TerminalNode UVEC4() { return getToken(GlslParser.UVEC4, 0); }
		public TerminalNode MAT2() { return getToken(GlslParser.MAT2, 0); }
		public TerminalNode MAT3() { return getToken(GlslParser.MAT3, 0); }
		public TerminalNode MAT4() { return getToken(GlslParser.MAT4, 0); }
		public TerminalNode MAT2X2() { return getToken(GlslParser.MAT2X2, 0); }
		public TerminalNode MAT2X3() { return getToken(GlslParser.MAT2X3, 0); }
		public TerminalNode MAT2X4() { return getToken(GlslParser.MAT2X4, 0); }
		public TerminalNode MAT3X2() { return getToken(GlslParser.MAT3X2, 0); }
		public TerminalNode MAT3X3() { return getToken(GlslParser.MAT3X3, 0); }
		public TerminalNode MAT3X4() { return getToken(GlslParser.MAT3X4, 0); }
		public TerminalNode MAT4X2() { return getToken(GlslParser.MAT4X2, 0); }
		public TerminalNode MAT4X3() { return getToken(GlslParser.MAT4X3, 0); }
		public TerminalNode MAT4X4() { return getToken(GlslParser.MAT4X4, 0); }
		public TerminalNode DMAT2() { return getToken(GlslParser.DMAT2, 0); }
		public TerminalNode DMAT3() { return getToken(GlslParser.DMAT3, 0); }
		public TerminalNode DMAT4() { return getToken(GlslParser.DMAT4, 0); }
		public TerminalNode DMAT2X2() { return getToken(GlslParser.DMAT2X2, 0); }
		public TerminalNode DMAT2X3() { return getToken(GlslParser.DMAT2X3, 0); }
		public TerminalNode DMAT2X4() { return getToken(GlslParser.DMAT2X4, 0); }
		public TerminalNode DMAT3X2() { return getToken(GlslParser.DMAT3X2, 0); }
		public TerminalNode DMAT3X3() { return getToken(GlslParser.DMAT3X3, 0); }
		public TerminalNode DMAT3X4() { return getToken(GlslParser.DMAT3X4, 0); }
		public TerminalNode DMAT4X2() { return getToken(GlslParser.DMAT4X2, 0); }
		public TerminalNode DMAT4X3() { return getToken(GlslParser.DMAT4X3, 0); }
		public TerminalNode DMAT4X4() { return getToken(GlslParser.DMAT4X4, 0); }
		public TerminalNode ATOMIC_UINT() { return getToken(GlslParser.ATOMIC_UINT, 0); }
		public TerminalNode SAMPLER1D() { return getToken(GlslParser.SAMPLER1D, 0); }
		public TerminalNode SAMPLER2D() { return getToken(GlslParser.SAMPLER2D, 0); }
		public TerminalNode SAMPLER3D() { return getToken(GlslParser.SAMPLER3D, 0); }
		public TerminalNode SAMPLERCUBE() { return getToken(GlslParser.SAMPLERCUBE, 0); }
		public TerminalNode SAMPLER1DSHADOW() { return getToken(GlslParser.SAMPLER1DSHADOW, 0); }
		public TerminalNode SAMPLER2DSHADOW() { return getToken(GlslParser.SAMPLER2DSHADOW, 0); }
		public TerminalNode SAMPLERCUBESHADOW() { return getToken(GlslParser.SAMPLERCUBESHADOW, 0); }
		public TerminalNode SAMPLER1DARRAY() { return getToken(GlslParser.SAMPLER1DARRAY, 0); }
		public TerminalNode SAMPLER2DARRAY() { return getToken(GlslParser.SAMPLER2DARRAY, 0); }
		public TerminalNode SAMPLER1DARRAYSHADOW() { return getToken(GlslParser.SAMPLER1DARRAYSHADOW, 0); }
		public TerminalNode SAMPLER2DARRAYSHADOW() { return getToken(GlslParser.SAMPLER2DARRAYSHADOW, 0); }
		public TerminalNode SAMPLERCUBEARRAY() { return getToken(GlslParser.SAMPLERCUBEARRAY, 0); }
		public TerminalNode SAMPLERCUBEARRAYSHADOW() { return getToken(GlslParser.SAMPLERCUBEARRAYSHADOW, 0); }
		public TerminalNode ISAMPLER1D() { return getToken(GlslParser.ISAMPLER1D, 0); }
		public TerminalNode ISAMPLER2D() { return getToken(GlslParser.ISAMPLER2D, 0); }
		public TerminalNode ISAMPLER3D() { return getToken(GlslParser.ISAMPLER3D, 0); }
		public TerminalNode ISAMPLERCUBE() { return getToken(GlslParser.ISAMPLERCUBE, 0); }
		public TerminalNode ISAMPLER1DARRAY() { return getToken(GlslParser.ISAMPLER1DARRAY, 0); }
		public TerminalNode ISAMPLER2DARRAY() { return getToken(GlslParser.ISAMPLER2DARRAY, 0); }
		public TerminalNode ISAMPLERCUBEARRAY() { return getToken(GlslParser.ISAMPLERCUBEARRAY, 0); }
		public TerminalNode USAMPLER1D() { return getToken(GlslParser.USAMPLER1D, 0); }
		public TerminalNode USAMPLER2D() { return getToken(GlslParser.USAMPLER2D, 0); }
		public TerminalNode USAMPLER3D() { return getToken(GlslParser.USAMPLER3D, 0); }
		public TerminalNode USAMPLERCUBE() { return getToken(GlslParser.USAMPLERCUBE, 0); }
		public TerminalNode USAMPLER1DARRAY() { return getToken(GlslParser.USAMPLER1DARRAY, 0); }
		public TerminalNode USAMPLER2DARRAY() { return getToken(GlslParser.USAMPLER2DARRAY, 0); }
		public TerminalNode USAMPLERCUBEARRAY() { return getToken(GlslParser.USAMPLERCUBEARRAY, 0); }
		public TerminalNode SAMPLER2DRECT() { return getToken(GlslParser.SAMPLER2DRECT, 0); }
		public TerminalNode SAMPLER2DRECTSHADOW() { return getToken(GlslParser.SAMPLER2DRECTSHADOW, 0); }
		public TerminalNode ISAMPLER2DRECT() { return getToken(GlslParser.ISAMPLER2DRECT, 0); }
		public TerminalNode USAMPLER2DRECT() { return getToken(GlslParser.USAMPLER2DRECT, 0); }
		public TerminalNode SAMPLERBUFFER() { return getToken(GlslParser.SAMPLERBUFFER, 0); }
		public TerminalNode ISAMPLERBUFFER() { return getToken(GlslParser.ISAMPLERBUFFER, 0); }
		public TerminalNode USAMPLERBUFFER() { return getToken(GlslParser.USAMPLERBUFFER, 0); }
		public TerminalNode SAMPLER2DMS() { return getToken(GlslParser.SAMPLER2DMS, 0); }
		public TerminalNode ISAMPLER2DMS() { return getToken(GlslParser.ISAMPLER2DMS, 0); }
		public TerminalNode USAMPLER2DMS() { return getToken(GlslParser.USAMPLER2DMS, 0); }
		public TerminalNode SAMPLER2DMSARRAY() { return getToken(GlslParser.SAMPLER2DMSARRAY, 0); }
		public TerminalNode ISAMPLER2DMSARRAY() { return getToken(GlslParser.ISAMPLER2DMSARRAY, 0); }
		public TerminalNode USAMPLER2DMSARRAY() { return getToken(GlslParser.USAMPLER2DMSARRAY, 0); }
		public TerminalNode IMAGE1D() { return getToken(GlslParser.IMAGE1D, 0); }
		public TerminalNode IIMAGE1D() { return getToken(GlslParser.IIMAGE1D, 0); }
		public TerminalNode UIMAGE1D() { return getToken(GlslParser.UIMAGE1D, 0); }
		public TerminalNode IMAGE2D() { return getToken(GlslParser.IMAGE2D, 0); }
		public TerminalNode IIMAGE2D() { return getToken(GlslParser.IIMAGE2D, 0); }
		public TerminalNode UIMAGE2D() { return getToken(GlslParser.UIMAGE2D, 0); }
		public TerminalNode IMAGE3D() { return getToken(GlslParser.IMAGE3D, 0); }
		public TerminalNode IIMAGE3D() { return getToken(GlslParser.IIMAGE3D, 0); }
		public TerminalNode UIMAGE3D() { return getToken(GlslParser.UIMAGE3D, 0); }
		public TerminalNode IMAGE2DRECT() { return getToken(GlslParser.IMAGE2DRECT, 0); }
		public TerminalNode IIMAGE2DRECT() { return getToken(GlslParser.IIMAGE2DRECT, 0); }
		public TerminalNode UIMAGE2DRECT() { return getToken(GlslParser.UIMAGE2DRECT, 0); }
		public TerminalNode IMAGECUBE() { return getToken(GlslParser.IMAGECUBE, 0); }
		public TerminalNode IIMAGECUBE() { return getToken(GlslParser.IIMAGECUBE, 0); }
		public TerminalNode UIMAGECUBE() { return getToken(GlslParser.UIMAGECUBE, 0); }
		public TerminalNode IMAGEBUFFER() { return getToken(GlslParser.IMAGEBUFFER, 0); }
		public TerminalNode IIMAGEBUFFER() { return getToken(GlslParser.IIMAGEBUFFER, 0); }
		public TerminalNode UIMAGEBUFFER() { return getToken(GlslParser.UIMAGEBUFFER, 0); }
		public TerminalNode IMAGE1DARRAY() { return getToken(GlslParser.IMAGE1DARRAY, 0); }
		public TerminalNode IIMAGE1DARRAY() { return getToken(GlslParser.IIMAGE1DARRAY, 0); }
		public TerminalNode UIMAGE1DARRAY() { return getToken(GlslParser.UIMAGE1DARRAY, 0); }
		public TerminalNode IMAGE2DARRAY() { return getToken(GlslParser.IMAGE2DARRAY, 0); }
		public TerminalNode IIMAGE2DARRAY() { return getToken(GlslParser.IIMAGE2DARRAY, 0); }
		public TerminalNode UIMAGE2DARRAY() { return getToken(GlslParser.UIMAGE2DARRAY, 0); }
		public TerminalNode IMAGECUBEARRAY() { return getToken(GlslParser.IMAGECUBEARRAY, 0); }
		public TerminalNode IIMAGECUBEARRAY() { return getToken(GlslParser.IIMAGECUBEARRAY, 0); }
		public TerminalNode UIMAGECUBEARRAY() { return getToken(GlslParser.UIMAGECUBEARRAY, 0); }
		public TerminalNode IMAGE2DMS() { return getToken(GlslParser.IMAGE2DMS, 0); }
		public TerminalNode IIMAGE2DMS() { return getToken(GlslParser.IIMAGE2DMS, 0); }
		public TerminalNode UIMAGE2DMS() { return getToken(GlslParser.UIMAGE2DMS, 0); }
		public TerminalNode IMAGE2DMSARRAY() { return getToken(GlslParser.IMAGE2DMSARRAY, 0); }
		public TerminalNode IIMAGE2DMSARRAY() { return getToken(GlslParser.IIMAGE2DMSARRAY, 0); }
		public TerminalNode UIMAGE2DMSARRAY() { return getToken(GlslParser.UIMAGE2DMSARRAY, 0); }
		public Struct_specifierContext struct_specifier() {
			return getRuleContext(Struct_specifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GlslParser.IDENTIFIER, 0); }
		public Type_specifier_nonarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier_nonarray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterType_specifier_nonarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitType_specifier_nonarray(this);
		}
	}

	public final Type_specifier_nonarrayContext type_specifier_nonarray() throws RecognitionException {
		Type_specifier_nonarrayContext _localctx = new Type_specifier_nonarrayContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_type_specifier_nonarray);
		try {
			setState(836);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(715);
				match(VOID);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(716);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(717);
				match(DOUBLE);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(718);
				match(INT);
				}
				break;
			case UINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(719);
				match(UINT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(720);
				match(BOOL);
				}
				break;
			case VEC2:
				enterOuterAlt(_localctx, 7);
				{
				setState(721);
				match(VEC2);
				}
				break;
			case VEC3:
				enterOuterAlt(_localctx, 8);
				{
				setState(722);
				match(VEC3);
				}
				break;
			case VEC4:
				enterOuterAlt(_localctx, 9);
				{
				setState(723);
				match(VEC4);
				}
				break;
			case DVEC2:
				enterOuterAlt(_localctx, 10);
				{
				setState(724);
				match(DVEC2);
				}
				break;
			case DVEC3:
				enterOuterAlt(_localctx, 11);
				{
				setState(725);
				match(DVEC3);
				}
				break;
			case DVEC4:
				enterOuterAlt(_localctx, 12);
				{
				setState(726);
				match(DVEC4);
				}
				break;
			case BVEC2:
				enterOuterAlt(_localctx, 13);
				{
				setState(727);
				match(BVEC2);
				}
				break;
			case BVEC3:
				enterOuterAlt(_localctx, 14);
				{
				setState(728);
				match(BVEC3);
				}
				break;
			case BVEC4:
				enterOuterAlt(_localctx, 15);
				{
				setState(729);
				match(BVEC4);
				}
				break;
			case IVEC2:
				enterOuterAlt(_localctx, 16);
				{
				setState(730);
				match(IVEC2);
				}
				break;
			case IVEC3:
				enterOuterAlt(_localctx, 17);
				{
				setState(731);
				match(IVEC3);
				}
				break;
			case IVEC4:
				enterOuterAlt(_localctx, 18);
				{
				setState(732);
				match(IVEC4);
				}
				break;
			case UVEC2:
				enterOuterAlt(_localctx, 19);
				{
				setState(733);
				match(UVEC2);
				}
				break;
			case UVEC3:
				enterOuterAlt(_localctx, 20);
				{
				setState(734);
				match(UVEC3);
				}
				break;
			case UVEC4:
				enterOuterAlt(_localctx, 21);
				{
				setState(735);
				match(UVEC4);
				}
				break;
			case MAT2:
				enterOuterAlt(_localctx, 22);
				{
				setState(736);
				match(MAT2);
				}
				break;
			case MAT3:
				enterOuterAlt(_localctx, 23);
				{
				setState(737);
				match(MAT3);
				}
				break;
			case MAT4:
				enterOuterAlt(_localctx, 24);
				{
				setState(738);
				match(MAT4);
				}
				break;
			case MAT2X2:
				enterOuterAlt(_localctx, 25);
				{
				setState(739);
				match(MAT2X2);
				}
				break;
			case MAT2X3:
				enterOuterAlt(_localctx, 26);
				{
				setState(740);
				match(MAT2X3);
				}
				break;
			case MAT2X4:
				enterOuterAlt(_localctx, 27);
				{
				setState(741);
				match(MAT2X4);
				}
				break;
			case MAT3X2:
				enterOuterAlt(_localctx, 28);
				{
				setState(742);
				match(MAT3X2);
				}
				break;
			case MAT3X3:
				enterOuterAlt(_localctx, 29);
				{
				setState(743);
				match(MAT3X3);
				}
				break;
			case MAT3X4:
				enterOuterAlt(_localctx, 30);
				{
				setState(744);
				match(MAT3X4);
				}
				break;
			case MAT4X2:
				enterOuterAlt(_localctx, 31);
				{
				setState(745);
				match(MAT4X2);
				}
				break;
			case MAT4X3:
				enterOuterAlt(_localctx, 32);
				{
				setState(746);
				match(MAT4X3);
				}
				break;
			case MAT4X4:
				enterOuterAlt(_localctx, 33);
				{
				setState(747);
				match(MAT4X4);
				}
				break;
			case DMAT2:
				enterOuterAlt(_localctx, 34);
				{
				setState(748);
				match(DMAT2);
				}
				break;
			case DMAT3:
				enterOuterAlt(_localctx, 35);
				{
				setState(749);
				match(DMAT3);
				}
				break;
			case DMAT4:
				enterOuterAlt(_localctx, 36);
				{
				setState(750);
				match(DMAT4);
				}
				break;
			case DMAT2X2:
				enterOuterAlt(_localctx, 37);
				{
				setState(751);
				match(DMAT2X2);
				}
				break;
			case DMAT2X3:
				enterOuterAlt(_localctx, 38);
				{
				setState(752);
				match(DMAT2X3);
				}
				break;
			case DMAT2X4:
				enterOuterAlt(_localctx, 39);
				{
				setState(753);
				match(DMAT2X4);
				}
				break;
			case DMAT3X2:
				enterOuterAlt(_localctx, 40);
				{
				setState(754);
				match(DMAT3X2);
				}
				break;
			case DMAT3X3:
				enterOuterAlt(_localctx, 41);
				{
				setState(755);
				match(DMAT3X3);
				}
				break;
			case DMAT3X4:
				enterOuterAlt(_localctx, 42);
				{
				setState(756);
				match(DMAT3X4);
				}
				break;
			case DMAT4X2:
				enterOuterAlt(_localctx, 43);
				{
				setState(757);
				match(DMAT4X2);
				}
				break;
			case DMAT4X3:
				enterOuterAlt(_localctx, 44);
				{
				setState(758);
				match(DMAT4X3);
				}
				break;
			case DMAT4X4:
				enterOuterAlt(_localctx, 45);
				{
				setState(759);
				match(DMAT4X4);
				}
				break;
			case ATOMIC_UINT:
				enterOuterAlt(_localctx, 46);
				{
				setState(760);
				match(ATOMIC_UINT);
				}
				break;
			case SAMPLER1D:
				enterOuterAlt(_localctx, 47);
				{
				setState(761);
				match(SAMPLER1D);
				}
				break;
			case SAMPLER2D:
				enterOuterAlt(_localctx, 48);
				{
				setState(762);
				match(SAMPLER2D);
				}
				break;
			case SAMPLER3D:
				enterOuterAlt(_localctx, 49);
				{
				setState(763);
				match(SAMPLER3D);
				}
				break;
			case SAMPLERCUBE:
				enterOuterAlt(_localctx, 50);
				{
				setState(764);
				match(SAMPLERCUBE);
				}
				break;
			case SAMPLER1DSHADOW:
				enterOuterAlt(_localctx, 51);
				{
				setState(765);
				match(SAMPLER1DSHADOW);
				}
				break;
			case SAMPLER2DSHADOW:
				enterOuterAlt(_localctx, 52);
				{
				setState(766);
				match(SAMPLER2DSHADOW);
				}
				break;
			case SAMPLERCUBESHADOW:
				enterOuterAlt(_localctx, 53);
				{
				setState(767);
				match(SAMPLERCUBESHADOW);
				}
				break;
			case SAMPLER1DARRAY:
				enterOuterAlt(_localctx, 54);
				{
				setState(768);
				match(SAMPLER1DARRAY);
				}
				break;
			case SAMPLER2DARRAY:
				enterOuterAlt(_localctx, 55);
				{
				setState(769);
				match(SAMPLER2DARRAY);
				}
				break;
			case SAMPLER1DARRAYSHADOW:
				enterOuterAlt(_localctx, 56);
				{
				setState(770);
				match(SAMPLER1DARRAYSHADOW);
				}
				break;
			case SAMPLER2DARRAYSHADOW:
				enterOuterAlt(_localctx, 57);
				{
				setState(771);
				match(SAMPLER2DARRAYSHADOW);
				}
				break;
			case SAMPLERCUBEARRAY:
				enterOuterAlt(_localctx, 58);
				{
				setState(772);
				match(SAMPLERCUBEARRAY);
				}
				break;
			case SAMPLERCUBEARRAYSHADOW:
				enterOuterAlt(_localctx, 59);
				{
				setState(773);
				match(SAMPLERCUBEARRAYSHADOW);
				}
				break;
			case ISAMPLER1D:
				enterOuterAlt(_localctx, 60);
				{
				setState(774);
				match(ISAMPLER1D);
				}
				break;
			case ISAMPLER2D:
				enterOuterAlt(_localctx, 61);
				{
				setState(775);
				match(ISAMPLER2D);
				}
				break;
			case ISAMPLER3D:
				enterOuterAlt(_localctx, 62);
				{
				setState(776);
				match(ISAMPLER3D);
				}
				break;
			case ISAMPLERCUBE:
				enterOuterAlt(_localctx, 63);
				{
				setState(777);
				match(ISAMPLERCUBE);
				}
				break;
			case ISAMPLER1DARRAY:
				enterOuterAlt(_localctx, 64);
				{
				setState(778);
				match(ISAMPLER1DARRAY);
				}
				break;
			case ISAMPLER2DARRAY:
				enterOuterAlt(_localctx, 65);
				{
				setState(779);
				match(ISAMPLER2DARRAY);
				}
				break;
			case ISAMPLERCUBEARRAY:
				enterOuterAlt(_localctx, 66);
				{
				setState(780);
				match(ISAMPLERCUBEARRAY);
				}
				break;
			case USAMPLER1D:
				enterOuterAlt(_localctx, 67);
				{
				setState(781);
				match(USAMPLER1D);
				}
				break;
			case USAMPLER2D:
				enterOuterAlt(_localctx, 68);
				{
				setState(782);
				match(USAMPLER2D);
				}
				break;
			case USAMPLER3D:
				enterOuterAlt(_localctx, 69);
				{
				setState(783);
				match(USAMPLER3D);
				}
				break;
			case USAMPLERCUBE:
				enterOuterAlt(_localctx, 70);
				{
				setState(784);
				match(USAMPLERCUBE);
				}
				break;
			case USAMPLER1DARRAY:
				enterOuterAlt(_localctx, 71);
				{
				setState(785);
				match(USAMPLER1DARRAY);
				}
				break;
			case USAMPLER2DARRAY:
				enterOuterAlt(_localctx, 72);
				{
				setState(786);
				match(USAMPLER2DARRAY);
				}
				break;
			case USAMPLERCUBEARRAY:
				enterOuterAlt(_localctx, 73);
				{
				setState(787);
				match(USAMPLERCUBEARRAY);
				}
				break;
			case SAMPLER2DRECT:
				enterOuterAlt(_localctx, 74);
				{
				setState(788);
				match(SAMPLER2DRECT);
				}
				break;
			case SAMPLER2DRECTSHADOW:
				enterOuterAlt(_localctx, 75);
				{
				setState(789);
				match(SAMPLER2DRECTSHADOW);
				}
				break;
			case ISAMPLER2DRECT:
				enterOuterAlt(_localctx, 76);
				{
				setState(790);
				match(ISAMPLER2DRECT);
				}
				break;
			case USAMPLER2DRECT:
				enterOuterAlt(_localctx, 77);
				{
				setState(791);
				match(USAMPLER2DRECT);
				}
				break;
			case SAMPLERBUFFER:
				enterOuterAlt(_localctx, 78);
				{
				setState(792);
				match(SAMPLERBUFFER);
				}
				break;
			case ISAMPLERBUFFER:
				enterOuterAlt(_localctx, 79);
				{
				setState(793);
				match(ISAMPLERBUFFER);
				}
				break;
			case USAMPLERBUFFER:
				enterOuterAlt(_localctx, 80);
				{
				setState(794);
				match(USAMPLERBUFFER);
				}
				break;
			case SAMPLER2DMS:
				enterOuterAlt(_localctx, 81);
				{
				setState(795);
				match(SAMPLER2DMS);
				}
				break;
			case ISAMPLER2DMS:
				enterOuterAlt(_localctx, 82);
				{
				setState(796);
				match(ISAMPLER2DMS);
				}
				break;
			case USAMPLER2DMS:
				enterOuterAlt(_localctx, 83);
				{
				setState(797);
				match(USAMPLER2DMS);
				}
				break;
			case SAMPLER2DMSARRAY:
				enterOuterAlt(_localctx, 84);
				{
				setState(798);
				match(SAMPLER2DMSARRAY);
				}
				break;
			case ISAMPLER2DMSARRAY:
				enterOuterAlt(_localctx, 85);
				{
				setState(799);
				match(ISAMPLER2DMSARRAY);
				}
				break;
			case USAMPLER2DMSARRAY:
				enterOuterAlt(_localctx, 86);
				{
				setState(800);
				match(USAMPLER2DMSARRAY);
				}
				break;
			case IMAGE1D:
				enterOuterAlt(_localctx, 87);
				{
				setState(801);
				match(IMAGE1D);
				}
				break;
			case IIMAGE1D:
				enterOuterAlt(_localctx, 88);
				{
				setState(802);
				match(IIMAGE1D);
				}
				break;
			case UIMAGE1D:
				enterOuterAlt(_localctx, 89);
				{
				setState(803);
				match(UIMAGE1D);
				}
				break;
			case IMAGE2D:
				enterOuterAlt(_localctx, 90);
				{
				setState(804);
				match(IMAGE2D);
				}
				break;
			case IIMAGE2D:
				enterOuterAlt(_localctx, 91);
				{
				setState(805);
				match(IIMAGE2D);
				}
				break;
			case UIMAGE2D:
				enterOuterAlt(_localctx, 92);
				{
				setState(806);
				match(UIMAGE2D);
				}
				break;
			case IMAGE3D:
				enterOuterAlt(_localctx, 93);
				{
				setState(807);
				match(IMAGE3D);
				}
				break;
			case IIMAGE3D:
				enterOuterAlt(_localctx, 94);
				{
				setState(808);
				match(IIMAGE3D);
				}
				break;
			case UIMAGE3D:
				enterOuterAlt(_localctx, 95);
				{
				setState(809);
				match(UIMAGE3D);
				}
				break;
			case IMAGE2DRECT:
				enterOuterAlt(_localctx, 96);
				{
				setState(810);
				match(IMAGE2DRECT);
				}
				break;
			case IIMAGE2DRECT:
				enterOuterAlt(_localctx, 97);
				{
				setState(811);
				match(IIMAGE2DRECT);
				}
				break;
			case UIMAGE2DRECT:
				enterOuterAlt(_localctx, 98);
				{
				setState(812);
				match(UIMAGE2DRECT);
				}
				break;
			case IMAGECUBE:
				enterOuterAlt(_localctx, 99);
				{
				setState(813);
				match(IMAGECUBE);
				}
				break;
			case IIMAGECUBE:
				enterOuterAlt(_localctx, 100);
				{
				setState(814);
				match(IIMAGECUBE);
				}
				break;
			case UIMAGECUBE:
				enterOuterAlt(_localctx, 101);
				{
				setState(815);
				match(UIMAGECUBE);
				}
				break;
			case IMAGEBUFFER:
				enterOuterAlt(_localctx, 102);
				{
				setState(816);
				match(IMAGEBUFFER);
				}
				break;
			case IIMAGEBUFFER:
				enterOuterAlt(_localctx, 103);
				{
				setState(817);
				match(IIMAGEBUFFER);
				}
				break;
			case UIMAGEBUFFER:
				enterOuterAlt(_localctx, 104);
				{
				setState(818);
				match(UIMAGEBUFFER);
				}
				break;
			case IMAGE1DARRAY:
				enterOuterAlt(_localctx, 105);
				{
				setState(819);
				match(IMAGE1DARRAY);
				}
				break;
			case IIMAGE1DARRAY:
				enterOuterAlt(_localctx, 106);
				{
				setState(820);
				match(IIMAGE1DARRAY);
				}
				break;
			case UIMAGE1DARRAY:
				enterOuterAlt(_localctx, 107);
				{
				setState(821);
				match(UIMAGE1DARRAY);
				}
				break;
			case IMAGE2DARRAY:
				enterOuterAlt(_localctx, 108);
				{
				setState(822);
				match(IMAGE2DARRAY);
				}
				break;
			case IIMAGE2DARRAY:
				enterOuterAlt(_localctx, 109);
				{
				setState(823);
				match(IIMAGE2DARRAY);
				}
				break;
			case UIMAGE2DARRAY:
				enterOuterAlt(_localctx, 110);
				{
				setState(824);
				match(UIMAGE2DARRAY);
				}
				break;
			case IMAGECUBEARRAY:
				enterOuterAlt(_localctx, 111);
				{
				setState(825);
				match(IMAGECUBEARRAY);
				}
				break;
			case IIMAGECUBEARRAY:
				enterOuterAlt(_localctx, 112);
				{
				setState(826);
				match(IIMAGECUBEARRAY);
				}
				break;
			case UIMAGECUBEARRAY:
				enterOuterAlt(_localctx, 113);
				{
				setState(827);
				match(UIMAGECUBEARRAY);
				}
				break;
			case IMAGE2DMS:
				enterOuterAlt(_localctx, 114);
				{
				setState(828);
				match(IMAGE2DMS);
				}
				break;
			case IIMAGE2DMS:
				enterOuterAlt(_localctx, 115);
				{
				setState(829);
				match(IIMAGE2DMS);
				}
				break;
			case UIMAGE2DMS:
				enterOuterAlt(_localctx, 116);
				{
				setState(830);
				match(UIMAGE2DMS);
				}
				break;
			case IMAGE2DMSARRAY:
				enterOuterAlt(_localctx, 117);
				{
				setState(831);
				match(IMAGE2DMSARRAY);
				}
				break;
			case IIMAGE2DMSARRAY:
				enterOuterAlt(_localctx, 118);
				{
				setState(832);
				match(IIMAGE2DMSARRAY);
				}
				break;
			case UIMAGE2DMSARRAY:
				enterOuterAlt(_localctx, 119);
				{
				setState(833);
				match(UIMAGE2DMSARRAY);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 120);
				{
				setState(834);
				struct_specifier();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 121);
				{
				setState(835);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precision_qualifierContext extends ParserRuleContext {
		public TerminalNode HIGH_PRECISION() { return getToken(GlslParser.HIGH_PRECISION, 0); }
		public TerminalNode MEDIUM_PRECISION() { return getToken(GlslParser.MEDIUM_PRECISION, 0); }
		public TerminalNode LOW_PRECISION() { return getToken(GlslParser.LOW_PRECISION, 0); }
		public Precision_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precision_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterPrecision_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitPrecision_qualifier(this);
		}
	}

	public final Precision_qualifierContext precision_qualifier() throws RecognitionException {
		Precision_qualifierContext _localctx = new Precision_qualifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_precision_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HIGH_PRECISION) | (1L << MEDIUM_PRECISION) | (1L << LOW_PRECISION))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_specifierContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(GlslParser.STRUCT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GlslParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(GlslParser.LEFT_BRACE, 0); }
		public Struct_declaration_listContext struct_declaration_list() {
			return getRuleContext(Struct_declaration_listContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GlslParser.RIGHT_BRACE, 0); }
		public Struct_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterStruct_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitStruct_specifier(this);
		}
	}

	public final Struct_specifierContext struct_specifier() throws RecognitionException {
		Struct_specifierContext _localctx = new Struct_specifierContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_struct_specifier);
		try {
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				match(STRUCT);
				setState(841);
				match(IDENTIFIER);
				setState(842);
				match(LEFT_BRACE);
				setState(843);
				struct_declaration_list(0);
				setState(844);
				match(RIGHT_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(846);
				match(STRUCT);
				setState(847);
				match(LEFT_BRACE);
				setState(848);
				struct_declaration_list(0);
				setState(849);
				match(RIGHT_BRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_declaration_listContext extends ParserRuleContext {
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public Struct_declaration_listContext struct_declaration_list() {
			return getRuleContext(Struct_declaration_listContext.class,0);
		}
		public Struct_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterStruct_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitStruct_declaration_list(this);
		}
	}

	public final Struct_declaration_listContext struct_declaration_list() throws RecognitionException {
		return struct_declaration_list(0);
	}

	private Struct_declaration_listContext struct_declaration_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Struct_declaration_listContext _localctx = new Struct_declaration_listContext(_ctx, _parentState);
		Struct_declaration_listContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_struct_declaration_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(854);
			struct_declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(860);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Struct_declaration_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_struct_declaration_list);
					setState(856);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(857);
					struct_declaration();
					}
					} 
				}
				setState(862);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Struct_declarationContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Struct_declarator_listContext struct_declarator_list() {
			return getRuleContext(Struct_declarator_listContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GlslParser.SEMICOLON, 0); }
		public Type_qualifierContext type_qualifier() {
			return getRuleContext(Type_qualifierContext.class,0);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitStruct_declaration(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_struct_declaration);
		try {
			setState(872);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case VOID:
			case BOOL:
			case FLOAT:
			case DOUBLE:
			case INT:
			case UINT:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case IVEC2:
			case IVEC3:
			case IVEC4:
			case UVEC2:
			case UVEC3:
			case UVEC4:
			case VEC2:
			case VEC3:
			case VEC4:
			case MAT2:
			case MAT3:
			case MAT4:
			case DVEC2:
			case DVEC3:
			case DVEC4:
			case DMAT2:
			case DMAT3:
			case DMAT4:
			case MAT2X2:
			case MAT2X3:
			case MAT2X4:
			case MAT3X2:
			case MAT3X3:
			case MAT3X4:
			case MAT4X2:
			case MAT4X3:
			case MAT4X4:
			case DMAT2X2:
			case DMAT2X3:
			case DMAT2X4:
			case DMAT3X2:
			case DMAT3X3:
			case DMAT3X4:
			case DMAT4X2:
			case DMAT4X3:
			case DMAT4X4:
			case ATOMIC_UINT:
			case SAMPLER1D:
			case SAMPLER2D:
			case SAMPLER3D:
			case SAMPLERCUBE:
			case SAMPLER1DSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLERCUBESHADOW:
			case SAMPLER1DARRAY:
			case SAMPLER2DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER2DARRAYSHADOW:
			case ISAMPLER1D:
			case ISAMPLER2D:
			case ISAMPLER3D:
			case ISAMPLERCUBE:
			case ISAMPLER1DARRAY:
			case ISAMPLER2DARRAY:
			case USAMPLER1D:
			case USAMPLER2D:
			case USAMPLER3D:
			case USAMPLERCUBE:
			case USAMPLER1DARRAY:
			case USAMPLER2DARRAY:
			case SAMPLER2DRECT:
			case SAMPLER2DRECTSHADOW:
			case ISAMPLER2DRECT:
			case USAMPLER2DRECT:
			case SAMPLERBUFFER:
			case ISAMPLERBUFFER:
			case USAMPLERBUFFER:
			case SAMPLERCUBEARRAY:
			case SAMPLERCUBEARRAYSHADOW:
			case ISAMPLERCUBEARRAY:
			case USAMPLERCUBEARRAY:
			case SAMPLER2DMS:
			case ISAMPLER2DMS:
			case USAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case ISAMPLER2DMSARRAY:
			case USAMPLER2DMSARRAY:
			case IMAGE1D:
			case IIMAGE1D:
			case UIMAGE1D:
			case IMAGE2D:
			case IIMAGE2D:
			case UIMAGE2D:
			case IMAGE3D:
			case IIMAGE3D:
			case UIMAGE3D:
			case IMAGE2DRECT:
			case IIMAGE2DRECT:
			case UIMAGE2DRECT:
			case IMAGECUBE:
			case IIMAGECUBE:
			case UIMAGECUBE:
			case IMAGEBUFFER:
			case IIMAGEBUFFER:
			case UIMAGEBUFFER:
			case IMAGE1DARRAY:
			case IIMAGE1DARRAY:
			case UIMAGE1DARRAY:
			case IMAGE2DARRAY:
			case IIMAGE2DARRAY:
			case UIMAGE2DARRAY:
			case IMAGECUBEARRAY:
			case IIMAGECUBEARRAY:
			case UIMAGECUBEARRAY:
			case IMAGE2DMS:
			case IIMAGE2DMS:
			case UIMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IIMAGE2DMSARRAY:
			case UIMAGE2DMSARRAY:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(863);
				type_specifier();
				setState(864);
				struct_declarator_list(0);
				setState(865);
				match(SEMICOLON);
				}
				break;
			case INVARIANT:
			case PRECISE:
			case HIGH_PRECISION:
			case MEDIUM_PRECISION:
			case LOW_PRECISION:
			case CONST:
			case SUBROUTINE:
			case CENTROID:
			case IN:
			case OUT:
			case INOUT:
			case UNIFORM:
			case PATCH:
			case SAMPLE:
			case BUFFER:
			case SHARED:
			case COHERENT:
			case VOLATILE:
			case RESTRICT:
			case READONLY:
			case WRITEONLY:
			case NOPERSPECTIVE:
			case FLAT:
			case SMOOTH:
			case LAYOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(867);
				type_qualifier(0);
				setState(868);
				type_specifier();
				setState(869);
				struct_declarator_list(0);
				setState(870);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_declarator_listContext extends ParserRuleContext {
		public Struct_declaratorContext struct_declarator() {
			return getRuleContext(Struct_declaratorContext.class,0);
		}
		public Struct_declarator_listContext struct_declarator_list() {
			return getRuleContext(Struct_declarator_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GlslParser.COMMA, 0); }
		public Struct_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterStruct_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitStruct_declarator_list(this);
		}
	}

	public final Struct_declarator_listContext struct_declarator_list() throws RecognitionException {
		return struct_declarator_list(0);
	}

	private Struct_declarator_listContext struct_declarator_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Struct_declarator_listContext _localctx = new Struct_declarator_listContext(_ctx, _parentState);
		Struct_declarator_listContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_struct_declarator_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(875);
			struct_declarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(882);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Struct_declarator_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_struct_declarator_list);
					setState(877);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(878);
					match(COMMA);
					setState(879);
					struct_declarator();
					}
					} 
				}
				setState(884);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Struct_declaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GlslParser.IDENTIFIER, 0); }
		public Array_specifierContext array_specifier() {
			return getRuleContext(Array_specifierContext.class,0);
		}
		public Struct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterStruct_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitStruct_declarator(this);
		}
	}

	public final Struct_declaratorContext struct_declarator() throws RecognitionException {
		Struct_declaratorContext _localctx = new Struct_declaratorContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_struct_declarator);
		try {
			setState(888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(885);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(886);
				match(IDENTIFIER);
				setState(887);
				array_specifier(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(GlslParser.LEFT_BRACE, 0); }
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GlslParser.RIGHT_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(GlslParser.COMMA, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_initializer);
		try {
			setState(900);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				assignment_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(891);
				match(LEFT_BRACE);
				setState(892);
				initializer_list(0);
				setState(893);
				match(RIGHT_BRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(895);
				match(LEFT_BRACE);
				setState(896);
				initializer_list(0);
				setState(897);
				match(COMMA);
				setState(898);
				match(RIGHT_BRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_listContext extends ParserRuleContext {
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GlslParser.COMMA, 0); }
		public Initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterInitializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitInitializer_list(this);
		}
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		return initializer_list(0);
	}

	private Initializer_listContext initializer_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, _parentState);
		Initializer_listContext _prevctx = _localctx;
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_initializer_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(903);
			initializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(910);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Initializer_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializer_list);
					setState(905);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(906);
					match(COMMA);
					setState(907);
					initializer();
					}
					} 
				}
				setState(912);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Declaration_statementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Declaration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterDeclaration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitDeclaration_statement(this);
		}
	}

	public final Declaration_statementContext declaration_statement() throws RecognitionException {
		Declaration_statementContext _localctx = new Declaration_statementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_declaration_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Simple_statementContext simple_statement() {
			return getRuleContext(Simple_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_statement);
		try {
			setState(917);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(915);
				compound_statement();
				}
				break;
			case LEFT_PAREN:
			case SEMICOLON:
			case DEFINE:
			case INVARIANT:
			case PRECISE:
			case HIGH_PRECISION:
			case MEDIUM_PRECISION:
			case LOW_PRECISION:
			case PRECISION:
			case STRUCT:
			case VOID:
			case WHILE:
			case CONST:
			case BOOL:
			case FLOAT:
			case DOUBLE:
			case INT:
			case UINT:
			case BREAK:
			case CONTINUE:
			case DO:
			case FOR:
			case IF:
			case DISCARD:
			case RETURN:
			case SWITCH:
			case CASE:
			case DEFAULT:
			case SUBROUTINE:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case IVEC2:
			case IVEC3:
			case IVEC4:
			case UVEC2:
			case UVEC3:
			case UVEC4:
			case VEC2:
			case VEC3:
			case VEC4:
			case MAT2:
			case MAT3:
			case MAT4:
			case CENTROID:
			case IN:
			case OUT:
			case INOUT:
			case UNIFORM:
			case PATCH:
			case SAMPLE:
			case BUFFER:
			case SHARED:
			case COHERENT:
			case VOLATILE:
			case RESTRICT:
			case READONLY:
			case WRITEONLY:
			case DVEC2:
			case DVEC3:
			case DVEC4:
			case DMAT2:
			case DMAT3:
			case DMAT4:
			case NOPERSPECTIVE:
			case FLAT:
			case SMOOTH:
			case LAYOUT:
			case MAT2X2:
			case MAT2X3:
			case MAT2X4:
			case MAT3X2:
			case MAT3X3:
			case MAT3X4:
			case MAT4X2:
			case MAT4X3:
			case MAT4X4:
			case DMAT2X2:
			case DMAT2X3:
			case DMAT2X4:
			case DMAT3X2:
			case DMAT3X3:
			case DMAT3X4:
			case DMAT4X2:
			case DMAT4X3:
			case DMAT4X4:
			case ATOMIC_UINT:
			case SAMPLER1D:
			case SAMPLER2D:
			case SAMPLER3D:
			case SAMPLERCUBE:
			case SAMPLER1DSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLERCUBESHADOW:
			case SAMPLER1DARRAY:
			case SAMPLER2DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER2DARRAYSHADOW:
			case ISAMPLER1D:
			case ISAMPLER2D:
			case ISAMPLER3D:
			case ISAMPLERCUBE:
			case ISAMPLER1DARRAY:
			case ISAMPLER2DARRAY:
			case USAMPLER1D:
			case USAMPLER2D:
			case USAMPLER3D:
			case USAMPLERCUBE:
			case USAMPLER1DARRAY:
			case USAMPLER2DARRAY:
			case SAMPLER2DRECT:
			case SAMPLER2DRECTSHADOW:
			case ISAMPLER2DRECT:
			case USAMPLER2DRECT:
			case SAMPLERBUFFER:
			case ISAMPLERBUFFER:
			case USAMPLERBUFFER:
			case SAMPLERCUBEARRAY:
			case SAMPLERCUBEARRAYSHADOW:
			case ISAMPLERCUBEARRAY:
			case USAMPLERCUBEARRAY:
			case SAMPLER2DMS:
			case ISAMPLER2DMS:
			case USAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case ISAMPLER2DMSARRAY:
			case USAMPLER2DMSARRAY:
			case IMAGE1D:
			case IIMAGE1D:
			case UIMAGE1D:
			case IMAGE2D:
			case IIMAGE2D:
			case UIMAGE2D:
			case IMAGE3D:
			case IIMAGE3D:
			case UIMAGE3D:
			case IMAGE2DRECT:
			case IIMAGE2DRECT:
			case UIMAGE2DRECT:
			case IMAGECUBE:
			case IIMAGECUBE:
			case UIMAGECUBE:
			case IMAGEBUFFER:
			case IIMAGEBUFFER:
			case UIMAGEBUFFER:
			case IMAGE1DARRAY:
			case IIMAGE1DARRAY:
			case UIMAGE1DARRAY:
			case IMAGE2DARRAY:
			case IIMAGE2DARRAY:
			case UIMAGE2DARRAY:
			case IMAGECUBEARRAY:
			case IIMAGECUBEARRAY:
			case UIMAGECUBEARRAY:
			case IMAGE2DMS:
			case IIMAGE2DMS:
			case UIMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IIMAGE2DMSARRAY:
			case UIMAGE2DMSARRAY:
			case PLUS:
			case DASH:
			case INC_OP:
			case DEC_OP:
			case BANG:
			case TILDE:
			case FLOATCONSTANT:
			case DOUBLECONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
			case BOOLCONSTANT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(916);
				simple_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_statementContext extends ParserRuleContext {
		public Declaration_statementContext declaration_statement() {
			return getRuleContext(Declaration_statementContext.class,0);
		}
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Selection_statementContext selection_statement() {
			return getRuleContext(Selection_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Case_labelContext case_label() {
			return getRuleContext(Case_labelContext.class,0);
		}
		public Iteration_statementContext iteration_statement() {
			return getRuleContext(Iteration_statementContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public Simple_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterSimple_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitSimple_statement(this);
		}
	}

	public final Simple_statementContext simple_statement() throws RecognitionException {
		Simple_statementContext _localctx = new Simple_statementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_simple_statement);
		try {
			setState(926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(919);
				declaration_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(920);
				expression_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(921);
				selection_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(922);
				switch_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(923);
				case_label();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(924);
				iteration_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(925);
				jump_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_statementContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(GlslParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(GlslParser.RIGHT_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitCompound_statement(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_compound_statement);
		try {
			setState(934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(928);
				match(LEFT_BRACE);
				setState(929);
				match(RIGHT_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(930);
				match(LEFT_BRACE);
				setState(931);
				statement_list(0);
				setState(932);
				match(RIGHT_BRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_no_new_scopeContext extends ParserRuleContext {
		public Compound_statement_no_new_scopeContext compound_statement_no_new_scope() {
			return getRuleContext(Compound_statement_no_new_scopeContext.class,0);
		}
		public Simple_statementContext simple_statement() {
			return getRuleContext(Simple_statementContext.class,0);
		}
		public Statement_no_new_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_no_new_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterStatement_no_new_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitStatement_no_new_scope(this);
		}
	}

	public final Statement_no_new_scopeContext statement_no_new_scope() throws RecognitionException {
		Statement_no_new_scopeContext _localctx = new Statement_no_new_scopeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_statement_no_new_scope);
		try {
			setState(938);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(936);
				compound_statement_no_new_scope();
				}
				break;
			case LEFT_PAREN:
			case SEMICOLON:
			case DEFINE:
			case INVARIANT:
			case PRECISE:
			case HIGH_PRECISION:
			case MEDIUM_PRECISION:
			case LOW_PRECISION:
			case PRECISION:
			case STRUCT:
			case VOID:
			case WHILE:
			case CONST:
			case BOOL:
			case FLOAT:
			case DOUBLE:
			case INT:
			case UINT:
			case BREAK:
			case CONTINUE:
			case DO:
			case FOR:
			case IF:
			case DISCARD:
			case RETURN:
			case SWITCH:
			case CASE:
			case DEFAULT:
			case SUBROUTINE:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case IVEC2:
			case IVEC3:
			case IVEC4:
			case UVEC2:
			case UVEC3:
			case UVEC4:
			case VEC2:
			case VEC3:
			case VEC4:
			case MAT2:
			case MAT3:
			case MAT4:
			case CENTROID:
			case IN:
			case OUT:
			case INOUT:
			case UNIFORM:
			case PATCH:
			case SAMPLE:
			case BUFFER:
			case SHARED:
			case COHERENT:
			case VOLATILE:
			case RESTRICT:
			case READONLY:
			case WRITEONLY:
			case DVEC2:
			case DVEC3:
			case DVEC4:
			case DMAT2:
			case DMAT3:
			case DMAT4:
			case NOPERSPECTIVE:
			case FLAT:
			case SMOOTH:
			case LAYOUT:
			case MAT2X2:
			case MAT2X3:
			case MAT2X4:
			case MAT3X2:
			case MAT3X3:
			case MAT3X4:
			case MAT4X2:
			case MAT4X3:
			case MAT4X4:
			case DMAT2X2:
			case DMAT2X3:
			case DMAT2X4:
			case DMAT3X2:
			case DMAT3X3:
			case DMAT3X4:
			case DMAT4X2:
			case DMAT4X3:
			case DMAT4X4:
			case ATOMIC_UINT:
			case SAMPLER1D:
			case SAMPLER2D:
			case SAMPLER3D:
			case SAMPLERCUBE:
			case SAMPLER1DSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLERCUBESHADOW:
			case SAMPLER1DARRAY:
			case SAMPLER2DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER2DARRAYSHADOW:
			case ISAMPLER1D:
			case ISAMPLER2D:
			case ISAMPLER3D:
			case ISAMPLERCUBE:
			case ISAMPLER1DARRAY:
			case ISAMPLER2DARRAY:
			case USAMPLER1D:
			case USAMPLER2D:
			case USAMPLER3D:
			case USAMPLERCUBE:
			case USAMPLER1DARRAY:
			case USAMPLER2DARRAY:
			case SAMPLER2DRECT:
			case SAMPLER2DRECTSHADOW:
			case ISAMPLER2DRECT:
			case USAMPLER2DRECT:
			case SAMPLERBUFFER:
			case ISAMPLERBUFFER:
			case USAMPLERBUFFER:
			case SAMPLERCUBEARRAY:
			case SAMPLERCUBEARRAYSHADOW:
			case ISAMPLERCUBEARRAY:
			case USAMPLERCUBEARRAY:
			case SAMPLER2DMS:
			case ISAMPLER2DMS:
			case USAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case ISAMPLER2DMSARRAY:
			case USAMPLER2DMSARRAY:
			case IMAGE1D:
			case IIMAGE1D:
			case UIMAGE1D:
			case IMAGE2D:
			case IIMAGE2D:
			case UIMAGE2D:
			case IMAGE3D:
			case IIMAGE3D:
			case UIMAGE3D:
			case IMAGE2DRECT:
			case IIMAGE2DRECT:
			case UIMAGE2DRECT:
			case IMAGECUBE:
			case IIMAGECUBE:
			case UIMAGECUBE:
			case IMAGEBUFFER:
			case IIMAGEBUFFER:
			case UIMAGEBUFFER:
			case IMAGE1DARRAY:
			case IIMAGE1DARRAY:
			case UIMAGE1DARRAY:
			case IMAGE2DARRAY:
			case IIMAGE2DARRAY:
			case UIMAGE2DARRAY:
			case IMAGECUBEARRAY:
			case IIMAGECUBEARRAY:
			case UIMAGECUBEARRAY:
			case IMAGE2DMS:
			case IIMAGE2DMS:
			case UIMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IIMAGE2DMSARRAY:
			case UIMAGE2DMSARRAY:
			case PLUS:
			case DASH:
			case INC_OP:
			case DEC_OP:
			case BANG:
			case TILDE:
			case FLOATCONSTANT:
			case DOUBLECONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
			case BOOLCONSTANT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(937);
				simple_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_statement_no_new_scopeContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(GlslParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(GlslParser.RIGHT_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Compound_statement_no_new_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement_no_new_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterCompound_statement_no_new_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitCompound_statement_no_new_scope(this);
		}
	}

	public final Compound_statement_no_new_scopeContext compound_statement_no_new_scope() throws RecognitionException {
		Compound_statement_no_new_scopeContext _localctx = new Compound_statement_no_new_scopeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_compound_statement_no_new_scope);
		try {
			setState(946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(940);
				match(LEFT_BRACE);
				setState(941);
				match(RIGHT_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(942);
				match(LEFT_BRACE);
				setState(943);
				statement_list(0);
				setState(944);
				match(RIGHT_BRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_listContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		return statement_list(0);
	}

	private Statement_listContext statement_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Statement_listContext _localctx = new Statement_listContext(_ctx, _parentState);
		Statement_listContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(949);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(955);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Statement_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statement_list);
					setState(951);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(952);
					statement();
					}
					} 
				}
				setState(957);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expression_statementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(GlslParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitExpression_statement(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_expression_statement);
		try {
			setState(962);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(958);
				match(SEMICOLON);
				}
				break;
			case LEFT_PAREN:
			case STRUCT:
			case VOID:
			case BOOL:
			case FLOAT:
			case DOUBLE:
			case INT:
			case UINT:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case IVEC2:
			case IVEC3:
			case IVEC4:
			case UVEC2:
			case UVEC3:
			case UVEC4:
			case VEC2:
			case VEC3:
			case VEC4:
			case MAT2:
			case MAT3:
			case MAT4:
			case DVEC2:
			case DVEC3:
			case DVEC4:
			case DMAT2:
			case DMAT3:
			case DMAT4:
			case MAT2X2:
			case MAT2X3:
			case MAT2X4:
			case MAT3X2:
			case MAT3X3:
			case MAT3X4:
			case MAT4X2:
			case MAT4X3:
			case MAT4X4:
			case DMAT2X2:
			case DMAT2X3:
			case DMAT2X4:
			case DMAT3X2:
			case DMAT3X3:
			case DMAT3X4:
			case DMAT4X2:
			case DMAT4X3:
			case DMAT4X4:
			case ATOMIC_UINT:
			case SAMPLER1D:
			case SAMPLER2D:
			case SAMPLER3D:
			case SAMPLERCUBE:
			case SAMPLER1DSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLERCUBESHADOW:
			case SAMPLER1DARRAY:
			case SAMPLER2DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER2DARRAYSHADOW:
			case ISAMPLER1D:
			case ISAMPLER2D:
			case ISAMPLER3D:
			case ISAMPLERCUBE:
			case ISAMPLER1DARRAY:
			case ISAMPLER2DARRAY:
			case USAMPLER1D:
			case USAMPLER2D:
			case USAMPLER3D:
			case USAMPLERCUBE:
			case USAMPLER1DARRAY:
			case USAMPLER2DARRAY:
			case SAMPLER2DRECT:
			case SAMPLER2DRECTSHADOW:
			case ISAMPLER2DRECT:
			case USAMPLER2DRECT:
			case SAMPLERBUFFER:
			case ISAMPLERBUFFER:
			case USAMPLERBUFFER:
			case SAMPLERCUBEARRAY:
			case SAMPLERCUBEARRAYSHADOW:
			case ISAMPLERCUBEARRAY:
			case USAMPLERCUBEARRAY:
			case SAMPLER2DMS:
			case ISAMPLER2DMS:
			case USAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case ISAMPLER2DMSARRAY:
			case USAMPLER2DMSARRAY:
			case IMAGE1D:
			case IIMAGE1D:
			case UIMAGE1D:
			case IMAGE2D:
			case IIMAGE2D:
			case UIMAGE2D:
			case IMAGE3D:
			case IIMAGE3D:
			case UIMAGE3D:
			case IMAGE2DRECT:
			case IIMAGE2DRECT:
			case UIMAGE2DRECT:
			case IMAGECUBE:
			case IIMAGECUBE:
			case UIMAGECUBE:
			case IMAGEBUFFER:
			case IIMAGEBUFFER:
			case UIMAGEBUFFER:
			case IMAGE1DARRAY:
			case IIMAGE1DARRAY:
			case UIMAGE1DARRAY:
			case IMAGE2DARRAY:
			case IIMAGE2DARRAY:
			case UIMAGE2DARRAY:
			case IMAGECUBEARRAY:
			case IIMAGECUBEARRAY:
			case UIMAGECUBEARRAY:
			case IMAGE2DMS:
			case IIMAGE2DMS:
			case UIMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IIMAGE2DMSARRAY:
			case UIMAGE2DMSARRAY:
			case PLUS:
			case DASH:
			case INC_OP:
			case DEC_OP:
			case BANG:
			case TILDE:
			case FLOATCONSTANT:
			case DOUBLECONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
			case BOOLCONSTANT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(959);
				expression(0);
				setState(960);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selection_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GlslParser.IF, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GlslParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GlslParser.RIGHT_PAREN, 0); }
		public Selection_rest_statementContext selection_rest_statement() {
			return getRuleContext(Selection_rest_statementContext.class,0);
		}
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterSelection_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitSelection_statement(this);
		}
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_selection_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(IF);
			setState(965);
			match(LEFT_PAREN);
			setState(966);
			expression(0);
			setState(967);
			match(RIGHT_PAREN);
			setState(968);
			selection_rest_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selection_rest_statementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GlslParser.ELSE, 0); }
		public Selection_rest_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_rest_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterSelection_rest_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitSelection_rest_statement(this);
		}
	}

	public final Selection_rest_statementContext selection_rest_statement() throws RecognitionException {
		Selection_rest_statementContext _localctx = new Selection_rest_statementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_selection_rest_statement);
		try {
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(970);
				statement();
				setState(971);
				match(ELSE);
				setState(972);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(974);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Fully_specified_typeContext fully_specified_type() {
			return getRuleContext(Fully_specified_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GlslParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(GlslParser.EQUAL, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_condition);
		try {
			setState(983);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(977);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(978);
				fully_specified_type();
				setState(979);
				match(IDENTIFIER);
				setState(980);
				match(EQUAL);
				setState(981);
				initializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_statementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(GlslParser.SWITCH, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GlslParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GlslParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(GlslParser.LEFT_BRACE, 0); }
		public Switch_statement_listContext switch_statement_list() {
			return getRuleContext(Switch_statement_listContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GlslParser.RIGHT_BRACE, 0); }
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitSwitch_statement(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			match(SWITCH);
			setState(986);
			match(LEFT_PAREN);
			setState(987);
			expression(0);
			setState(988);
			match(RIGHT_PAREN);
			setState(989);
			match(LEFT_BRACE);
			setState(990);
			switch_statement_list();
			setState(991);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_statement_listContext extends ParserRuleContext {
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Switch_statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterSwitch_statement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitSwitch_statement_list(this);
		}
	}

	public final Switch_statement_listContext switch_statement_list() throws RecognitionException {
		Switch_statement_listContext _localctx = new Switch_statement_listContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_switch_statement_list);
		try {
			setState(995);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RIGHT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case LEFT_PAREN:
			case LEFT_BRACE:
			case SEMICOLON:
			case DEFINE:
			case INVARIANT:
			case PRECISE:
			case HIGH_PRECISION:
			case MEDIUM_PRECISION:
			case LOW_PRECISION:
			case PRECISION:
			case STRUCT:
			case VOID:
			case WHILE:
			case CONST:
			case BOOL:
			case FLOAT:
			case DOUBLE:
			case INT:
			case UINT:
			case BREAK:
			case CONTINUE:
			case DO:
			case FOR:
			case IF:
			case DISCARD:
			case RETURN:
			case SWITCH:
			case CASE:
			case DEFAULT:
			case SUBROUTINE:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case IVEC2:
			case IVEC3:
			case IVEC4:
			case UVEC2:
			case UVEC3:
			case UVEC4:
			case VEC2:
			case VEC3:
			case VEC4:
			case MAT2:
			case MAT3:
			case MAT4:
			case CENTROID:
			case IN:
			case OUT:
			case INOUT:
			case UNIFORM:
			case PATCH:
			case SAMPLE:
			case BUFFER:
			case SHARED:
			case COHERENT:
			case VOLATILE:
			case RESTRICT:
			case READONLY:
			case WRITEONLY:
			case DVEC2:
			case DVEC3:
			case DVEC4:
			case DMAT2:
			case DMAT3:
			case DMAT4:
			case NOPERSPECTIVE:
			case FLAT:
			case SMOOTH:
			case LAYOUT:
			case MAT2X2:
			case MAT2X3:
			case MAT2X4:
			case MAT3X2:
			case MAT3X3:
			case MAT3X4:
			case MAT4X2:
			case MAT4X3:
			case MAT4X4:
			case DMAT2X2:
			case DMAT2X3:
			case DMAT2X4:
			case DMAT3X2:
			case DMAT3X3:
			case DMAT3X4:
			case DMAT4X2:
			case DMAT4X3:
			case DMAT4X4:
			case ATOMIC_UINT:
			case SAMPLER1D:
			case SAMPLER2D:
			case SAMPLER3D:
			case SAMPLERCUBE:
			case SAMPLER1DSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLERCUBESHADOW:
			case SAMPLER1DARRAY:
			case SAMPLER2DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER2DARRAYSHADOW:
			case ISAMPLER1D:
			case ISAMPLER2D:
			case ISAMPLER3D:
			case ISAMPLERCUBE:
			case ISAMPLER1DARRAY:
			case ISAMPLER2DARRAY:
			case USAMPLER1D:
			case USAMPLER2D:
			case USAMPLER3D:
			case USAMPLERCUBE:
			case USAMPLER1DARRAY:
			case USAMPLER2DARRAY:
			case SAMPLER2DRECT:
			case SAMPLER2DRECTSHADOW:
			case ISAMPLER2DRECT:
			case USAMPLER2DRECT:
			case SAMPLERBUFFER:
			case ISAMPLERBUFFER:
			case USAMPLERBUFFER:
			case SAMPLERCUBEARRAY:
			case SAMPLERCUBEARRAYSHADOW:
			case ISAMPLERCUBEARRAY:
			case USAMPLERCUBEARRAY:
			case SAMPLER2DMS:
			case ISAMPLER2DMS:
			case USAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case ISAMPLER2DMSARRAY:
			case USAMPLER2DMSARRAY:
			case IMAGE1D:
			case IIMAGE1D:
			case UIMAGE1D:
			case IMAGE2D:
			case IIMAGE2D:
			case UIMAGE2D:
			case IMAGE3D:
			case IIMAGE3D:
			case UIMAGE3D:
			case IMAGE2DRECT:
			case IIMAGE2DRECT:
			case UIMAGE2DRECT:
			case IMAGECUBE:
			case IIMAGECUBE:
			case UIMAGECUBE:
			case IMAGEBUFFER:
			case IIMAGEBUFFER:
			case UIMAGEBUFFER:
			case IMAGE1DARRAY:
			case IIMAGE1DARRAY:
			case UIMAGE1DARRAY:
			case IMAGE2DARRAY:
			case IIMAGE2DARRAY:
			case UIMAGE2DARRAY:
			case IMAGECUBEARRAY:
			case IIMAGECUBEARRAY:
			case UIMAGECUBEARRAY:
			case IMAGE2DMS:
			case IIMAGE2DMS:
			case UIMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IIMAGE2DMSARRAY:
			case UIMAGE2DMSARRAY:
			case PLUS:
			case DASH:
			case INC_OP:
			case DEC_OP:
			case BANG:
			case TILDE:
			case FLOATCONSTANT:
			case DOUBLECONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
			case BOOLCONSTANT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				statement_list(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_labelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(GlslParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GlslParser.COLON, 0); }
		public TerminalNode DEFAULT() { return getToken(GlslParser.DEFAULT, 0); }
		public Case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterCase_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitCase_label(this);
		}
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_case_label);
		try {
			setState(1003);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(997);
				match(CASE);
				setState(998);
				expression(0);
				setState(999);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1001);
				match(DEFAULT);
				setState(1002);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Iteration_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GlslParser.WHILE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GlslParser.LEFT_PAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GlslParser.RIGHT_PAREN, 0); }
		public Statement_no_new_scopeContext statement_no_new_scope() {
			return getRuleContext(Statement_no_new_scopeContext.class,0);
		}
		public TerminalNode DO() { return getToken(GlslParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GlslParser.SEMICOLON, 0); }
		public TerminalNode FOR() { return getToken(GlslParser.FOR, 0); }
		public For_init_statementContext for_init_statement() {
			return getRuleContext(For_init_statementContext.class,0);
		}
		public For_rest_statementContext for_rest_statement() {
			return getRuleContext(For_rest_statementContext.class,0);
		}
		public Iteration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterIteration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitIteration_statement(this);
		}
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_iteration_statement);
		try {
			setState(1026);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1005);
				match(WHILE);
				setState(1006);
				match(LEFT_PAREN);
				setState(1007);
				condition();
				setState(1008);
				match(RIGHT_PAREN);
				setState(1009);
				statement_no_new_scope();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
				match(DO);
				setState(1012);
				statement();
				setState(1013);
				match(WHILE);
				setState(1014);
				match(LEFT_PAREN);
				setState(1015);
				expression(0);
				setState(1016);
				match(RIGHT_PAREN);
				setState(1017);
				match(SEMICOLON);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1019);
				match(FOR);
				setState(1020);
				match(LEFT_PAREN);
				setState(1021);
				for_init_statement();
				setState(1022);
				for_rest_statement();
				setState(1023);
				match(RIGHT_PAREN);
				setState(1024);
				statement_no_new_scope();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_init_statementContext extends ParserRuleContext {
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Declaration_statementContext declaration_statement() {
			return getRuleContext(Declaration_statementContext.class,0);
		}
		public For_init_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterFor_init_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitFor_init_statement(this);
		}
	}

	public final For_init_statementContext for_init_statement() throws RecognitionException {
		For_init_statementContext _localctx = new For_init_statementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_for_init_statement);
		try {
			setState(1030);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1028);
				expression_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
				declaration_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionoptContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionoptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionopt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterConditionopt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitConditionopt(this);
		}
	}

	public final ConditionoptContext conditionopt() throws RecognitionException {
		ConditionoptContext _localctx = new ConditionoptContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_conditionopt);
		try {
			setState(1034);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
			case INVARIANT:
			case PRECISE:
			case HIGH_PRECISION:
			case MEDIUM_PRECISION:
			case LOW_PRECISION:
			case STRUCT:
			case VOID:
			case CONST:
			case BOOL:
			case FLOAT:
			case DOUBLE:
			case INT:
			case UINT:
			case SUBROUTINE:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case IVEC2:
			case IVEC3:
			case IVEC4:
			case UVEC2:
			case UVEC3:
			case UVEC4:
			case VEC2:
			case VEC3:
			case VEC4:
			case MAT2:
			case MAT3:
			case MAT4:
			case CENTROID:
			case IN:
			case OUT:
			case INOUT:
			case UNIFORM:
			case PATCH:
			case SAMPLE:
			case BUFFER:
			case SHARED:
			case COHERENT:
			case VOLATILE:
			case RESTRICT:
			case READONLY:
			case WRITEONLY:
			case DVEC2:
			case DVEC3:
			case DVEC4:
			case DMAT2:
			case DMAT3:
			case DMAT4:
			case NOPERSPECTIVE:
			case FLAT:
			case SMOOTH:
			case LAYOUT:
			case MAT2X2:
			case MAT2X3:
			case MAT2X4:
			case MAT3X2:
			case MAT3X3:
			case MAT3X4:
			case MAT4X2:
			case MAT4X3:
			case MAT4X4:
			case DMAT2X2:
			case DMAT2X3:
			case DMAT2X4:
			case DMAT3X2:
			case DMAT3X3:
			case DMAT3X4:
			case DMAT4X2:
			case DMAT4X3:
			case DMAT4X4:
			case ATOMIC_UINT:
			case SAMPLER1D:
			case SAMPLER2D:
			case SAMPLER3D:
			case SAMPLERCUBE:
			case SAMPLER1DSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLERCUBESHADOW:
			case SAMPLER1DARRAY:
			case SAMPLER2DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER2DARRAYSHADOW:
			case ISAMPLER1D:
			case ISAMPLER2D:
			case ISAMPLER3D:
			case ISAMPLERCUBE:
			case ISAMPLER1DARRAY:
			case ISAMPLER2DARRAY:
			case USAMPLER1D:
			case USAMPLER2D:
			case USAMPLER3D:
			case USAMPLERCUBE:
			case USAMPLER1DARRAY:
			case USAMPLER2DARRAY:
			case SAMPLER2DRECT:
			case SAMPLER2DRECTSHADOW:
			case ISAMPLER2DRECT:
			case USAMPLER2DRECT:
			case SAMPLERBUFFER:
			case ISAMPLERBUFFER:
			case USAMPLERBUFFER:
			case SAMPLERCUBEARRAY:
			case SAMPLERCUBEARRAYSHADOW:
			case ISAMPLERCUBEARRAY:
			case USAMPLERCUBEARRAY:
			case SAMPLER2DMS:
			case ISAMPLER2DMS:
			case USAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case ISAMPLER2DMSARRAY:
			case USAMPLER2DMSARRAY:
			case IMAGE1D:
			case IIMAGE1D:
			case UIMAGE1D:
			case IMAGE2D:
			case IIMAGE2D:
			case UIMAGE2D:
			case IMAGE3D:
			case IIMAGE3D:
			case UIMAGE3D:
			case IMAGE2DRECT:
			case IIMAGE2DRECT:
			case UIMAGE2DRECT:
			case IMAGECUBE:
			case IIMAGECUBE:
			case UIMAGECUBE:
			case IMAGEBUFFER:
			case IIMAGEBUFFER:
			case UIMAGEBUFFER:
			case IMAGE1DARRAY:
			case IIMAGE1DARRAY:
			case UIMAGE1DARRAY:
			case IMAGE2DARRAY:
			case IIMAGE2DARRAY:
			case UIMAGE2DARRAY:
			case IMAGECUBEARRAY:
			case IIMAGECUBEARRAY:
			case UIMAGECUBEARRAY:
			case IMAGE2DMS:
			case IIMAGE2DMS:
			case UIMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IIMAGE2DMSARRAY:
			case UIMAGE2DMSARRAY:
			case PLUS:
			case DASH:
			case INC_OP:
			case DEC_OP:
			case BANG:
			case TILDE:
			case FLOATCONSTANT:
			case DOUBLECONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
			case BOOLCONSTANT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1032);
				condition();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_rest_statementContext extends ParserRuleContext {
		public ConditionoptContext conditionopt() {
			return getRuleContext(ConditionoptContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GlslParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_rest_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_rest_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterFor_rest_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitFor_rest_statement(this);
		}
	}

	public final For_rest_statementContext for_rest_statement() throws RecognitionException {
		For_rest_statementContext _localctx = new For_rest_statementContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_for_rest_statement);
		try {
			setState(1043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1036);
				conditionopt();
				setState(1037);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1039);
				conditionopt();
				setState(1040);
				match(SEMICOLON);
				setState(1041);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jump_statementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(GlslParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(GlslParser.SEMICOLON, 0); }
		public TerminalNode BREAK() { return getToken(GlslParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(GlslParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DISCARD() { return getToken(GlslParser.DISCARD, 0); }
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterJump_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitJump_statement(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_jump_statement);
		try {
			setState(1057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1045);
				match(CONTINUE);
				setState(1046);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1047);
				match(BREAK);
				setState(1048);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1049);
				match(RETURN);
				setState(1050);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1051);
				match(RETURN);
				setState(1052);
				expression(0);
				setState(1053);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1055);
				match(DISCARD);
				setState(1056);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Translation_unitContext extends ParserRuleContext {
		public External_declarationContext external_declaration() {
			return getRuleContext(External_declarationContext.class,0);
		}
		public Translation_unitContext translation_unit() {
			return getRuleContext(Translation_unitContext.class,0);
		}
		public Translation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterTranslation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitTranslation_unit(this);
		}
	}

	public final Translation_unitContext translation_unit() throws RecognitionException {
		return translation_unit(0);
	}

	private Translation_unitContext translation_unit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Translation_unitContext _localctx = new Translation_unitContext(_ctx, _parentState);
		Translation_unitContext _prevctx = _localctx;
		int _startState = 164;
		enterRecursionRule(_localctx, 164, RULE_translation_unit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1060);
			external_declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1066);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Translation_unitContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_translation_unit);
					setState(1062);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1063);
					external_declaration();
					}
					} 
				}
				setState(1068);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class External_declarationContext extends ParserRuleContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GlslParser.SEMICOLON, 0); }
		public External_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterExternal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitExternal_declaration(this);
		}
	}

	public final External_declarationContext external_declaration() throws RecognitionException {
		External_declarationContext _localctx = new External_declarationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_external_declaration);
		try {
			setState(1072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1069);
				function_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1070);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1071);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definitionContext extends ParserRuleContext {
		public Function_prototypeContext function_prototype() {
			return getRuleContext(Function_prototypeContext.class,0);
		}
		public Compound_statement_no_new_scopeContext compound_statement_no_new_scope() {
			return getRuleContext(Compound_statement_no_new_scopeContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlslListener ) ((GlslListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			function_prototype();
			setState(1075);
			compound_statement_no_new_scope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		case 9:
			return function_call_header_with_parameters_sempred((Function_call_header_with_parametersContext)_localctx, predIndex);
		case 14:
			return multiplicative_expression_sempred((Multiplicative_expressionContext)_localctx, predIndex);
		case 15:
			return additive_expression_sempred((Additive_expressionContext)_localctx, predIndex);
		case 16:
			return shift_expression_sempred((Shift_expressionContext)_localctx, predIndex);
		case 17:
			return relational_expression_sempred((Relational_expressionContext)_localctx, predIndex);
		case 18:
			return equality_expression_sempred((Equality_expressionContext)_localctx, predIndex);
		case 19:
			return and_expression_sempred((And_expressionContext)_localctx, predIndex);
		case 20:
			return exclusive_or_expression_sempred((Exclusive_or_expressionContext)_localctx, predIndex);
		case 21:
			return inclusive_or_expression_sempred((Inclusive_or_expressionContext)_localctx, predIndex);
		case 22:
			return logical_and_expression_sempred((Logical_and_expressionContext)_localctx, predIndex);
		case 23:
			return logical_xor_expression_sempred((Logical_xor_expressionContext)_localctx, predIndex);
		case 24:
			return logical_or_expression_sempred((Logical_or_expressionContext)_localctx, predIndex);
		case 28:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 31:
			return identifier_list_sempred((Identifier_listContext)_localctx, predIndex);
		case 34:
			return function_header_with_parameters_sempred((Function_header_with_parametersContext)_localctx, predIndex);
		case 39:
			return init_declarator_list_sempred((Init_declarator_listContext)_localctx, predIndex);
		case 45:
			return layout_qualifier_id_list_sempred((Layout_qualifier_id_listContext)_localctx, predIndex);
		case 48:
			return type_qualifier_sempred((Type_qualifierContext)_localctx, predIndex);
		case 51:
			return type_name_list_sempred((Type_name_listContext)_localctx, predIndex);
		case 53:
			return array_specifier_sempred((Array_specifierContext)_localctx, predIndex);
		case 57:
			return struct_declaration_list_sempred((Struct_declaration_listContext)_localctx, predIndex);
		case 59:
			return struct_declarator_list_sempred((Struct_declarator_listContext)_localctx, predIndex);
		case 62:
			return initializer_list_sempred((Initializer_listContext)_localctx, predIndex);
		case 69:
			return statement_list_sempred((Statement_listContext)_localctx, predIndex);
		case 82:
			return translation_unit_sempred((Translation_unitContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean function_call_header_with_parameters_sempred(Function_call_header_with_parametersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicative_expression_sempred(Multiplicative_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additive_expression_sempred(Additive_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shift_expression_sempred(Shift_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relational_expression_sempred(Relational_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equality_expression_sempred(Equality_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean and_expression_sempred(And_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusive_or_expression_sempred(Exclusive_or_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusive_or_expression_sempred(Inclusive_or_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logical_and_expression_sempred(Logical_and_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logical_xor_expression_sempred(Logical_xor_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logical_or_expression_sempred(Logical_or_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identifier_list_sempred(Identifier_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean function_header_with_parameters_sempred(Function_header_with_parametersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean init_declarator_list_sempred(Init_declarator_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 4);
		case 28:
			return precpred(_ctx, 3);
		case 29:
			return precpred(_ctx, 2);
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean layout_qualifier_id_list_sempred(Layout_qualifier_id_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_qualifier_sempred(Type_qualifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_name_list_sempred(Type_name_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean array_specifier_sempred(Array_specifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 2);
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean struct_declaration_list_sempred(Struct_declaration_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean struct_declarator_list_sempred(Struct_declarator_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializer_list_sempred(Initializer_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statement_list_sempred(Statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean translation_unit_sempred(Translation_unitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00d9\u0438\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00b7\n\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c8\n\6"+
		"\3\7\3\7\3\7\5\7\u00cd\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7\u00db\n\7\f\7\16\7\u00de\13\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u00e8\n\t\3\n\3\n\3\n\3\n\5\n\u00ee\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u00f7\n\13\f\13\16\13\u00fa\13\13\3\f\3\f\3\f\3\r\3\r"+
		"\5\r\u0101\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u010b\n\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u011b\n\20\f\20\16\20\u011e\13\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u0129\n\21\f\21\16\21\u012c\13\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0137\n\22\f\22\16\22\u013a\13\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u014b\n\23\f\23\16\23\u014e\13\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u0159\n\24\f\24\16\24\u015c\13\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u0164\n\25\f\25\16\25\u0167\13\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\7\26\u016f\n\26\f\26\16\26\u0172\13\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u017a\n\27\f\27\16\27\u017d\13\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u0185\n\30\f\30\16\30\u0188\13\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\7\31\u0190\n\31\f\31\16\31\u0193\13\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\7\32\u019b\n\32\f\32\16\32\u019e\13\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u01a7\n\33\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u01ae\n\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u01b8\n\36\f"+
		"\36\16\36\u01bb\13\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01f1\n \3!\3!\3!\3!\3"+
		"!\3!\3!\7!\u01fa\n!\f!\16!\u01fd\13!\3\"\3\"\3\"\3#\3#\5#\u0204\n#\3$"+
		"\3$\3$\3$\3$\3$\3$\7$\u020d\n$\f$\16$\u0210\13$\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\5&\u021d\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0227\n\'\3"+
		"(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\7)\u0241\n)\f)\16)\u0244\13)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\5*\u0259\n*\3+\3+\3+\3+\5+\u025f\n+\3,\3,\3-\3-\3."+
		"\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\7/\u0270\n/\f/\16/\u0273\13/\3\60\3\60"+
		"\3\60\3\60\3\60\5\60\u027a\n\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\7\62"+
		"\u0283\n\62\f\62\16\62\u0286\13\62\3\63\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u028e\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u02a5\n\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\7\65\u02ad\n\65\f\65\16\65\u02b0\13\65\3\66\3\66"+
		"\3\66\3\66\5\66\u02b6\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u02bf"+
		"\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u02c9\n\67\f\67\16"+
		"\67\u02cc\13\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\58\u0347\n8\39\39\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\5:\u0356\n:\3;\3;\3;\3;\3;\7;\u035d\n;\f;\16;\u0360\13"+
		";\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u036b\n<\3=\3=\3=\3=\3=\3=\7=\u0373\n"+
		"=\f=\16=\u0376\13=\3>\3>\3>\5>\u037b\n>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?"+
		"\5?\u0387\n?\3@\3@\3@\3@\3@\3@\7@\u038f\n@\f@\16@\u0392\13@\3A\3A\3B\3"+
		"B\5B\u0398\nB\3C\3C\3C\3C\3C\3C\3C\5C\u03a1\nC\3D\3D\3D\3D\3D\3D\5D\u03a9"+
		"\nD\3E\3E\5E\u03ad\nE\3F\3F\3F\3F\3F\3F\5F\u03b5\nF\3G\3G\3G\3G\3G\7G"+
		"\u03bc\nG\fG\16G\u03bf\13G\3H\3H\3H\3H\5H\u03c5\nH\3I\3I\3I\3I\3I\3I\3"+
		"J\3J\3J\3J\3J\5J\u03d2\nJ\3K\3K\3K\3K\3K\3K\5K\u03da\nK\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3M\3M\5M\u03e6\nM\3N\3N\3N\3N\3N\3N\5N\u03ee\nN\3O\3O\3O\3"+
		"O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0405\nO\3P\3"+
		"P\5P\u0409\nP\3Q\3Q\5Q\u040d\nQ\3R\3R\3R\3R\3R\3R\3R\5R\u0416\nR\3S\3"+
		"S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u0424\nS\3T\3T\3T\3T\3T\7T\u042b\n"+
		"T\fT\16T\u042e\13T\3U\3U\3U\5U\u0433\nU\3V\3V\3V\3V\2\34\f\24\36 \"$&"+
		"(*,.\60\62:@FP\\bhltx~\u008c\u00a6W\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\2\6\5\2\u00b0\u00b1\u00bf"+
		"\u00bf\u00c3\u00c3\3\2\u00c6\u00d0\3\2PR\3\2\22\24\u04df\2\u00ac\3\2\2"+
		"\2\4\u00b6\3\2\2\2\6\u00b8\3\2\2\2\b\u00bb\3\2\2\2\n\u00c7\3\2\2\2\f\u00cc"+
		"\3\2\2\2\16\u00df\3\2\2\2\20\u00e7\3\2\2\2\22\u00ed\3\2\2\2\24\u00ef\3"+
		"\2\2\2\26\u00fb\3\2\2\2\30\u0100\3\2\2\2\32\u010a\3\2\2\2\34\u010c\3\2"+
		"\2\2\36\u010e\3\2\2\2 \u011f\3\2\2\2\"\u012d\3\2\2\2$\u013b\3\2\2\2&\u014f"+
		"\3\2\2\2(\u015d\3\2\2\2*\u0168\3\2\2\2,\u0173\3\2\2\2.\u017e\3\2\2\2\60"+
		"\u0189\3\2\2\2\62\u0194\3\2\2\2\64\u01a6\3\2\2\2\66\u01ad\3\2\2\28\u01af"+
		"\3\2\2\2:\u01b1\3\2\2\2<\u01bc\3\2\2\2>\u01f0\3\2\2\2@\u01f2\3\2\2\2B"+
		"\u01fe\3\2\2\2D\u0203\3\2\2\2F\u0205\3\2\2\2H\u0211\3\2\2\2J\u021c\3\2"+
		"\2\2L\u0226\3\2\2\2N\u0228\3\2\2\2P\u022a\3\2\2\2R\u0258\3\2\2\2T\u025e"+
		"\3\2\2\2V\u0260\3\2\2\2X\u0262\3\2\2\2Z\u0264\3\2\2\2\\\u0269\3\2\2\2"+
		"^\u0279\3\2\2\2`\u027b\3\2\2\2b\u027d\3\2\2\2d\u028d\3\2\2\2f\u02a4\3"+
		"\2\2\2h\u02a6\3\2\2\2j\u02b5\3\2\2\2l\u02be\3\2\2\2n\u0346\3\2\2\2p\u0348"+
		"\3\2\2\2r\u0355\3\2\2\2t\u0357\3\2\2\2v\u036a\3\2\2\2x\u036c\3\2\2\2z"+
		"\u037a\3\2\2\2|\u0386\3\2\2\2~\u0388\3\2\2\2\u0080\u0393\3\2\2\2\u0082"+
		"\u0397\3\2\2\2\u0084\u03a0\3\2\2\2\u0086\u03a8\3\2\2\2\u0088\u03ac\3\2"+
		"\2\2\u008a\u03b4\3\2\2\2\u008c\u03b6\3\2\2\2\u008e\u03c4\3\2\2\2\u0090"+
		"\u03c6\3\2\2\2\u0092\u03d1\3\2\2\2\u0094\u03d9\3\2\2\2\u0096\u03db\3\2"+
		"\2\2\u0098\u03e5\3\2\2\2\u009a\u03ed\3\2\2\2\u009c\u0404\3\2\2\2\u009e"+
		"\u0408\3\2\2\2\u00a0\u040c\3\2\2\2\u00a2\u0415\3\2\2\2\u00a4\u0423\3\2"+
		"\2\2\u00a6\u0425\3\2\2\2\u00a8\u0432\3\2\2\2\u00aa\u0434\3\2\2\2\u00ac"+
		"\u00ad\5\6\4\2\u00ad\u00ae\5\4\3\2\u00ae\3\3\2\2\2\u00af\u00b0\5> \2\u00b0"+
		"\u00b1\5\4\3\2\u00b1\u00b7\3\2\2\2\u00b2\u00b3\5\u00aaV\2\u00b3\u00b4"+
		"\5\4\3\2\u00b4\u00b7\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00af\3\2\2\2\u00b6"+
		"\u00b2\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\5\3\2\2\2\u00b8\u00b9\7\16\2"+
		"\2\u00b9\u00ba\7\u00d3\2\2\u00ba\7\3\2\2\2\u00bb\u00bc\7\u00d6\2\2\u00bc"+
		"\t\3\2\2\2\u00bd\u00c8\5\b\5\2\u00be\u00c8\7\u00d3\2\2\u00bf\u00c8\7\u00d4"+
		"\2\2\u00c0\u00c8\7\u00d1\2\2\u00c1\u00c8\7\u00d5\2\2\u00c2\u00c8\7\u00d2"+
		"\2\2\u00c3\u00c4\7\3\2\2\u00c4\u00c5\5:\36\2\u00c5\u00c6\7\4\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00bd\3\2\2\2\u00c7\u00be\3\2\2\2\u00c7\u00bf\3\2"+
		"\2\2\u00c7\u00c0\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7"+
		"\u00c3\3\2\2\2\u00c8\13\3\2\2\2\u00c9\u00ca\b\7\1\2\u00ca\u00cd\5\n\6"+
		"\2\u00cb\u00cd\5\20\t\2\u00cc\u00c9\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\u00dc\3\2\2\2\u00ce\u00cf\f\7\2\2\u00cf\u00d0\7\5\2\2\u00d0\u00d1\5\16"+
		"\b\2\u00d1\u00d2\7\6\2\2\u00d2\u00db\3\2\2\2\u00d3\u00d4\f\5\2\2\u00d4"+
		"\u00d5\7\t\2\2\u00d5\u00db\7\r\2\2\u00d6\u00d7\f\4\2\2\u00d7\u00db\7\u00b5"+
		"\2\2\u00d8\u00d9\f\3\2\2\u00d9\u00db\7\u00b6\2\2\u00da\u00ce\3\2\2\2\u00da"+
		"\u00d3\3\2\2\2\u00da\u00d6\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00de\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\r\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00df\u00e0\5:\36\2\u00e0\17\3\2\2\2\u00e1\u00e2\5\24\13\2\u00e2"+
		"\u00e3\7\4\2\2\u00e3\u00e8\3\2\2\2\u00e4\u00e5\5\22\n\2\u00e5\u00e6\7"+
		"\4\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e8"+
		"\21\3\2\2\2\u00e9\u00ea\5\26\f\2\u00ea\u00eb\7\27\2\2\u00eb\u00ee\3\2"+
		"\2\2\u00ec\u00ee\5\26\f\2\u00ed\u00e9\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee"+
		"\23\3\2\2\2\u00ef\u00f0\b\13\1\2\u00f0\u00f1\5\26\f\2\u00f1\u00f2\5\66"+
		"\34\2\u00f2\u00f8\3\2\2\2\u00f3\u00f4\f\3\2\2\u00f4\u00f5\7\n\2\2\u00f5"+
		"\u00f7\5\66\34\2\u00f6\u00f3\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\25\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00fc\5\30\r\2\u00fc\u00fd\7\3\2\2\u00fd\27\3\2\2\2\u00fe\u0101\5j\66"+
		"\2\u00ff\u0101\7\u00d6\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101"+
		"\31\3\2\2\2\u0102\u010b\5\f\7\2\u0103\u0104\7\u00b5\2\2\u0104\u010b\5"+
		"\32\16\2\u0105\u0106\7\u00b6\2\2\u0106\u010b\5\32\16\2\u0107\u0108\5\34"+
		"\17\2\u0108\u0109\5\32\16\2\u0109\u010b\3\2\2\2\u010a\u0102\3\2\2\2\u010a"+
		"\u0103\3\2\2\2\u010a\u0105\3\2\2\2\u010a\u0107\3\2\2\2\u010b\33\3\2\2"+
		"\2\u010c\u010d\t\2\2\2\u010d\35\3\2\2\2\u010e\u010f\b\20\1\2\u010f\u0110"+
		"\5\32\16\2\u0110\u011c\3\2\2\2\u0111\u0112\f\5\2\2\u0112\u0113\7\u00b2"+
		"\2\2\u0113\u011b\5\32\16\2\u0114\u0115\f\4\2\2\u0115\u0116\7\u00b3\2\2"+
		"\u0116\u011b\5\32\16\2\u0117\u0118\f\3\2\2\u0118\u0119\7\u00b4\2\2\u0119"+
		"\u011b\5\32\16\2\u011a\u0111\3\2\2\2\u011a\u0114\3\2\2\2\u011a\u0117\3"+
		"\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\37\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\b\21\1\2\u0120\u0121\5\36"+
		"\20\2\u0121\u012a\3\2\2\2\u0122\u0123\f\4\2\2\u0123\u0124\7\u00b0\2\2"+
		"\u0124\u0129\5\36\20\2\u0125\u0126\f\3\2\2\u0126\u0127\7\u00b1\2\2\u0127"+
		"\u0129\5\36\20\2\u0128\u0122\3\2\2\2\u0128\u0125\3\2\2\2\u0129\u012c\3"+
		"\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b!\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012d\u012e\b\22\1\2\u012e\u012f\5 \21\2\u012f\u0138\3\2\2\2"+
		"\u0130\u0131\f\4\2\2\u0131\u0132\7\u00c4\2\2\u0132\u0137\5 \21\2\u0133"+
		"\u0134\f\3\2\2\u0134\u0135\7\u00c5\2\2\u0135\u0137\5 \21\2\u0136\u0130"+
		"\3\2\2\2\u0136\u0133\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139#\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\b\23\1\2"+
		"\u013c\u013d\5\"\22\2\u013d\u014c\3\2\2\2\u013e\u013f\f\6\2\2\u013f\u0140"+
		"\7\u00ba\2\2\u0140\u014b\5\"\22\2\u0141\u0142\f\5\2\2\u0142\u0143\7\u00b9"+
		"\2\2\u0143\u014b\5\"\22\2\u0144\u0145\f\4\2\2\u0145\u0146\7\u00bc\2\2"+
		"\u0146\u014b\5\"\22\2\u0147\u0148\f\3\2\2\u0148\u0149\7\u00bb\2\2\u0149"+
		"\u014b\5\"\22\2\u014a\u013e\3\2\2\2\u014a\u0141\3\2\2\2\u014a\u0144\3"+
		"\2\2\2\u014a\u0147\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d%\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\b\24\1\2"+
		"\u0150\u0151\5$\23\2\u0151\u015a\3\2\2\2\u0152\u0153\f\4\2\2\u0153\u0154"+
		"\7\u00b7\2\2\u0154\u0159\5$\23\2\u0155\u0156\f\3\2\2\u0156\u0157\7\u00b8"+
		"\2\2\u0157\u0159\5$\23\2\u0158\u0152\3\2\2\2\u0158\u0155\3\2\2\2\u0159"+
		"\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\'\3\2\2\2"+
		"\u015c\u015a\3\2\2\2\u015d\u015e\b\25\1\2\u015e\u015f\5&\24\2\u015f\u0165"+
		"\3\2\2\2\u0160\u0161\f\3\2\2\u0161\u0162\7\u00c0\2\2\u0162\u0164\5&\24"+
		"\2\u0163\u0160\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166)\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\b\26\1\2\u0169"+
		"\u016a\5(\25\2\u016a\u0170\3\2\2\2\u016b\u016c\f\3\2\2\u016c\u016d\7\31"+
		"\2\2\u016d\u016f\5(\25\2\u016e\u016b\3\2\2\2\u016f\u0172\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171+\3\2\2\2\u0172\u0170\3\2\2\2"+
		"\u0173\u0174\b\27\1\2\u0174\u0175\5*\26\2\u0175\u017b\3\2\2\2\u0176\u0177"+
		"\f\3\2\2\u0177\u0178\7\u00c1\2\2\u0178\u017a\5*\26\2\u0179\u0176\3\2\2"+
		"\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c-"+
		"\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\b\30\1\2\u017f\u0180\5,\27\2"+
		"\u0180\u0186\3\2\2\2\u0181\u0182\f\3\2\2\u0182\u0183\7\u00bd\2\2\u0183"+
		"\u0185\5,\27\2\u0184\u0181\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2"+
		"\2\2\u0186\u0187\3\2\2\2\u0187/\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a"+
		"\b\31\1\2\u018a\u018b\5.\30\2\u018b\u0191\3\2\2\2\u018c\u018d\f\3\2\2"+
		"\u018d\u018e\7\u00c2\2\2\u018e\u0190\5.\30\2\u018f\u018c\3\2\2\2\u0190"+
		"\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\61\3\2\2"+
		"\2\u0193\u0191\3\2\2\2\u0194\u0195\b\32\1\2\u0195\u0196\5\60\31\2\u0196"+
		"\u019c\3\2\2\2\u0197\u0198\f\3\2\2\u0198\u0199\7\u00be\2\2\u0199\u019b"+
		"\5\60\31\2\u019a\u0197\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2"+
		"\u019c\u019d\3\2\2\2\u019d\63\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a7"+
		"\5\62\32\2\u01a0\u01a1\5\62\32\2\u01a1\u01a2\7\32\2\2\u01a2\u01a3\5:\36"+
		"\2\u01a3\u01a4\7\13\2\2\u01a4\u01a5\5\66\34\2\u01a5\u01a7\3\2\2\2\u01a6"+
		"\u019f\3\2\2\2\u01a6\u01a0\3\2\2\2\u01a7\65\3\2\2\2\u01a8\u01ae\5\64\33"+
		"\2\u01a9\u01aa\5\32\16\2\u01aa\u01ab\58\35\2\u01ab\u01ac\5\66\34\2\u01ac"+
		"\u01ae\3\2\2\2\u01ad\u01a8\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ae\67\3\2\2"+
		"\2\u01af\u01b0\t\3\2\2\u01b09\3\2\2\2\u01b1\u01b2\b\36\1\2\u01b2\u01b3"+
		"\5\66\34\2\u01b3\u01b9\3\2\2\2\u01b4\u01b5\f\3\2\2\u01b5\u01b6\7\n\2\2"+
		"\u01b6\u01b8\5\66\34\2\u01b7\u01b4\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7"+
		"\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba;\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc"+
		"\u01bd\5\64\33\2\u01bd=\3\2\2\2\u01be\u01bf\7\17\2\2\u01bf\u01c0\7\u00d6"+
		"\2\2\u01c0\u01f1\5\n\6\2\u01c1\u01c2\5B\"\2\u01c2\u01c3\7\f\2\2\u01c3"+
		"\u01f1\3\2\2\2\u01c4\u01c5\5P)\2\u01c5\u01c6\7\f\2\2\u01c6\u01f1\3\2\2"+
		"\2\u01c7\u01c8\7\25\2\2\u01c8\u01c9\5p9\2\u01c9\u01ca\5j\66\2\u01ca\u01cb"+
		"\7\f\2\2\u01cb\u01f1\3\2\2\2\u01cc\u01cd\5b\62\2\u01cd\u01ce\7\u00d6\2"+
		"\2\u01ce\u01cf\7\7\2\2\u01cf\u01d0\5t;\2\u01d0\u01d1\7\b\2\2\u01d1\u01d2"+
		"\7\f\2\2\u01d2\u01f1\3\2\2\2\u01d3\u01d4\5b\62\2\u01d4\u01d5\7\u00d6\2"+
		"\2\u01d5\u01d6\7\7\2\2\u01d6\u01d7\5t;\2\u01d7\u01d8\7\b\2\2\u01d8\u01d9"+
		"\7\u00d6\2\2\u01d9\u01da\7\f\2\2\u01da\u01f1\3\2\2\2\u01db\u01dc\5b\62"+
		"\2\u01dc\u01dd\7\u00d6\2\2\u01dd\u01de\7\7\2\2\u01de\u01df\5t;\2\u01df"+
		"\u01e0\7\b\2\2\u01e0\u01e1\7\u00d6\2\2\u01e1\u01e2\5l\67\2\u01e2\u01e3"+
		"\7\f\2\2\u01e3\u01f1\3\2\2\2\u01e4\u01e5\5b\62\2\u01e5\u01e6\7\f\2\2\u01e6"+
		"\u01f1\3\2\2\2\u01e7\u01e8\5b\62\2\u01e8\u01e9\7\u00d6\2\2\u01e9\u01ea"+
		"\7\f\2\2\u01ea\u01f1\3\2\2\2\u01eb\u01ec\5b\62\2\u01ec\u01ed\7\u00d6\2"+
		"\2\u01ed\u01ee\5@!\2\u01ee\u01ef\7\f\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01be"+
		"\3\2\2\2\u01f0\u01c1\3\2\2\2\u01f0\u01c4\3\2\2\2\u01f0\u01c7\3\2\2\2\u01f0"+
		"\u01cc\3\2\2\2\u01f0\u01d3\3\2\2\2\u01f0\u01db\3\2\2\2\u01f0\u01e4\3\2"+
		"\2\2\u01f0\u01e7\3\2\2\2\u01f0\u01eb\3\2\2\2\u01f1?\3\2\2\2\u01f2\u01f3"+
		"\b!\1\2\u01f3\u01f4\7\n\2\2\u01f4\u01f5\7\u00d6\2\2\u01f5\u01fb\3\2\2"+
		"\2\u01f6\u01f7\f\3\2\2\u01f7\u01f8\7\n\2\2\u01f8\u01fa\7\u00d6\2\2\u01f9"+
		"\u01f6\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2"+
		"\2\2\u01fcA\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff\5D#\2\u01ff\u0200"+
		"\7\4\2\2\u0200C\3\2\2\2\u0201\u0204\5H%\2\u0202\u0204\5F$\2\u0203\u0201"+
		"\3\2\2\2\u0203\u0202\3\2\2\2\u0204E\3\2\2\2\u0205\u0206\b$\1\2\u0206\u0207"+
		"\5H%\2\u0207\u0208\5L\'\2\u0208\u020e\3\2\2\2\u0209\u020a\f\3\2\2\u020a"+
		"\u020b\7\n\2\2\u020b\u020d\5L\'\2\u020c\u0209\3\2\2\2\u020d\u0210\3\2"+
		"\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020fG\3\2\2\2\u0210\u020e"+
		"\3\2\2\2\u0211\u0212\5T+\2\u0212\u0213\7\u00d6\2\2\u0213\u0214\7\3\2\2"+
		"\u0214I\3\2\2\2\u0215\u0216\5j\66\2\u0216\u0217\7\u00d6\2\2\u0217\u021d"+
		"\3\2\2\2\u0218\u0219\5j\66\2\u0219\u021a\7\u00d6\2\2\u021a\u021b\5l\67"+
		"\2\u021b\u021d\3\2\2\2\u021c\u0215\3\2\2\2\u021c\u0218\3\2\2\2\u021dK"+
		"\3\2\2\2\u021e\u021f\5b\62\2\u021f\u0220\5J&\2\u0220\u0227\3\2\2\2\u0221"+
		"\u0227\5J&\2\u0222\u0223\5b\62\2\u0223\u0224\5N(\2\u0224\u0227\3\2\2\2"+
		"\u0225\u0227\5N(\2\u0226\u021e\3\2\2\2\u0226\u0221\3\2\2\2\u0226\u0222"+
		"\3\2\2\2\u0226\u0225\3\2\2\2\u0227M\3\2\2\2\u0228\u0229\5j\66\2\u0229"+
		"O\3\2\2\2\u022a\u022b\b)\1\2\u022b\u022c\5R*\2\u022c\u0242\3\2\2\2\u022d"+
		"\u022e\f\6\2\2\u022e\u022f\7\n\2\2\u022f\u0241\7\u00d6\2\2\u0230\u0231"+
		"\f\5\2\2\u0231\u0232\7\n\2\2\u0232\u0233\7\u00d6\2\2\u0233\u0241\5l\67"+
		"\2\u0234\u0235\f\4\2\2\u0235\u0236\7\n\2\2\u0236\u0237\7\u00d6\2\2\u0237"+
		"\u0238\5l\67\2\u0238\u0239\7\u00c6\2\2\u0239\u023a\5|?\2\u023a\u0241\3"+
		"\2\2\2\u023b\u023c\f\3\2\2\u023c\u023d\7\n\2\2\u023d\u023e\7\u00d6\2\2"+
		"\u023e\u023f\7\u00c6\2\2\u023f\u0241\5|?\2\u0240\u022d\3\2\2\2\u0240\u0230"+
		"\3\2\2\2\u0240\u0234\3\2\2\2\u0240\u023b\3\2\2\2\u0241\u0244\3\2\2\2\u0242"+
		"\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243Q\3\2\2\2\u0244\u0242\3\2\2\2"+
		"\u0245\u0259\5T+\2\u0246\u0247\5T+\2\u0247\u0248\7\u00d6\2\2\u0248\u0259"+
		"\3\2\2\2\u0249\u024a\5T+\2\u024a\u024b\7\u00d6\2\2\u024b\u024c\5l\67\2"+
		"\u024c\u0259\3\2\2\2\u024d\u024e\5T+\2\u024e\u024f\7\u00d6\2\2\u024f\u0250"+
		"\5l\67\2\u0250\u0251\7\u00c6\2\2\u0251\u0252\5|?\2\u0252\u0259\3\2\2\2"+
		"\u0253\u0254\5T+\2\u0254\u0255\7\u00d6\2\2\u0255\u0256\7\u00c6\2\2\u0256"+
		"\u0257\5|?\2\u0257\u0259\3\2\2\2\u0258\u0245\3\2\2\2\u0258\u0246\3\2\2"+
		"\2\u0258\u0249\3\2\2\2\u0258\u024d\3\2\2\2\u0258\u0253\3\2\2\2\u0259S"+
		"\3\2\2\2\u025a\u025f\5j\66\2\u025b\u025c\5b\62\2\u025c\u025d\5j\66\2\u025d"+
		"\u025f\3\2\2\2\u025e\u025a\3\2\2\2\u025e\u025b\3\2\2\2\u025fU\3\2\2\2"+
		"\u0260\u0261\7\20\2\2\u0261W\3\2\2\2\u0262\u0263\t\4\2\2\u0263Y\3\2\2"+
		"\2\u0264\u0265\7S\2\2\u0265\u0266\7\3\2\2\u0266\u0267\5\\/\2\u0267\u0268"+
		"\7\4\2\2\u0268[\3\2\2\2\u0269\u026a\b/\1\2\u026a\u026b\5^\60\2\u026b\u0271"+
		"\3\2\2\2\u026c\u026d\f\3\2\2\u026d\u026e\7\n\2\2\u026e\u0270\5^\60\2\u026f"+
		"\u026c\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2"+
		"\2\2\u0272]\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u027a\7\u00d6\2\2\u0275"+
		"\u0276\7\u00d6\2\2\u0276\u0277\7\u00c6\2\2\u0277\u027a\5<\37\2\u0278\u027a"+
		"\7D\2\2\u0279\u0274\3\2\2\2\u0279\u0275\3\2\2\2\u0279\u0278\3\2\2\2\u027a"+
		"_\3\2\2\2\u027b\u027c\7\21\2\2\u027ca\3\2\2\2\u027d\u027e\b\62\1\2\u027e"+
		"\u027f\5d\63\2\u027f\u0284\3\2\2\2\u0280\u0281\f\3\2\2\u0281\u0283\5d"+
		"\63\2\u0282\u0280\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285c\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u028e\5f\64\2"+
		"\u0288\u028e\5Z.\2\u0289\u028e\5p9\2\u028a\u028e\5X-\2\u028b\u028e\5V"+
		",\2\u028c\u028e\5`\61\2\u028d\u0287\3\2\2\2\u028d\u0288\3\2\2\2\u028d"+
		"\u0289\3\2\2\2\u028d\u028a\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028c\3\2"+
		"\2\2\u028ee\3\2\2\2\u028f\u02a5\7\33\2\2\u0290\u02a5\7?\2\2\u0291\u02a5"+
		"\7=\2\2\u0292\u02a5\7>\2\2\u0293\u02a5\7<\2\2\u0294\u02a5\7A\2\2\u0295"+
		"\u02a5\7B\2\2\u0296\u02a5\7@\2\2\u0297\u02a5\7C\2\2\u0298\u02a5\7D\2\2"+
		"\u0299\u02a5\7E\2\2\u029a\u02a5\7F\2\2\u029b\u02a5\7G\2\2\u029c\u02a5"+
		"\7H\2\2\u029d\u02a5\7I\2\2\u029e\u02a5\7,\2\2\u029f\u02a0\7,\2\2\u02a0"+
		"\u02a1\7\3\2\2\u02a1\u02a2\5h\65\2\u02a2\u02a3\7\4\2\2\u02a3\u02a5\3\2"+
		"\2\2\u02a4\u028f\3\2\2\2\u02a4\u0290\3\2\2\2\u02a4\u0291\3\2\2\2\u02a4"+
		"\u0292\3\2\2\2\u02a4\u0293\3\2\2\2\u02a4\u0294\3\2\2\2\u02a4\u0295\3\2"+
		"\2\2\u02a4\u0296\3\2\2\2\u02a4\u0297\3\2\2\2\u02a4\u0298\3\2\2\2\u02a4"+
		"\u0299\3\2\2\2\u02a4\u029a\3\2\2\2\u02a4\u029b\3\2\2\2\u02a4\u029c\3\2"+
		"\2\2\u02a4\u029d\3\2\2\2\u02a4\u029e\3\2\2\2\u02a4\u029f\3\2\2\2\u02a5"+
		"g\3\2\2\2\u02a6\u02a7\b\65\1\2\u02a7\u02a8\7\u00d6\2\2\u02a8\u02ae\3\2"+
		"\2\2\u02a9\u02aa\f\3\2\2\u02aa\u02ab\7\n\2\2\u02ab\u02ad\7\u00d6\2\2\u02ac"+
		"\u02a9\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2"+
		"\2\2\u02afi\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b6\5n8\2\u02b2\u02b3"+
		"\5n8\2\u02b3\u02b4\5l\67\2\u02b4\u02b6\3\2\2\2\u02b5\u02b1\3\2\2\2\u02b5"+
		"\u02b2\3\2\2\2\u02b6k\3\2\2\2\u02b7\u02b8\b\67\1\2\u02b8\u02b9\7\5\2\2"+
		"\u02b9\u02bf\7\6\2\2\u02ba\u02bb\7\5\2\2\u02bb\u02bc\5\64\33\2\u02bc\u02bd"+
		"\7\6\2\2\u02bd\u02bf\3\2\2\2\u02be\u02b7\3\2\2\2\u02be\u02ba\3\2\2\2\u02bf"+
		"\u02ca\3\2\2\2\u02c0\u02c1\f\4\2\2\u02c1\u02c2\7\5\2\2\u02c2\u02c9\7\6"+
		"\2\2\u02c3\u02c4\f\3\2\2\u02c4\u02c5\7\5\2\2\u02c5\u02c6\5\64\33\2\u02c6"+
		"\u02c7\7\6\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02c0\3\2\2\2\u02c8\u02c3\3\2"+
		"\2\2\u02c9\u02cc\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb"+
		"m\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd\u0347\7\27\2\2\u02ce\u0347\7\35\2"+
		"\2\u02cf\u0347\7\36\2\2\u02d0\u0347\7\37\2\2\u02d1\u0347\7 \2\2\u02d2"+
		"\u0347\7\34\2\2\u02d3\u0347\7\66\2\2\u02d4\u0347\7\67\2\2\u02d5\u0347"+
		"\78\2\2\u02d6\u0347\7J\2\2\u02d7\u0347\7K\2\2\u02d8\u0347\7L\2\2\u02d9"+
		"\u0347\7-\2\2\u02da\u0347\7.\2\2\u02db\u0347\7/\2\2\u02dc\u0347\7\60\2"+
		"\2\u02dd\u0347\7\61\2\2\u02de\u0347\7\62\2\2\u02df\u0347\7\63\2\2\u02e0"+
		"\u0347\7\64\2\2\u02e1\u0347\7\65\2\2\u02e2\u0347\79\2\2\u02e3\u0347\7"+
		":\2\2\u02e4\u0347\7;\2\2\u02e5\u0347\7T\2\2\u02e6\u0347\7U\2\2\u02e7\u0347"+
		"\7V\2\2\u02e8\u0347\7W\2\2\u02e9\u0347\7X\2\2\u02ea\u0347\7Y\2\2\u02eb"+
		"\u0347\7Z\2\2\u02ec\u0347\7[\2\2\u02ed\u0347\7\\\2\2\u02ee\u0347\7M\2"+
		"\2\u02ef\u0347\7N\2\2\u02f0\u0347\7O\2\2\u02f1\u0347\7]\2\2\u02f2\u0347"+
		"\7^\2\2\u02f3\u0347\7_\2\2\u02f4\u0347\7`\2\2\u02f5\u0347\7a\2\2\u02f6"+
		"\u0347\7b\2\2\u02f7\u0347\7c\2\2\u02f8\u0347\7d\2\2\u02f9\u0347\7e\2\2"+
		"\u02fa\u0347\7f\2\2\u02fb\u0347\7g\2\2\u02fc\u0347\7h\2\2\u02fd\u0347"+
		"\7i\2\2\u02fe\u0347\7j\2\2\u02ff\u0347\7k\2\2\u0300\u0347\7l\2\2\u0301"+
		"\u0347\7m\2\2\u0302\u0347\7n\2\2\u0303\u0347\7o\2\2\u0304\u0347\7p\2\2"+
		"\u0305\u0347\7q\2\2\u0306\u0347\7\u0085\2\2\u0307\u0347\7\u0086\2\2\u0308"+
		"\u0347\7r\2\2\u0309\u0347\7s\2\2\u030a\u0347\7t\2\2\u030b\u0347\7u\2\2"+
		"\u030c\u0347\7v\2\2\u030d\u0347\7w\2\2\u030e\u0347\7\u0087\2\2\u030f\u0347"+
		"\7x\2\2\u0310\u0347\7y\2\2\u0311\u0347\7z\2\2\u0312\u0347\7{\2\2\u0313"+
		"\u0347\7|\2\2\u0314\u0347\7}\2\2\u0315\u0347\7\u0088\2\2\u0316\u0347\7"+
		"~\2\2\u0317\u0347\7\177\2\2\u0318\u0347\7\u0080\2\2\u0319\u0347\7\u0081"+
		"\2\2\u031a\u0347\7\u0082\2\2\u031b\u0347\7\u0083\2\2\u031c\u0347\7\u0084"+
		"\2\2\u031d\u0347\7\u0089\2\2\u031e\u0347\7\u008a\2\2\u031f\u0347\7\u008b"+
		"\2\2\u0320\u0347\7\u008c\2\2\u0321\u0347\7\u008d\2\2\u0322\u0347\7\u008e"+
		"\2\2\u0323\u0347\7\u008f\2\2\u0324\u0347\7\u0090\2\2\u0325\u0347\7\u0091"+
		"\2\2\u0326\u0347\7\u0092\2\2\u0327\u0347\7\u0093\2\2\u0328\u0347\7\u0094"+
		"\2\2\u0329\u0347\7\u0095\2\2\u032a\u0347\7\u0096\2\2\u032b\u0347\7\u0097"+
		"\2\2\u032c\u0347\7\u0098\2\2\u032d\u0347\7\u0099\2\2\u032e\u0347\7\u009a"+
		"\2\2\u032f\u0347\7\u009b\2\2\u0330\u0347\7\u009c\2\2\u0331\u0347\7\u009d"+
		"\2\2\u0332\u0347\7\u009e\2\2\u0333\u0347\7\u009f\2\2\u0334\u0347\7\u00a0"+
		"\2\2\u0335\u0347\7\u00a1\2\2\u0336\u0347\7\u00a2\2\2\u0337\u0347\7\u00a3"+
		"\2\2\u0338\u0347\7\u00a4\2\2\u0339\u0347\7\u00a5\2\2\u033a\u0347\7\u00a6"+
		"\2\2\u033b\u0347\7\u00a7\2\2\u033c\u0347\7\u00a8\2\2\u033d\u0347\7\u00a9"+
		"\2\2\u033e\u0347\7\u00aa\2\2\u033f\u0347\7\u00ab\2\2\u0340\u0347\7\u00ac"+
		"\2\2\u0341\u0347\7\u00ad\2\2\u0342\u0347\7\u00ae\2\2\u0343\u0347\7\u00af"+
		"\2\2\u0344\u0347\5r:\2\u0345\u0347\7\u00d6\2\2\u0346\u02cd\3\2\2\2\u0346"+
		"\u02ce\3\2\2\2\u0346\u02cf\3\2\2\2\u0346\u02d0\3\2\2\2\u0346\u02d1\3\2"+
		"\2\2\u0346\u02d2\3\2\2\2\u0346\u02d3\3\2\2\2\u0346\u02d4\3\2\2\2\u0346"+
		"\u02d5\3\2\2\2\u0346\u02d6\3\2\2\2\u0346\u02d7\3\2\2\2\u0346\u02d8\3\2"+
		"\2\2\u0346\u02d9\3\2\2\2\u0346\u02da\3\2\2\2\u0346\u02db\3\2\2\2\u0346"+
		"\u02dc\3\2\2\2\u0346\u02dd\3\2\2\2\u0346\u02de\3\2\2\2\u0346\u02df\3\2"+
		"\2\2\u0346\u02e0\3\2\2\2\u0346\u02e1\3\2\2\2\u0346\u02e2\3\2\2\2\u0346"+
		"\u02e3\3\2\2\2\u0346\u02e4\3\2\2\2\u0346\u02e5\3\2\2\2\u0346\u02e6\3\2"+
		"\2\2\u0346\u02e7\3\2\2\2\u0346\u02e8\3\2\2\2\u0346\u02e9\3\2\2\2\u0346"+
		"\u02ea\3\2\2\2\u0346\u02eb\3\2\2\2\u0346\u02ec\3\2\2\2\u0346\u02ed\3\2"+
		"\2\2\u0346\u02ee\3\2\2\2\u0346\u02ef\3\2\2\2\u0346\u02f0\3\2\2\2\u0346"+
		"\u02f1\3\2\2\2\u0346\u02f2\3\2\2\2\u0346\u02f3\3\2\2\2\u0346\u02f4\3\2"+
		"\2\2\u0346\u02f5\3\2\2\2\u0346\u02f6\3\2\2\2\u0346\u02f7\3\2\2\2\u0346"+
		"\u02f8\3\2\2\2\u0346\u02f9\3\2\2\2\u0346\u02fa\3\2\2\2\u0346\u02fb\3\2"+
		"\2\2\u0346\u02fc\3\2\2\2\u0346\u02fd\3\2\2\2\u0346\u02fe\3\2\2\2\u0346"+
		"\u02ff\3\2\2\2\u0346\u0300\3\2\2\2\u0346\u0301\3\2\2\2\u0346\u0302\3\2"+
		"\2\2\u0346\u0303\3\2\2\2\u0346\u0304\3\2\2\2\u0346\u0305\3\2\2\2\u0346"+
		"\u0306\3\2\2\2\u0346\u0307\3\2\2\2\u0346\u0308\3\2\2\2\u0346\u0309\3\2"+
		"\2\2\u0346\u030a\3\2\2\2\u0346\u030b\3\2\2\2\u0346\u030c\3\2\2\2\u0346"+
		"\u030d\3\2\2\2\u0346\u030e\3\2\2\2\u0346\u030f\3\2\2\2\u0346\u0310\3\2"+
		"\2\2\u0346\u0311\3\2\2\2\u0346\u0312\3\2\2\2\u0346\u0313\3\2\2\2\u0346"+
		"\u0314\3\2\2\2\u0346\u0315\3\2\2\2\u0346\u0316\3\2\2\2\u0346\u0317\3\2"+
		"\2\2\u0346\u0318\3\2\2\2\u0346\u0319\3\2\2\2\u0346\u031a\3\2\2\2\u0346"+
		"\u031b\3\2\2\2\u0346\u031c\3\2\2\2\u0346\u031d\3\2\2\2\u0346\u031e\3\2"+
		"\2\2\u0346\u031f\3\2\2\2\u0346\u0320\3\2\2\2\u0346\u0321\3\2\2\2\u0346"+
		"\u0322\3\2\2\2\u0346\u0323\3\2\2\2\u0346\u0324\3\2\2\2\u0346\u0325\3\2"+
		"\2\2\u0346\u0326\3\2\2\2\u0346\u0327\3\2\2\2\u0346\u0328\3\2\2\2\u0346"+
		"\u0329\3\2\2\2\u0346\u032a\3\2\2\2\u0346\u032b\3\2\2\2\u0346\u032c\3\2"+
		"\2\2\u0346\u032d\3\2\2\2\u0346\u032e\3\2\2\2\u0346\u032f\3\2\2\2\u0346"+
		"\u0330\3\2\2\2\u0346\u0331\3\2\2\2\u0346\u0332\3\2\2\2\u0346\u0333\3\2"+
		"\2\2\u0346\u0334\3\2\2\2\u0346\u0335\3\2\2\2\u0346\u0336\3\2\2\2\u0346"+
		"\u0337\3\2\2\2\u0346\u0338\3\2\2\2\u0346\u0339\3\2\2\2\u0346\u033a\3\2"+
		"\2\2\u0346\u033b\3\2\2\2\u0346\u033c\3\2\2\2\u0346\u033d\3\2\2\2\u0346"+
		"\u033e\3\2\2\2\u0346\u033f\3\2\2\2\u0346\u0340\3\2\2\2\u0346\u0341\3\2"+
		"\2\2\u0346\u0342\3\2\2\2\u0346\u0343\3\2\2\2\u0346\u0344\3\2\2\2\u0346"+
		"\u0345\3\2\2\2\u0347o\3\2\2\2\u0348\u0349\t\5\2\2\u0349q\3\2\2\2\u034a"+
		"\u034b\7\26\2\2\u034b\u034c\7\u00d6\2\2\u034c\u034d\7\7\2\2\u034d\u034e"+
		"\5t;\2\u034e\u034f\7\b\2\2\u034f\u0356\3\2\2\2\u0350\u0351\7\26\2\2\u0351"+
		"\u0352\7\7\2\2\u0352\u0353\5t;\2\u0353\u0354\7\b\2\2\u0354\u0356\3\2\2"+
		"\2\u0355\u034a\3\2\2\2\u0355\u0350\3\2\2\2\u0356s\3\2\2\2\u0357\u0358"+
		"\b;\1\2\u0358\u0359\5v<\2\u0359\u035e\3\2\2\2\u035a\u035b\f\3\2\2\u035b"+
		"\u035d\5v<\2\u035c\u035a\3\2\2\2\u035d\u0360\3\2\2\2\u035e\u035c\3\2\2"+
		"\2\u035e\u035f\3\2\2\2\u035fu\3\2\2\2\u0360\u035e\3\2\2\2\u0361\u0362"+
		"\5j\66\2\u0362\u0363\5x=\2\u0363\u0364\7\f\2\2\u0364\u036b\3\2\2\2\u0365"+
		"\u0366\5b\62\2\u0366\u0367\5j\66\2\u0367\u0368\5x=\2\u0368\u0369\7\f\2"+
		"\2\u0369\u036b\3\2\2\2\u036a\u0361\3\2\2\2\u036a\u0365\3\2\2\2\u036bw"+
		"\3\2\2\2\u036c\u036d\b=\1\2\u036d\u036e\5z>\2\u036e\u0374\3\2\2\2\u036f"+
		"\u0370\f\3\2\2\u0370\u0371\7\n\2\2\u0371\u0373\5z>\2\u0372\u036f\3\2\2"+
		"\2\u0373\u0376\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375y"+
		"\3\2\2\2\u0376\u0374\3\2\2\2\u0377\u037b\7\u00d6\2\2\u0378\u0379\7\u00d6"+
		"\2\2\u0379\u037b\5l\67\2\u037a\u0377\3\2\2\2\u037a\u0378\3\2\2\2\u037b"+
		"{\3\2\2\2\u037c\u0387\5\66\34\2\u037d\u037e\7\7\2\2\u037e\u037f\5~@\2"+
		"\u037f\u0380\7\b\2\2\u0380\u0387\3\2\2\2\u0381\u0382\7\7\2\2\u0382\u0383"+
		"\5~@\2\u0383\u0384\7\n\2\2\u0384\u0385\7\b\2\2\u0385\u0387\3\2\2\2\u0386"+
		"\u037c\3\2\2\2\u0386\u037d\3\2\2\2\u0386\u0381\3\2\2\2\u0387}\3\2\2\2"+
		"\u0388\u0389\b@\1\2\u0389\u038a\5|?\2\u038a\u0390\3\2\2\2\u038b\u038c"+
		"\f\3\2\2\u038c\u038d\7\n\2\2\u038d\u038f\5|?\2\u038e\u038b\3\2\2\2\u038f"+
		"\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391\177\3\2\2"+
		"\2\u0392\u0390\3\2\2\2\u0393\u0394\5> \2\u0394\u0081\3\2\2\2\u0395\u0398"+
		"\5\u0086D\2\u0396\u0398\5\u0084C\2\u0397\u0395\3\2\2\2\u0397\u0396\3\2"+
		"\2\2\u0398\u0083\3\2\2\2\u0399\u03a1\5\u0080A\2\u039a\u03a1\5\u008eH\2"+
		"\u039b\u03a1\5\u0090I\2\u039c\u03a1\5\u0096L\2\u039d\u03a1\5\u009aN\2"+
		"\u039e\u03a1\5\u009cO\2\u039f\u03a1\5\u00a4S\2\u03a0\u0399\3\2\2\2\u03a0"+
		"\u039a\3\2\2\2\u03a0\u039b\3\2\2\2\u03a0\u039c\3\2\2\2\u03a0\u039d\3\2"+
		"\2\2\u03a0\u039e\3\2\2\2\u03a0\u039f\3\2\2\2\u03a1\u0085\3\2\2\2\u03a2"+
		"\u03a3\7\7\2\2\u03a3\u03a9\7\b\2\2\u03a4\u03a5\7\7\2\2\u03a5\u03a6\5\u008c"+
		"G\2\u03a6\u03a7\7\b\2\2\u03a7\u03a9\3\2\2\2\u03a8\u03a2\3\2\2\2\u03a8"+
		"\u03a4\3\2\2\2\u03a9\u0087\3\2\2\2\u03aa\u03ad\5\u008aF\2\u03ab\u03ad"+
		"\5\u0084C\2\u03ac\u03aa\3\2\2\2\u03ac\u03ab\3\2\2\2\u03ad\u0089\3\2\2"+
		"\2\u03ae\u03af\7\7\2\2\u03af\u03b5\7\b\2\2\u03b0\u03b1\7\7\2\2\u03b1\u03b2"+
		"\5\u008cG\2\u03b2\u03b3\7\b\2\2\u03b3\u03b5\3\2\2\2\u03b4\u03ae\3\2\2"+
		"\2\u03b4\u03b0\3\2\2\2\u03b5\u008b\3\2\2\2\u03b6\u03b7\bG\1\2\u03b7\u03b8"+
		"\5\u0082B\2\u03b8\u03bd\3\2\2\2\u03b9\u03ba\f\3\2\2\u03ba\u03bc\5\u0082"+
		"B\2\u03bb\u03b9\3\2\2\2\u03bc\u03bf\3\2\2\2\u03bd\u03bb\3\2\2\2\u03bd"+
		"\u03be\3\2\2\2\u03be\u008d\3\2\2\2\u03bf\u03bd\3\2\2\2\u03c0\u03c5\7\f"+
		"\2\2\u03c1\u03c2\5:\36\2\u03c2\u03c3\7\f\2\2\u03c3\u03c5\3\2\2\2\u03c4"+
		"\u03c0\3\2\2\2\u03c4\u03c1\3\2\2\2\u03c5\u008f\3\2\2\2\u03c6\u03c7\7&"+
		"\2\2\u03c7\u03c8\7\3\2\2\u03c8\u03c9\5:\36\2\u03c9\u03ca\7\4\2\2\u03ca"+
		"\u03cb\5\u0092J\2\u03cb\u0091\3\2\2\2\u03cc\u03cd\5\u0082B\2\u03cd\u03ce"+
		"\7$\2\2\u03ce\u03cf\5\u0082B\2\u03cf\u03d2\3\2\2\2\u03d0\u03d2\5\u0082"+
		"B\2\u03d1\u03cc\3\2\2\2\u03d1\u03d0\3\2\2\2\u03d2\u0093\3\2\2\2\u03d3"+
		"\u03da\5:\36\2\u03d4\u03d5\5T+\2\u03d5\u03d6\7\u00d6\2\2\u03d6\u03d7\7"+
		"\u00c6\2\2\u03d7\u03d8\5|?\2\u03d8\u03da\3\2\2\2\u03d9\u03d3\3\2\2\2\u03d9"+
		"\u03d4\3\2\2\2\u03da\u0095\3\2\2\2\u03db\u03dc\7)\2\2\u03dc\u03dd\7\3"+
		"\2\2\u03dd\u03de\5:\36\2\u03de\u03df\7\4\2\2\u03df\u03e0\7\7\2\2\u03e0"+
		"\u03e1\5\u0098M\2\u03e1\u03e2\7\b\2\2\u03e2\u0097\3\2\2\2\u03e3\u03e6"+
		"\3\2\2\2\u03e4\u03e6\5\u008cG\2\u03e5\u03e3\3\2\2\2\u03e5\u03e4\3\2\2"+
		"\2\u03e6\u0099\3\2\2\2\u03e7\u03e8\7*\2\2\u03e8\u03e9\5:\36\2\u03e9\u03ea"+
		"\7\13\2\2\u03ea\u03ee\3\2\2\2\u03eb\u03ec\7+\2\2\u03ec\u03ee\7\13\2\2"+
		"\u03ed\u03e7\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ee\u009b\3\2\2\2\u03ef\u03f0"+
		"\7\30\2\2\u03f0\u03f1\7\3\2\2\u03f1\u03f2\5\u0094K\2\u03f2\u03f3\7\4\2"+
		"\2\u03f3\u03f4\5\u0088E\2\u03f4\u0405\3\2\2\2\u03f5\u03f6\7#\2\2\u03f6"+
		"\u03f7\5\u0082B\2\u03f7\u03f8\7\30\2\2\u03f8\u03f9\7\3\2\2\u03f9\u03fa"+
		"\5:\36\2\u03fa\u03fb\7\4\2\2\u03fb\u03fc\7\f\2\2\u03fc\u0405\3\2\2\2\u03fd"+
		"\u03fe\7%\2\2\u03fe\u03ff\7\3\2\2\u03ff\u0400\5\u009eP\2\u0400\u0401\5"+
		"\u00a2R\2\u0401\u0402\7\4\2\2\u0402\u0403\5\u0088E\2\u0403\u0405\3\2\2"+
		"\2\u0404\u03ef\3\2\2\2\u0404\u03f5\3\2\2\2\u0404\u03fd\3\2\2\2\u0405\u009d"+
		"\3\2\2\2\u0406\u0409\5\u008eH\2\u0407\u0409\5\u0080A\2\u0408\u0406\3\2"+
		"\2\2\u0408\u0407\3\2\2\2\u0409\u009f\3\2\2\2\u040a\u040d\5\u0094K\2\u040b"+
		"\u040d\3\2\2\2\u040c\u040a\3\2\2\2\u040c\u040b\3\2\2\2\u040d\u00a1\3\2"+
		"\2\2\u040e\u040f\5\u00a0Q\2\u040f\u0410\7\f\2\2\u0410\u0416\3\2\2\2\u0411"+
		"\u0412\5\u00a0Q\2\u0412\u0413\7\f\2\2\u0413\u0414\5:\36\2\u0414\u0416"+
		"\3\2\2\2\u0415\u040e\3\2\2\2\u0415\u0411\3\2\2\2\u0416\u00a3\3\2\2\2\u0417"+
		"\u0418\7\"\2\2\u0418\u0424\7\f\2\2\u0419\u041a\7!\2\2\u041a\u0424\7\f"+
		"\2\2\u041b\u041c\7(\2\2\u041c\u0424\7\f\2\2\u041d\u041e\7(\2\2\u041e\u041f"+
		"\5:\36\2\u041f\u0420\7\f\2\2\u0420\u0424\3\2\2\2\u0421\u0422\7\'\2\2\u0422"+
		"\u0424\7\f\2\2\u0423\u0417\3\2\2\2\u0423\u0419\3\2\2\2\u0423\u041b\3\2"+
		"\2\2\u0423\u041d\3\2\2\2\u0423\u0421\3\2\2\2\u0424\u00a5\3\2\2\2\u0425"+
		"\u0426\bT\1\2\u0426\u0427\5\u00a8U\2\u0427\u042c\3\2\2\2\u0428\u0429\f"+
		"\3\2\2\u0429\u042b\5\u00a8U\2\u042a\u0428\3\2\2\2\u042b\u042e\3\2\2\2"+
		"\u042c\u042a\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u00a7\3\2\2\2\u042e\u042c"+
		"\3\2\2\2\u042f\u0433\5\u00aaV\2\u0430\u0433\5> \2\u0431\u0433\7\f\2\2"+
		"\u0432\u042f\3\2\2\2\u0432\u0430\3\2\2\2\u0432\u0431\3\2\2\2\u0433\u00a9"+
		"\3\2\2\2\u0434\u0435\5B\"\2\u0435\u0436\5\u008aF\2\u0436\u00ab\3\2\2\2"+
		"M\u00b6\u00c7\u00cc\u00da\u00dc\u00e7\u00ed\u00f8\u0100\u010a\u011a\u011c"+
		"\u0128\u012a\u0136\u0138\u014a\u014c\u0158\u015a\u0165\u0170\u017b\u0186"+
		"\u0191\u019c\u01a6\u01ad\u01b9\u01f0\u01fb\u0203\u020e\u021c\u0226\u0240"+
		"\u0242\u0258\u025e\u0271\u0279\u0284\u028d\u02a4\u02ae\u02b5\u02be\u02c8"+
		"\u02ca\u0346\u0355\u035e\u036a\u0374\u037a\u0386\u0390\u0397\u03a0\u03a8"+
		"\u03ac\u03b4\u03bd\u03c4\u03d1\u03d9\u03e5\u03ed\u0404\u0408\u040c\u0415"+
		"\u0423\u042c\u0432";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}