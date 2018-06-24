grammar Glsl;

@header {
package org.viduus.lwjgl.graphics.shaders.parsers.glsl;
}

// Productions

glsl
	:	version_declaration top_statement
	;

top_statement
	:	define_declaration top_statement
	|	declaration top_statement
	|	function_definition top_statement
	|
	;

version_declaration
	:	'#version' INTCONSTANT
	;

define_declaration
	:	'#define' variable_identifier primary_expression
	;

variable_identifier
	:	IDENTIFIER
	;

primary_expression
	:	variable_identifier
	|	INTCONSTANT
	|	UINTCONSTANT
	|	FLOATCONSTANT
	|	BOOLCONSTANT
	|	DOUBLECONSTANT
	|	LEFT_PAREN expression RIGHT_PAREN
	;

postfix_expression
	:	primary_expression
	|	postfix_expression LEFT_BRACKET integer_expression RIGHT_BRACKET function_call
	|	postfix_expression DOT FIELD_SELECTION
	|	postfix_expression INC_OP
	|	postfix_expression DEC_OP
	;

integer_expression
	:	expression
	;

function_call
	:	function_call_header_with_parameters RIGHT_PAREN
	|	function_call_header_no_parameters RIGHT_PAREN
	;

function_call_header_no_parameters
	: function_call_header VOID
	|	function_call_header
	;

function_call_header_with_parameters
	:	function_call_header assignment_expression
	|	function_call_header_with_parameters COMMA assignment_expression
	;

function_call_header
	: function_identifier LEFT_PAREN
	;

// Grammar Note: Constructors look like functions, but lexical analysis recognized most of them as
// keywords. They are now recognized through “type_specifier”.
// Methods (.length), subroutine array calls, and identifiers are recognized through postfix_expression.

function_identifier
	: type_specifier
	| postfix_expression
	;

unary_expression
	: postfix_expression
	| INC_OP unary_expression
	|	DEC_OP unary_expression
	|	unary_operator unary_expression
	;

// Grammar Note: No traditional style type casts.

unary_operator
	: PLUS
	|	DASH
	| BANG
	|	TILDE
	;

// Grammar Note: No '*' or '&' unary ops. Pointers are not supported.

multiplicative_expression
	: unary_expression
	| multiplicative_expression STAR unary_expression
	|	multiplicative_expression SLASH unary_expression
	|	multiplicative_expression PERCENT unary_expression
	;

additive_expression
	: multiplicative_expression
	| additive_expression PLUS multiplicative_expression
	|	additive_expression DASH multiplicative_expression
	;

shift_expression
	: additive_expression
	| shift_expression LEFT_OP additive_expression
	|	shift_expression RIGHT_OP additive_expression
	;

relational_expression
	: shift_expression
	| relational_expression LEFT_ANGLE shift_expression
	|	relational_expression RIGHT_ANGLE shift_expression
	|	relational_expression LE_OP shift_expression
	|	relational_expression GE_OP shift_expression
	;

equality_expression
	: relational_expression
	|	equality_expression EQ_OP relational_expression
	|	equality_expression NE_OP relational_expression
	;

and_expression
	: equality_expression
	|	and_expression AMPERSAND equality_expression
	;

exclusive_or_expression
	: and_expression
	|	exclusive_or_expression CARET and_expression
	;

inclusive_or_expression
	: exclusive_or_expression
	|	inclusive_or_expression VERTICAL_BAR exclusive_or_expression
	;

logical_and_expression
	:	inclusive_or_expression
	|	logical_and_expression AND_OP inclusive_or_expression
	;

logical_xor_expression
	:	logical_and_expression
	|	logical_xor_expression XOR_OP logical_and_expression
	;

logical_or_expression
	:	logical_xor_expression
	|	logical_or_expression OR_OP logical_xor_expression
	;

conditional_expression
	:	logical_or_expression
	|	logical_or_expression QUESTION expression COLON assignment_expression
	;

