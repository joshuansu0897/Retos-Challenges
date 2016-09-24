
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        for (int i = 0; i < line.length(); i++) {
            if (Character.isLowerCase(line.charAt(i))) {
                System.out.print(String.valueOf(line.charAt(i)).toUpperCase());
            }else{
                System.out.print(String.valueOf(line.charAt(i)).toLowerCase());
            }
        }
        System.out.println();
        }
    }
}
