
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        line = line.replace(String.valueOf('|'), "A");
        String[] sep = line.split(" A ");
        String []numeros0=sep[0].split(" ");
        String []numeros1=sep[1].split(" ");
        for (int i = 0; i < numeros1.length; i++) {
            System.out.print((Integer.parseInt(numeros0[i])*Integer.parseInt(numeros1[i]))+" ");
        }
        System.out.println();
        }
    }
}
