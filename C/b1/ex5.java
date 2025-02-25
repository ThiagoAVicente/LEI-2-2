import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

/**
* ex5
*/
public class ex5 {

    private static HashMap<String, String> getMap(String file) {
        // num - string

        String dados = null;
        try {
            dados = new String(Files.readAllBytes(Paths.get(file)));
        } catch (IOException e) {
            System.out.println("Erro ao ler ficheiro");
        }

        String[] parts = dados.split("\n");
        HashMap<String, String> response = new HashMap<String, String>();

        for (String p : parts) {
            String[] subParts = p.split("-");
            response.put(subParts[1].strip(), subParts[0].strip());
        }
        return response;
    }

    public static void main(String[] args) {
        HashMap<String, String> mp = getMap("numbers.txt");
        String allInOne = String.join(" ", args);

        Scanner sc = new Scanner( allInOne.replaceAll("[^a-zA-Z]"," ") );


        int num = 0;
        int prev = 0;
        boolean given = false;

        while (sc.hasNext()) {

            String a = sc.next();

            if (mp.containsKey(a)) {

                // verificar se é o primeiro valor
                if ( !given ){
                    given = true;
                    prev = Integer.parseInt(mp.get(a));
                    continue;
                }

                // verificar descrição
                int curr = Integer.parseInt(mp.get(a));
                if ( curr  > prev ){
                    prev *= curr;
                    continue;
                }

                // adicionar valor ao número final
                num += prev;
                prev = curr;

            }
        }
        sc.close();

        // adicionar último valor salvo
        num += prev;
        System.out.println(num);
    }



}
