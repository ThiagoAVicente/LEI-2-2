import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;
/**
* ex6
*/
public class ex6 {


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
                Scanner sc = new Scanner(p);

                String key = sc.next();
                StringBuilder value = new StringBuilder();
                while ( sc.hasNext()) value.append(sc.next()+ " ");

                response.put(key, value.toString());
                sc.close();
            }
            return response;
        }

    public static String traduz(HashMap<String,String> mp, String word){

        StringBuilder contrutor = new StringBuilder();
        if ( mp.containsKey(word) ){

            // resolver recurcivamente o significado da palavra
            Scanner sc = new Scanner(mp.get(word));
            while (sc.hasNext()){
                contrutor.append( traduz(mp, sc.next()) + " " );
            }
            sc.close();

            return contrutor.toString();

        }

        return word;
    }

    public static void main(String[] args) {

        Scanner leitorInput = new Scanner(System.in);
        HashMap<String, String> mp = getMap(leitorInput.next());

        // ler texto
        while ( leitorInput.hasNextLine()){
            Scanner leitorLinha = new Scanner(leitorInput.nextLine());

            while (leitorLinha.hasNext()) {

                String output = traduz(mp,leitorLinha.next());
                output += " ";
                output = output.replaceAll("\\s+"," ");

                System.out.printf("%s",output);
            }
            leitorLinha.close();
            System.out.println();
        }
        leitorInput.close();

    }
}
