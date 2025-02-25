import java.util.Scanner;

/**
* ex7
*/

class ExpressionTree{

    String value;
    boolean isVal = false;
    boolean isOp = false;

    // subarvore
    private ExpressionTree leftTree = null;
    private ExpressionTree rightTree = null;

    private ExpressionTree(String val){

        // verificar se nó é um valor ou uma operação
        try{
            Double.parseDouble(val);
            isVal = true;
        }
        catch( NumberFormatException e){
            isOp = true;
        }

        value = val;
    }

    public static ExpressionTree create( String input){

        Scanner in = new Scanner(input);
        ExpressionTree response = createPrefix( in );
        in.close();
        return response;
    }
    private static ExpressionTree createPrefix(Scanner in){

        if (!in.hasNext()) {
            return null;
        }

        String token = in.next();
        ExpressionTree node = new ExpressionTree(token);

        if (node.isOp) {
            if ( in.hasNext() ){
                node.leftTree = createPrefix(in);
            }else{
                System.err.println("Sintaxe inválida");
            }

            if ( in.hasNext() ){
                node.rightTree = createPrefix(in);
            }else{
                System.err.println("Sintaxe inválida");
            }
        }

        return node;
    }

    public void printInfix(){
        // pressupõe uma validação previa

        if ( this.isVal ){
            // se for valor só é necessário imprimir o valor
            System.out.print(value + " ");
            return;
        }

        // arvore da esquerda
        System.out.print("(");
        leftTree.printInfix();
        // nó atual
        System.out.print(value + " ");
        // árvore da direita
        rightTree.printInfix();
        System.out.print(")");

    }

    public double eval(){

        if ( isVal ){ // é um valor
            return Double.parseDouble(value);
        }

        double leftValue = leftTree.eval();
        double rightValue = rightTree.eval();

        switch( value ){
            case "+":
                return leftValue + rightValue;
            case "-":
                return leftValue - rightValue;
            case "*":
                return leftValue * rightValue;
            case "/":
                return leftValue / rightValue;
            default:
                throw new UnsupportedOperationException("Operador desconhecido "+ value);
        }
    }

}

public class ex7 {

    public static void main(String[] args) {

        Scanner leitorInput = new Scanner(System.in);

        StringBuilder allInOne = new StringBuilder();
        while ( leitorInput.hasNext() )allInOne.append(leitorInput.next()+" ");

        ExpressionTree et = ExpressionTree.create(allInOne.toString());
        
        // dsplay da operação
        et.printInfix();
        System.out.println();
        
        // resolver
        System.out.printf("Resultado: %f",et.eval());

    }

}
