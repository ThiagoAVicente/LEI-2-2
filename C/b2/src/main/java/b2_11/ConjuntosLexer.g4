lexer grammar ConjuntosLexer;

// Uma variável é uma sequência de letras maiúsculas.
Var:
    [A-Z]+
    ;

// Uma palavra é uma sequência de letras minúsculas.
Palavra:
        [a-z]+
        ;

// Um número é uma sequência de dı́gitos, eventualmente precedida pelo sinal menos
// ou pelo sinal mais.
Digito:
       [-+]? [0-9]+
        ;

// Comentários
COMMENT: '--' ~[\r\n]* -> skip;

// TOKENS auxiliares
NEWLINE:
    '\r'? '\n';
WS:
    [ \t]+ -> skip;
LBRACE: '{';
RBRACE: '}';
COMMA: ',';
EQUALS: '=';
LPAR: '(';
RPAR: ')';
DIFF: '\\';
INTERCEPTION: '&';
UNION: '+';