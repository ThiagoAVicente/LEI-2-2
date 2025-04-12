import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("CheckReturnValue")
public class Validator extends myParserBaseVisitor<Integer> {

   private int errorCounter;
   private int lineCounter;
   private HashSet<String> hs = new HashSet<>();

   @Override public Integer visitProgram(myParser.ProgramContext ctx) {
      errorCounter = 0;
      lineCounter = 0;

      for ( myParser.LineContext line: ctx.line()) visit(line);

      return errorCounter;
   }

   @Override public Integer visitLine(myParser.LineContext ctx) {
      lineCounter++;
      visitChildren(ctx);
      return 0;
   }

   @Override public Integer visitAssign(myParser.AssignContext ctx) {

      // add new variable to known set
      String varName = ctx.VarName().getText();
      this.hs.add(varName);

      // visit associated expr
      visit(ctx.expr());
      return 0;
   }

   @Override public Integer visitIntegerExpr(myParser.IntegerExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Integer visitBinaryExpr(myParser.BinaryExprContext ctx) {
      return visitChildren(ctx);
   }


   @Override public Integer visitParentesisExpr(myParser.ParentesisExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Integer visitVariableExpr(myParser.VariableExprContext ctx) {
      String varName = ctx.VarName().getText();
      if ( !hs.contains(varName) ) {
         System.err.printf("Error on line %d: cannot resolve %s.\n",lineCounter,varName);
         errorCounter++;
      }
      return 0;
   }

   @Override public Integer visitSignalExpr(myParser.SignalExprContext ctx) {
      return 0;
   }

   @Override public Integer visitPrint(myParser.PrintContext ctx) {
      return visitChildren(ctx.expr());
   }
}
