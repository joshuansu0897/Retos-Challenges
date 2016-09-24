
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        for (int i = 0; i < line.length(); i++) {
            if (line.codePointAt(i)>=97 && line.codePointAt(i)<=102) {
                System.out.print((char)(line.codePointAt(i)+20));
            }
            if (line.codePointAt(i)>=103 && line.codePointAt(i)<=109) {
                System.out.print((char)(line.codePointAt(i)+7));
            }
            
            if (line.codePointAt(i)>=117 && line.codePointAt(i)<=122) {
                System.out.print((char)(line.codePointAt(i)-20));
            }
            if (line.codePointAt(i)>=110 && line.codePointAt(i)<=116) {
                System.out.print((char)(line.codePointAt(i)-7));
            }
        }
        System.out.println();
        }
    }
}
