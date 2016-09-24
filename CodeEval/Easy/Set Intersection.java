
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
        String imprime="";
        String separado[] = line.split(";");
        String parte1[] = separado[0].split(",");
        String parte2[] = separado[1].split(",");
        for (int i = 0; i < parte1.length; i++) {
            for (int j = 0; j < parte2.length; j++) {
                if (Integer.parseInt(parte1[i]) == Integer.parseInt(parte2[j])) {
                    imprime+=parte1[i] + ",";
                }
            }
        }
        for (int i = 0; i < (imprime.length()-1); i++) {
            System.out.print(imprime.charAt(i));
        }
        System.out.println();
        }
    }
}
