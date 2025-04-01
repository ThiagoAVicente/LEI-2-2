import java.util.HashMap;
import java.util.Map;


@SuppressWarnings("CheckReturnValue")
public class QuestionVisi extends perguntasGrammarBaseVisitor<String> {

   HashMap<String, Pergunta> hm = new HashMap<>();
   private boolean isCorrect = false;

   @Override public String visitProgram(perguntasGrammarParser.ProgramContext ctx) {
      String res = null;
      visitChildren(ctx);

      System.out.printf("Foram feitas %d perguntas:%n",hm.size());
      for ( Map.Entry<String, Pergunta> entry  : hm.entrySet()){
         System.out.printf("Id: %s. Pergunta: %s.%n",entry.getKey(), entry.getValue().getText());
      }

      return null;
   }

   @Override public String visitLine(perguntasGrammarParser.LineContext ctx) {
      return visitChildren(ctx);
   }

   @Override public String visitOpcao(perguntasGrammarParser.OpcaoContext ctx) {
      String ques = ctx.TextoMultilinha().getText();
       isCorrect = visit(ctx.cotacao()).charAt(0) == 'T';
      return ques;
   }

   @Override public String visitPergunta(perguntasGrammarParser.PerguntaContext ctx) {

      String id = ctx.Texto().getText();

      Pergunta p = new Pergunta(id, ctx.TextoMultilinha().getText());
      for ( perguntasGrammarParser.OpcaoContext c : ctx.opcao() ){
         // visitar cada opção e adicionar à pergunta
         String ques = visit(c);
         p.addOption(ques,isCorrect);
         isCorrect = false; // resetar flag

      }
      hm.put(id,p);
      return null;
   }

   @Override public String visitCotacao0(perguntasGrammarParser.Cotacao0Context ctx) {
      return "F";
   }

   @Override public String visitCotacao100(perguntasGrammarParser.Cotacao100Context ctx) {
      return "T";
   }
}
