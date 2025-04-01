// Generated from ConjuntosParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ConjuntosParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Var=1, Palavra=2, Digito=3, COMMENT=4, NEWLINE=5, WS=6, LBRACE=7, RBRACE=8, 
		COMMA=9, EQUALS=10, LPAR=11, RPAR=12, DIFF=13, INTERCEPTION=14, UNION=15;
	public static final int
		RULE_program = 0, RULE_linha = 1, RULE_elementoConjunto = 2, RULE_conjunto = 3, 
		RULE_operador = 4, RULE_operacao = 5, RULE_atribuicao = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "linha", "elementoConjunto", "conjunto", "operador", "operacao", 
			"atribuicao"
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

	@Override
	public String getGrammarFileName() { return "ConjuntosParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ConjuntosParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<LinhaContext> linha() {
			return getRuleContexts(LinhaContext.class);
		}
		public LinhaContext linha(int i) {
			return getRuleContext(LinhaContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConjuntosParserVisitor ) return ((ConjuntosParserVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2226L) != 0)) {
				{
				{
				setState(14);
				linha();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class LinhaContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ConjuntosParser.NEWLINE, 0); }
		public TerminalNode COMMENT() { return getToken(ConjuntosParser.COMMENT, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public LinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).enterLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).exitLinha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConjuntosParserVisitor ) return ((ConjuntosParserVisitor<? extends T>)visitor).visitLinha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinhaContext linha() throws RecognitionException {
		LinhaContext _localctx = new LinhaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_linha);
		int _la;
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				atribuicao();
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(21);
					match(COMMENT);
					}
				}

				setState(24);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				operacao();
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(27);
					match(COMMENT);
					}
				}

				setState(30);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(32);
					match(COMMENT);
					}
				}

				setState(35);
				match(NEWLINE);
				}
				break;
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
	public static class ElementoConjuntoContext extends ParserRuleContext {
		public ElementoConjuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementoConjunto; }
	 
		public ElementoConjuntoContext() { }
		public void copyFrom(ElementoConjuntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementoPalavraContext extends ElementoConjuntoContext {
		public TerminalNode Palavra() { return getToken(ConjuntosParser.Palavra, 0); }
		public ElementoPalavraContext(ElementoConjuntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).enterElementoPalavra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).exitElementoPalavra(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConjuntosParserVisitor ) return ((ConjuntosParserVisitor<? extends T>)visitor).visitElementoPalavra(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementoDigitoContext extends ElementoConjuntoContext {
		public TerminalNode Digito() { return getToken(ConjuntosParser.Digito, 0); }
		public ElementoDigitoContext(ElementoConjuntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).enterElementoDigito(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).exitElementoDigito(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConjuntosParserVisitor ) return ((ConjuntosParserVisitor<? extends T>)visitor).visitElementoDigito(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoConjuntoContext elementoConjunto() throws RecognitionException {
		ElementoConjuntoContext _localctx = new ElementoConjuntoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_elementoConjunto);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Digito:
				_localctx = new ElementoDigitoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(Digito);
				}
				break;
			case Palavra:
				_localctx = new ElementoPalavraContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(Palavra);
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
	public static class ConjuntoContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ConjuntosParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ConjuntosParser.RBRACE, 0); }
		public List<ElementoConjuntoContext> elementoConjunto() {
			return getRuleContexts(ElementoConjuntoContext.class);
		}
		public ElementoConjuntoContext elementoConjunto(int i) {
			return getRuleContext(ElementoConjuntoContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ConjuntosParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ConjuntosParser.COMMA, i);
		}
		public ConjuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).enterConjunto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).exitConjunto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConjuntosParserVisitor ) return ((ConjuntosParserVisitor<? extends T>)visitor).visitConjunto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjuntoContext conjunto() throws RecognitionException {
		ConjuntoContext _localctx = new ConjuntoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conjunto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(LBRACE);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Palavra || _la==Digito) {
				{
				setState(43);
				elementoConjunto();
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(44);
					match(COMMA);
					setState(45);
					elementoConjunto();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(53);
			match(RBRACE);
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
	public static class OperadorContext extends ParserRuleContext {
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
	 
		public OperadorContext() { }
		public void copyFrom(OperadorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperadorVariavelContext extends OperadorContext {
		public TerminalNode Var() { return getToken(ConjuntosParser.Var, 0); }
		public OperadorVariavelContext(OperadorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).enterOperadorVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).exitOperadorVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConjuntosParserVisitor ) return ((ConjuntosParserVisitor<? extends T>)visitor).visitOperadorVariavel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperadorConjuntoContext extends OperadorContext {
		public ConjuntoContext conjunto() {
			return getRuleContext(ConjuntoContext.class,0);
		}
		public OperadorConjuntoContext(OperadorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).enterOperadorConjunto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).exitOperadorConjunto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConjuntosParserVisitor ) return ((ConjuntosParserVisitor<? extends T>)visitor).visitOperadorConjunto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operador);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				_localctx = new OperadorVariavelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(Var);
				}
				break;
			case LBRACE:
				_localctx = new OperadorConjuntoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				conjunto();
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
	public static class OperacaoContext extends ParserRuleContext {
		public OperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao; }
	 
		public OperacaoContext() { }
		public void copyFrom(OperacaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoUniaoContext extends OperacaoContext {
		public List<OperadorContext> operador() {
			return getRuleContexts(OperadorContext.class);
		}
		public OperadorContext operador(int i) {
			return getRuleContext(OperadorContext.class,i);
		}
		public TerminalNode UNION() { return getToken(ConjuntosParser.UNION, 0); }
		public OperacaoUniaoContext(OperacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).enterOperacaoUniao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).exitOperacaoUniao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConjuntosParserVisitor ) return ((ConjuntosParserVisitor<? extends T>)visitor).visitOperacaoUniao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoIntercecaoContext extends OperacaoContext {
		public List<OperadorContext> operador() {
			return getRuleContexts(OperadorContext.class);
		}
		public OperadorContext operador(int i) {
			return getRuleContext(OperadorContext.class,i);
		}
		public TerminalNode INTERCEPTION() { return getToken(ConjuntosParser.INTERCEPTION, 0); }
		public OperacaoIntercecaoContext(OperacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).enterOperacaoIntercecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).exitOperacaoIntercecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConjuntosParserVisitor ) return ((ConjuntosParserVisitor<? extends T>)visitor).visitOperacaoIntercecao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoParentesisContext extends OperacaoContext {
		public TerminalNode LPAR() { return getToken(ConjuntosParser.LPAR, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ConjuntosParser.RPAR, 0); }
		public OperacaoParentesisContext(OperacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).enterOperacaoParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).exitOperacaoParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConjuntosParserVisitor ) return ((ConjuntosParserVisitor<? extends T>)visitor).visitOperacaoParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoDiferencaContext extends OperacaoContext {
		public List<OperadorContext> operador() {
			return getRuleContexts(OperadorContext.class);
		}
		public OperadorContext operador(int i) {
			return getRuleContext(OperadorContext.class,i);
		}
		public TerminalNode DIFF() { return getToken(ConjuntosParser.DIFF, 0); }
		public OperacaoDiferencaContext(OperacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).enterOperacaoDiferenca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).exitOperacaoDiferenca(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConjuntosParserVisitor ) return ((ConjuntosParserVisitor<? extends T>)visitor).visitOperacaoDiferenca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacaoContext operacao() throws RecognitionException {
		OperacaoContext _localctx = new OperacaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operacao);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new OperacaoParentesisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(LPAR);
				setState(60);
				operacao();
				setState(61);
				match(RPAR);
				}
				break;
			case 2:
				_localctx = new OperacaoDiferencaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				operador();
				setState(64);
				match(DIFF);
				setState(65);
				operador();
				}
				break;
			case 3:
				_localctx = new OperacaoIntercecaoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				operador();
				setState(68);
				match(INTERCEPTION);
				setState(69);
				operador();
				}
				break;
			case 4:
				_localctx = new OperacaoUniaoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				operador();
				setState(72);
				match(UNION);
				setState(73);
				operador();
				}
				break;
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
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(ConjuntosParser.Var, 0); }
		public TerminalNode EQUALS() { return getToken(ConjuntosParser.EQUALS, 0); }
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConjuntosParserListener ) ((ConjuntosParserListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConjuntosParserVisitor ) return ((ConjuntosParserVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(Var);
			setState(78);
			match(EQUALS);
			setState(79);
			operador();
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
		"\u0004\u0001\u000fR\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0005\u0000\u0010"+
		"\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0017\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u001d\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001"+
		"\u0001\u0001\u0003\u0001%\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		")\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"/\b\u0003\n\u0003\f\u00032\t\u0003\u0003\u00034\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0003\u0004:\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005L\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002"+
		"\u0004\u0006\b\n\f\u0000\u0000W\u0000\u0011\u0001\u0000\u0000\u0000\u0002"+
		"$\u0001\u0000\u0000\u0000\u0004(\u0001\u0000\u0000\u0000\u0006*\u0001"+
		"\u0000\u0000\u0000\b9\u0001\u0000\u0000\u0000\nK\u0001\u0000\u0000\u0000"+
		"\fM\u0001\u0000\u0000\u0000\u000e\u0010\u0003\u0002\u0001\u0000\u000f"+
		"\u000e\u0001\u0000\u0000\u0000\u0010\u0013\u0001\u0000\u0000\u0000\u0011"+
		"\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012"+
		"\u0001\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0014"+
		"\u0016\u0003\f\u0006\u0000\u0015\u0017\u0005\u0004\u0000\u0000\u0016\u0015"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0005\u0000\u0000\u0019%\u0001"+
		"\u0000\u0000\u0000\u001a\u001c\u0003\n\u0005\u0000\u001b\u001d\u0005\u0004"+
		"\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0005"+
		"\u0000\u0000\u001f%\u0001\u0000\u0000\u0000 \"\u0005\u0004\u0000\u0000"+
		"! \u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#%\u0005\u0005\u0000\u0000$\u0014\u0001\u0000\u0000\u0000$\u001a"+
		"\u0001\u0000\u0000\u0000$!\u0001\u0000\u0000\u0000%\u0003\u0001\u0000"+
		"\u0000\u0000&)\u0005\u0003\u0000\u0000\')\u0005\u0002\u0000\u0000(&\u0001"+
		"\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)\u0005\u0001\u0000\u0000"+
		"\u0000*3\u0005\u0007\u0000\u0000+0\u0003\u0004\u0002\u0000,-\u0005\t\u0000"+
		"\u0000-/\u0003\u0004\u0002\u0000.,\u0001\u0000\u0000\u0000/2\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000014\u0001"+
		"\u0000\u0000\u000020\u0001\u0000\u0000\u00003+\u0001\u0000\u0000\u0000"+
		"34\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0005\b\u0000\u0000"+
		"6\u0007\u0001\u0000\u0000\u00007:\u0005\u0001\u0000\u00008:\u0003\u0006"+
		"\u0003\u000097\u0001\u0000\u0000\u000098\u0001\u0000\u0000\u0000:\t\u0001"+
		"\u0000\u0000\u0000;<\u0005\u000b\u0000\u0000<=\u0003\n\u0005\u0000=>\u0005"+
		"\f\u0000\u0000>L\u0001\u0000\u0000\u0000?@\u0003\b\u0004\u0000@A\u0005"+
		"\r\u0000\u0000AB\u0003\b\u0004\u0000BL\u0001\u0000\u0000\u0000CD\u0003"+
		"\b\u0004\u0000DE\u0005\u000e\u0000\u0000EF\u0003\b\u0004\u0000FL\u0001"+
		"\u0000\u0000\u0000GH\u0003\b\u0004\u0000HI\u0005\u000f\u0000\u0000IJ\u0003"+
		"\b\u0004\u0000JL\u0001\u0000\u0000\u0000K;\u0001\u0000\u0000\u0000K?\u0001"+
		"\u0000\u0000\u0000KC\u0001\u0000\u0000\u0000KG\u0001\u0000\u0000\u0000"+
		"L\u000b\u0001\u0000\u0000\u0000MN\u0005\u0001\u0000\u0000NO\u0005\n\u0000"+
		"\u0000OP\u0003\b\u0004\u0000P\r\u0001\u0000\u0000\u0000\n\u0011\u0016"+
		"\u001c!$(039K";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}