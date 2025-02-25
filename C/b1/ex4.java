import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

/**
 * ex4
 */
public class ex4 {

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
        String[] parts = allInOne.split("[^a-zA-Z]");

        for (String a : parts) {
            if (mp.containsKey(a)) {
                System.out.printf("%s ", mp.get(a));
            }
        }
        System.out.println();
    }
}
