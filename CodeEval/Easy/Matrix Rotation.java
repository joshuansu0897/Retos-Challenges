
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        String letras="";
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) !=' ') {
                letras+=line.charAt(i);
            }
        }
        String [][]orden=new String [(int)(Math.sqrt(letras.length()))][(int)(Math.sqrt(letras.length()))];
        int R=0;
        for (int i = 0; i < orden.length; i++) {
            for (int j = 0; j < orden.length; j++) {
                orden[i][j]=String.valueOf(letras.charAt(R));
                R++;
            }
        }
        for (int i = 0; i < orden.length; i++) {
            for (int j = orden.length-1; j > -1; j--) {
                System.out.print(orden[j][i]+" ");
            }
        }
        System.out.println();
        }
    }
}