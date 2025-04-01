// Generated from ConjuntosParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaConjuntosParser}.
 */
public interface gramaticaConjuntosListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaConjuntosParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gramaticaConjuntosParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaConjuntosParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gramaticaConjuntosParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaConjuntosParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(gramaticaConjuntosParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaConjuntosParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(gramaticaConjuntosParser.LineContext ctx);
}