grammar KendrickScript;

kendrickScript: kendrickEntity+ '.';

kendrickEntity: kModelDeclaration
               | compositionDeclaration
               | scenarioDeclaration
               | simulationDeclaration
               | visualizationDeclaration;

identifier: LETTER (LETTER | DIGIT)*;
compositeIdentifier: identifier '_' identifier ('_' identifier)*;

LETTER: [a-zA-Z];
DIGIT: [0-9];

number: DIGIT+ ('.' DIGIT+)?;

equation: equationSignature '=' equationExpression;

equationSignature: identifier ':' identifier;

equationExpression: term (('+' | '-') equationExpression)?;

term: ('-'? number | identifier | compositeIdentifier | product);

product: ('*' | '/') term;

array: '#(' values | shortExpression ')';

values: value (' ' value)*;

value: number | STRING | array;

shortExpression: equationExpression (basicOperator+)?;

basicOperator: 'sum' | 'sqrt' | 'log' | 'size' | 'min' | 'max' | 'avg' | 'sin' | 'cos';

kModelDeclaration: 'KendrickModel' identifier modelBody;

modelBody: attributeDeclaration ';' (modelExpression ';')* modelExpression '.';

modelExpression: attributeDeclaration
               | parametersDeclaration
               | assignmentClause
               | equationsDeclaration
               | transitionsDeclaration
               | modelInterfaceDeclaration;

attributeDeclaration: 'attribute: #(' identifier '->' identifier (identifier)* ')';

parametersDeclaration: 'parameters: #(' identifier (identifier)* ')';

equationsDeclaration: 'equations: ' equationArray;

equationArray: '#(' equation ('.' equation)* ')';

transitionsDeclaration: 'transitions: ' transitionArray;

transitionArray: '#(' transition ('.' transition)* ')';

transition: identifier '--' identifier '-->' identifier;

assignmentClause: identifier | compositeIdentifier ':' value ';';

compositionDeclaration: 'Composition' identifier compositionBody;

compositionBody: (compositionExpression ';')* compositionExpression '.';

compositionExpression: modelClause
                     | parametersDeclaration
                     | assignmentClause;

modelClause: 'model: \'' identifier '\'';

scenarioDeclaration: 'Scenario' identifier scenarioBody;

scenarioBody: onClause populationClause (scenarioExpression ';')* '.';

onClause: 'on: \'' identifier '\';';

populationClause: 'populationSize: ' number;

scenarioExpression: assignmentClause;

simulationDeclaration: 'Simulation' identifier algorithm simulationBody;

algorithm: 'rungeKutta' | 'gillespie' | 'tauleap';

simulationBody: (simulationScenario)* simulationScenario simulationTime;

simulationScenario: 'scenario: \'' identifier '\'';

simulationTime: 'from: ' number ';'
                'to: ' number ';'
                'step: ' number '.';

visualizationDeclaration: 'Visualization' identifier visualizationModule visualizationBody;

visualizationModule: 'diagram' | 'map';

visualizationBody: forClause (';' visualizationExpression)* '.';

forClause: 'for: \'' identifier '\'';

visualizationExpression: 'legends: ' array
                        | 'xLabel: ' STRING
                        | 'yLabel: ' STRING
                        | 'legendTitle: ' STRING
                        | 'data: ' shortExpression;

modelInterfaceDeclaration: 'interface: ' CLASS_NAME;

STRING: '\'' ~('\'' | '\r' | '\n')* '\'';

CLASS_NAME: [A-Z][a-zA-Z0-9_]*;

WS: [ \t\r\n]+ -> skip;
