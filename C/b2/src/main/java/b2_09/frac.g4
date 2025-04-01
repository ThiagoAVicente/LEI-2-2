grammar frac;

program:
    stat* EOF;

stat:
    statement ';' Comment? NEWLINE
    | Comment NEWLINE
    | NEWLINE
    ;

statement:
    expr
    | assi
    | print
    ;

print:
    'print' VarName                #PrintVar
    |'print' 'reduce' expr         #ExprReduceCall
    |'print' expr                  #PrintExpr
    ;
assi:
    expr '->' VarName
    ;
expr:
    expr '^' Integer               #ExprPow
    | sig = ('+'|'-') expr         #ExprSigned
    | expr '/' expr                #ExprFraction
    | expr op = ('*'|':'|'%') expr #ExprMultDivMod
    |   expr op = ('+'|'-') expr   #ExprAddSub
    |   Integer                    #ExprInteger
    | VarName                      #ExprVarName
    |   '(' expr ')'               #ExprParentesis
    |'read' '"' VarName '"'        #ExprReadCall
    ;


// nome das variaveis
VarName:
    [a-zA-Z] [a-zA-Z0-9_]* ;

Integer:
    [0-9]+;

NEWLINE:
    '\r'?'\n';

WS:
    [ \t]+ -> skip;
Comment:
    '//' ~[\r\n]*  -> skip;

