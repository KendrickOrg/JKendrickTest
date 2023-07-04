package KendrickParser;

// Generated from KendrickScript.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KendrickScriptParser}.
 */
public interface KendrickScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#kendrickScript}.
	 * @param ctx the parse tree
	 */
	void enterKendrickScript(KendrickScriptParser.KendrickScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#kendrickScript}.
	 * @param ctx the parse tree
	 */
	void exitKendrickScript(KendrickScriptParser.KendrickScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#kendrickEntity}.
	 * @param ctx the parse tree
	 */
	void enterKendrickEntity(KendrickScriptParser.KendrickEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#kendrickEntity}.
	 * @param ctx the parse tree
	 */
	void exitKendrickEntity(KendrickScriptParser.KendrickEntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(KendrickScriptParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(KendrickScriptParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#compositeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterCompositeIdentifier(KendrickScriptParser.CompositeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#compositeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitCompositeIdentifier(KendrickScriptParser.CompositeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(KendrickScriptParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(KendrickScriptParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(KendrickScriptParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(KendrickScriptParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#equationSignature}.
	 * @param ctx the parse tree
	 */
	void enterEquationSignature(KendrickScriptParser.EquationSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#equationSignature}.
	 * @param ctx the parse tree
	 */
	void exitEquationSignature(KendrickScriptParser.EquationSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#equationExpression}.
	 * @param ctx the parse tree
	 */
	void enterEquationExpression(KendrickScriptParser.EquationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#equationExpression}.
	 * @param ctx the parse tree
	 */
	void exitEquationExpression(KendrickScriptParser.EquationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(KendrickScriptParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(KendrickScriptParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#product}.
	 * @param ctx the parse tree
	 */
	void enterProduct(KendrickScriptParser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#product}.
	 * @param ctx the parse tree
	 */
	void exitProduct(KendrickScriptParser.ProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(KendrickScriptParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(KendrickScriptParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(KendrickScriptParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(KendrickScriptParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(KendrickScriptParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(KendrickScriptParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#shortExpression}.
	 * @param ctx the parse tree
	 */
	void enterShortExpression(KendrickScriptParser.ShortExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#shortExpression}.
	 * @param ctx the parse tree
	 */
	void exitShortExpression(KendrickScriptParser.ShortExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#basicOperator}.
	 * @param ctx the parse tree
	 */
	void enterBasicOperator(KendrickScriptParser.BasicOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#basicOperator}.
	 * @param ctx the parse tree
	 */
	void exitBasicOperator(KendrickScriptParser.BasicOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#kModelDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterKModelDeclaration(KendrickScriptParser.KModelDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#kModelDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitKModelDeclaration(KendrickScriptParser.KModelDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#modelBody}.
	 * @param ctx the parse tree
	 */
	void enterModelBody(KendrickScriptParser.ModelBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#modelBody}.
	 * @param ctx the parse tree
	 */
	void exitModelBody(KendrickScriptParser.ModelBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#modelExpression}.
	 * @param ctx the parse tree
	 */
	void enterModelExpression(KendrickScriptParser.ModelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#modelExpression}.
	 * @param ctx the parse tree
	 */
	void exitModelExpression(KendrickScriptParser.ModelExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#attributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDeclaration(KendrickScriptParser.AttributeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#attributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDeclaration(KendrickScriptParser.AttributeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#parametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParametersDeclaration(KendrickScriptParser.ParametersDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#parametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParametersDeclaration(KendrickScriptParser.ParametersDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#equationsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEquationsDeclaration(KendrickScriptParser.EquationsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#equationsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEquationsDeclaration(KendrickScriptParser.EquationsDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#equationArray}.
	 * @param ctx the parse tree
	 */
	void enterEquationArray(KendrickScriptParser.EquationArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#equationArray}.
	 * @param ctx the parse tree
	 */
	void exitEquationArray(KendrickScriptParser.EquationArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#transitionsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTransitionsDeclaration(KendrickScriptParser.TransitionsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#transitionsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTransitionsDeclaration(KendrickScriptParser.TransitionsDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#transitionArray}.
	 * @param ctx the parse tree
	 */
	void enterTransitionArray(KendrickScriptParser.TransitionArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#transitionArray}.
	 * @param ctx the parse tree
	 */
	void exitTransitionArray(KendrickScriptParser.TransitionArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(KendrickScriptParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(KendrickScriptParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#assignmentClause}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentClause(KendrickScriptParser.AssignmentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#assignmentClause}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentClause(KendrickScriptParser.AssignmentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#compositionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCompositionDeclaration(KendrickScriptParser.CompositionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#compositionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCompositionDeclaration(KendrickScriptParser.CompositionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#compositionBody}.
	 * @param ctx the parse tree
	 */
	void enterCompositionBody(KendrickScriptParser.CompositionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#compositionBody}.
	 * @param ctx the parse tree
	 */
	void exitCompositionBody(KendrickScriptParser.CompositionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#compositionExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompositionExpression(KendrickScriptParser.CompositionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#compositionExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompositionExpression(KendrickScriptParser.CompositionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#modelClause}.
	 * @param ctx the parse tree
	 */
	void enterModelClause(KendrickScriptParser.ModelClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#modelClause}.
	 * @param ctx the parse tree
	 */
	void exitModelClause(KendrickScriptParser.ModelClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#scenarioDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterScenarioDeclaration(KendrickScriptParser.ScenarioDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#scenarioDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitScenarioDeclaration(KendrickScriptParser.ScenarioDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#scenarioBody}.
	 * @param ctx the parse tree
	 */
	void enterScenarioBody(KendrickScriptParser.ScenarioBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#scenarioBody}.
	 * @param ctx the parse tree
	 */
	void exitScenarioBody(KendrickScriptParser.ScenarioBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#onClause}.
	 * @param ctx the parse tree
	 */
	void enterOnClause(KendrickScriptParser.OnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#onClause}.
	 * @param ctx the parse tree
	 */
	void exitOnClause(KendrickScriptParser.OnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#populationClause}.
	 * @param ctx the parse tree
	 */
	void enterPopulationClause(KendrickScriptParser.PopulationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#populationClause}.
	 * @param ctx the parse tree
	 */
	void exitPopulationClause(KendrickScriptParser.PopulationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#scenarioExpression}.
	 * @param ctx the parse tree
	 */
	void enterScenarioExpression(KendrickScriptParser.ScenarioExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#scenarioExpression}.
	 * @param ctx the parse tree
	 */
	void exitScenarioExpression(KendrickScriptParser.ScenarioExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#simulationDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimulationDeclaration(KendrickScriptParser.SimulationDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#simulationDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimulationDeclaration(KendrickScriptParser.SimulationDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#algorithm}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithm(KendrickScriptParser.AlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#algorithm}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithm(KendrickScriptParser.AlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#simulationBody}.
	 * @param ctx the parse tree
	 */
	void enterSimulationBody(KendrickScriptParser.SimulationBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#simulationBody}.
	 * @param ctx the parse tree
	 */
	void exitSimulationBody(KendrickScriptParser.SimulationBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#simulationScenario}.
	 * @param ctx the parse tree
	 */
	void enterSimulationScenario(KendrickScriptParser.SimulationScenarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#simulationScenario}.
	 * @param ctx the parse tree
	 */
	void exitSimulationScenario(KendrickScriptParser.SimulationScenarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#simulationTime}.
	 * @param ctx the parse tree
	 */
	void enterSimulationTime(KendrickScriptParser.SimulationTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#simulationTime}.
	 * @param ctx the parse tree
	 */
	void exitSimulationTime(KendrickScriptParser.SimulationTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#visualizationDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVisualizationDeclaration(KendrickScriptParser.VisualizationDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#visualizationDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVisualizationDeclaration(KendrickScriptParser.VisualizationDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#visualizationModule}.
	 * @param ctx the parse tree
	 */
	void enterVisualizationModule(KendrickScriptParser.VisualizationModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#visualizationModule}.
	 * @param ctx the parse tree
	 */
	void exitVisualizationModule(KendrickScriptParser.VisualizationModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#visualizationBody}.
	 * @param ctx the parse tree
	 */
	void enterVisualizationBody(KendrickScriptParser.VisualizationBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#visualizationBody}.
	 * @param ctx the parse tree
	 */
	void exitVisualizationBody(KendrickScriptParser.VisualizationBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(KendrickScriptParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(KendrickScriptParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#visualizationExpression}.
	 * @param ctx the parse tree
	 */
	void enterVisualizationExpression(KendrickScriptParser.VisualizationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#visualizationExpression}.
	 * @param ctx the parse tree
	 */
	void exitVisualizationExpression(KendrickScriptParser.VisualizationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KendrickScriptParser#modelInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModelInterfaceDeclaration(KendrickScriptParser.ModelInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KendrickScriptParser#modelInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModelInterfaceDeclaration(KendrickScriptParser.ModelInterfaceDeclarationContext ctx);
}