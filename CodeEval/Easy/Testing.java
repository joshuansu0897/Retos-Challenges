
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        line = line.replace(String.valueOf('|'), "&");
        String sep[]=line.split(" & ");
        int contador=0;
        for (int i = 0; i < sep[0].length(); i++) {
            if (sep[0].charAt(i)!= sep[1].charAt(i)) {
                contador++;
            }
        }
        if (contador==0) {
            System.out.println("Done");
        } else {
            if (contador <= 2) {
                System.out.println("Low");
            }else{
                if (contador <= 4) {
                    System.out.println("Medium");
                }else{
                    if (contador <= 6) {
                        System.out.println("High");
                    }else{
                        System.out.println("Critical");
                    }
                }
            }
        }
        }
    }
}
