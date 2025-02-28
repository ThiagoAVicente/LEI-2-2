package b2_03;

@SuppressWarnings("CheckReturnValue")
public class Interpreter2 extends CalculatorBaseVisitor<String> {

   @Override public String visitProgram(CalculatorParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   private float _visitStatHelper(CalculatorParser.ExprContext ctx){

      // caso base
      if ( ctx.Integer() != null){
         return Integer.parseInt( ctx.Integer().getText() );
      }

      if ( ctx.expr().size() == 1 ){
         // expressão dentro de ()
         return _visitStatHelper(ctx.expr(0));
      }

      // resolver recursivamente
      float n1 = _visitStatHelper( ctx.expr(0) );
      float n2 = _visitStatHelper( ctx.expr(1) );
      char op = ctx.op.getText().charAt(0);

      // resolver operação
      switch (op){

         case '-':
            return n1 - n2;

         case '+':
            return n1 + n2;

         case '*':
            return n1*n2;

         case '%':
            return n1 % n2;

         case '/':
            if ( n2 == 0){
               System.err.println("Divisão por 0.");
               return 123;
            }
            return n1/n2;
      }

      return .0f;
   }

   @Override public String visitStat(CalculatorParser.StatContext ctx) {
      float result = _visitStatHelper(ctx.expr());
      System.out.printf("= %.2f",result);
      return null;
   }

   @Override public String visitExpr(CalculatorParser.ExprContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }
}
