@SuppressWarnings("CheckReturnValue")
public class valFormat extends csv2htmlParserBaseVisitor<Integer> {

   @Override public Integer visitProgram(csv2htmlParser.ProgramContext ctx) {
      int expected = -1;
      int errorCount = 0;
      int line_count = 0;

      for ( csv2htmlParser.LineContext line : ctx.line() ){

         // incrementar linha
         line_count++;

         int sz = visitLine(line);

         if (expected == -1 ){
            expected = sz;
            continue;
         }

         if ( sz != expected ){
            errorCount++;
            System.err.printf("[Error] line %d -- %s%n",line_count,line.getText());
         }

      }

      return errorCount;
   }

   @Override public Integer visitLine(csv2htmlParser.LineContext ctx) {
      return ctx.content().size();
   }
}
