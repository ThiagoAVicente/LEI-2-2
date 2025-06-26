import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TupleLangMain {
   public static void main(String[] args) {
      try {

         for ( String fileName : args ){

            // create a CharStream that reads from standard input:
            CharStream input = CharStreams.fromFileName(fileName);
            // create a lexer that feeds off of input CharStream:
            TupleLangLexer lexer = new TupleLangLexer(input);
            // create a buffer of tokens pulled from the lexer:
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // create a parser that feeds off the tokens buffer:
            TupleLangParser parser = new TupleLangParser(tokens);
            // replace error listener:
            // begin parsing at start rule:
            ParseTree tree = parser.start();
            if (parser.getNumberOfSyntaxErrors() == 0) {
               Interpreter visitor0 = new Interpreter();
               visitor0.visit(tree);
            }
         }
      }
      catch(IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
}
