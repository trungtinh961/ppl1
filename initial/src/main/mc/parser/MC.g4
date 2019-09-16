/**
 * Student name:    Nguyễn Trung Tính
 * Student ID:      1713521
 */

grammar MC;

@lexer::header {
from lexererr import *
}

@lexer::members {
def emit(self):
    tk = self.type

    if tk == self.UNCLOSE_STRING:       
        result = super().emit();
        raise UncloseString(result.text);
    elif tk == self.ILLEGAL_ESCAPE:
        result = super().emit();
        raise IllegalEscape(result.text);
    elif tk == self.ERROR_CHAR:
        result = super().emit();
        raise ErrorToken(result.text); 
    else:
        return super().emit();
}

options{
	language=Java;
}

                /************
                *   LEXER   *
                ************/

fragment Letter         : [a-zA-Z];

fragment Digit          : [0-9];

fragment Exponent       : [eE] SUB? Digit+ ;

fragment Underscore  : '_';

fragment Dot         : '.';

                /************
                *  KEYWORDS *
                ************/

BOOLEANTYPE     : 'boolean';
BREAK           : 'break';
CONTINUE        : 'continue';
ELSE            : 'else';
FOR             : 'for';
FLOATTYPE       : 'float';
IF              : 'if';
INTTYPE         : 'int' ;
RETURN          : 'return';
VOIDTYPE        : 'void' ;
DO              : 'do';
WHILE           : 'while';
TRUE            : 'true';
FALSE           : 'false';
STRINGTYPE      : 'string'; 

//KEYWORDS: BOOLEANTYPE | BREAK | CONTINUE | ELSE | FOR | FLOATTYPE | IF | INTTYPE | RETURN | VOIDTYPE | DO | WHILE | TRUE | FALSE | STRINGTYPE;

                /**************
                * IDENTIFIERS *
                **************/

ID : ( Underscore | Letter )( Underscore | Letter | Digit )*;

                /************
                * OPERATORS *
                ************/

ADD     : '+';
SUB     : '-';
MUL     : '*';
DIV     : '/';
NOT     : '!';
MOD     : '%';
OR      : '||';
AND     : '&&';
NEQ     : '!=';
EQ      : '==';
LESS    : '<';
GRATER  : '>';
LEQ     : '<=';
GEQ     : '>=';
ASSIGN  : '=';

                /************
                * LITERALS  *
                ************/

INTLIT      : Digit+;
FLOATLIT    : ( Digit+ (Dot | Dot? Exponent) Digit* ) | ( Digit* Dot Digit+ ( | Exponent) );
BOOLEANLIT  : TRUE | FALSE; 
STRINGLIT   : '"' ( '\\' [btnfr"\\] | ~[\r\n\\"] )* '"' { self.text = self.text.lstrip('"').rstrip('"') };
   
                /*************
                * SEPARATORS *
                *************/

LP          : '(';
RP          : ')';
LB          : '{';
RB          : '}';
LSB         : '[';
RSB         : ']';
SEMI        : ';';
CM          : ',';


                /************
                *  COMMENT  *
                ************/

BLOCK_COMMENT   : '/*' .*? '*/' -> skip;
LINE_COMMENT    : '//' ~[\r\n]* -> skip;
WS              : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

                /************
                *   ERROR   *
                ************/

ILLEGAL_ESCAPE  : '"' ( '\\' [btnfr"\\] | ~'\\')* ('\\' ~[btnfr"\\]) {self.text =  self.text.lstrip('"')};

UNCLOSE_STRING  : '"' ( '\\' [btnfr"\\] | ~[\r\n\\"] )* { self.text = self.text.lstrip('"') };

ERROR_CHAR      : .;

                /************
                *  PARXER   *
                ************/   

program             : manydecls ;
manydecls           : decl manydecls | decl ;
decl                : variable_decl | function_decl ;
variable_decl       : primitive_type many_variables SEMI ;
primitive_type      : INTTYPE | FLOATTYPE | BOOLEANTYPE | STRINGTYPE ;
many_variables      : variable CM many_variables | variable ;
variable            : ID (LSB INTLIT RSB)? ;

function_decl       : func_type ID LP parameter_list RP block_statement ;
func_type           : primitive_type | VOIDTYPE | array_pointer_type ;
parameter_list      : (parameter_decl parameter_tail)? ;
parameter_tail      : (CM parameter_decl parameter_tail)? ;
parameter_decl      : primitive_type ID (LSB RSB)? ;
var_stmt_list       : (var_stmt var_stmt_tail) ? ;
var_stmt_tail       : (var_stmt var_stmt_tail) ? ;
var_stmt            : variable_decl | statement ;

array               : primitive_type LSB INTLIT RSB;
array_pointer_type  : input_para | output_para;
input_para          : primitive_type ID LSB RSB;
output_para         : primitive_type LSB RSB;

expr            : expr1 ASSIGN expr | expr1;
expr1           : expr1 OR expr2 | expr2;
expr2           : expr2 AND expr3 | expr3;
expr3           : expr4 (EQ | NEQ) expr4 | expr4;
expr4           : expr5 (LESS | LEQ | GRATER | GEQ) expr5 | expr5;
expr5           : expr5 (ADD | SUB) expr6 | expr6;
expr6           : expr6 (DIV | MUL | MOD) expr7 | expr7;
expr7           : (SUB | NOT) expr7 | expr8;
expr8           : expr9 LSB RSB | expr9;
expr9           : LP expr RP | operands;
operands        : literal | ID | array_element | func_call;
literal         : INTLIT | FLOATLIT | BOOLEANLIT | STRINGLIT;
array_element   : func_call LSB expr RSB;////////////////////////////////////

func_call       : ID LP exprlist RP;
exprlist        : (expr exprtail) ? ;
exprtail        : (CM expr exprtail) ? ;

statement       : if_stmt 
                | for_stmt 
                | dowhile_stmt 
                | break_stmt 
                | continue_stmt 
                | return_stmt 
                | expr_stmt
                | block_statement
                ;
if_stmt         : if_else | if_no_else;
if_else         : IF LP expr RP statement ELSE statement;
if_no_else      : IF LP expr RP statement;

dowhile_stmt    : DO statement+ WHILE expr;

for_stmt        : FOR LP expr SEMI expr SEMI expr RP statement;

break_stmt      : BREAK SEMI;

continue_stmt   : CONTINUE SEMI;

return_stmt     : RETURN expr?;

expr_stmt       : expr SEMI;

block_statement : LB var_stmt_list RB ;