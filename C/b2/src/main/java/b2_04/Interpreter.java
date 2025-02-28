package b2_04;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends PrefixCalculatorBaseVisitor<String> {

   @Override public String visitProgram(PrefixCalculatorParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   private float _visitStatHelper(PrefixCalculatorParser.ExprContext ctx){

      // caso base
      if ( ctx.Number() != null ) return Float.parseFloat( ctx.Number().getText() );

      // resolver recursivamente
      float n1 = _visitStatHelper( ctx.expr(0) );
      float n2 = _visitStatHelper( ctx.expr(1) );

      char op = ctx.op.getText().charAt(0);

      switch (op) {
         case '+':
            return n1 + n2;
         case '-':
            return n1 - n2;
         case '*':
            return n1 * n2;
         case '/':
            if (n2 == 0) {
               System.err.println("Division by 0");
               System.exit(1);
            }
            return n1 / n2;
         }

         return 0; // nunca chega
   }

   @Override public String visitStat(PrefixCalculatorParser.StatContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExpr(PrefixCalculatorParser.ExprContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }
}
