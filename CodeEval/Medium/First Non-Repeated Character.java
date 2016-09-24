import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        for (int i = 0; i < line.length(); i++) {
            int numero=0;
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(i)==line.charAt(j)) {
                    numero++;
                }
            }
            if (numero==1) {
                System.out.println(line.charAt(i));
                break;
            }
        }
        }
    }
}
