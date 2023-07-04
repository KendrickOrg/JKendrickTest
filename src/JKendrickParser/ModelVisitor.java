package JKendrickParser;

// Generated from Model.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ModelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ModelVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ModelParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(ModelParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(ModelParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#concern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcern(ModelParser.ConcernContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#rates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRates(ModelParser.RatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#iRates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIRates(ModelParser.IRatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#sumRate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumRate(ModelParser.SumRateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#mulRate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulRate(ModelParser.MulRateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#divRate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivRate(ModelParser.DivRateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#rate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRate(ModelParser.RateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ModelParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#stringList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringList(ModelParser.StringListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#scenario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScenario(ModelParser.ScenarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(ModelParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#tauLeap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTauLeap(ModelParser.TauLeapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#rk4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRk4(ModelParser.Rk4Context ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#gillespie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGillespie(ModelParser.GillespieContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#visualization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisualization(ModelParser.VisualizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#simulation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimulation(ModelParser.SimulationContext ctx);
}