import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
        String []separacion=line.split(" ");
        String palabra="";
        for (int i = separacion.length-1; i >= 0; i--) {
            if (palabra.length() <= separacion[i].length()) {
                palabra=separacion[i];
            }
        }
        System.out.println(palabra);
        }
    }
}
