grammar ProjectGrammar;

project
    : 'root' '{' (directory | file)* scriptSection? '}'
    ;


directory
    : IDENTIFIER '{' (directory | file)* '}'
    ;

file
    : FILENAME
    ;

scriptSection
    : 'script' '{' npmSection '}'
    ;

npmSection
    : 'npm' '{' dependencies '}'
    ;

dependencies
    : 'dependencies' STRING
    ;

IDENTIFIER
    : [a-zA-Z][a-zA-Z0-9_]*
    ;

FILENAME
    : [a-zA-Z] [a-zA-Z0-9_]* ('.' [a-zA-Z0-9_]+)?
    | '.' [a-zA-Z0-9_]+ ('.' [a-zA-Z0-9_]+)?
    ;

STRING
    : '\'' .*? '\''
    ;

WS
    : [ \t\r\n]+ -> skip
    ;