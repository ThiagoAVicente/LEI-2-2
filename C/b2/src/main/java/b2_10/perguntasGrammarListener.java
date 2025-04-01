// Generated from perguntasGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link perguntasGrammarParser}.
 */
public interface perguntasGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link perguntasGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(perguntasGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link perguntasGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(perguntasGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link perguntasGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(perguntasGrammarParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link perguntasGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(perguntasGrammarParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link perguntasGrammarParser#opcao}.
	 * @param ctx the parse tree
	 */
	void enterOpcao(perguntasGrammarParser.OpcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link perguntasGrammarParser#opcao}.
	 * @param ctx the parse tree
	 */
	void exitOpcao(perguntasGrammarParser.OpcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link perguntasGrammarParser#pergunta}.
	 * @param ctx the parse tree
	 */
	void enterPergunta(perguntasGrammarParser.PerguntaContext ctx);
	/**
	 * Exit a parse tree produced by {@link perguntasGrammarParser#pergunta}.
	 * @param ctx the parse tree
	 */
	void exitPergunta(perguntasGrammarParser.PerguntaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cotacao0}
	 * labeled alternative in {@link perguntasGrammarParser#cotacao}.
	 * @param ctx the parse tree
	 */
	void enterCotacao0(perguntasGrammarParser.Cotacao0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Cotacao0}
	 * labeled alternative in {@link perguntasGrammarParser#cotacao}.
	 * @param ctx the parse tree
	 */
	void exitCotacao0(perguntasGrammarParser.Cotacao0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Cotacao100}
	 * labeled alternative in {@link perguntasGrammarParser#cotacao}.
	 * @param ctx the parse tree
	 */
	void enterCotacao100(perguntasGrammarParser.Cotacao100Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Cotacao100}
	 * labeled alternative in {@link perguntasGrammarParser#cotacao}.
	 * @param ctx the parse tree
	 */
	void exitCotacao100(perguntasGrammarParser.Cotacao100Context ctx);
}