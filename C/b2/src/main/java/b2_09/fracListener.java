// Generated from frac.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fracParser}.
 */
public interface fracListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fracParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(fracParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link fracParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(fracParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link fracParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(fracParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link fracParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(fracParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link fracParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(fracParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fracParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(fracParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintVar}
	 * labeled alternative in {@link fracParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintVar(fracParser.PrintVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintVar}
	 * labeled alternative in {@link fracParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintVar(fracParser.PrintVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReduceCall}
	 * labeled alternative in {@link fracParser#print}.
	 * @param ctx the parse tree
	 */
	void enterExprReduceCall(fracParser.ExprReduceCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReduceCall}
	 * labeled alternative in {@link fracParser#print}.
	 * @param ctx the parse tree
	 */
	void exitExprReduceCall(fracParser.ExprReduceCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintExpr}
	 * labeled alternative in {@link fracParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(fracParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintExpr}
	 * labeled alternative in {@link fracParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(fracParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link fracParser#assi}.
	 * @param ctx the parse tree
	 */
	void enterAssi(fracParser.AssiContext ctx);
	/**
	 * Exit a parse tree produced by {@link fracParser#assi}.
	 * @param ctx the parse tree
	 */
	void exitAssi(fracParser.AssiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(fracParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(fracParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParentesis}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParentesis(fracParser.ExprParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParentesis}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParentesis(fracParser.ExprParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPow(fracParser.ExprPowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPow(fracParser.ExprPowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSigned}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSigned(fracParser.ExprSignedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSigned}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSigned(fracParser.ExprSignedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReadCall}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReadCall(fracParser.ExprReadCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReadCall}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReadCall(fracParser.ExprReadCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(fracParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(fracParser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVarName}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVarName(fracParser.ExprVarNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVarName}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVarName(fracParser.ExprVarNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFraction(fracParser.ExprFractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFraction(fracParser.ExprFractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDivMod(fracParser.ExprMultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link fracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDivMod(fracParser.ExprMultDivModContext ctx);
}