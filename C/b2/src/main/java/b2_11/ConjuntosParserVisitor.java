// Generated from ConjuntosParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ConjuntosParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ConjuntosParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ConjuntosParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ConjuntosParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConjuntosParser#linha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinha(ConjuntosParser.LinhaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementoDigito}
	 * labeled alternative in {@link ConjuntosParser#elementoConjunto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementoDigito(ConjuntosParser.ElementoDigitoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementoPalavra}
	 * labeled alternative in {@link ConjuntosParser#elementoConjunto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementoPalavra(ConjuntosParser.ElementoPalavraContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConjuntosParser#conjunto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunto(ConjuntosParser.ConjuntoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperadorVariavel}
	 * labeled alternative in {@link ConjuntosParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorVariavel(ConjuntosParser.OperadorVariavelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperadorConjunto}
	 * labeled alternative in {@link ConjuntosParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorConjunto(ConjuntosParser.OperadorConjuntoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperacaoParentesis}
	 * labeled alternative in {@link ConjuntosParser#operacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacaoParentesis(ConjuntosParser.OperacaoParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperacaoDiferenca}
	 * labeled alternative in {@link ConjuntosParser#operacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacaoDiferenca(ConjuntosParser.OperacaoDiferencaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperacaoIntercecao}
	 * labeled alternative in {@link ConjuntosParser#operacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacaoIntercecao(ConjuntosParser.OperacaoIntercecaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperacaoUniao}
	 * labeled alternative in {@link ConjuntosParser#operacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacaoUniao(ConjuntosParser.OperacaoUniaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConjuntosParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(ConjuntosParser.AtribuicaoContext ctx);
}