// Generated from perguntasGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class perguntasGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TextoMultilinha=7, Texto=8, 
		NEWLINE=9, WS=10, EL=11, Comment=12;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_opcao = 2, RULE_pergunta = 3, RULE_cotacao = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "opcao", "pergunta", "cotacao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "') {'", "'}'", "'0'", "'100'", null, null, null, 
			null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "TextoMultilinha", "Texto", 
			"NEWLINE", "WS", "EL", "Comment"
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
	public String getGrammarFileName() { return "perguntasGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public perguntasGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(perguntasGrammarParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof perguntasGrammarListener ) ((perguntasGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof perguntasGrammarListener ) ((perguntasGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof perguntasGrammarVisitor ) return ((perguntasGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4960L) != 0)) {
				{
				{
				setState(10);
				line();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(perguntasGrammarParser.NEWLINE, 0); }
		public TerminalNode Comment() { return getToken(perguntasGrammarParser.Comment, 0); }
		public CotacaoContext cotacao() {
			return getRuleContext(CotacaoContext.class,0);
		}
		public PerguntaContext pergunta() {
			return getRuleContext(PerguntaContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof perguntasGrammarListener ) ((perguntasGrammarListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof perguntasGrammarListener ) ((perguntasGrammarListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof perguntasGrammarVisitor ) return ((perguntasGrammarVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(NEWLINE);
				}
				break;
			case Comment:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				match(Comment);
				setState(20);
				match(NEWLINE);
				}
				break;
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(21);
				cotacao();
				setState(22);
				match(NEWLINE);
				}
				break;
			case Texto:
				enterOuterAlt(_localctx, 4);
				{
				setState(24);
				pergunta();
				setState(25);
				match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpcaoContext extends ParserRuleContext {
		public TerminalNode TextoMultilinha() { return getToken(perguntasGrammarParser.TextoMultilinha, 0); }
		public CotacaoContext cotacao() {
			return getRuleContext(CotacaoContext.class,0);
		}
		public TerminalNode EL() { return getToken(perguntasGrammarParser.EL, 0); }
		public TerminalNode NEWLINE() { return getToken(perguntasGrammarParser.NEWLINE, 0); }
		public OpcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof perguntasGrammarListener ) ((perguntasGrammarListener)listener).enterOpcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof perguntasGrammarListener ) ((perguntasGrammarListener)listener).exitOpcao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof perguntasGrammarVisitor ) return ((perguntasGrammarVisitor<? extends T>)visitor).visitOpcao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcaoContext opcao() throws RecognitionException {
		OpcaoContext _localctx = new OpcaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_opcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(TextoMultilinha);
			setState(30);
			match(T__0);
			setState(31);
			cotacao();
			setState(32);
			match(EL);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(33);
				match(NEWLINE);
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class PerguntaContext extends ParserRuleContext {
		public TerminalNode Texto() { return getToken(perguntasGrammarParser.Texto, 0); }
		public TerminalNode TextoMultilinha() { return getToken(perguntasGrammarParser.TextoMultilinha, 0); }
		public TerminalNode NEWLINE() { return getToken(perguntasGrammarParser.NEWLINE, 0); }
		public List<OpcaoContext> opcao() {
			return getRuleContexts(OpcaoContext.class);
		}
		public OpcaoContext opcao(int i) {
			return getRuleContext(OpcaoContext.class,i);
		}
		public PerguntaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pergunta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof perguntasGrammarListener ) ((perguntasGrammarListener)listener).enterPergunta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof perguntasGrammarListener ) ((perguntasGrammarListener)listener).exitPergunta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof perguntasGrammarVisitor ) return ((perguntasGrammarVisitor<? extends T>)visitor).visitPergunta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerguntaContext pergunta() throws RecognitionException {
		PerguntaContext _localctx = new PerguntaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pergunta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(Texto);
			setState(37);
			match(T__1);
			setState(38);
			match(TextoMultilinha);
			setState(39);
			match(T__2);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(40);
				match(NEWLINE);
				}
			}

			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				opcao();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TextoMultilinha );
			setState(48);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CotacaoContext extends ParserRuleContext {
		public CotacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cotacao; }
	 
		public CotacaoContext() { }
		public void copyFrom(CotacaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Cotacao0Context extends CotacaoContext {
		public Cotacao0Context(CotacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof perguntasGrammarListener ) ((perguntasGrammarListener)listener).enterCotacao0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof perguntasGrammarListener ) ((perguntasGrammarListener)listener).exitCotacao0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof perguntasGrammarVisitor ) return ((perguntasGrammarVisitor<? extends T>)visitor).visitCotacao0(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Cotacao100Context extends CotacaoContext {
		public Cotacao100Context(CotacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof perguntasGrammarListener ) ((perguntasGrammarListener)listener).enterCotacao100(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof perguntasGrammarListener ) ((perguntasGrammarListener)listener).exitCotacao100(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof perguntasGrammarVisitor ) return ((perguntasGrammarVisitor<? extends T>)visitor).visitCotacao100(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CotacaoContext cotacao() throws RecognitionException {
		CotacaoContext _localctx = new CotacaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cotacao);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new Cotacao0Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new Cotacao100Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\u0004\u0001\f7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001c\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"#\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003*\b\u0003\u0001\u0003\u0004\u0003-\b\u0003\u000b\u0003\f\u0003"+
		".\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u00045\b\u0004"+
		"\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u00009"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0002\u001b\u0001\u0000\u0000\u0000\u0004"+
		"\u001d\u0001\u0000\u0000\u0000\u0006$\u0001\u0000\u0000\u0000\b4\u0001"+
		"\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000"+
		"\u0000\f\u000f\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000"+
		"\r\u000e\u0001\u0000\u0000\u0000\u000e\u0010\u0001\u0000\u0000\u0000\u000f"+
		"\r\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0000\u0000\u0001\u0011\u0001"+
		"\u0001\u0000\u0000\u0000\u0012\u001c\u0005\t\u0000\u0000\u0013\u0014\u0005"+
		"\f\u0000\u0000\u0014\u001c\u0005\t\u0000\u0000\u0015\u0016\u0003\b\u0004"+
		"\u0000\u0016\u0017\u0005\t\u0000\u0000\u0017\u001c\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0003\u0006\u0003\u0000\u0019\u001a\u0005\t\u0000\u0000\u001a"+
		"\u001c\u0001\u0000\u0000\u0000\u001b\u0012\u0001\u0000\u0000\u0000\u001b"+
		"\u0013\u0001\u0000\u0000\u0000\u001b\u0015\u0001\u0000\u0000\u0000\u001b"+
		"\u0018\u0001\u0000\u0000\u0000\u001c\u0003\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0005\u0007\u0000\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f"+
		" \u0003\b\u0004\u0000 \"\u0005\u000b\u0000\u0000!#\u0005\t\u0000\u0000"+
		"\"!\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#\u0005\u0001\u0000"+
		"\u0000\u0000$%\u0005\b\u0000\u0000%&\u0005\u0002\u0000\u0000&\'\u0005"+
		"\u0007\u0000\u0000\')\u0005\u0003\u0000\u0000(*\u0005\t\u0000\u0000)("+
		"\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000"+
		"\u0000+-\u0003\u0004\u0002\u0000,+\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u000001\u0005\u0004\u0000\u00001\u0007\u0001\u0000\u0000"+
		"\u000025\u0005\u0005\u0000\u000035\u0005\u0006\u0000\u000042\u0001\u0000"+
		"\u0000\u000043\u0001\u0000\u0000\u00005\t\u0001\u0000\u0000\u0000\u0006"+
		"\r\u001b\").4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}