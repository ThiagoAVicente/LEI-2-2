// Generated from csv2htmlParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link csv2htmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface csv2htmlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link csv2htmlParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(csv2htmlParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link csv2htmlParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(csv2htmlParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link csv2htmlParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(csv2htmlParser.ContentContext ctx);
}