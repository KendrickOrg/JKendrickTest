package JKendrickParser;

// Generated from Model.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ModelParser}.
 */
public interface ModelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ModelParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(ModelParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(ModelParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(ModelParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(ModelParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#concern}.
	 * @param ctx the parse tree
	 */
	void enterConcern(ModelParser.ConcernContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#concern}.
	 * @param ctx the parse tree
	 */
	void exitConcern(ModelParser.ConcernContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#rates}.
	 * @param ctx the parse tree
	 */
	void enterRates(ModelParser.RatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#rates}.
	 * @param ctx the parse tree
	 */
	void exitRates(ModelParser.RatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#iRates}.
	 * @param ctx the parse tree
	 */
	void enterIRates(ModelParser.IRatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#iRates}.
	 * @param ctx the parse tree
	 */
	void exitIRates(ModelParser.IRatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#sumRate}.
	 * @param ctx the parse tree
	 */
	void enterSumRate(ModelParser.SumRateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#sumRate}.
	 * @param ctx the parse tree
	 */
	void exitSumRate(ModelParser.SumRateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#mulRate}.
	 * @param ctx the parse tree
	 */
	void enterMulRate(ModelParser.MulRateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#mulRate}.
	 * @param ctx the parse tree
	 */
	void exitMulRate(ModelParser.MulRateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#divRate}.
	 * @param ctx the parse tree
	 */
	void enterDivRate(ModelParser.DivRateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#divRate}.
	 * @param ctx the parse tree
	 */
	void exitDivRate(ModelParser.DivRateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#rate}.
	 * @param ctx the parse tree
	 */
	void enterRate(ModelParser.RateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#rate}.
	 * @param ctx the parse tree
	 */
	void exitRate(ModelParser.RateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ModelParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ModelParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#stringList}.
	 * @param ctx the parse tree
	 */
	void enterStringList(ModelParser.StringListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#stringList}.
	 * @param ctx the parse tree
	 */
	void exitStringList(ModelParser.StringListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#scenario}.
	 * @param ctx the parse tree
	 */
	void enterScenario(ModelParser.ScenarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#scenario}.
	 * @param ctx the parse tree
	 */
	void exitScenario(ModelParser.ScenarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(ModelParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(ModelParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#tauLeap}.
	 * @param ctx the parse tree
	 */
	void enterTauLeap(ModelParser.TauLeapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#tauLeap}.
	 * @param ctx the parse tree
	 */
	void exitTauLeap(ModelParser.TauLeapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#rk4}.
	 * @param ctx the parse tree
	 */
	void enterRk4(ModelParser.Rk4Context ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#rk4}.
	 * @param ctx the parse tree
	 */
	void exitRk4(ModelParser.Rk4Context ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#gillespie}.
	 * @param ctx the parse tree
	 */
	void enterGillespie(ModelParser.GillespieContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#gillespie}.
	 * @param ctx the parse tree
	 */
	void exitGillespie(ModelParser.GillespieContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#visualization}.
	 * @param ctx the parse tree
	 */
	void enterVisualization(ModelParser.VisualizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#visualization}.
	 * @param ctx the parse tree
	 */
	void exitVisualization(ModelParser.VisualizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#simulation}.
	 * @param ctx the parse tree
	 */
	void enterSimulation(ModelParser.SimulationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#simulation}.
	 * @param ctx the parse tree
	 */
	void exitSimulation(ModelParser.SimulationContext ctx);
}