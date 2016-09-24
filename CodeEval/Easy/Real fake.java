import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        int suma = 0;
        int espacio = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != ' ') {
                if (espacio == 0) {
                    suma+=Integer.parseInt(String.valueOf(line.charAt(i)))*2;
                    espacio=1;
                } else {
                    espacio=0;
                    suma+=Integer.parseInt(String.valueOf(line.charAt(i)));
                }
            } else {
                espacio = 0;
            }
        }
        if (suma%10 == 0) {
            System.out.println("Real");
        }else{
            System.out.println("Fake");
        }
        }
    }
}
