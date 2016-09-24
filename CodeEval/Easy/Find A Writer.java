
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            line = line.replace(String.valueOf('|'), "AQUIES");
        String []separados=line.split("AQUIES");
        
        String []numeros=separados[1].split(" ");
        
        for (int i = 1; i < numeros.length; i++) {
            System.out.print(separados[0].charAt(Integer.parseInt(numeros[i])-1));
        }
        System.out.println();
        }
    }
}