assignment_expression
	:	conditional_expression
	|	unary_expression assignment_operator assignment_expression
	;

assignment_operator
	: EQUAL
	|	MUL_ASSIGN
	|	DIV_ASSIGN
	|	MOD_ASSIGN
	|	ADD_ASSIGN
	|	SUB_ASSIGN
	|	LEFT_ASSIGN
	|	RIGHT_ASSIGN
	|	AND_ASSIGN
	|	XOR_ASSIGN
	|	OR_ASSIGN
	;

expression
	:	assignment_expression
	|	expression COMMA assignment_expression
	;

constant_expression
	: conditional_expression
	;

declaration
	:	function_prototype SEMICOLON
	|	init_declarator_list SEMICOLON
	|	PRECISION precision_qualifier type_specifier SEMICOLON
	|	type_qualifier IDENTIFIER LEFT_BRACE struct_declaration_list RIGHT_BRACE SEMICOLON
	|	type_qualifier IDENTIFIER LEFT_BRACE struct_declaration_list RIGHT_BRACE IDENTIFIER SEMICOLON
	|	type_qualifier IDENTIFIER LEFT_BRACE struct_declaration_list RIGHT_BRACE IDENTIFIER array_specifier SEMICOLON
	|	type_qualifier SEMICOLON
	|	type_qualifier IDENTIFIER SEMICOLON
	|	type_qualifier IDENTIFIER identifier_list SEMICOLON
	;

identifier_list
	:	COMMA IDENTIFIER
	|	identifier_list COMMA IDENTIFIER
	;

function_prototype
	:	function_declarator RIGHT_PAREN
	;

function_declarator
	: function_header
	|	function_header_with_parameters
	;

function_header_with_parameters
	:	function_header parameter_declaration
	|	function_header_with_parameters COMMA parameter_declaration
	;

function_header
	:	fully_specified_type IDENTIFIER LEFT_PAREN
	;

parameter_declarator
	:	type_specifier IDENTIFIER
	|	type_specifier IDENTIFIER array_specifier
	;

parameter_declaration
	:	type_qualifier parameter_declarator
	|	parameter_declarator
	|	type_qualifier parameter_type_specifier
	|	parameter_type_specifier
	;

parameter_type_specifier
	: type_specifier
	;

init_declarator_list
	: single_declaration
	|	init_declarator_list COMMA IDENTIFIER
	|	init_declarator_list COMMA IDENTIFIER array_specifier
	|	init_declarator_list COMMA IDENTIFIER array_specifier EQUAL initializer
	|	init_declarator_list COMMA IDENTIFIER EQUAL initializer
	;

single_declaration
	: fully_specified_type
	|	fully_specified_type IDENTIFIER
	|	fully_specified_type IDENTIFIER array_specifier
	|	fully_specified_type IDENTIFIER array_specifier EQUAL initializer
	|	fully_specified_type IDENTIFIER EQUAL initializer
	;

// Grammar Note: No 'enum', or 'typedef'.

fully_specified_type
	: type_specifier
	|	type_qualifier type_specifier
	;

invariant_qualifier
	: INVARIANT
	;

interpolation_qualifier
	:	SMOOTH
	|	FLAT
	|	NOPERSPECTIVE
	;

layout_qualifier
	:	LAYOUT LEFT_PAREN layout_qualifier_id_list RIGHT_PAREN
	;

layout_qualifier_id_list
	: layout_qualifier_id
	|	layout_qualifier_id_list COMMA layout_qualifier_id
	;

layout_qualifier_id
	: IDENTIFIER
	|	IDENTIFIER EQUAL constant_expression
	|	SHARED
	;

precise_qualifier
	: PRECISE
	;

type_qualifier
	:	single_type_qualifier
	|	type_qualifier single_type_qualifier
	;

single_type_qualifier
	: storage_qualifier
	|	layout_qualifier
	|	precision_qualifier
	|	interpolation_qualifier
	|	invariant_qualifier
	|	precise_qualifier
	;

