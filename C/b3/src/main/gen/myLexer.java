// Generated from /home/vcnt/Documents/university/C/b3/src/main/java/calculator/myLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class myLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VarName=1, Integer=2, COMMENT=3, NW=4, WS=5, LeftP=6, RightP=7, EQUAL=8, 
		PLUS=9, MINUS=10, MULTIPLY=11, DIVIDE=12, REMAINDER=13, PRINTOP=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"VarName", "Integer", "COMMENT", "NW", "WS", "LeftP", "RightP", "EQUAL", 
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "REMAINDER", "PRINTOP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'('", "')'", "'='", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VarName", "Integer", "COMMENT", "NW", "WS", "LeftP", "RightP", 
			"EQUAL", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "REMAINDER", "PRINTOP"
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


	public myLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "myLexer.g4"; }

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
		"\u0004\u0000\u000eN\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0004\u0000\u001f"+
		"\b\u0000\u000b\u0000\f\u0000 \u0001\u0001\u0004\u0001$\b\u0001\u000b\u0001"+
		"\f\u0001%\u0001\u0002\u0001\u0002\u0005\u0002*\b\u0002\n\u0002\f\u0002"+
		"-\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u00032\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0004\u00047\b\u0004\u000b\u0004\f\u0004"+
		"8\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0000\u0000"+
		"\u000e\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u0001\u0000\u0004\u0001\u0000az\u0001\u000009\u0002\u0000\n\n\r\r\u0002"+
		"\u0000\t\t  R\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0001\u001e\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000\u0000\u0005"+
		"\'\u0001\u0000\u0000\u0000\u00071\u0001\u0000\u0000\u0000\t6\u0001\u0000"+
		"\u0000\u0000\u000b<\u0001\u0000\u0000\u0000\r>\u0001\u0000\u0000\u0000"+
		"\u000f@\u0001\u0000\u0000\u0000\u0011B\u0001\u0000\u0000\u0000\u0013D"+
		"\u0001\u0000\u0000\u0000\u0015F\u0001\u0000\u0000\u0000\u0017H\u0001\u0000"+
		"\u0000\u0000\u0019J\u0001\u0000\u0000\u0000\u001bL\u0001\u0000\u0000\u0000"+
		"\u001d\u001f\u0007\u0000\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000"+
		"\u001f \u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!\u0002\u0001\u0000\u0000\u0000\"$\u0007\u0001\u0000"+
		"\u0000#\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%#\u0001\u0000"+
		"\u0000\u0000%&\u0001\u0000\u0000\u0000&\u0004\u0001\u0000\u0000\u0000"+
		"\'+\u0005#\u0000\u0000(*\b\u0002\u0000\u0000)(\u0001\u0000\u0000\u0000"+
		"*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"+
		"\u0000,.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0006\u0002"+
		"\u0000\u0000/\u0006\u0001\u0000\u0000\u000002\u0005\r\u0000\u000010\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000"+
		"34\u0005\n\u0000\u00004\b\u0001\u0000\u0000\u000057\u0007\u0003\u0000"+
		"\u000065\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000086\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0006"+
		"\u0004\u0000\u0000;\n\u0001\u0000\u0000\u0000<=\u0005(\u0000\u0000=\f"+
		"\u0001\u0000\u0000\u0000>?\u0005)\u0000\u0000?\u000e\u0001\u0000\u0000"+
		"\u0000@A\u0005=\u0000\u0000A\u0010\u0001\u0000\u0000\u0000BC\u0005+\u0000"+
		"\u0000C\u0012\u0001\u0000\u0000\u0000DE\u0005-\u0000\u0000E\u0014\u0001"+
		"\u0000\u0000\u0000FG\u0005*\u0000\u0000G\u0016\u0001\u0000\u0000\u0000"+
		"HI\u0005/\u0000\u0000I\u0018\u0001\u0000\u0000\u0000JK\u0005%\u0000\u0000"+
		"K\u001a\u0001\u0000\u0000\u0000LM\u0005@\u0000\u0000M\u001c\u0001\u0000"+
		"\u0000\u0000\u0006\u0000 %+18\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}