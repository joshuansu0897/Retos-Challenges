import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        String numeros[] = line.split(" ");
        int posicion = 0;
        for (int i = 0; i < numeros.length; i++) {
            double futuro = 999999999;
            for (int j = 0; j < numeros.length; j++) {
                if (Double.parseDouble(numeros[j]) < futuro) {
                    futuro = Double.parseDouble(numeros[j]);
                    posicion = j;
                }
            }
            System.out.print(numeros[posicion]+" ");
            numeros[posicion] = "999999999";
        }
        System.out.println();
        }
    }
}