storage_qualifier
	: CONST
	|	INOUT
	|	IN
	|	OUT
	|	CENTROID
	|	PATCH
	|	SAMPLE
	|	UNIFORM
	|	BUFFER
	|	SHARED
	|	COHERENT
	|	VOLATILE
	|	RESTRICT
	|	READONLY
	|	WRITEONLY
	|	SUBROUTINE
	|	SUBROUTINE LEFT_PAREN type_name_list RIGHT_PAREN
	;

type_name_list
	: IDENTIFIER
	|	type_name_list COMMA IDENTIFIER
	;

type_specifier
	:	type_specifier_nonarray
	|	type_specifier_nonarray array_specifier
	;

array_specifier
	:	LEFT_BRACKET RIGHT_BRACKET
	|	LEFT_BRACKET conditional_expression RIGHT_BRACKET
	|	array_specifier LEFT_BRACKET RIGHT_BRACKET
	|	array_specifier LEFT_BRACKET conditional_expression RIGHT_BRACKET
	;

type_specifier_nonarray
	: VOID
	|	FLOAT
	|	DOUBLE
	|	INT
	|	UINT
	|	BOOL
	|	VEC2
	|	VEC3
	|	VEC4
	|	DVEC2
	|	DVEC3
	|	DVEC4
	|	BVEC2
	|	BVEC3
	|	BVEC4
	|	IVEC2
	|	IVEC3
	|	IVEC4
	|	UVEC2
	|	UVEC3
	|	UVEC4
	|	MAT2
	|	MAT3
	|	MAT4
	|	MAT2X2
	|	MAT2X3
	|	MAT2X4
	|	MAT3X2
	|	MAT3X3
	|	MAT3X4
	|	MAT4X2
	|	MAT4X3
	|	MAT4X4
	|	DMAT2
	|	DMAT3
	|	DMAT4
	|	DMAT2X2
	|	DMAT2X3
	|	DMAT2X4
	|	DMAT3X2
	|	DMAT3X3
	|	DMAT3X4
	|	DMAT4X2
	|	DMAT4X3
	|	DMAT4X4
	|	ATOMIC_UINT
	|	SAMPLER1D
	|	SAMPLER2D
	|	SAMPLER3D
	|	SAMPLERCUBE
	|	SAMPLER1DSHADOW
	|	SAMPLER2DSHADOW
	|	SAMPLERCUBESHADOW
	|	SAMPLER1DARRAY
	|	SAMPLER2DARRAY
	|	SAMPLER1DARRAYSHADOW
	|	SAMPLER2DARRAYSHADOW
	|	SAMPLERCUBEARRAY
	|	SAMPLERCUBEARRAYSHADOW
	|	ISAMPLER1D
	|	ISAMPLER2D
	|	ISAMPLER3D
	|	ISAMPLERCUBE
	|	ISAMPLER1DARRAY
	|	ISAMPLER2DARRAY
	|	ISAMPLERCUBEARRAY
	|	USAMPLER1D
	|	USAMPLER2D
	|	USAMPLER3D
	|	USAMPLERCUBE
	|	USAMPLER1DARRAY
	|	USAMPLER2DARRAY
	|	USAMPLERCUBEARRAY
	|	SAMPLER2DRECT
	|	SAMPLER2DRECTSHADOW
	|	ISAMPLER2DRECT
	|	USAMPLER2DRECT
	|	SAMPLERBUFFER
	|	ISAMPLERBUFFER
	|	USAMPLERBUFFER
	|	SAMPLER2DMS
	|	ISAMPLER2DMS
	|	USAMPLER2DMS
	|	SAMPLER2DMSARRAY
	|	ISAMPLER2DMSARRAY
	|	USAMPLER2DMSARRAY
	|	IMAGE1D
	|	IIMAGE1D
	|	UIMAGE1D
	|	IMAGE2D
	|	IIMAGE2D
	|	UIMAGE2D
	|	IMAGE3D
	|	IIMAGE3D
	|	UIMAGE3D
	|	IMAGE2DRECT
	|	IIMAGE2DRECT
	|	UIMAGE2DRECT
	|	IMAGECUBE
	|	IIMAGECUBE
	|	UIMAGECUBE
	|	IMAGEBUFFER
	|	IIMAGEBUFFER
	|	UIMAGEBUFFER
	|	IMAGE1DARRAY
	|	IIMAGE1DARRAY
	|	UIMAGE1DARRAY
	|	IMAGE2DARRAY
	|	IIMAGE2DARRAY
	|	UIMAGE2DARRAY
	|	IMAGECUBEARRAY
	|	IIMAGECUBEARRAY
	|	UIMAGECUBEARRAY
	|	IMAGE2DMS
	|	IIMAGE2DMS
	|	UIMAGE2DMS
	|	IMAGE2DMSARRAY
	|	IIMAGE2DMSARRAY
	|	UIMAGE2DMSARRAY
	|	struct_specifier
	|	IDENTIFIER
	;

