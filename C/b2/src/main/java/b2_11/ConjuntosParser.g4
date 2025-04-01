parser grammar ConjuntosParser;

options {
    tokenVocab = ConjuntosLexer;
}


// Definição do programa
program:
    linha*
    ;

linha:
    atribuicao COMMENT? NEWLINE|
    operacao COMMENT? NEWLINE|
    COMMENT? NEWLINE
    ;

// Um conjunto é definido por uma sequencia de palavras, ou de números, separada por
// vı́rgulas e delimitada por chavetas:
elementoConjunto:
         Digito  # ElementoDigito
        |Palavra # ElementoPalavra
    ;

conjunto:
    LBRACE (elementoConjunto (COMMA elementoConjunto)*)? RBRACE
    ;

// Operações podem ser feitas entre conjuntos. Esses conjuntos podem ser passados por uma variavel
// ou diretamente
operador:
    Var #OperadorVariavel
    |conjunto #OperadorConjunto
    ;

// Implemente as operações (com prioridade crescente) sobre conjuntos: união (definida
// pelo sı́mbolo +), intercepção (sı́mbolo &) e diferença (sı́mbolo \).
operacao:
    LPAR operacao RPAR # OperacaoParentesis
    |operador DIFF operador #OperacaoDiferenca
    |operador INTERCEPTION operador #OperacaoIntercecao
    |operador UNION operador #OperacaoUniao
    ;

// atribução de um conjunto a uma variável
atribuicao:
    Var EQUALS operador
    ;



