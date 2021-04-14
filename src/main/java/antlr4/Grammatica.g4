grammar Grammatica ;

PLUS : '+' ;
MINUS : '-' ;
MULT : '*' ;
DIV : '/' ;
POW : '^' ;
UNAROPERATION : '++'
              | '--'
              ;

TYPE: 'int'
    | 'float'
    | 'double'
    ;

TYPEFUNC : 'VOID'
         | 'INT'
         | 'DOUBLE'
         | 'FLOAT';

NAMEFUNC : [A-Z]+;
NEWLINE : '\r'? '\n';
IF: 'if';
RETURN: 'bratishka_ia_pokushat_prines' ;
WHILE : 'while';
DO: 'do:';
FOR : 'for';
ID : ([a-z]+[A-Z]*[0-9]*)+ ;
NUMBER : [0-9]+ ;
FLOAT : NUMBER'.'NUMBER ;




COMPARE:'!='
    |   '=='
    |   '<'
    |   '>'
    |   '>='
    |   '<='
    ;

WHITESPACE:[ \t\r]+ ->  skip;

function: TYPEFUNC NAMEFUNC '(' functionalParam?'):' NEWLINE  blockStatement*  NEWLINE NEWLINE;
functionCall : NAMEFUNC '(' functionalParam? ')' NEWLINE;
functionMain : '{'blockStatement*'}' ;

functionalParam : param (',' param)* ;

param : functionCall
      | expr
      ;

program : (function)* functionMain ;

blockStatement : functionCall #functionCallState
               | NEWLINE #newlineState
               | stat #statement
               ;

assigningValue: ID '=' expr
              ;

defineVar : TYPE ID '=' expr
          | TYPE ID
          | TYPE ID '=' (NUMBER|FLOAT)
          | TYPE ID '=' ID
          ;

expr:   '(' expr ')' #bracketsExp
    |   defineVar #defVarExp
    |   assigningValue #assigValueExp
    |   expr (MULT|DIV) expr #multDivExp
    |   expr POW expr #powExp
    |   expr (PLUS|MINUS) expr #plusMinusExp
    |   expr COMPARE expr #compareExp
    |   ID UNAROPERATION #unaryOperExp
    |   NUMBER #numberExp
    |   ID #idExp
    ;

stat:   expr NEWLINE #exprStatement
    |   'if('expr'):' NEWLINE stat+  NEWLINE #ifStatement
    |   WHILE '(' expr COMPARE expr '):' NEWLINE stat+  NEWLINE #whileStatement
    |   'for(' expr ';' expr ';' expr '):' NEWLINE stat+  NEWLINE #forStatement
    |   DO NEWLINE stat+ WHILE '(' expr COMPARE expr ')' NEWLINE #doWhileStatement
    |   RETURN expr #returnStatement
    |   'Pokazhis(' expr')' #printStatement
    ;


