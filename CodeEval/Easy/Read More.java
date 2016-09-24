import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        if (line.length() <=55) {
            System.out.println(line);
        }else{
            int posicion=39;
            while(line.charAt(posicion) !=' '){
                posicion--;
                if (posicion==0) {
                    posicion=40;
                    break;
                }
            }
            System.out.println(line.substring(0, posicion)+"... <Read More>");
        }
        }
    }
}