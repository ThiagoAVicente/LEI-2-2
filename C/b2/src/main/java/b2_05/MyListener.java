
import  java.util.HashMap;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
@SuppressWarnings("CheckReturnValue")

public class MyListener extends vocabBaseListener {

   private  int lineCounter = 0;
   private HashMap<Integer, String > hm = null;

   @Override public void enterProgram(vocabParser.ProgramContext ctx) {
      this.hm = new HashMap<>();
   }

   @Override public void exitProgram(vocabParser.ProgramContext ctx) {
      System.out.println(this.hm.toString());
      System.out.printf("Processed %d lines.\n",this.lineCounter);
   }

   @Override public void enterLine(vocabParser.LineContext ctx) {
      lineCounter++;
   }

   @Override public void exitLine(vocabParser.LineContext ctx) {

      int n = Integer.parseInt(ctx.Integer().getText());
      String txt = ctx.String().getText();

      this.hm.put( n, txt );
   }

   @Override public void enterEveryRule(ParserRuleContext ctx) {
   }

   @Override public void exitEveryRule(ParserRuleContext ctx) {
   }

   @Override public void visitTerminal(TerminalNode node) {
   }

   @Override public void visitErrorNode(ErrorNode node) {
   }
}
