
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
        String[] sep = line.split(";");
        String palabra = sep[0];
        String[] palabraseparadas = palabra.split(" ");
        String numeros = sep[1];
        String[] numeroseparados = numeros.split(" ");
        String[] numeroscompletos = new String[palabraseparadas.length];
        if (numeroseparados.length != numeroscompletos.length) {
            for (int i = 1; i <= numeroscompletos.length; i++) {
                for (int j = 0; j < numeroseparados.length; j++) {
                    if (i==Integer.parseInt(numeroseparados[j])) {
                        break;
                    }
                    if (i != Integer.parseInt(numeroseparados[j]) && j==(numeroseparados.length-1)) {
                        numeroscompletos[numeroscompletos.length-1]=""+i; 
                    }
                }
            }
            for (int i = 0; i < numeroseparados.length; i++) {
                numeroscompletos[i]=numeroseparados[i];
            }
        }else{
            for (int i = 0; i < numeroseparados.length; i++) {
                numeroscompletos[i]=numeroseparados[i];
            }
        }
        for (int i = 1; i <= numeroscompletos.length; i++) {
            for (int j = 0; j < numeroscompletos.length; j++) {
                if (i == Integer.parseInt(numeroscompletos[j])) {
                    System.out.print(palabraseparadas[j]+" ");
                }
            }
        }
        System.out.println();
        }
    }
}
