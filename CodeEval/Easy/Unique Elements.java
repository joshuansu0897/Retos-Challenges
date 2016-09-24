import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        String[] sep = line.split(",");
        int numero = 0;
        String concatenar = "";
        for (int i = 0; i < sep.length; i++) {
            numero = Integer.parseInt(sep[i]);
            for (int j = i + 1; j < sep.length; j++) {
                if (numero == Integer.parseInt(sep[j])) {
                    sep[j] = "0";
                }
            }
        }
        for (int i = 0; i <= (sep.length - 1); i++) {
            if (!(Integer.parseInt(sep[i]) == 0)) {
                concatenar += sep[i]+",";
            }
        }
        for (int i = 0; i < concatenar.length()-1; i++) {
            System.out.print(concatenar.charAt(i));
        }
        System.out.println();
        }
    }
}
