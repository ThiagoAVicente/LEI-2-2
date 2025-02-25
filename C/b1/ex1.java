import java.util.Scanner;
import java.util.regex.*;

public class ex1 {

    public static void main(String[] args) {
        // ler inputs usando regex e resolver operações
        // ^\d+\s*[\+\-\*\/]\s*\d+$

        Scanner scn = new Scanner(System.in);

        // regex para avaliar input
        String regex =
            "^\\b\\d+(\\.\\d+)?\\s*[\\+\\-\\*\\/]\\s*\\d+(\\.\\d+)?\\b$";
        Pattern pattern = Pattern.compile(regex);

        // receber input
        while (2 > 1) {
            String input = scn.nextLine();
            if (input.strip().equals("q")) {
                break;
            }

            Matcher matcher = pattern.matcher(input.strip());

            // verificar se expressão é válida
            if (matcher.matches()) {
                // separar por partes
                String[] parts = input.split("[\\+\\-\\*\\/]");
                float n1 = Float.parseFloat(parts[0].strip());
                float n2 = Float.parseFloat(parts[1].strip());
                char operator = input
                    .replaceAll("[^\\+\\-\\*\\/]", "")
                    .charAt(0);

                float result = 0;

                // calcular resultado
                switch (operator) {
                    case '+':
                        result = n1 + n2;
                        break;
                    case '-':
                        result = n1 - n2;
                        break;
                    case '*':
                        result = n1 * n2;
                        break;
                    case '/':
                        result = n1 / n2;
                        break;
                }

                System.out.println("Resultado: " + result);
            } else {
                System.out.println(
                    "Expressão inválida. A expressão precisa conter <número><operador[+-*/] ><número> "
                );
            }
        }

        scn.close();
    }
}
