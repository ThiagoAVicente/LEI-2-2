// Generated from ConjuntosParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ConjuntosParser}.
 */
public interface ConjuntosParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ConjuntosParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ConjuntosParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConjuntosParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ConjuntosParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConjuntosParser#linha}.
	 * @param ctx the parse tree
	 */
	void enterLinha(ConjuntosParser.LinhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConjuntosParser#linha}.
	 * @param ctx the parse tree
	 */
	void exitLinha(ConjuntosParser.LinhaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementoDigito}
	 * labeled alternative in {@link ConjuntosParser#elementoConjunto}.
	 * @param ctx the parse tree
	 */
	void enterElementoDigito(ConjuntosParser.ElementoDigitoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementoDigito}
	 * labeled alternative in {@link ConjuntosParser#elementoConjunto}.
	 * @param ctx the parse tree
	 */
	void exitElementoDigito(ConjuntosParser.ElementoDigitoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementoPalavra}
	 * labeled alternative in {@link ConjuntosParser#elementoConjunto}.
	 * @param ctx the parse tree
	 */
	void enterElementoPalavra(ConjuntosParser.ElementoPalavraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementoPalavra}
	 * labeled alternative in {@link ConjuntosParser#elementoConjunto}.
	 * @param ctx the parse tree
	 */
	void exitElementoPalavra(ConjuntosParser.ElementoPalavraContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConjuntosParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void enterConjunto(ConjuntosParser.ConjuntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConjuntosParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void exitConjunto(ConjuntosParser.ConjuntoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperadorVariavel}
	 * labeled alternative in {@link ConjuntosParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperadorVariavel(ConjuntosParser.OperadorVariavelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperadorVariavel}
	 * labeled alternative in {@link ConjuntosParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperadorVariavel(ConjuntosParser.OperadorVariavelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperadorConjunto}
	 * labeled alternative in {@link ConjuntosParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperadorConjunto(ConjuntosParser.OperadorConjuntoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperadorConjunto}
	 * labeled alternative in {@link ConjuntosParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperadorConjunto(ConjuntosParser.OperadorConjuntoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperacaoParentesis}
	 * labeled alternative in {@link ConjuntosParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoParentesis(ConjuntosParser.OperacaoParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperacaoParentesis}
	 * labeled alternative in {@link ConjuntosParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoParentesis(ConjuntosParser.OperacaoParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperacaoDiferenca}
	 * labeled alternative in {@link ConjuntosParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoDiferenca(ConjuntosParser.OperacaoDiferencaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperacaoDiferenca}
	 * labeled alternative in {@link ConjuntosParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoDiferenca(ConjuntosParser.OperacaoDiferencaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperacaoIntercecao}
	 * labeled alternative in {@link ConjuntosParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoIntercecao(ConjuntosParser.OperacaoIntercecaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperacaoIntercecao}
	 * labeled alternative in {@link ConjuntosParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoIntercecao(ConjuntosParser.OperacaoIntercecaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperacaoUniao}
	 * labeled alternative in {@link ConjuntosParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoUniao(ConjuntosParser.OperacaoUniaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperacaoUniao}
	 * labeled alternative in {@link ConjuntosParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoUniao(ConjuntosParser.OperacaoUniaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConjuntosParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(ConjuntosParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConjuntosParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(ConjuntosParser.AtribuicaoContext ctx);
}