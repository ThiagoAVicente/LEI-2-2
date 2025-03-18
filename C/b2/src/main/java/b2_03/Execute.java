@SuppressWarnings("CheckReturnValue")
public class Execute extends CalculatorBaseVisitor<String> {

   @Override public String visitProgram(CalculatorParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
   }

   private float _visitStatHelper(CalculatorParser.ExprContext ctx){

      if ( ctx.sig != null ){
         // negação
         int s = ctx.sig.getText().charAt(0) == '+' ? 1 : -1;

         if ( ctx.Integer() != null) return s * Integer.parseInt( ctx.Integer().getText() );

         return s * _visitStatHelper(ctx.expr(0));
      }

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
      String result = String.valueOf( _visitStatHelper(ctx.expr()) );

      // Print the result
      System.out.printf("= %s\n", result);

      return null;
   }

   @Override public String visitExpr(CalculatorParser.ExprContext ctx) {
      String res = null;
      return visitChildren(ctx);

      //return res;
   }
}
