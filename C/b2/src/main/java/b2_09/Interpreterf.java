import java.util.HashMap;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class Interpreterf extends fracBaseVisitor<String> {

   private HashMap<String,MyFraction> hm = new HashMap<>();

   @Override public String visitProgram(fracParser.ProgramContext ctx) {
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStat(fracParser.StatContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStatement(fracParser.StatementContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitPrintVar(fracParser.PrintVarContext ctx) {

      MyFraction fraction = hm.get(ctx.VarName().getText());
      System.out.println(fraction);

      return  null;
   }

   @Override public String visitExprReduceCall(fracParser.ExprReduceCallContext ctx) {



      MyFraction frac = MyFraction.reduce( MyFraction.fromText(visit(ctx.expr())));
      System.out.printf("= %s%n",frac);

      return  null;
   }

   @Override public String visitPrintExpr(fracParser.PrintExprContext ctx) {
      String res =  visit(ctx.expr());
      System.out.printf("= %s%n",res);
      return null;
   }

   @Override public String visitAssi(fracParser.AssiContext ctx) {
      String val = visit(ctx.expr());
      hm.put(ctx.VarName().getText(), MyFraction.fromText(val));
      return null;
   }

   @Override public String visitExprAddSub(fracParser.ExprAddSubContext ctx) {
      MyFraction f1 = MyFraction.fromText(visit(ctx.expr(0)));
      MyFraction f2 = MyFraction.fromText(visit(ctx.expr(1)));

      MyFraction res = new MyFraction(-1,-1);

      switch (ctx.op.getText().charAt(0)){

         case '+':

             res =  f1.add(f2);
            break;
         case '-':

             res = f1.sub(f2);
      }

      return res.toString();
   }

   @Override public String visitExprParentesis(fracParser.ExprParentesisContext ctx) {
      return visit(ctx.expr());
   }

   @Override public String visitExprPow(fracParser.ExprPowContext ctx) {

      MyFraction f = MyFraction.fromText(visit(ctx.expr()));
      MyFraction res = f.pow(Integer.parseInt(ctx.Integer().getText()));
      return res.toString();
   }

   @Override public String visitExprSigned(fracParser.ExprSignedContext ctx) {
      char sig = ctx.sig.getText().charAt(0);
      MyFraction res = MyFraction.fromText( visit(ctx.expr()) );
      res = (sig == '+')? res : res.multi(-1);

      return res.toString();
   }

   @Override public String visitExprReadCall(fracParser.ExprReadCallContext ctx) {
      Scanner sc = new Scanner(System.in);
      System.out.print(">> ");
      String line = sc.nextLine();
      MyFraction f = MyFraction.fromText(line);

      hm.put(ctx.VarName().getText(),f);

      return f.toString();
   }

   @Override public String visitExprInteger(fracParser.ExprIntegerContext ctx) {
      return ctx.Integer().getText();
   }

   @Override public String visitExprVarName(fracParser.ExprVarNameContext ctx) {
      return hm.get(ctx.VarName().getText()).toString();
   }

   @Override public String visitExprFraction(fracParser.ExprFractionContext ctx) {

      MyFraction f1 = MyFraction.fromText(visit(ctx.expr(0)));
      MyFraction f2 = MyFraction.fromText(visit(ctx.expr(1)));

      return f1.div(f2).toString();
   }

   @Override public String visitExprMultDivMod(fracParser.ExprMultDivModContext ctx) {
      MyFraction f1 = MyFraction.fromText(visit(ctx.expr(0)));
      MyFraction f2 = MyFraction.fromText(visit(ctx.expr(1)));

      MyFraction res = new MyFraction(-1,-1);

      switch (ctx.op.getText().charAt(0)){

         case '*':

            res =  f1.multi(f2);
            break;
         case ':':
            res = f1.div(f2);
            break;
         default:
            res = f1.mod(f2);
      }

      return res.toString();
   }

}
