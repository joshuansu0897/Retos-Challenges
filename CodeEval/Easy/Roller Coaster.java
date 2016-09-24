import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
          Pattern pat = Pattern.compile("[a-zA-Z]");
            int bandera=0;
        for (int i = 0; i < line.length(); i++) {
            Matcher mat = pat.matcher(""+line.charAt(i));
            if (mat.matches()) {
                if (bandera==1) {
                    bandera=0;
                    System.out.print(String.valueOf(line.charAt(i)).toLowerCase());
                }else{
                    bandera=1;
                    System.out.print(String.valueOf(line.charAt(i)).toUpperCase());
                }
            }else{
                System.out.print(line.charAt(i));
            }
        }
        System.out.println();
        }
    }
}