precision_qualifier
	:	HIGH_PRECISION
	|	MEDIUM_PRECISION
	|	LOW_PRECISION
	;

struct_specifier
	:	STRUCT IDENTIFIER LEFT_BRACE struct_declaration_list RIGHT_BRACE
	|	STRUCT LEFT_BRACE struct_declaration_list RIGHT_BRACE
	;

struct_declaration_list
	: struct_declaration
	|	struct_declaration_list struct_declaration
	;

struct_declaration
	:	type_specifier struct_declarator_list SEMICOLON
	|	type_qualifier type_specifier struct_declarator_list SEMICOLON
	;

struct_declarator_list
	: struct_declarator
	|	struct_declarator_list COMMA struct_declarator
	;

struct_declarator
	: IDENTIFIER
	|	IDENTIFIER array_specifier
	;

initializer
	:	assignment_expression
	|	LEFT_BRACE initializer_list RIGHT_BRACE
	|	LEFT_BRACE initializer_list COMMA RIGHT_BRACE
	;

initializer_list
	: initializer
	|	initializer_list COMMA initializer
	;

declaration_statement
	: declaration
	;

statement
	: compound_statement
	|	simple_statement
	;

// Grammar Note: labeled statements for SWITCH only; 'goto' is not supported.

simple_statement
	: declaration_statement
	|	expression_statement
	|	selection_statement
	|	switch_statement
	|	case_label
	|	iteration_statement
	|	jump_statement
	;

compound_statement
	:	LEFT_BRACE RIGHT_BRACE
	|	LEFT_BRACE statement_list RIGHT_BRACE
	;

statement_no_new_scope
	: compound_statement_no_new_scope
	|	simple_statement
	;

compound_statement_no_new_scope
	: LEFT_BRACE RIGHT_BRACE
	|	LEFT_BRACE statement_list RIGHT_BRACE
	;

statement_list
	: statement
	|	statement_list statement
	;

expression_statement
	: SEMICOLON
	|	expression SEMICOLON
	;

selection_statement
	:	IF LEFT_PAREN expression RIGHT_PAREN selection_rest_statement
	;

selection_rest_statement
	: statement ELSE statement
	|	statement
	;

condition
	: expression
	|	fully_specified_type IDENTIFIER EQUAL initializer
	;

switch_statement
	:	SWITCH LEFT_PAREN expression RIGHT_PAREN LEFT_BRACE switch_statement_list RIGHT_BRACE
	;

switch_statement_list
	: 
	|	statement_list
	;

case_label
	:	CASE expression COLON
	|	DEFAULT COLON
	;

