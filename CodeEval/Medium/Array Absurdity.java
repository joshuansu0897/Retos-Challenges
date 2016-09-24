
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        String sep[]=line.split(";");
        String numero[]=sep[1].split(",");
        String contador="";
        for (int i = 0; i < numero.length; i++) {
            for (int j = i+1; j < numero.length; j++) {
                if (Integer.parseInt(numero[i]) == Integer.parseInt(numero[j])) {
                    contador=numero[i];
                    break;
                }
            }
            if (contador.isEmpty()==false) {
                break;
            }
        }
        System.out.println(contador);
        }
    }
}
