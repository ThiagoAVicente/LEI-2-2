import java.util.HashMap;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends StrLangBaseVisitor<String> {

    private final HashMap<String, String> variables = new HashMap<>();
    private int line_count = 0;
    
   @Override public String visitProgram(StrLangParser.ProgramContext ctx) {
       for ( StrLangParser.StatContext stat : ctx.stat()){
           line_count++;
           visit(stat);
       }
       return null;
   }

   @Override public String visitStat(StrLangParser.StatContext ctx) {
       visitChildren(ctx);
       return null;
        
   }

   @Override public String visitPrint(StrLangParser.PrintContext ctx) {
       String val = visit(ctx.expr());
       System.out.println(val);
       return null;
   }

   @Override public String visitInput(StrLangParser.InputContext ctx) {
      
      // prepare values 
      String text = visit(ctx.expr());
      System.out.print(text+" ");
     
      // read user value
      Scanner sc = new Scanner(System.in);
      if ( sc.hasNextLine()){ return sc.nextLine(); }
      
      // fail
      fail("No value was provided");
      
      return null; // unreachable
   }

   @Override public String visitAssign(StrLangParser.AssignContext ctx) {
    
       // save new value
       String name = ctx.ID().getText();
       String val = visit(ctx.expr());
       variables.put(name,val);
       
       return null;
   }

   @Override public String visitExprRemove(StrLangParser.ExprRemoveContext ctx) {
      String exp = visit(ctx.expr(0));
      String target = visit(ctx.expr(1));
      return exp.replace(target, "");
   }

   @Override public String visitExprReplace(StrLangParser.ExprReplaceContext ctx) {
      String exp = visit(ctx.expr(0));
      String target = visit(ctx.expr(1));
      String replacement = visit(ctx.expr(2));
      return exp.replace(target, replacement);
   }

   @Override public String visitExprConcat(StrLangParser.ExprConcatContext ctx) {
       String exp1 = visit(ctx.expr(0));
       String exp2 = visit(ctx.expr(1));
       return exp1 + exp2;
   }

   @Override public String visitExprString(StrLangParser.ExprStringContext ctx) {
       String raw = ctx.STRING().getText();
       String clean = raw.replaceAll("^\"|\"$", ""); // remove quotes
       return clean;
   }

   @Override public String visitExprParens(StrLangParser.ExprParensContext ctx) {
      return visit(ctx.expr());
   }

   @Override public String visitExprInput(StrLangParser.ExprInputContext ctx) {
      return visit(ctx.input());
   }

   @Override public String visitExprTrim(StrLangParser.ExprTrimContext ctx) {
       String exp = visit(ctx.expr());
       return exp.trim();
   }

   @Override public String visitExprId(StrLangParser.ExprIdContext ctx) {
       String id = ctx.ID().getText();
       String val = variables.get(id);
       
       if ( val == null){
           // fail
           fail(String.format("%s was never declared",id));
       }
       
       return val;
   }
   
   private void fail(String message) {
       System.err.printf("[ERROR] line:%d %s %n", line_count, message);
       System.exit(1);
   }
}
