import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.ST;

public class myMain {
   public static void main(String[] args) {
      try {
         if (args.length == 0) {
            System.err.println("Please provide an input file as a command-line argument.");
            System.exit(1);
         }

         String fileName = args[0];

         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromFileName(fileName);

         // create a lexer that feeds off of input CharStream:
         myLexer lexer = new myLexer(input);

         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);

         // create a parser that feeds off the tokens buffer:
         myParser parser = new myParser(tokens);

         // begin parsing at program rule:
         ParseTree tree = parser.program();
         Validator validator = new Validator();

         // Validate input file
         if (parser.getNumberOfSyntaxErrors() != 0 || validator.visit(tree) != 0)
            System.exit(1);

         Compiler compiler = new Compiler();
         ST code = compiler.visit(tree);


         String outputFileName = fileName.contains(".")
                 ? fileName.substring(0, fileName.lastIndexOf(".")) + ".java"
                 : fileName + ".java";

         String outputClassName = outputFileName.replace(".java","");
         code.add("fileName",outputClassName);

         try
         {
            PrintWriter pw = new PrintWriter(new File("out/"+outputFileName));
            pw.print(code.render());
            pw.close();
         }
         catch(IOException e)
         {
            System.exit(1);
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
