// Generated from Calculator.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CalculatorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(CalculatorParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#assi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssi(CalculatorParser.AssiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(CalculatorParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParentesis}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParentesis(CalculatorParser.ExprParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSigned}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSigned(CalculatorParser.ExprSignedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInteger(CalculatorParser.ExprIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVarName}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVarName(CalculatorParser.ExprVarNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx);
}