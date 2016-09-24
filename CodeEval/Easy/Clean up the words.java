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
        Pattern pat = Pattern.compile("[^a-zA-Z]");
        Matcher mat = pat.matcher(line);
        line = mat.replaceAll(" ");
        String palabra="";
        int espacio=0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != ' ') {
                espacio=1;
                palabra+=line.charAt(i);
            }
            if (line.charAt(i) == ' ' && espacio==1) {
                palabra+=" ";
                espacio=0;
            }
        }
        System.out.println(palabra.toLowerCase());
        }
    }
}
