import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        String[] sep = line.split(",");
        String[] palabras = sep[0].split(" ");
        for (int i = 0; i < sep[1].length(); i++) {
            for (int j = 0; j < palabras.length; j++) {
                palabras[j] = palabras[j].replace(sep[1].charAt(i), ' ');
            }
        }
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras[i].length(); j++) {
                if (palabras[i].charAt(j) == ' ') {
                } else {
                    System.out.print(palabras[i].charAt(j));
                }
            }
            System.out.print(" ");
        }
        System.out.println("");
        }
    }
}
