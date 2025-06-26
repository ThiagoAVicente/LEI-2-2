import javax.naming.InvalidNameException;
import java.util.HashMap;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends FracLangBaseVisitor<Fraction> {

   private HashMap<String,Fraction> var_map = new HashMap<>();

   @Override public Fraction visitMain(FracLangParser.MainContext ctx) {

      // visit each line
      for (FracLangParser.LineContext l : ctx.line()){
         visitLine(l);
      }
      return null;
   }

   @Override public Fraction visitLine(FracLangParser.LineContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Fraction visitInput(FracLangParser.InputContext ctx) {
      String id = ctx.ID().getText();
      Fraction v = visit (ctx.expr());
      var_map.put(id,v);
      return null;
   }

   @Override public Fraction visitOutput(FracLangParser.OutputContext ctx) {
      Fraction to_print = visit(ctx.expr());
      System.out.println(to_print);
      return null;
   }

   @Override public Fraction visitExprSimple(FracLangParser.ExprSimpleContext ctx) {
      return visitOpr(ctx.opr());
   }

   @Override public Fraction visitExprParen(FracLangParser.ExprParenContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Fraction visitExprRead(FracLangParser.ExprReadContext ctx) {
      return visitRead(ctx.read());
   }

   @Override public Fraction visitExprMult(FracLangParser.ExprMultContext ctx) {
      Fraction o1 = visit(ctx.expr(0));
      Fraction o2 = visit(ctx.expr(1));

      if ( ctx.op.getText() == ":") {
         return Fraction.div(o1, o2);
      }
      return Fraction.mult(o1,o2);
   }

   @Override public Fraction visitExprSum(FracLangParser.ExprSumContext ctx) {
      Fraction o1 = visit(ctx.expr(0));
      Fraction o2 = visit(ctx.expr(1));

      if ( ctx.op.getText() == "-") {
         return Fraction.minus(o1, o2);
      }
      return Fraction.add(o1,o2);
   }

   @Override public Fraction visitExprSig(FracLangParser.ExprSigContext ctx) {
      Fraction res = visit(ctx.expr());
      return Fraction.mult(res,new Fraction(-1,1));
   }

   @Override public Fraction visitExprReduce(FracLangParser.ExprReduceContext ctx) {
      return visitReduce(ctx.reduce());
   }

   @Override public Fraction visitReduce(FracLangParser.ReduceContext ctx) {
      Fraction to_reduce = visit(ctx.expr());
      return Fraction.reduce(to_reduce);
   }

   @Override public Fraction visitRead(FracLangParser.ReadContext ctx) {
      System.out.println(ctx.TEXT().getText());
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine().strip();

      try {
         if (input.contains("/")) {
            // fraction
            String[] parts = input.split("/");

            int num = Integer.parseInt(parts[0]);
            int den = Integer.parseInt(parts[1]);

            return new Fraction(num,den);

         } else {
            // Num
            int num = Integer.parseInt(input);
            return new Fraction(num,1);
         }
      }
      catch (NumberFormatException e){
         System.err.printf("%s could not be transformed into a fraction.%n",input);
         throw new NumberFormatException("");
      }

   }

   @Override public Fraction visitOpr(FracLangParser.OprContext ctx)  {
      if (ctx.ID() != null ){

         String var_name = ctx.ID().getText();

         // check if variable was assigned
         if ( !var_map.containsKey(var_name) ){
            System.err.printf("%s was not declared%n",var_name);
            System.exit(1);
         }


         return var_map.get(var_name);
      }

      return visit(ctx.numeric());
   }

   @Override public Fraction visitInt(FracLangParser.IntContext ctx) {
      int num = Integer.parseInt(ctx.INTEGER().getText());
      return new Fraction(num,1);
   }

   @Override public Fraction visitFrac(FracLangParser.FracContext ctx) {
      int num = visit(ctx.int_(0)).getNum();
      int den= visit(ctx.int_(1)).getNum();
      return new Fraction(num,den);
   }

}
