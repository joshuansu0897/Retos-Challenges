import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int contador= 0;
            for (int i = 0; i < line.length()-4; i++ ) {
              if (line.substring(i, i+5).equals("<--<<") || line.substring(i, i+5).equals(">>-->")) {
                contador++;
              }
            }
            System.out.println(contador);
        }
    }
}
