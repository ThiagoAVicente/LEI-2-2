// Generated from frac.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link fracParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface fracVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link fracParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(fracParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link fracParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(fracParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link fracParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(fracParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintVar}
	 * labeled alternative in {@link fracParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintVar(fracParser.PrintVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprReduceCall}
	 * labeled alternative in {@link fracParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprReduceCall(fracParser.ExprReduceCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintExpr}
	 * labeled alternative in {@link fracParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(fracParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link fracParser#assi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssi(fracParser.AssiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(fracParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParentesis}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParentesis(fracParser.ExprParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPow(fracParser.ExprPowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSigned}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSigned(fracParser.ExprSignedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprReadCall}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprReadCall(fracParser.ExprReadCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInteger(fracParser.ExprIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVarName}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVarName(fracParser.ExprVarNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFraction(fracParser.ExprFractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDivMod(fracParser.ExprMultDivModContext ctx);
}