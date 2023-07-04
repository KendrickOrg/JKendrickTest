package JKendrickParser;

// Generated from Model.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, DoubleLiteral=29, IntegerLiteral=30, 
		Identifier=31;
	public static final int
		RULE_parse = 0, RULE_main = 1, RULE_concern = 2, RULE_rates = 3, RULE_iRates = 4, 
		RULE_sumRate = 5, RULE_mulRate = 6, RULE_divRate = 7, RULE_rate = 8, RULE_identifier = 9, 
		RULE_stringList = 10, RULE_scenario = 11, RULE_model = 12, RULE_tauLeap = 13, 
		RULE_rk4 = 14, RULE_gillespie = 15, RULE_visualization = 16, RULE_simulation = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "main", "concern", "rates", "iRates", "sumRate", "mulRate", 
			"divRate", "rate", "identifier", "stringList", "scenario", "model", "tauLeap", 
			"rk4", "gillespie", "visualization", "simulation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'class'", "'MainModel'", "'{'", "'static'", "'void'", 
			"'main'", "'('", "'String'", "'['", "']'", "'args'", "')'", "'}'", "'Concern'", 
			"'IRates'", "'SumRate'", "','", "'MulRate'", "'DivRate'", "'Rate'", "'Scenario'", 
			"'Model'", "'TauLeap'", "'RK4Solver'", "'Gillespie'", "'Visualization'", 
			"'Simulation'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "DoubleLiteral", "IntegerLiteral", "Identifier"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Model.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ModelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			main();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public ConcernContext concern() {
			return getRuleContext(ConcernContext.class,0);
		}
		public RatesContext rates() {
			return getRuleContext(RatesContext.class,0);
		}
		public ScenarioContext scenario() {
			return getRuleContext(ScenarioContext.class,0);
		}
		public ModelContext model() {
			return getRuleContext(ModelContext.class,0);
		}
		public TauLeapContext tauLeap() {
			return getRuleContext(TauLeapContext.class,0);
		}
		public Rk4Context rk4() {
			return getRuleContext(Rk4Context.class,0);
		}
		public VisualizationContext visualization() {
			return getRuleContext(VisualizationContext.class,0);
		}
		public SimulationContext simulation() {
			return getRuleContext(SimulationContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
			setState(39);
			match(T__1);
			setState(40);
			match(T__2);
			setState(41);
			match(T__3);
			setState(42);
			match(T__0);
			setState(43);
			match(T__4);
			setState(44);
			match(T__5);
			setState(45);
			match(T__6);
			setState(46);
			match(T__7);
			setState(47);
			match(T__8);
			setState(48);
			match(T__9);
			setState(49);
			match(T__10);
			setState(50);
			match(T__11);
			setState(51);
			match(T__12);
			setState(52);
			match(T__3);
			setState(53);
			concern();
			setState(54);
			rates();
			setState(55);
			scenario();
			setState(56);
			model();
			setState(57);
			tauLeap();
			setState(58);
			rk4();
			setState(59);
			visualization();
			setState(60);
			simulation();
			setState(61);
			match(T__13);
			setState(62);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConcernContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringListContext stringList() {
			return getRuleContext(StringListContext.class,0);
		}
		public ConcernContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterConcern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitConcern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitConcern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcernContext concern() throws RecognitionException {
		ConcernContext _localctx = new ConcernContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_concern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__14);
			setState(65);
			identifier();
			setState(66);
			match(T__7);
			setState(67);
			stringList();
			setState(68);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RatesContext extends ParserRuleContext {
		public List<IRatesContext> iRates() {
			return getRuleContexts(IRatesContext.class);
		}
		public IRatesContext iRates(int i) {
			return getRuleContext(IRatesContext.class,i);
		}
		public RatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterRates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitRates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitRates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RatesContext rates() throws RecognitionException {
		RatesContext _localctx = new RatesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				iRates();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__15 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IRatesContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IRatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iRates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterIRates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitIRates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitIRates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IRatesContext iRates() throws RecognitionException {
		IRatesContext _localctx = new IRatesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_iRates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__15);
			setState(76);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumRateContext extends ParserRuleContext {
		public List<IRatesContext> iRates() {
			return getRuleContexts(IRatesContext.class);
		}
		public IRatesContext iRates(int i) {
			return getRuleContext(IRatesContext.class,i);
		}
		public SumRateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumRate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterSumRate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitSumRate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitSumRate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumRateContext sumRate() throws RecognitionException {
		SumRateContext _localctx = new SumRateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sumRate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__16);
			setState(79);
			match(T__7);
			setState(80);
			iRates();
			setState(81);
			match(T__17);
			setState(82);
			iRates();
			setState(83);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulRateContext extends ParserRuleContext {
		public List<IRatesContext> iRates() {
			return getRuleContexts(IRatesContext.class);
		}
		public IRatesContext iRates(int i) {
			return getRuleContext(IRatesContext.class,i);
		}
		public MulRateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulRate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterMulRate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitMulRate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitMulRate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulRateContext mulRate() throws RecognitionException {
		MulRateContext _localctx = new MulRateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mulRate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__18);
			setState(86);
			match(T__7);
			setState(87);
			iRates();
			setState(88);
			match(T__17);
			setState(89);
			iRates();
			setState(90);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivRateContext extends ParserRuleContext {
		public List<IRatesContext> iRates() {
			return getRuleContexts(IRatesContext.class);
		}
		public IRatesContext iRates(int i) {
			return getRuleContext(IRatesContext.class,i);
		}
		public DivRateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divRate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterDivRate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitDivRate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitDivRate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivRateContext divRate() throws RecognitionException {
		DivRateContext _localctx = new DivRateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_divRate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__19);
			setState(93);
			match(T__7);
			setState(94);
			iRates();
			setState(95);
			match(T__17);
			setState(96);
			iRates();
			setState(97);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RateContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterRate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitRate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitRate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RateContext rate() throws RecognitionException {
		RateContext _localctx = new RateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__20);
			setState(100);
			match(T__7);
			setState(101);
			identifier();
			setState(102);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public StringListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterStringList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitStringList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitStringList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringListContext stringList() throws RecognitionException {
		StringListContext _localctx = new StringListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stringList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__7);
			setState(107);
			identifier();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(108);
				match(T__17);
				setState(109);
				identifier();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScenarioContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConcernContext concern() {
			return getRuleContext(ConcernContext.class,0);
		}
		public ScenarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scenario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterScenario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitScenario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitScenario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScenarioContext scenario() throws RecognitionException {
		ScenarioContext _localctx = new ScenarioContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_scenario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__21);
			setState(118);
			match(T__7);
			setState(119);
			identifier();
			setState(120);
			match(T__12);
			setState(121);
			match(T__3);
			setState(122);
			concern();
			setState(123);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModelContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> DoubleLiteral() { return getTokens(ModelParser.DoubleLiteral); }
		public TerminalNode DoubleLiteral(int i) {
			return getToken(ModelParser.DoubleLiteral, i);
		}
		public TerminalNode IntegerLiteral() { return getToken(ModelParser.IntegerLiteral, 0); }
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__22);
			setState(126);
			match(T__7);
			setState(127);
			identifier();
			setState(128);
			match(T__17);
			setState(129);
			match(DoubleLiteral);
			setState(130);
			match(T__17);
			setState(131);
			match(DoubleLiteral);
			setState(132);
			match(T__17);
			setState(133);
			match(IntegerLiteral);
			setState(134);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TauLeapContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TauLeapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tauLeap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterTauLeap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitTauLeap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTauLeap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TauLeapContext tauLeap() throws RecognitionException {
		TauLeapContext _localctx = new TauLeapContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tauLeap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__23);
			setState(137);
			match(T__7);
			setState(138);
			identifier();
			setState(139);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rk4Context extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Rk4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rk4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterRk4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitRk4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitRk4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rk4Context rk4() throws RecognitionException {
		Rk4Context _localctx = new Rk4Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_rk4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__24);
			setState(142);
			match(T__7);
			setState(143);
			identifier();
			setState(144);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GillespieContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GillespieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gillespie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterGillespie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitGillespie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitGillespie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GillespieContext gillespie() throws RecognitionException {
		GillespieContext _localctx = new GillespieContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_gillespie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__25);
			setState(147);
			match(T__7);
			setState(148);
			identifier();
			setState(149);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VisualizationContext extends ParserRuleContext {
		public VisualizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visualization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterVisualization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitVisualization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitVisualization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisualizationContext visualization() throws RecognitionException {
		VisualizationContext _localctx = new VisualizationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_visualization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__26);
			setState(152);
			match(T__7);
			setState(153);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimulationContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public SimulationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simulation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterSimulation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitSimulation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitSimulation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimulationContext simulation() throws RecognitionException {
		SimulationContext _localctx = new SimulationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_simulation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__27);
			setState(156);
			match(T__7);
			setState(157);
			identifier();
			setState(158);
			match(T__17);
			setState(159);
			identifier();
			setState(160);
			match(T__17);
			setState(161);
			identifier();
			setState(162);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00a7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\6\5J\n\5\r\5\16\5K\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\7\fq\n\f\f\f\16\ft\13\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\2"+
		"\2\u0096\2&\3\2\2\2\4(\3\2\2\2\6B\3\2\2\2\bI\3\2\2\2\nM\3\2\2\2\fP\3\2"+
		"\2\2\16W\3\2\2\2\20^\3\2\2\2\22e\3\2\2\2\24j\3\2\2\2\26l\3\2\2\2\30w\3"+
		"\2\2\2\32\177\3\2\2\2\34\u008a\3\2\2\2\36\u008f\3\2\2\2 \u0094\3\2\2\2"+
		"\"\u0099\3\2\2\2$\u009d\3\2\2\2&\'\5\4\3\2\'\3\3\2\2\2()\7\3\2\2)*\7\4"+
		"\2\2*+\7\5\2\2+,\7\6\2\2,-\7\3\2\2-.\7\7\2\2./\7\b\2\2/\60\7\t\2\2\60"+
		"\61\7\n\2\2\61\62\7\13\2\2\62\63\7\f\2\2\63\64\7\r\2\2\64\65\7\16\2\2"+
		"\65\66\7\17\2\2\66\67\7\6\2\2\678\5\6\4\289\5\b\5\29:\5\30\r\2:;\5\32"+
		"\16\2;<\5\34\17\2<=\5\36\20\2=>\5\"\22\2>?\5$\23\2?@\7\20\2\2@A\7\20\2"+
		"\2A\5\3\2\2\2BC\7\21\2\2CD\5\24\13\2DE\7\n\2\2EF\5\26\f\2FG\7\17\2\2G"+
		"\7\3\2\2\2HJ\5\n\6\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\t\3\2\2"+
		"\2MN\7\22\2\2NO\5\24\13\2O\13\3\2\2\2PQ\7\23\2\2QR\7\n\2\2RS\5\n\6\2S"+
		"T\7\24\2\2TU\5\n\6\2UV\7\17\2\2V\r\3\2\2\2WX\7\25\2\2XY\7\n\2\2YZ\5\n"+
		"\6\2Z[\7\24\2\2[\\\5\n\6\2\\]\7\17\2\2]\17\3\2\2\2^_\7\26\2\2_`\7\n\2"+
		"\2`a\5\n\6\2ab\7\24\2\2bc\5\n\6\2cd\7\17\2\2d\21\3\2\2\2ef\7\27\2\2fg"+
		"\7\n\2\2gh\5\24\13\2hi\7\17\2\2i\23\3\2\2\2jk\7!\2\2k\25\3\2\2\2lm\7\n"+
		"\2\2mr\5\24\13\2no\7\24\2\2oq\5\24\13\2pn\3\2\2\2qt\3\2\2\2rp\3\2\2\2"+
		"rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\17\2\2v\27\3\2\2\2wx\7\30\2\2xy\7\n"+
		"\2\2yz\5\24\13\2z{\7\17\2\2{|\7\6\2\2|}\5\6\4\2}~\7\20\2\2~\31\3\2\2\2"+
		"\177\u0080\7\31\2\2\u0080\u0081\7\n\2\2\u0081\u0082\5\24\13\2\u0082\u0083"+
		"\7\24\2\2\u0083\u0084\7\37\2\2\u0084\u0085\7\24\2\2\u0085\u0086\7\37\2"+
		"\2\u0086\u0087\7\24\2\2\u0087\u0088\7 \2\2\u0088\u0089\7\17\2\2\u0089"+
		"\33\3\2\2\2\u008a\u008b\7\32\2\2\u008b\u008c\7\n\2\2\u008c\u008d\5\24"+
		"\13\2\u008d\u008e\7\17\2\2\u008e\35\3\2\2\2\u008f\u0090\7\33\2\2\u0090"+
		"\u0091\7\n\2\2\u0091\u0092\5\24\13\2\u0092\u0093\7\17\2\2\u0093\37\3\2"+
		"\2\2\u0094\u0095\7\34\2\2\u0095\u0096\7\n\2\2\u0096\u0097\5\24\13\2\u0097"+
		"\u0098\7\17\2\2\u0098!\3\2\2\2\u0099\u009a\7\35\2\2\u009a\u009b\7\n\2"+
		"\2\u009b\u009c\7\17\2\2\u009c#\3\2\2\2\u009d\u009e\7\36\2\2\u009e\u009f"+
		"\7\n\2\2\u009f\u00a0\5\24\13\2\u00a0\u00a1\7\24\2\2\u00a1\u00a2\5\24\13"+
		"\2\u00a2\u00a3\7\24\2\2\u00a3\u00a4\5\24\13\2\u00a4\u00a5\7\17\2\2\u00a5"+
		"%\3\2\2\2\4Kr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}