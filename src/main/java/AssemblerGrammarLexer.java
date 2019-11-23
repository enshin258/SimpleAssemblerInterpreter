// Generated from C:/Users/Dom/Desktop/WAT/JFK/AssemblerInterpreter/src\AssemblerGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblerGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, REGISTER=9, 
		NUMBERSYMBOL=10, PLUSORMINUSSYMBOL=11, MULTIPLICATIONSYMBOL=12, LEFTBRACKET=13, 
		RIGHTBRACKET=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "REGISTER", 
			"NUMBERSYMBOL", "PLUSORMINUSSYMBOL", "MULTIPLICATIONSYMBOL", "LEFTBRACKET", 
			"RIGHTBRACKET"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'mov'", "' '", "'push'", "'xor'", "'\n'", "','", "'int'", "'0x80'", 
			null, null, null, "'*'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "REGISTER", "NUMBERSYMBOL", 
			"PLUSORMINUSSYMBOL", "MULTIPLICATIONSYMBOL", "LEFTBRACKET", "RIGHTBRACKET"
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


	public AssemblerGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AssemblerGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20Z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\nL\n\n\3\13\6\13O\n\13\r\13\16\13P\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\3\2\4\3\2\62;\4\2--//\2]\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\3\37\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t*\3\2\2\2\13.\3\2\2\2\r\60"+
		"\3\2\2\2\17\62\3\2\2\2\21\66\3\2\2\2\23K\3\2\2\2\25N\3\2\2\2\27R\3\2\2"+
		"\2\31T\3\2\2\2\33V\3\2\2\2\35X\3\2\2\2\37 \7o\2\2 !\7q\2\2!\"\7x\2\2\""+
		"\4\3\2\2\2#$\7\"\2\2$\6\3\2\2\2%&\7r\2\2&\'\7w\2\2\'(\7u\2\2()\7j\2\2"+
		")\b\3\2\2\2*+\7z\2\2+,\7q\2\2,-\7t\2\2-\n\3\2\2\2./\7\f\2\2/\f\3\2\2\2"+
		"\60\61\7.\2\2\61\16\3\2\2\2\62\63\7k\2\2\63\64\7p\2\2\64\65\7v\2\2\65"+
		"\20\3\2\2\2\66\67\7\62\2\2\678\7z\2\289\7:\2\29:\7\62\2\2:\22\3\2\2\2"+
		";<\7\'\2\2<=\7g\2\2=>\7c\2\2>L\7z\2\2?@\7\'\2\2@A\7g\2\2AB\7d\2\2BL\7"+
		"z\2\2CD\7\'\2\2DE\7g\2\2EF\7e\2\2FL\7z\2\2GH\7\'\2\2HI\7g\2\2IJ\7f\2\2"+
		"JL\7z\2\2K;\3\2\2\2K?\3\2\2\2KC\3\2\2\2KG\3\2\2\2L\24\3\2\2\2MO\t\2\2"+
		"\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\26\3\2\2\2RS\t\3\2\2S\30\3"+
		"\2\2\2TU\7,\2\2U\32\3\2\2\2VW\7*\2\2W\34\3\2\2\2XY\7+\2\2Y\36\3\2\2\2"+
		"\5\2KP\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}