iteration_statement
	:	WHILE LEFT_PAREN condition RIGHT_PAREN statement_no_new_scope
	|	DO statement WHILE LEFT_PAREN expression RIGHT_PAREN SEMICOLON
	| FOR LEFT_PAREN for_init_statement for_rest_statement RIGHT_PAREN statement_no_new_scope
	;
	
for_init_statement
	: expression_statement
	|	declaration_statement
	;

conditionopt
	: condition
	|	
	;

for_rest_statement
	:	conditionopt SEMICOLON
	|	conditionopt SEMICOLON expression
	;

jump_statement
	:	CONTINUE SEMICOLON
	|	BREAK SEMICOLON
	|	RETURN SEMICOLON
	|	RETURN expression SEMICOLON
	|	DISCARD SEMICOLON // Fragment shader only.
	;

// Grammar Note: No 'goto'. Gotos are not supported.

translation_unit
	:	external_declaration
	|	translation_unit external_declaration
	;

external_declaration
	: function_definition
	|	declaration
	|	SEMICOLON
	;

function_definition
	:	function_prototype compound_statement_no_new_scope
	;

// Symbols

LEFT_PAREN : '(';
RIGHT_PAREN : ')';
LEFT_BRACKET : '[';
RIGHT_BRACKET : ']';
LEFT_BRACE : '{';
RIGHT_BRACE : '}';
DOT : '.';
COMMA : ',';
COLON : ':';
SEMICOLON : ';';
FIELD_SELECTION : '.';

// Keywords

INVARIANT : 'invariant';
PRECISE : 'precise';
HIGH_PRECISION : 'highp';
MEDIUM_PRECISION : 'mediump';
LOW_PRECISION : 'lowp';
PRECISION : 'precision';

