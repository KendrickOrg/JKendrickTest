grammar Model;

parse : main ;

main : 'public' 'class' 'MainModel' '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' 'args' ')' '{' concern rates scenario model tauLeap rk4 visualization simulation '}' '}' ;

concern : 'Concern' identifier '(' stringList ')' ;

rates : iRates+ ;

iRates : 'IRates' identifier ;

sumRate : 'SumRate' '(' iRates ',' iRates ')' ;

mulRate : 'MulRate' '(' iRates ',' iRates ')' ;

divRate : 'DivRate' '(' iRates ',' iRates ')' ;

rate : 'Rate' '(' identifier ')' ;

identifier : Identifier ;

stringList : '(' identifier ( ',' identifier )* ')' ;

scenario : 'Scenario' '(' identifier ')' '{' concern '}' ;

model : 'Model' '(' identifier ',' DoubleLiteral ',' DoubleLiteral ',' IntegerLiteral ')' ;

tauLeap : 'TauLeap' '(' identifier ')' ;

rk4 : 'RK4Solver' '(' identifier ')' ;

gillespie : 'Gillespie' '(' identifier ')' ;

visualization : 'Visualization' '(' ')' ;

simulation : 'Simulation' '(' identifier ',' identifier ',' identifier ')' ;

DoubleLiteral : '-'? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ;

IntegerLiteral : '-'? ( '0' .. '9' )+ ;

Identifier : ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )* ;