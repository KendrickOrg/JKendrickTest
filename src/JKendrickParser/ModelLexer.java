package JKendrickParser;

// Generated from Model.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModelLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "DoubleLiteral", "IntegerLiteral", "Identifier"
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


	public ModelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Model.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u0111\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\5\36\u00f5"+
		"\n\36\3\36\6\36\u00f8\n\36\r\36\16\36\u00f9\3\36\3\36\7\36\u00fe\n\36"+
		"\f\36\16\36\u0101\13\36\3\37\5\37\u0104\n\37\3\37\6\37\u0107\n\37\r\37"+
		"\16\37\u0108\3 \3 \7 \u010d\n \f \16 \u0110\13 \2\2!\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!\3\2\4\6\2&&C\\"+
		"aac|\7\2&&\62;C\\aac|\2\u0116\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5"+
		"H\3\2\2\2\7N\3\2\2\2\tX\3\2\2\2\13Z\3\2\2\2\ra\3\2\2\2\17f\3\2\2\2\21"+
		"k\3\2\2\2\23m\3\2\2\2\25t\3\2\2\2\27v\3\2\2\2\31x\3\2\2\2\33}\3\2\2\2"+
		"\35\177\3\2\2\2\37\u0081\3\2\2\2!\u0089\3\2\2\2#\u0090\3\2\2\2%\u0098"+
		"\3\2\2\2\'\u009a\3\2\2\2)\u00a2\3\2\2\2+\u00aa\3\2\2\2-\u00af\3\2\2\2"+
		"/\u00b8\3\2\2\2\61\u00be\3\2\2\2\63\u00c6\3\2\2\2\65\u00d0\3\2\2\2\67"+
		"\u00da\3\2\2\29\u00e8\3\2\2\2;\u00f4\3\2\2\2=\u0103\3\2\2\2?\u010a\3\2"+
		"\2\2AB\7r\2\2BC\7w\2\2CD\7d\2\2DE\7n\2\2EF\7k\2\2FG\7e\2\2G\4\3\2\2\2"+
		"HI\7e\2\2IJ\7n\2\2JK\7c\2\2KL\7u\2\2LM\7u\2\2M\6\3\2\2\2NO\7O\2\2OP\7"+
		"c\2\2PQ\7k\2\2QR\7p\2\2RS\7O\2\2ST\7q\2\2TU\7f\2\2UV\7g\2\2VW\7n\2\2W"+
		"\b\3\2\2\2XY\7}\2\2Y\n\3\2\2\2Z[\7u\2\2[\\\7v\2\2\\]\7c\2\2]^\7v\2\2^"+
		"_\7k\2\2_`\7e\2\2`\f\3\2\2\2ab\7x\2\2bc\7q\2\2cd\7k\2\2de\7f\2\2e\16\3"+
		"\2\2\2fg\7o\2\2gh\7c\2\2hi\7k\2\2ij\7p\2\2j\20\3\2\2\2kl\7*\2\2l\22\3"+
		"\2\2\2mn\7U\2\2no\7v\2\2op\7t\2\2pq\7k\2\2qr\7p\2\2rs\7i\2\2s\24\3\2\2"+
		"\2tu\7]\2\2u\26\3\2\2\2vw\7_\2\2w\30\3\2\2\2xy\7c\2\2yz\7t\2\2z{\7i\2"+
		"\2{|\7u\2\2|\32\3\2\2\2}~\7+\2\2~\34\3\2\2\2\177\u0080\7\177\2\2\u0080"+
		"\36\3\2\2\2\u0081\u0082\7E\2\2\u0082\u0083\7q\2\2\u0083\u0084\7p\2\2\u0084"+
		"\u0085\7e\2\2\u0085\u0086\7g\2\2\u0086\u0087\7t\2\2\u0087\u0088\7p\2\2"+
		"\u0088 \3\2\2\2\u0089\u008a\7K\2\2\u008a\u008b\7T\2\2\u008b\u008c\7c\2"+
		"\2\u008c\u008d\7v\2\2\u008d\u008e\7g\2\2\u008e\u008f\7u\2\2\u008f\"\3"+
		"\2\2\2\u0090\u0091\7U\2\2\u0091\u0092\7w\2\2\u0092\u0093\7o\2\2\u0093"+
		"\u0094\7T\2\2\u0094\u0095\7c\2\2\u0095\u0096\7v\2\2\u0096\u0097\7g\2\2"+
		"\u0097$\3\2\2\2\u0098\u0099\7.\2\2\u0099&\3\2\2\2\u009a\u009b\7O\2\2\u009b"+
		"\u009c\7w\2\2\u009c\u009d\7n\2\2\u009d\u009e\7T\2\2\u009e\u009f\7c\2\2"+
		"\u009f\u00a0\7v\2\2\u00a0\u00a1\7g\2\2\u00a1(\3\2\2\2\u00a2\u00a3\7F\2"+
		"\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7x\2\2\u00a5\u00a6\7T\2\2\u00a6\u00a7"+
		"\7c\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7g\2\2\u00a9*\3\2\2\2\u00aa\u00ab"+
		"\7T\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7g\2\2\u00ae"+
		",\3\2\2\2\u00af\u00b0\7U\2\2\u00b0\u00b1\7e\2\2\u00b1\u00b2\7g\2\2\u00b2"+
		"\u00b3\7p\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7k\2\2"+
		"\u00b6\u00b7\7q\2\2\u00b7.\3\2\2\2\u00b8\u00b9\7O\2\2\u00b9\u00ba\7q\2"+
		"\2\u00ba\u00bb\7f\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7n\2\2\u00bd\60\3"+
		"\2\2\2\u00be\u00bf\7V\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7w\2\2\u00c1"+
		"\u00c2\7N\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7r\2\2"+
		"\u00c5\62\3\2\2\2\u00c6\u00c7\7T\2\2\u00c7\u00c8\7M\2\2\u00c8\u00c9\7"+
		"\66\2\2\u00c9\u00ca\7U\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7n\2\2\u00cc"+
		"\u00cd\7x\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7t\2\2\u00cf\64\3\2\2\2\u00d0"+
		"\u00d1\7I\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7n\2\2"+
		"\u00d4\u00d5\7g\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7r\2\2\u00d7\u00d8"+
		"\7k\2\2\u00d8\u00d9\7g\2\2\u00d9\66\3\2\2\2\u00da\u00db\7X\2\2\u00db\u00dc"+
		"\7k\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7c\2\2\u00df"+
		"\u00e0\7n\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7|\2\2\u00e2\u00e3\7c\2\2"+
		"\u00e3\u00e4\7v\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7"+
		"\7p\2\2\u00e78\3\2\2\2\u00e8\u00e9\7U\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb"+
		"\7o\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7c\2\2\u00ee"+
		"\u00ef\7v\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7p\2\2"+
		"\u00f2:\3\2\2\2\u00f3\u00f5\7/\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f8\4\62;\2\u00f7\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u00ff\7\60\2\2\u00fc\u00fe\4\62;\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100<\3\2\2\2"+
		"\u0101\u00ff\3\2\2\2\u0102\u0104\7/\2\2\u0103\u0102\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0107\4\62;\2\u0106\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109>\3\2\2\2"+
		"\u010a\u010e\t\2\2\2\u010b\u010d\t\3\2\2\u010c\u010b\3\2\2\2\u010d\u0110"+
		"\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f@\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\t\2\u00f4\u00f9\u00ff\u0103\u0108\u010e\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}