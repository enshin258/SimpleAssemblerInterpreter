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
		RIGHTBRACKET=14, ErrorCharacter=15;
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
			"RIGHTBRACKET", "ErrorCharacter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'mov'", "' '", "'push'", "'xor'", "'\t'", "'\n'", "','", "'int 0x80'", 
			null, null, null, "'*'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "REGISTER", "NUMBERSYMBOL", 
			"PLUSORMINUSSYMBOL", "MULTIPLICATIONSYMBOL", "LEFTBRACKET", "RIGHTBRACKET", 
			"ErrorCharacter"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21`\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\nP\n\n\3\13\6\13S\n\13\r\13\16\13T\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\4\3\2\62;\4\2-"+
		"-//\2c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2"+
		"\5%\3\2\2\2\7\'\3\2\2\2\t,\3\2\2\2\13\60\3\2\2\2\r\62\3\2\2\2\17\64\3"+
		"\2\2\2\21\66\3\2\2\2\23O\3\2\2\2\25R\3\2\2\2\27V\3\2\2\2\31X\3\2\2\2\33"+
		"Z\3\2\2\2\35\\\3\2\2\2\37^\3\2\2\2!\"\7o\2\2\"#\7q\2\2#$\7x\2\2$\4\3\2"+
		"\2\2%&\7\"\2\2&\6\3\2\2\2\'(\7r\2\2()\7w\2\2)*\7u\2\2*+\7j\2\2+\b\3\2"+
		"\2\2,-\7z\2\2-.\7q\2\2./\7t\2\2/\n\3\2\2\2\60\61\7\13\2\2\61\f\3\2\2\2"+
		"\62\63\7\f\2\2\63\16\3\2\2\2\64\65\7.\2\2\65\20\3\2\2\2\66\67\7k\2\2\67"+
		"8\7p\2\289\7v\2\29:\7\"\2\2:;\7\62\2\2;<\7z\2\2<=\7:\2\2=>\7\62\2\2>\22"+
		"\3\2\2\2?@\7\'\2\2@A\7g\2\2AB\7c\2\2BP\7z\2\2CD\7\'\2\2DE\7g\2\2EF\7d"+
		"\2\2FP\7z\2\2GH\7\'\2\2HI\7g\2\2IJ\7e\2\2JP\7z\2\2KL\7\'\2\2LM\7g\2\2"+
		"MN\7f\2\2NP\7z\2\2O?\3\2\2\2OC\3\2\2\2OG\3\2\2\2OK\3\2\2\2P\24\3\2\2\2"+
		"QS\t\2\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\26\3\2\2\2VW\t\3\2"+
		"\2W\30\3\2\2\2XY\7,\2\2Y\32\3\2\2\2Z[\7*\2\2[\34\3\2\2\2\\]\7+\2\2]\36"+
		"\3\2\2\2^_\13\2\2\2_ \3\2\2\2\5\2OT\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}