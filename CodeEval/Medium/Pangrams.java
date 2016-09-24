
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        for (int i = 0; i < line.length(); i++) {
            if (Character.isUpperCase(line.charAt(i))) {
                line = line.replaceFirst(String.valueOf(line.charAt(i)), String.valueOf(line.charAt(i)).toLowerCase());
            }
        }
        String abc="abcdefghijklmnopqrstuvwxyz";
        int contador=0;
        for (int i = 0; i < abc.length(); i++) {
            for (int j = 0; j < line.length(); j++) {
                if (abc.charAt(i)==line.charAt(j)) {
                    break;
                }
                if (abc.charAt(i)!=line.charAt(j) && j==(line.length()-1)) {
                    System.out.print(abc.charAt(i));
                    contador++;
                }
            }
        }
        if (contador == 0) {
            System.out.print("NULL");
        }
        System.out.println();
        }
    }
}