grammar TupleLang;

start:
    stat* EOF
    ;

stat:
    command ';'
    ;
command:
        expr
    |   print
    |   assign
    |   while 
    ;

print:
    'print' (expr (',' expr)*)?
    ;
assign:
    ID ':=' expr
    ;

expr:
     '(' expr ')'                       #ExprParen
    | 'head' expr                       #ExprHead
    | 'tail' expr                       #ExprTail
    | 'sum' expr                        #ExprSum 
    | 'average' expr                    #ExprAvg
    | sig=('+'|'-') expr                #ExprUnary
    | op1=expr op=('+'|'-') op2=expr    #ExprAddSub
    |'[' (NUMERIC (','NUMERIC)* )?  ']' #ExprTuple
    | ID                                #ExprId
    | 'read'                            #ExprRead
    ;

while:
    'while' expr 'do' ':' stat* 'end'
    ;

ID:[a-zA-Z_][a-zA-Z0-9_]*;
NUMERIC: [0-9]+('.'[0-9]+)?;

COMMENT: '--' ~[\r\n]*->skip;
NW: '\n'? '\n' -> skip;
WS: [\t ]->skip;