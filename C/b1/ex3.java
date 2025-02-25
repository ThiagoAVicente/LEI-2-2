import java.util.Scanner;
import java.util.Stack;

public class ex3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(String.join(" ", args));
        Stack<Float> s = new Stack<Float>();

        while (scn.hasNext()) {
            String a = scn.next();

            // processar valor
            try {
                Float nw = Float.parseFloat(a);
                s.push(nw);
            } catch (NumberFormatException e) {
                // verificar se é operador

                if (
                    !(a.equals("+") ||
                        a.equals("-") ||
                        a.equals("*") ||
                        a.equals("/"))
                ) {
                    // operador inválido
                    System.out.printf("-->%s<--não é um operador válido.");
                    System.exit(1);
                }

                // verificar se há valores na stack
                if (s.size() < 2) {
                    System.out.println(
                        "Não há valores para realizar a operação."
                    );
                    System.exit(1);
                }

                float n1 = s.pop();
                float n2 = s.pop();
                float result = 0;

                switch (a) {
                    case "+":
                        result = n1 + n2;
                        break;
                    case "-":
                        result = n1 - n2;
                        break;
                    case "*":
                        result = n1 * n2;
                        break;
                    case "/":
                        result = n1 / n2;
                        break;
                }

                s.push(result);
            }
        }
        String r = "";
        while (!s.isEmpty()) {
            Float a = s.pop();
            r = a + " " + r;
        }
        System.out.printf("Stack: [%s]\n", r);

        scn.close();
    }
}
