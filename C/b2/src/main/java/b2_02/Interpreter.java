
@SuppressWarnings("CheckReturnValue")
public class Interpreter extends SuffixCalculatorBaseVisitor<String> {

   @Override public String visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   private String _visitHelper(SuffixCalculatorParser.ExprContext ctx) {

      if (ctx.Number() != null) {
         // a expressão é um nmr então basta retirnar o número
         return ctx.Number().getText();  // Return the number text
      }

      // resolver recursivamente
      String left = _visitHelper(ctx.expr(0));
      String right = _visitHelper(ctx.expr(1));

      float n1;
      float n2;

      try {
         n1 = Float.parseFloat(left);
         n2 = Float.parseFloat(right);
      }
      catch (Exception e){
         return "Division by 0";
      }
      char op = ctx.op.getText().charAt(0);

      // resolver operações e retornar o resultado
      switch (op) {
         case '+':
            return String.valueOf(n1 + n2);
         case '-':
            return String.valueOf(n1 - n2);
         case '*':
            return String.valueOf(n1 * n2);
         case '/':
            if (n2 == 0) {
               return "Division by 0";
            }
            return String.valueOf(n1 / n2);
         default:
            return "Unknown operator";
      }
   }

   @Override public String visitStat(SuffixCalculatorParser.StatContext ctx) {

      // Get the result from _visitHelper
      String result = _visitHelper(ctx.expr());

      // Print the result
      System.out.printf("= %s\n", result);

      return null;
   }


   @Override
   public String visitExpr(SuffixCalculatorParser.ExprContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

}