STRUCT : 'struct';
VOID : 'void';
WHILE : 'while';
CARET : '^';
QUESTION : '?';
CONST : 'const';
BOOL : 'bool';
FLOAT : 'float';
DOUBLE : 'double';
INT : 'int';
UINT : 'uint';
BREAK : 'break';
CONTINUE : 'continue';
DO : 'do';
ELSE : 'else';
FOR : 'for';
IF : 'if';
DISCARD : 'discard';
RETURN : 'return';
SWITCH : 'switch';
CASE : 'case';
DEFAULT : 'default';
SUBROUTINE : 'subroutine';
BVEC2 : 'bvec2';
BVEC3 : 'bvec3';
BVEC4 : 'bvec4';
IVEC2 : 'ivec2';
IVEC3 : 'ivec3';
IVEC4 : 'ivec4';
UVEC2 : 'uvec2';
UVEC3 : 'uvec3';
UVEC4 : 'uvec4';
VEC2 : 'vec2';
VEC3 : 'vec3';
VEC4 : 'vec4';
MAT2 : 'mat2';
MAT3 : 'mat3';
MAT4 : 'mat4';
CENTROID : 'centroid';
IN : 'in';
OUT : 'out';
INOUT : 'inout';
UNIFORM : 'uniform';
PATCH : 'patch';
SAMPLE : 'sample';
BUFFER : 'buffer';
SHARED : 'shared';
COHERENT : 'coherent';
VOLATILE : 'volatile';
RESTRICT : 'restrict';
READONLY : 'readonly';
WRITEONLY : 'writeonly';
DVEC2 : 'dvec2';
DVEC3 : 'dvec3';
DVEC4 : 'dvec4';
DMAT2 : 'dmat2';
DMAT3 : 'dmat3';
DMAT4 : 'dmat4';
NOPERSPECTIVE : 'noperspective';
FLAT : 'flat';
SMOOTH : 'smooth';
LAYOUT : 'layout';
MAT2X2 : 'mat2x2';
MAT2X3 : 'mat2x3';
MAT2X4 : 'mat2x4';
MAT3X2 : 'mat3x2';
MAT3X3 : 'mat3x3';
MAT3X4 : 'mat3x4';
MAT4X2 : 'mat4x2';
MAT4X3 : 'mat4x3';
MAT4X4 : 'mat4x4';
DMAT2X2 : 'dmat2x2';
DMAT2X3 : 'dmat2x3';
DMAT2X4 : 'dmat2x4';
DMAT3X2 : 'dmat3x2';
DMAT3X3 : 'dmat3x3';
DMAT3X4 : 'dmat3x4';
DMAT4X2 : 'dmat4x2';
DMAT4X3 : 'dmat4x3';
DMAT4X4 : 'dmat4x4';
ATOMIC_UINT : 'atomic_unit';
SAMPLER1D : 'sampler1D';
SAMPLER2D : 'sampler2D';
SAMPLER3D : 'sampler3D';
SAMPLERCUBE : 'samplerCube';
SAMPLER1DSHADOW : 'sampler1DShadow';
SAMPLER2DSHADOW : 'sampler2DShadow';
SAMPLERCUBESHADOW : 'samplerCubeShadow';
SAMPLER1DARRAY : 'sampler1DArray';
SAMPLER2DARRAY : 'sampler2DArray';
SAMPLER1DARRAYSHADOW : 'sampler1DArrayShadow';
SAMPLER2DARRAYSHADOW : 'sampler2DArrayShadow';
ISAMPLER1D : 'isampelr1D';
ISAMPLER2D : 'isampler2D';
ISAMPLER3D : 'isampler3D';
ISAMPLERCUBE : 'isamplerCube';
ISAMPLER1DARRAY : 'isampler1DArray';
ISAMPLER2DARRAY : 'isampler2DArray';
USAMPLER1D : 'usampler1D';
USAMPLER2D : 'usampler2D';
USAMPLER3D : 'usampler3D';
USAMPLERCUBE : 'usamplerCube';
USAMPLER1DARRAY : 'usampler1DArray';
USAMPLER2DARRAY : 'usampler2DArray';
SAMPLER2DRECT : 'sampler2DRect';
SAMPLER2DRECTSHADOW : 'sampler2DRectShadow';
ISAMPLER2DRECT : 'isampler2DRect';
USAMPLER2DRECT : 'usampler2DRect';
SAMPLERBUFFER : 'samplerBuffer';
ISAMPLERBUFFER : 'isamplerBuffer';
USAMPLERBUFFER : 'usamplerBuffer';
SAMPLERCUBEARRAY : 'samplerCubeArray';
SAMPLERCUBEARRAYSHADOW : 'samplerCubeArrayShadow';
ISAMPLERCUBEARRAY : 'isamplerCubeArray';
USAMPLERCUBEARRAY : 'usamplerCubeArray';
SAMPLER2DMS : 'sampler2DMS';
ISAMPLER2DMS : 'isampler2DMS';
USAMPLER2DMS : 'usampler2DMS';
SAMPLER2DMSARRAY : 'sampler2DMSArray';
ISAMPLER2DMSARRAY : 'isampler2DMSArray';
USAMPLER2DMSARRAY : 'usamlper2DMSArray';
IMAGE1D : 'image1D';
IIMAGE1D : 'iimage1D';
UIMAGE1D : 'uimage1D';
IMAGE2D : 'image2D';
IIMAGE2D : 'iimage2D';
UIMAGE2D : 'uimage2D';
IMAGE3D : 'image3D';
IIMAGE3D : 'iimage3D';
UIMAGE3D : 'uimage3D';
IMAGE2DRECT : 'image2DRect';
IIMAGE2DRECT : 'iimage2DRect';
UIMAGE2DRECT : 'uimage2DRect';
IMAGECUBE : 'imageCube';
IIMAGECUBE : 'iimageCube';
UIMAGECUBE : 'uimageCube';
IMAGEBUFFER : 'imageBuffer';
IIMAGEBUFFER : 'iimageBuffer';
UIMAGEBUFFER : 'uimageBuffer';
IMAGE1DARRAY : 'image1DArray';
IIMAGE1DARRAY : 'iimage1DArray';
UIMAGE1DARRAY : 'uimage1DArray';
IMAGE2DARRAY : 'image2DArray';
IIMAGE2DARRAY : 'iimage2DArray';
UIMAGE2DARRAY : 'uimage2DArray';
IMAGECUBEARRAY : 'imageCubeArray';
IIMAGECUBEARRAY : 'iimageCubeArray';
UIMAGECUBEARRAY : 'uimageCubeArray';
IMAGE2DMS : 'image2DMS';
IIMAGE2DMS : 'iimage2DMS';
UIMAGE2DMS : 'uimage2DMS';
IMAGE2DMSARRAY : 'image2DMSArray';
IIMAGE2DMSARRAY : 'iimage2DMSArray';
UIMAGE2DMSARRAY : 'uimage2DMSArray';

