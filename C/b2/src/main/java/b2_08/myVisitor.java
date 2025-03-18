@SuppressWarnings("CheckReturnValue")
public class myVisitor extends CalculatorBaseVisitor<Void> {

   @Override public Void visitProgram(CalculatorParser.ProgramContext ctx) {
      Void res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Void visitStat(CalculatorParser.StatContext ctx) {
      Void res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Void visitAssi(CalculatorParser.AssiContext ctx) {
      Void res = null;

      System.out.printf("%s = ",ctx.VarName().getText());

      // visitar outras expressions
      visit(ctx.expr());

      System.out.println();

      return res;
   }

   @Override public Void visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Void res = null;
      visit(ctx.expr(0));
      visit(ctx.expr(1));
      System.out.printf("%s ",ctx.op.getText());
      return res;
   }

   // DONE
   @Override public Void visitExprParentesis(CalculatorParser.ExprParentesisContext ctx) {
      Void res = null;
      visit(ctx.expr());
      return res;
   }

   // DONE
   @Override public Void visitExprSigned(CalculatorParser.ExprSignedContext ctx) {
      Void res = null;
      visit(ctx.expr());
      System.out.printf("!%s ",ctx.sig.getText());
      return res;
   }

   // DONE
   @Override public Void visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {

      Void res = null;

      System.out.printf("%s ",ctx.Integer().getText());

      return res;
   }

   // DONE
   @Override public Void visitExprVarName(CalculatorParser.ExprVarNameContext ctx) {
      Void res = null;

      System.out.printf("%s ",ctx.VarName().getText());

      return res;
   }

   @Override public Void visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      Void res = null;
      visit(ctx.expr(0));
      visit(ctx.expr(1));
      System.out.printf("%s ",ctx.op.getText());
      return res;
   }
}
