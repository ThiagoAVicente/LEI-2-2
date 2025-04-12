lexer grammar myLexer;

VarName: [a-z]+;
Integer: [0-9]+;
COMMENT: '#' ~[\r\n]* -> skip;

// New line
NW: '\r'? '\n'  ;

// Whitespace
WS: [ \t]+ -> skip;

// Parentesis
LeftP: '(';
RightP: ')';

// operators
EQUAL: '=';
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
REMAINDER: '%';
PRINTOP: '@';