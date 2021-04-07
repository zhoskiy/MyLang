// Generated from D:/Study/6 ���/����/MyLang/src/main/java/antlr4\Grammatica.g4 by ANTLR 4.9.1
package antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, PLUS=11, MINUS=12, MULT=13, DIV=14, POW=15, UNAROPERATION=16, 
		TYPE=17, TYPEFUNC=18, NAMEFUNC=19, NEWLINE=20, IF=21, RETURN=22, WHILE=23, 
		DO=24, FOR=25, ID=26, NUMBER=27, FLOAT=28, COMPARE=29, WHITESPACE=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "PLUS", "MINUS", "MULT", "DIV", "POW", "UNAROPERATION", "TYPE", 
			"TYPEFUNC", "NAMEFUNC", "NEWLINE", "IF", "RETURN", "WHILE", "DO", "FOR", 
			"ID", "NUMBER", "FLOAT", "COMPARE", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'):'", "')'", "'{'", "'}'", "','", "'if('", "'for('", "';'", 
			"'='", "'+'", "'-'", "'*'", "'/'", "'^'", null, null, null, null, null, 
			"'if'", "'bratishka_ia_pokushat_prines'", "'while'", "'do:'", "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "PLUS", 
			"MINUS", "MULT", "DIV", "POW", "UNAROPERATION", "TYPE", "TYPEFUNC", "NAMEFUNC", 
			"NEWLINE", "IF", "RETURN", "WHILE", "DO", "FOR", "ID", "NUMBER", "FLOAT", 
			"COMPARE", "WHITESPACE"
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


	public GrammaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammatica.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00e9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\5\21h\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22r\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u0080\n\23\3\24\6\24\u0083\n\24\r\24\16\24\u0084\3\25\5\25"+
		"\u0088\n\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\6\33\u00bb\n\33\r\33\16"+
		"\33\u00bc\3\33\7\33\u00c0\n\33\f\33\16\33\u00c3\13\33\3\33\7\33\u00c6"+
		"\n\33\f\33\16\33\u00c9\13\33\6\33\u00cb\n\33\r\33\16\33\u00cc\3\34\6\34"+
		"\u00d0\n\34\r\34\16\34\u00d1\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u00e1\n\36\3\37\6\37\u00e4\n\37\r\37\16\37"+
		"\u00e5\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= \3\2\7\3\2C\\\3\2c|\3\2\62;\4\2>>@@\5\2\13\13\17"+
		"\17\"\"\2\u00f8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7D\3\2\2\2\tF\3"+
		"\2\2\2\13H\3\2\2\2\rJ\3\2\2\2\17L\3\2\2\2\21P\3\2\2\2\23U\3\2\2\2\25W"+
		"\3\2\2\2\27Y\3\2\2\2\31[\3\2\2\2\33]\3\2\2\2\35_\3\2\2\2\37a\3\2\2\2!"+
		"g\3\2\2\2#q\3\2\2\2%\177\3\2\2\2\'\u0082\3\2\2\2)\u0087\3\2\2\2+\u008b"+
		"\3\2\2\2-\u008e\3\2\2\2/\u00ab\3\2\2\2\61\u00b1\3\2\2\2\63\u00b5\3\2\2"+
		"\2\65\u00ca\3\2\2\2\67\u00cf\3\2\2\29\u00d3\3\2\2\2;\u00e0\3\2\2\2=\u00e3"+
		"\3\2\2\2?@\7*\2\2@\4\3\2\2\2AB\7+\2\2BC\7<\2\2C\6\3\2\2\2DE\7+\2\2E\b"+
		"\3\2\2\2FG\7}\2\2G\n\3\2\2\2HI\7\177\2\2I\f\3\2\2\2JK\7.\2\2K\16\3\2\2"+
		"\2LM\7k\2\2MN\7h\2\2NO\7*\2\2O\20\3\2\2\2PQ\7h\2\2QR\7q\2\2RS\7t\2\2S"+
		"T\7*\2\2T\22\3\2\2\2UV\7=\2\2V\24\3\2\2\2WX\7?\2\2X\26\3\2\2\2YZ\7-\2"+
		"\2Z\30\3\2\2\2[\\\7/\2\2\\\32\3\2\2\2]^\7,\2\2^\34\3\2\2\2_`\7\61\2\2"+
		"`\36\3\2\2\2ab\7`\2\2b \3\2\2\2cd\7-\2\2dh\7-\2\2ef\7/\2\2fh\7/\2\2gc"+
		"\3\2\2\2ge\3\2\2\2h\"\3\2\2\2ij\7k\2\2jk\7p\2\2kr\7v\2\2lm\7h\2\2mn\7"+
		"n\2\2no\7q\2\2op\7c\2\2pr\7v\2\2qi\3\2\2\2ql\3\2\2\2r$\3\2\2\2st\7X\2"+
		"\2tu\7Q\2\2uv\7K\2\2v\u0080\7F\2\2wx\7K\2\2xy\7P\2\2y\u0080\7V\2\2z{\7"+
		"H\2\2{|\7N\2\2|}\7Q\2\2}~\7C\2\2~\u0080\7V\2\2\177s\3\2\2\2\177w\3\2\2"+
		"\2\177z\3\2\2\2\u0080&\3\2\2\2\u0081\u0083\t\2\2\2\u0082\u0081\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085(\3"+
		"\2\2\2\u0086\u0088\7\17\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\7\f\2\2\u008a*\3\2\2\2\u008b\u008c\7k\2\2\u008c"+
		"\u008d\7h\2\2\u008d,\3\2\2\2\u008e\u008f\7d\2\2\u008f\u0090\7t\2\2\u0090"+
		"\u0091\7c\2\2\u0091\u0092\7v\2\2\u0092\u0093\7k\2\2\u0093\u0094\7u\2\2"+
		"\u0094\u0095\7j\2\2\u0095\u0096\7m\2\2\u0096\u0097\7c\2\2\u0097\u0098"+
		"\7a\2\2\u0098\u0099\7k\2\2\u0099\u009a\7c\2\2\u009a\u009b\7a\2\2\u009b"+
		"\u009c\7r\2\2\u009c\u009d\7q\2\2\u009d\u009e\7m\2\2\u009e\u009f\7w\2\2"+
		"\u009f\u00a0\7u\2\2\u00a0\u00a1\7j\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3"+
		"\7v\2\2\u00a3\u00a4\7a\2\2\u00a4\u00a5\7r\2\2\u00a5\u00a6\7t\2\2\u00a6"+
		"\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7u\2\2"+
		"\u00aa.\3\2\2\2\u00ab\u00ac\7y\2\2\u00ac\u00ad\7j\2\2\u00ad\u00ae\7k\2"+
		"\2\u00ae\u00af\7n\2\2\u00af\u00b0\7g\2\2\u00b0\60\3\2\2\2\u00b1\u00b2"+
		"\7f\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7<\2\2\u00b4\62\3\2\2\2\u00b5\u00b6"+
		"\7h\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7t\2\2\u00b8\64\3\2\2\2\u00b9\u00bb"+
		"\t\3\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00c1\3\2\2\2\u00be\u00c0\t\2\2\2\u00bf\u00be\3\2"+
		"\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c7\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\t\4\2\2\u00c5\u00c4\3\2"+
		"\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00ba\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\66\3\2\2\2\u00ce\u00d0"+
		"\t\4\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d28\3\2\2\2\u00d3\u00d4\5\67\34\2\u00d4\u00d5\7\60\2"+
		"\2\u00d5\u00d6\5\67\34\2\u00d6:\3\2\2\2\u00d7\u00d8\7#\2\2\u00d8\u00e1"+
		"\7?\2\2\u00d9\u00da\7?\2\2\u00da\u00e1\7?\2\2\u00db\u00e1\t\5\2\2\u00dc"+
		"\u00dd\7@\2\2\u00dd\u00e1\7?\2\2\u00de\u00df\7>\2\2\u00df\u00e1\7?\2\2"+
		"\u00e0\u00d7\3\2\2\2\u00e0\u00d9\3\2\2\2\u00e0\u00db\3\2\2\2\u00e0\u00dc"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1<\3\2\2\2\u00e2\u00e4\t\6\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\b\37\2\2\u00e8>\3\2\2\2\17\2gq\177"+
		"\u0084\u0087\u00bc\u00c1\u00c7\u00cc\u00d1\u00e0\u00e5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}