import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends TupleLangBaseVisitor<ArrayList<Double>> {

   private HashMap<String,ArrayList<Double>> variables = new HashMap<>();

   private String Tuple2String(ArrayList<Double> in){
      StringBuilder sb = new StringBuilder("[");
      for ( Double d : in ){
         sb.append(String.format("%.2f, ",d));
      }
      return sb.append("]").toString();
   }

   private void fail(String message){
         System.err.printf("[ERROR] %s%n",message);
         System.exit(1);
   }


   @Override public ArrayList<Double> visitStart(TupleLangParser.StartContext ctx) {
      visitChildren(ctx);
      return null;
   }

   @Override public ArrayList<Double> visitStat(TupleLangParser.StatContext ctx) {
      visit(ctx.command());
      return null;
   }


   @Override public ArrayList<Double> visitPrint(TupleLangParser.PrintContext ctx) {
      StringBuilder sb = new StringBuilder("");
      
      // parse each expr to string
      for ( var c: ctx.expr()){
          ArrayList<Double> arr = visit(c);
         sb.append(Tuple2String(arr) + " ");
      }
      
      System.out.println(sb.toString());

      return null;
   }

   @Override public ArrayList<Double> visitAssign(TupleLangParser.AssignContext ctx) {
      ArrayList<Double> val = visit(ctx.expr());
      String id = ctx.ID().getText();
      variables.put(id,val);
      return null;
   }

   @Override public ArrayList<Double> visitExprAddSub(TupleLangParser.ExprAddSubContext ctx) {
      ArrayList<Double> res = new ArrayList<>();
      
      // iterate over each 
      ArrayList<Double> op1 = visit(ctx.op1);
      ArrayList<Double> op2 = visit(ctx.op2);

      int i = 0;
      int mult = ctx.op.getText().contains("-")? -1:1;
      
      while (i < op1.size() || i < op2.size()){

         int c= i++;

         if ( c< op1.size() && c < op2.size()){
            res.add(op1.get(c) + mult*op2.get(c));
            continue;
         }

         if ( c < op1.size() ){
            res.add(op1.get(c));
            continue;
         }

         res.add(op2.get(c));

      }

      return res;

   }

   @Override public ArrayList<Double> visitExprHead(TupleLangParser.ExprHeadContext ctx) {
      ArrayList<Double> target = visit(ctx.expr());
      if ( target.size() == 0 ){
         return new ArrayList<>();
      }
      ArrayList<Double> res = new ArrayList<>();
      res.add(target.get(0));
      return res;
   }

   @Override public ArrayList<Double> visitExprParen(TupleLangParser.ExprParenContext ctx) {
      return visit(ctx.expr());
   }

   @Override public ArrayList<Double> visitExprRead(TupleLangParser.ExprReadContext ctx) {
      Scanner sc = new Scanner(System.in);
      System.out.print("> ");
      String input = sc.nextLine().strip();

      ArrayList<Double> res = new ArrayList<>();

      String[] parts = input.split(",");

      // empty line
      if ( input.isEmpty()) return res;
      
      // try to convert numbers
      try{  
         for ( String s: parts){
            res.add(Double.parseDouble(s));
         }

      }catch (NumberFormatException e){
         fail(String.format("Bad format input -> \"%s\"",input));
      }

      return res;
   }

   @Override public ArrayList<Double> visitExprSum(TupleLangParser.ExprSumContext ctx) {
      ArrayList<Double> target = visit(ctx.expr());
      double v = .0;
      for ( Double d: target){
         v+=d;
      }
      ArrayList<Double> res = new ArrayList<>();
      res.add(v);
      return res;
   }

   @Override public ArrayList<Double> visitExprTuple(TupleLangParser.ExprTupleContext ctx) {
      ArrayList<Double> res = new ArrayList<>();
      
      String content = ctx.getText();
      content = content.replaceAll("[\\[\\]]","").strip();

      if (content.isEmpty()) {
        return res;
      }

      String[] parts = content.split(",");

      for ( String p : parts){
         res.add(Double.parseDouble(p.strip()));
      }

      return res;
   }

   @Override public ArrayList<Double> visitExprUnary(TupleLangParser.ExprUnaryContext ctx) {
      ArrayList<Double> target = visit(ctx.expr());
      ArrayList<Double> res = new ArrayList<>();
      
      int mult = ctx.sig.getText().contains("-")? -1:1;
      
      for ( Double d : target){
         res.add(d* mult );
      }
      return res;
   }

   @Override public ArrayList<Double> visitExprTail(TupleLangParser.ExprTailContext ctx) {
      ArrayList<Double> target = visit(ctx.expr());
      ArrayList<Double> res = new ArrayList<>();

      for ( int i = 1; i < target.size() ; ++i){
         res.add(target.get(i));
      }   

      return res;
   }

   @Override public ArrayList<Double> visitExprId(TupleLangParser.ExprIdContext ctx) {
      
      String id = ctx.ID().getText();

      if ( !variables.containsKey(id)){
         fail(String.format("[ERROR] \"%s\" was not declared.",id));
      }

      return variables.get(id); 

   }

   @Override public ArrayList<Double> visitExprAvg(TupleLangParser.ExprAvgContext ctx) {
      ArrayList<Double> target = visit(ctx.expr());
      ArrayList<Double> res = new ArrayList<>();
      
      int size = target.size();
      if (size == 0){
         // return to avoid division by 0
         return res;
      }
      
      double sum = .0;
      for ( Double d : target){
         sum+=d;
      }
      res.add(sum/size);

      return res;
   }

   @Override public ArrayList<Double> visitWhile(TupleLangParser.WhileContext ctx) {
      
      // :)
      double epsilon = 1e-9;

      while ( true ){
         ArrayList<Double> target = visit(ctx.expr());
         if (target.size() == 0) break;

         // check sum: just check if there is any number greater than 0
         boolean stop = false;
         for ( Double d : target){
            if ( d < epsilon){
               stop = true;
               break;
            }
         }
         if (stop) break;
         for ( TupleLangParser.StatContext stat: ctx.stat() )
            visit(stat);
      }

      return null;

   }
}
