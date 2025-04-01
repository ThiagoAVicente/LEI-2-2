// Generated from perguntasGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link perguntasGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface perguntasGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link perguntasGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(perguntasGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link perguntasGrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(perguntasGrammarParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link perguntasGrammarParser#opcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcao(perguntasGrammarParser.OpcaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link perguntasGrammarParser#pergunta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPergunta(perguntasGrammarParser.PerguntaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cotacao0}
	 * labeled alternative in {@link perguntasGrammarParser#cotacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCotacao0(perguntasGrammarParser.Cotacao0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Cotacao100}
	 * labeled alternative in {@link perguntasGrammarParser#cotacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCotacao100(perguntasGrammarParser.Cotacao100Context ctx);
}