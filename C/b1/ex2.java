import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.*;

public class ex2 {

    private static Float getValue(String s, HashMap<String, Float> m) {
        // verifica se s é um número ou se é uma entrada de m
        // retorna null se não se verifica nenhuma das condições anteriores

        float v;
        try {
            v = Float.parseFloat(s);
        } catch (NumberFormatException e) {
            if (!m.containsKey(s)) {
                System.out.printf(
                    "-->%s<-- não foi declarado previamente.\n",
                    s
                );
                return null;
            }

            v = m.get(s);
        }

        return v;
    }

    public static void main(String[] args) {
        // ler inputs usando regex e resolver operações
        // ^\d+\s*[\+\-\*\/]\s*\d+$

        HashMap<String, Float> array_associativo = new HashMap<String, Float>();
        Scanner scn = new Scanner(System.in);

        // regex para avaliar input
        String regex =
            "^\\b(\\d+(\\.\\d+)?|\\w+)\\s*[\\+\\-\\*\\/]\\s*(\\d+(\\.\\d+)?|\\w+)\\b$"; // alterar regex para permitir strings como nome de variaveis
        Pattern pattern = Pattern.compile(regex);

        String atribuicao_r = "^\\b\\w+\\s*=\\s*(\\d+(\\.\\d+)?|\\w+)";
        Pattern atribuicao_p = Pattern.compile(atribuicao_r);

        Matcher matcher;

        // receber input
        while (2 > 1) {
            String input = scn.nextLine();
            if (input.strip().equals("q")) {
                break;
            }

            // atribuição
            matcher = atribuicao_p.matcher(input.strip());
            if (matcher.matches()) {
                String[] parts = input.split("=");
                String var = parts[0].strip();
                String val = parts[1].strip();
                Float v;

                // validar nome da varivel
                if (!Character.isLetter(var.charAt(0))) {
                    System.out.printf(
                        "-->%s<-- nome inválido, primeira letra precisa ser uma letra.\n",
                        var
                    );
                    continue;
                }

                // validar valor atribuido
                v = getValue(val, array_associativo);
                if (v == null) {
                    continue;
                }

                array_associativo.put(var, v);

                continue; // proxima iteração
            }

            // operação
            matcher = pattern.matcher(input.strip());

            // verificar se expressão é válida
            if (matcher.matches()) {
                // separar por partes
                String[] parts = input.split("[\\+\\-\\*\\/]");
                String a = parts[0].strip();
                String b = parts[1].strip();

                Float n1;
                Float n2;

                // validar a
                n1 = getValue(a, array_associativo);
                if (n1 == null) {
                    continue;
                }

                // validar b
                n2 = getValue(b, array_associativo);
                if (n2 == null) {
                    continue;
                }

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
