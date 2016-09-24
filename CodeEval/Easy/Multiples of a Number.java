import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        String sep[]=line.split(",");
        for (int i = 0; i < Integer.parseInt(sep[0]); i++) {
            if (Integer.parseInt(sep[0]) <= (Integer.parseInt(sep[1])*i)) {
                System.out.println(Integer.parseInt(sep[1])*i);
                break;
            }
        }
        }
    }
}