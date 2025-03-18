// Generated from vocab.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link vocabParser}.
 */
public interface vocabListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link vocabParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(vocabParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(vocabParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link vocabParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(vocabParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(vocabParser.LineContext ctx);
}