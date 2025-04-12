// Generated from myParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link myParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface myParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link myParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(myParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(myParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(myParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(myParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerExpr}
	 * labeled alternative in {@link myParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpr(myParser.IntegerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParentesisExpr}
	 * labeled alternative in {@link myParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesisExpr(myParser.ParentesisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link myParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(myParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableExpr}
	 * labeled alternative in {@link myParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpr(myParser.VariableExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SignalExpr}
	 * labeled alternative in {@link myParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalExpr(myParser.SignalExprContext ctx);
}