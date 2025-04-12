// Generated from csv2htmlParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link csv2htmlParser}.
 */
public interface csv2htmlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link csv2htmlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(csv2htmlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link csv2htmlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(csv2htmlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link csv2htmlParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(csv2htmlParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link csv2htmlParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(csv2htmlParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link csv2htmlParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(csv2htmlParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link csv2htmlParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(csv2htmlParser.ContentContext ctx);
}