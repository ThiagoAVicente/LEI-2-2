import org.stringtemplate.v4.*;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("CheckReturnValue")
public class compiler extends csv2htmlParserBaseVisitor<ST> {
   STGroup group = null;

   @Override public ST visitProgram(csv2htmlParser.ProgramContext ctx) {
      // ler ficheiro de módulos
      group = new STGroupFile("modules.stg");

      ST res = group.getInstanceOf("htmlTable");
      List<String> rows = new ArrayList<>();

      // processar header
      ST header = group.getInstanceOf("htmlRow");
      List<String> header_cells = new ArrayList<>();
      for ( csv2htmlParser.ContentContext cell : ctx.line(0).content() ){
         ST headerCell = group.getInstanceOf("htmlHeadCell");
         headerCell.add("content",cell.Content().getText());
         header_cells.add(headerCell.render());
      }
      header.add("cells",header_cells);

      rows.add(header.render());

      // processar outras linhas
      for (int i = 1; i < ctx.line().size(); ++i){
         ST row = visitLine(ctx.line(i));
         rows.add(row.render());
      }
      res.add("rows",rows);
      return res;
   }

   @Override public ST visitLine(csv2htmlParser.LineContext ctx) {
      ST res = group.getInstanceOf("htmlRow");
      List<String> temp = new ArrayList<>();

      for ( csv2htmlParser.ContentContext cont : ctx.content()){
         temp.add(visitContent(cont).render());
      }

      res.add("cells",temp);
      return res;
   }



   @Override public ST visitContent(csv2htmlParser.ContentContext ctx) {
      ST res = group.getInstanceOf("htmlCell");
      res.add("content",ctx.Content().getText());
      return res;
   }
}
