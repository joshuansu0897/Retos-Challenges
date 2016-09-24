import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        line = line.trim();
        String[] sep = line.split(" ");
        String palabra = sep[0];
        String bin = sep[1];
        //Integer.parseInt(String.valueOf(bin))
        for (int i = 0; i < palabra.length(); i++) {
            if ( bin.charAt(i) == '1') {
                System.out.print(String.valueOf(palabra.charAt(i)).toUpperCase());
            } 
            else 
            {
                System.out.print(String.valueOf(palabra.charAt(i)).toLowerCase());

            }
        }
        System.out.println("\n");
        }
    }
}