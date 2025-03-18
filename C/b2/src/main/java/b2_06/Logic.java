import java.util.HashMap;

@SuppressWarnings("CheckReturnValue")
public class Logic extends CalculatorBaseVisitor<Float> {

   private HashMap<String, Float> hm = new HashMap<>();
   private int counter = 0;

   @Override public Float visitProgram(CalculatorParser.ProgramContext ctx) {

      return visitChildren(ctx);
   }

   @Override public Float visitStat(CalculatorParser.StatContext ctx) {

      this.counter++;

      if ( ctx.assi()!= null){
         return visit(ctx.assi());
      }

      Float res = visit(ctx.expr());
      System.out.printf("line %d :: = %.2f.\n",this.counter, res);

      return visitChildren(ctx);
      //return res;
   }

   @Override public Float visitAssi(CalculatorParser.AssiContext ctx) {

      Float res = visit(ctx.expr());
      String key = ctx.VarName().getText();
      this.hm.put(key,res);

      return null;
   }

   @Override public Float visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Float n1 = visit(ctx.expr(0));
      Float n2 = visit(ctx.expr(1));

      char op = ctx.op.getText().charAt(0);

      return ( op == '+' )? n1+n2: n1-n2;
   }

   @Override public Float visitExprParentesis(CalculatorParser.ExprParentesisContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Float visitExprSigned(CalculatorParser.ExprSignedContext ctx) {

      int sig = ( ctx.sig.getText().charAt(0) == '+' )? 1 : -1 ;
      Float res = visit(ctx.expr());

      return sig*res;
   }

   @Override public Float visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      return Integer.parseInt(ctx.Integer().getText()) + .0f;
   }

   @Override public Float visitExprVarName(CalculatorParser.ExprVarNameContext ctx) {

      String varName = ctx.VarName().getText();

      if ( !this.hm.containsKey(varName) ){
         // value does not exist
         System.err.printf("%s: name not found.\n",varName);
         System.exit(1);
      }

      // return saved value
      return this.hm.get(varName);

   }

   @Override public Float visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {

      Float n1 = visit(ctx.expr(0));
      Float n2 = visit(ctx.expr(1));

      char op = ctx.op.getText().charAt(0);

      if ( op == '*' ) return n1*n2;

      if ( n2 == 0){
         System.err.printf("%s : divisão por 0.\n",ctx.getText());
         System.exit(1);
      }

      if ( op == '/') return n1/n2;
      return n1%n2;
   }
}
