// Generated from /home/vcnt/Documents/university/C/b2/src/main/java/b2_11/ConjuntosLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ConjuntosLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Var=1, Palavra=2, Digito=3, COMMENT=4, NEWLINE=5, WS=6, LBRACE=7, RBRACE=8, 
		COMMA=9, EQUALS=10, LPAR=11, RPAR=12, DIFF=13, INTERCEPTION=14, UNION=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Var", "Palavra", "Digito", "COMMENT", "NEWLINE", "WS", "LBRACE", "RBRACE", 
			"COMMA", "EQUALS", "LPAR", "RPAR", "DIFF", "INTERCEPTION", "UNION"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'{'", "'}'", "','", "'='", 
			"'('", "')'", "'\\'", "'&'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Var", "Palavra", "Digito", "COMMENT", "NEWLINE", "WS", "LBRACE", 
			"RBRACE", "COMMA", "EQUALS", "LPAR", "RPAR", "DIFF", "INTERCEPTION", 
			"UNION"
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


	public ConjuntosLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ConjuntosLexer.g4"; }

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
		"\u0004\u0000\u000fZ\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0004\u0000!\b\u0000\u000b\u0000\f\u0000\"\u0001\u0001\u0004\u0001"+
		"&\b\u0001\u000b\u0001\f\u0001\'\u0001\u0002\u0003\u0002+\b\u0002\u0001"+
		"\u0002\u0004\u0002.\b\u0002\u000b\u0002\f\u0002/\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u00036\b\u0003\n\u0003\f\u00039\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004>\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0004\u0005C\b\u0005\u000b\u0005\f\u0005D\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u0001\u0000\u0006\u0001\u0000AZ\u0001\u0000az\u0002\u0000++--\u0001"+
		"\u000009\u0002\u0000\n\n\r\r\u0002\u0000\t\t  `\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0001 \u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005*"+
		"\u0001\u0000\u0000\u0000\u00071\u0001\u0000\u0000\u0000\t=\u0001\u0000"+
		"\u0000\u0000\u000bB\u0001\u0000\u0000\u0000\rH\u0001\u0000\u0000\u0000"+
		"\u000fJ\u0001\u0000\u0000\u0000\u0011L\u0001\u0000\u0000\u0000\u0013N"+
		"\u0001\u0000\u0000\u0000\u0015P\u0001\u0000\u0000\u0000\u0017R\u0001\u0000"+
		"\u0000\u0000\u0019T\u0001\u0000\u0000\u0000\u001bV\u0001\u0000\u0000\u0000"+
		"\u001dX\u0001\u0000\u0000\u0000\u001f!\u0007\u0000\u0000\u0000 \u001f"+
		"\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#\u0002\u0001\u0000\u0000\u0000$&\u0007"+
		"\u0001\u0000\u0000%$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(\u0004\u0001\u0000"+
		"\u0000\u0000)+\u0007\u0002\u0000\u0000*)\u0001\u0000\u0000\u0000*+\u0001"+
		"\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,.\u0007\u0003\u0000\u0000"+
		"-,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u00000\u0006\u0001\u0000\u0000\u000012\u0005"+
		"-\u0000\u000023\u0005-\u0000\u000037\u0001\u0000\u0000\u000046\b\u0004"+
		"\u0000\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u0000:;\u0006\u0003\u0000\u0000;\b\u0001\u0000\u0000"+
		"\u0000<>\u0005\r\u0000\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?@\u0005\n\u0000\u0000@\n\u0001\u0000"+
		"\u0000\u0000AC\u0007\u0005\u0000\u0000BA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FG\u0006\u0005\u0000\u0000G\f\u0001\u0000\u0000"+
		"\u0000HI\u0005{\u0000\u0000I\u000e\u0001\u0000\u0000\u0000JK\u0005}\u0000"+
		"\u0000K\u0010\u0001\u0000\u0000\u0000LM\u0005,\u0000\u0000M\u0012\u0001"+
		"\u0000\u0000\u0000NO\u0005=\u0000\u0000O\u0014\u0001\u0000\u0000\u0000"+
		"PQ\u0005(\u0000\u0000Q\u0016\u0001\u0000\u0000\u0000RS\u0005)\u0000\u0000"+
		"S\u0018\u0001\u0000\u0000\u0000TU\u0005\\\u0000\u0000U\u001a\u0001\u0000"+
		"\u0000\u0000VW\u0005&\u0000\u0000W\u001c\u0001\u0000\u0000\u0000XY\u0005"+
		"+\u0000\u0000Y\u001e\u0001\u0000\u0000\u0000\b\u0000\"\'*/7=D\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}