import org.stringtemplate.v4.*;
import java.util.*;

@SuppressWarnings("CheckReturnValue")
public class Compiler extends myParserBaseVisitor<ST> {

   STGroup group = new STGroupFile("calculator.stg");
   private int varId_counter = 0;
   private final HashMap<String, String> namesAssociations = new HashMap<>();
   private String lastVar = null;

   private String varNameGen() {
      return "var" + (++varId_counter);
   }

   private String varNameGen(String given) {
      return "var" + given;
   }

   @Override
   public ST visitProgram(myParser.ProgramContext ctx) {
      ST main = group.getInstanceOf("main");
      List<String> lines = new ArrayList<>();
      for (var lineCtx : ctx.line()) {
         lines.add(visit(lineCtx).render());
      }
      main.add("lines", lines);
      return main;
   }

   @Override
   public ST visitLine(myParser.LineContext ctx) {
      if (ctx.assign() != null) return visit(ctx.assign());
      if (ctx.expr() != null) return visit(ctx.expr());
      if (ctx.print() != null) return visit(ctx.print());
      return new ST(""); // empty line
   }

   @Override
   public ST visitAssign(myParser.AssignContext ctx) {

      ST exprSolve = visit(ctx.expr());
      String value = lastVar;

      String outputVarName = varNameGen(ctx.VarName().getText());

      ST response = null;
      if ( namesAssociations.containsKey(ctx.VarName().getText()) ){
         response = group.getInstanceOf("valueChange");
      }else{
         response = group.getInstanceOf("declarationCopy");
         namesAssociations.put(ctx.VarName().getText(),outputVarName);
      }

      response.add("block",exprSolve.render());
      response.add("varName",outputVarName);
      response.add("value",value);

      lastVar = null;
      return response;
   }

   @Override
   public ST visitIntegerExpr(myParser.IntegerExprContext ctx) {
      ST res = group.getInstanceOf("tempDeclaration");
      String varName = varNameGen();
      res.add("varName",varName);
      res.add("value",ctx.Integer().getText());
      this.lastVar = varName;

      return res;
   }

   @Override
   public ST visitVariableExpr(myParser.VariableExprContext ctx) {
      this.lastVar = namesAssociations.get(ctx.VarName().getText());
      return new ST("");
   }

   @Override public ST visitParentesisExpr(myParser.ParentesisExprContext ctx) {
      return visit(ctx.expr());
   }

   @Override public ST visitBinaryExpr(myParser.BinaryExprContext ctx) {
      // visit operators
      ST left = visit(ctx.expr(0));
      String leftResult = lastVar;

      ST right = visit(ctx.expr(1));
      String rightResult = lastVar;

      ST block = group.getInstanceOf("block");

      List<String> pre = new ArrayList<>();
      pre.add(left.render());
      pre.add(right.render());
      block.add("lines",pre);

      ST operation = group.getInstanceOf("operation");
      String varName = varNameGen();
      operation.add("varName",varName);
      operation.add("var1",leftResult);
      operation.add("var2",rightResult);
      operation.add("op",ctx.op.getText());
      operation.add("block",block.render());

      lastVar = varName; // update last var
      return operation;
   }

   @Override public ST visitSignalExpr(myParser.SignalExprContext ctx) {
      ST exprResolution = visit(ctx.expr());
      String varName = lastVar;

      ST response = group.getInstanceOf("valueChange");

      response.add("varName",lastVar);
      response.add("value",String.format("%s.multiply(BigInteger.valueOf(-1))",lastVar));
      response.add("block",exprResolution.render());

      // lastVar is still on the same name
      return response;
   }

   @Override
   public ST visitPrint(myParser.PrintContext ctx) {
      ST exprResolution = visit(ctx.expr());
      String varName = lastVar;

      ST response = group.getInstanceOf("print");
      response.add("value", varName);
      response.add("label", ctx.expr().getText());
      response.add("block",exprResolution.render());

      return response;
   }
}
