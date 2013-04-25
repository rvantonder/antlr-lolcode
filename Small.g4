grammar Small;

// file: (functionalDecl | varDecl)+ ;

// PROGRAM STRUCTURE
file: 'HAI\n' block 'KTHXBYE\n' EOF ; 

block: statement* ;

// TYPES

identifier: ID | 'SRS' expr;

type: 'YARN' | 'NUMBR' | 'NUMBAR' | 'TROOF' 
  | 'BUKKIT' | 'NOOB' ;

// STATEMENTS

statement
  : print
  | assignment
  | declaration
  ;

print: 'VISIBLE' exprlist 'BANG'? '\n' ;

assignment: identifier 'R' expr '\n' ;

declaration: 'I HAS A' identifier init ;

init: ('ITZ' expr | 'ITZ LIEK A' identifier) '\n' ;

exprlist: expr (',' expr)* ;

expr returns [int value]
  : constant
  | identifier
  ;

constant: BOOLEAN | INTEGER | STRING;

BOOLEAN : 'WIN' | 'FAIL' ;

ID : LETTER (LETTER | [0-9])* ;
fragment
LETTER : [a-zA-Z] ;

INTEGER : [0-9]+ ;

WS : [ \t\n\r]+ -> skip ;

COMMENT
  : 'BTW' .*? '\n' -> skip
  ;

fragment QUOTE: '\"' ;

STRING : QUOTE .*? QUOTE { setText(getText().substring(1, getText().length()-1)); };
