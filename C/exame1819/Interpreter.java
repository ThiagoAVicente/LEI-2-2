import java.util.HashMap;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends VectorBaseVisitor<Result> {

   private HashMap<String, Result> variables = new HashMap();

   @Override public Result visitMain(VectorParser.MainContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Result visitStat(VectorParser.StatContext ctx) {
      return visitChildren(ctx.func());
   }

   @Override public Result visitFunc(VectorParser.FuncContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Result visitAssign(VectorParser.AssignContext ctx) {

      // save new variable
      String varName = ctx.ID().getText();
      Result value = visit(ctx.expr());
      variables.put(varName,value);

      return null;
   }

   @Override public Result visitShowCall(VectorParser.ShowCallContext ctx) {
      Result exp = visit(ctx.expr());
      System.out.println(exp);
      return null;
   }

   @Override public Result visitExprNum(VectorParser.ExprNumContext ctx) {
      double num = Double.parseDouble(ctx.NUM().getText());
      return new Result(num);
   }

   @Override public Result visitExprParen(VectorParser.ExprParenContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Result visitExprMult(VectorParser.ExprMultContext ctx) {
      Result exp1 = visit(ctx.expr(0));
      Result exp2 = visit(ctx.expr(1));

      boolean exp1Num = exp1.vector() == null;
      boolean exp2Num = exp2.vector() == null;

      Result res = null;

      if ( !(exp1Num && exp2Num) ){
         // one of the exprs is a vector
         Vector vec = exp1Num? exp2.vector(): exp1.vector();
         Vector newVec = vec.multAll(exp1Num? exp1.number() : exp2.number());
         
         res = new Result(newVec);
      }

      else if ( exp1Num ){
         // both are numbers
         res = new Result(exp1.number()*exp2.number());
      }
      else {
         fail("Cannot apply operator \"*\" vectors.");
      }

      return res;

   }

   @Override public Result visitExprSumSub(VectorParser.ExprSumSubContext ctx) {
      Result exp1 = visit(ctx.expr(0));
      Result exp2 = visit(ctx.expr(1));

      boolean exp1Num = exp1.vector() == null;
      boolean exp2Num = exp2.vector() == null;

      if (!(exp1Num == exp2Num)){
         fail(
            String.format(
               "Cannot apply operator \"%s\" when arguments are not of the same type.",ctx.op.getText()
            )
         );
      }

      boolean sub = ctx.op.getText().contains("-");

      Result res = null;
      try{
         if (exp1Num){
            res = new Result(exp1.number() + (sub? -1*exp2.number():exp2.number()) ); 
         }
         else{ res = new Result(exp1.vector().add(exp2.vector(), sub? -1:1)); }

      }
      catch (Exception e){
         fail(e.toString());
      }
      return res;
   }

   @Override public Result visitExprDot(VectorParser.ExprDotContext ctx) {
      Result exp1 = visit(ctx.expr(0));
      Result exp2 = visit(ctx.expr(1));

      boolean exp1Num = exp1.vector() == null;
      boolean exp2Num = exp2.vector() == null;

      if (exp1Num || exp2Num){
         fail(
            String.format(
               "Cannot apply operator \".\" to a escalar value. ")
            );
      }

      try{
         return new Result(exp1.vector().dot(exp2.vector()));
      }
      catch (Exception e){ 
         fail("Error on dot operation.");
      }

      return null; // unreachable
   }

   @Override public Result visitExprVec(VectorParser.ExprVecContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Result visitExprId(VectorParser.ExprIdContext ctx) {

      String varId = ctx.ID().getText();
      if (!variables.containsKey(varId)){
         fail(String.format("\"%s\" was not declared",varId));
      }

      return variables.get(varId);
   }

   @Override public Result visitExprSig(VectorParser.ExprSigContext ctx) {
      
      Result exp = visit(ctx.expr());
      boolean neg = ctx.sig.getText().contains("-");
      
      if (!neg) return exp;

      if (exp.vector()!= null) return new Result(exp.vector().multAll(-1));
      
      return new Result(exp.number()*-1); 
      
   }

   @Override public Result visitVec(VectorParser.VecContext ctx) {
      Vector v = new Vector();

      ctx.NUM().forEach(num -> v.insert(Double.valueOf(num.getText())));

      return new Result(v);
   }

   private void fail(String message){
      System.err.printf("[ERROR]%s %n",message);
      System.exit(1);
   }
}
