import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        String []sep=line.split(" ");
        int bandera=0;
        for (int i = sep.length-1; i > -1; i--) {
            if (bandera==Integer.parseInt(sep[sep.length-1])) {
            System.out.println(sep[i]);
            }
            bandera++;
        }
        }
    }
}
