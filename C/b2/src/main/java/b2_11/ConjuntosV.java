import java.util.HashMap;

@SuppressWarnings("CheckReturnValue")
public class ConjuntosV extends ConjuntosParserBaseVisitor<Conjunto> {

   private HashMap<String,Conjunto> hm = new HashMap<>();

   @Override public Conjunto visitProgram(ConjuntosParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Conjunto visitLinha(ConjuntosParser.LinhaContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Conjunto visitElementoDigito(ConjuntosParser.ElementoDigitoContext ctx) {
      Conjunto c  = new Conjunto();
      c.add(Integer.parseInt(ctx.Digito().getText()));
      return c;
   }

   @Override public Conjunto visitElementoPalavra(ConjuntosParser.ElementoPalavraContext ctx) {
      Conjunto c  = new Conjunto();
      c.add(ctx.Palavra().getText());
      return c;
   }

   @Override public Conjunto visitConjunto(ConjuntosParser.ConjuntoContext ctx) {
      Conjunto c = new Conjunto();
      for ( ConjuntosParser.ElementoConjuntoContext ele: ctx.elementoConjunto()){
         Conjunto temp = visit(ele);
         c = c.union(temp);
      }
      return c;
   }

   @Override public Conjunto visitOperadorVariavel(ConjuntosParser.OperadorVariavelContext ctx) {
      String varName = ctx.Var().getText();

      if ( ! hm.containsKey(varName) ){
         System.err.printf("%s não foi previamente declarado.%n",varName);
         System.exit(1);
      }

      return hm.get(varName);

   }

   @Override public Conjunto visitOperadorConjunto(ConjuntosParser.OperadorConjuntoContext ctx) {
      return visit(ctx.conjunto());
   }

   @Override public Conjunto visitOperacaoParentesis(ConjuntosParser.OperacaoParentesisContext ctx) {
      return visit(ctx.operacao());
   }

   @Override public Conjunto visitOperacaoDiferenca(ConjuntosParser.OperacaoDiferencaContext ctx) {
      Conjunto c1 = visit(ctx.operador(0));
      Conjunto c2 = visit(ctx.operador(1));
      Conjunto res = c1.difference(c2);
      System.out.println("result: "+ res.toString());

      return res;
   }

   @Override public Conjunto visitOperacaoIntercecao(ConjuntosParser.OperacaoIntercecaoContext ctx) {
      Conjunto c1 = visit(ctx.operador(0));
      Conjunto c2 = visit(ctx.operador(1));
      Conjunto res = c1.intersection(c2);
      System.out.println("result: "+ res.toString());

      return res;
   }

   @Override public Conjunto visitOperacaoUniao(ConjuntosParser.OperacaoUniaoContext ctx) {
      Conjunto c1 = visit(ctx.operador(0));
      Conjunto c2 = visit(ctx.operador(1));
      Conjunto res = c1.union(c2);
      System.out.println("result: "+ res.toString());

      return res;
   }

   @Override public Conjunto visitAtribuicao(ConjuntosParser.AtribuicaoContext ctx) {
      Conjunto res = visit(ctx.operador());
      String varName = ctx.Var().getText();
      hm.put(varName,res);

      System.out.println("result: "+ res.toString());

      return null;
   }
}
