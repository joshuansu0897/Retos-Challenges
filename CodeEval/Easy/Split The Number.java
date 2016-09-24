
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
             int flag = 0;
        String[] sepa = line.split(" ");
        String numeros = sepa[0];
        String letras = sepa[1];
        String[] signo;
        String letras1 = "";
        String letras2 = "";

        if (letras.contains("+")) {
            letras = letras.replace("+", "/");
            signo = letras.split("/");
            letras1 = signo[0];
            letras2 = signo[1];
            flag = 1;
        }
        if (letras.contains("-")) {
            signo = letras.split("-");
            letras1 = signo[0];
            letras2 = signo[1];
            flag = 0;

        }

        String primera = "", segunda = "";
        int suma = 0, primeranum = 0, segundanum=0;
        if (flag == 0) {
            for (int i = 0; i < letras1.length(); i++) {
                primera = primera + numeros.charAt(i);
            }
            primeranum=Integer.parseInt(primera);
            for (int i = letras1.length(); i < numeros.length(); i++) {
                segunda = segunda + numeros.charAt(i);
            }
            segundanum=Integer.parseInt(segunda);
            suma = primeranum - segundanum;

        } else {
            
            for (int i = 0; i < letras1.length(); i++) {
                primera = primera + numeros.charAt(i);
            }
            primeranum=Integer.parseInt(primera);
            for (int i = letras1.length(); i < numeros.length(); i++) {
                segunda = segunda + numeros.charAt(i);
            }
            segundanum=Integer.parseInt(segunda);
            suma = primeranum + segundanum;
        }

        System.out.println(" " + suma);
        }
    }
}