// Arithmetic Operators

PLUS : '+';
DASH : '-';
STAR : '*';
SLASH : '/';
PERCENT : '%';
INC_OP : '++';
DEC_OP : '--';

// Relational Operators

EQ_OP : '==';
NE_OP : '!=';
RIGHT_ANGLE : '>';
LEFT_ANGLE : '<';
GE_OP : '>=';
LE_OP : '<=';

// Logical Operators

AND_OP : '&&';
OR_OP : '||';
BANG : '!';

// Bitwise Operators

AMPERSAND : '&';
VERTICAL_BAR : '|';
XOR_OP : '^';
TILDE : '~';
LEFT_OP : '<<';
RIGHT_OP : '>>';

// Assignment Operators

EQUAL : '=';
ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MUL_ASSIGN : '*=';
DIV_ASSIGN : '/=';
MOD_ASSIGN : '%=';
LEFT_ASSIGN : '<<=';
RIGHT_ASSIGN : '>>=';
AND_ASSIGN : '&=';
XOR_ASSIGN : '^=';
OR_ASSIGN : '|=';

// Float Constants

FLOATCONSTANT
	: DECIMAL_NUMBER
	| DECIMAL_NUMBER 'f'
	| DECIMAL_NUMBER 'F'
	;

// Double Constants

DOUBLECONSTANT
	: DECIMAL_NUMBER 'lf'
	| DECIMAL_NUMBER 'LF'
	;

// Int Constants
// Any integer value is by default of type int (a signed integer). To create an integer literal of unsigned type, use the suffix u or U.
// Integer literals can be defined in base 8 or base 16 using the standard C/C++ conventions (prefix with 0 for base 8 or 0x for base 16)

INTCONSTANT
	: SIGNED_NUMBER
	| SIGN '0' OCTAL_DIGET+
	| SIGN '0x' HEX_DIGET+
	;

// Unsigned Int Constants

UINTCONSTANT
	: INTCONSTANT 'u'
	| INTCONSTANT 'U'
	;

// Bool Constants

BOOLCONSTANT
	:	'true'
	|	'false'
	;

// Identifiers

IDENTIFIER: NAME;

fragment NAME: NONDIGET (NONDIGET | DEC_DIGET)*;

fragment NONDIGET: [a-zA-Z_];

fragment DECIMAL_NUMBER
	:	SIGNED_NUMBER DOT DEC_DIGET+
	| SIGNED_NUMBER DOT DEC_DIGET+ [eE] SIGNED_NUMBER
	;

fragment SIGNED_NUMBER: SIGN NUMBER;

fragment NUMBER: NONZERO_DEC_DIGET DEC_DIGET*;

fragment NONZERO_DEC_DIGET: [1-9];

fragment DEC_DIGET: [0-9];

fragment OCTAL_DIGET:	[0-7];

fragment HEX_DIGET:	[0-9a-f];

fragment SIGN: '-'?;

// Ignored Characters

WS: [ \r\t\u000C\n]+ -> skip;

COMMENT: '/*' .*? '*/' -> skip;

LINECOMMENT: '//' ~[\r\n]* '\r'? '\n' -> skip;