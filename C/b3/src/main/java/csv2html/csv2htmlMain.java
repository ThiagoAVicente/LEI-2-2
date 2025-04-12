import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.ST;

public class csv2htmlMain {
   public static void main(String[] args) {
      try {
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromStream(System.in);
         // create a lexer that feeds off of input CharStream:
         csv2htmlLexer lexer = new csv2htmlLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         csv2htmlParser parser = new csv2htmlParser(tokens);
         // replace error listener:
         //parser.removeErrorListeners(); // remove ConsoleErrorListener
         //parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at program rule:
         ParseTree tree = parser.program();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            valFormat validator = new valFormat();
            int syntaxError = validator.visit(tree);

            if ( syntaxError != 0 ){ System.exit(1); }

            compiler comp = new compiler();
            ST code = comp.visit(tree);

            try
            {
               PrintWriter pw = new PrintWriter(new File("output.html"));
               pw.print(code.render());
               pw.close();
            }
            catch(IOException e)
            {
               System.exit(1);
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
