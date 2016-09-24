
import java.io.*;
public class Main {
    
    static boolean esprimo(int n) {
        boolean primo = true;
        for (int i = 2; i < ((n - 1)/2)+1; i++) {
            if (n % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }
    public static void main (String[] args) throws IOException {
        int contador = 0, suma=0;
        int cantidad = 2;
        while (contador <= 1000) {
            if (esprimo(cantidad)) {
                suma +=cantidad;
                contador++;
            }
            cantidad++;
        }
        System.out.println((suma-4));
    }
}
