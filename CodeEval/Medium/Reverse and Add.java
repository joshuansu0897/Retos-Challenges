import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int contador = 0;
        long num = Integer.parseInt(line);
        long inverso=0, div, resto;
        while (contador >= -1) {
            inverso = 0;
            div = num;
            resto = 0;
            while (div != 0) {
                resto = div % 10;
                div = div / 10;
                inverso = inverso * 10 + resto;
            }
            if ((num == inverso)) {
                break;
            } else {
                num = num + inverso;
                contador++;
            }
        }
        System.out.println(contador + " " + inverso);
        }
    }
}
