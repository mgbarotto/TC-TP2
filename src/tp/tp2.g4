grammar tp2;

fragment DIG    : [0-9];
fragment VARCHAR: [0-9a-zA-Z_]; 

WS              :([\n\r\t ]       
                | '/''*'.*'*''/'   
                | '/''/'~([\n\r])*) -> skip;

OBRACE          : '{';
CBRACE          : '}';
OBRACKET        : '[';
CBRACKET        : ']';
SCOLON          : ';';
COMMA           : ',';
ASSIGN          : '=';

SUMOP           : '+'|'-';

MULTOP          : '/'|'*';


MOD             : '%';
INCREMENT       : '++';
DECREMENT       : '--';
PLASSIGN        : '+=';
MINASSIGN       : '-=';
MULTASSIGN      : '*=';
DIVASSIGN       : '/=';
MODASSIGN       : '%=';

COMPOP          : '>'|'<'|'=='|'!='|'>='|'<=';


LOGICOP         : OR|AND;

NOT             : '!';
OR              : '||';
AND             : '&&';



TYPE            : T_DOUBLE|T_FLOAT|T_INT|T_CHAR;

T_DOUBLE        : 'double';
T_FLOAT         : 'float';
T_INT           : 'int';
T_CHAR          : 'char';
T_VOID          : 'void';

IF              : 'if';
ELSE            : 'else';
DO              : 'do';
WHILE           : 'while';
FOR             : 'for';

BREAK           : 'break';
CONTINUE        : 'continue';

RETURN          : 'return';

SWITCH          : 'switch';
CASE            : 'case';
DEFAULT         : 'default';


INT             :  DIG+;
FLOAT           : ((DIG*'.'DIG+)|(DIG+'.'DIG*))('e'INT)?;

ID              : [_a-zA-Z]VARCHAR*;
CHAR            : '\''.'\'';


program: rec_instruc;
       
rec_instruc: instruc rec_instruc?;

instruc: block
        |forloop
        |whileloop
        |cond
        |func_prot
        |func_def
        |sentence SCOLON? 
        |SCOLON
       ;

sentence:declare
        |exp
        |assign
        |BREAK
        |CONTINUE;

block : OBRACE rec_instruc CBRACE;

baseexp:func_call
       |INT
       |FLOAT 
       |ID
       |CHAR;




exp:'('exp')'
   |baseexp
   |exp MULTOP exp
   |exp SUMOP exp
   |exp COMPOP exp
   |exp LOGICOP exp 
   |NOT exp;

assign: ID (ASSIGN|PLASSIGN|MINASSIGN|MULTASSIGN|DIVASSIGN) exp;

ret: RETURN exp? SCOLON;

func_def: (T_VOID|TYPE) ID '(' (T_VOID|func_def_param?) ')' OBRACE rec_instruc? ret? CBRACE ;
func_def_param :TYPE ID (COMMA func_def_param)?;

func_prot: (T_VOID|TYPE) ID '(' (func_prot_param) ')' SCOLON;
func_prot_param :TYPE ID? (COMMA func_prot_param)?;
          
func_call: ID '(' (func_call_param (COMMA func_call_param)*)? ')';
func_call_param: exp;
declare : TYPE ID (ASSIGN exp)? dec_comma*; 

dec_comma: COMMA ID (ASSIGN exp)?;

cond        : IF '(' exp ')' instruc elcond?;
          
elcond        : ELSE instruc;

forloop     : FOR '(' sentence SCOLON sentence SCOLON sentence ')' instruc;

whileloop :   WHILE '(' exp ')' instruc;






