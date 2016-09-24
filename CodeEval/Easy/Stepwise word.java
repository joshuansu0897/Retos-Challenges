
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        String []sep=line.split(" ");
        String palabra="";
        for (int i = 0; i < sep.length; i++) {
            if (palabra.length()<sep[i].length()) {
                palabra=sep[i];
            }
        }
        int contador=0;
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < contador; j++) {
                System.out.print("*");
            }
            System.out.print(palabra.charAt(i)+" ");
            contador++;
        }
        System.out.println();
        }
    }
}
