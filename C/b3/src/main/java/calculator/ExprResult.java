import org.stringtemplate.v4.*;

public class ExprResult {
    ST code;             // ST containing all the lines generated for this expression
    String lastVarName;  // the name of the variable holding the result

    ExprResult(ST code, String lastVarName) {
        this.code = code;
        this.lastVarName = lastVarName;
    }
}