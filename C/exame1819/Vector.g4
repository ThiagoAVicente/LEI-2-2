grammar Vector;

main:
    stat* EOF
    ;

stat:
    func ';'
    ;

func:
        assign
    |   showCall
    |   expr
    ;

assign:
    expr '->' ID
    ;
showCall:
    'show' expr 
    ;

expr:
     sig=('+'|'-') expr    #ExprSig
    | expr '*' expr         #ExprMult
    | expr '.' expr         #ExprDot
    |expr op=('+'|'-') expr #ExprSumSub
    |'('expr')'              #ExprParen
    | NUM                    #ExprNum
    |vec                    #ExprVec
    |ID                     #ExprId
    
    ;

vec:
    '[' NUM (','NUM)* ']'
    ;

ID: [a-zA-Z][a-zA-Z0-9_]*;
NUM:[0-9]+('.'[0-9]+)?;
NW: '\r'? '\n' -> skip;
WS: [\t ] -> skip;
