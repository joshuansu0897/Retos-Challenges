
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        String binario = Integer.toBinaryString(Integer.parseInt(line));
        int contador=0;
        for (int i = 0; i < binario.length(); i++) {
            if (binario.charAt(i)=='1') {
                contador++;
            }
        }
        System.out.println(contador);
        }
    }
}
