// Generated from myParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link myParser}.
 */
public interface myParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link myParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(myParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(myParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(myParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(myParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(myParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(myParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(myParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(myParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerExpr}
	 * labeled alternative in {@link myParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpr(myParser.IntegerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerExpr}
	 * labeled alternative in {@link myParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpr(myParser.IntegerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParentesisExpr}
	 * labeled alternative in {@link myParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentesisExpr(myParser.ParentesisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParentesisExpr}
	 * labeled alternative in {@link myParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentesisExpr(myParser.ParentesisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link myParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(myParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link myParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(myParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableExpr}
	 * labeled alternative in {@link myParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpr(myParser.VariableExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableExpr}
	 * labeled alternative in {@link myParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpr(myParser.VariableExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SignalExpr}
	 * labeled alternative in {@link myParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSignalExpr(myParser.SignalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SignalExpr}
	 * labeled alternative in {@link myParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSignalExpr(myParser.SignalExprContext ctx);
}