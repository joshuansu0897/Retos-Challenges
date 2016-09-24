
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        int[][] Arreglo = new int[Integer.parseInt(line)][Integer.parseInt(line)];
        for (int i = 0; i < Integer.parseInt(line); i++) {
            for (int j = 0; j < Integer.parseInt(line); j++) {
                if (j==0 || j==i) {
                    Arreglo[i][j]=1;
                }
                else{
                    Arreglo[i][j]=0;
                }
            }
        }
        for (int i = 1; i < Integer.parseInt(line); i++) {
            for (int j = 1; j < Integer.parseInt(line); j++) {
                Arreglo[i][j]=Arreglo[i-1][j-1]+Arreglo[i-1][j];
            }
        }
        for (int i = 0; i < Integer.parseInt(line); i++) {
            for (int j = 0; j < Integer.parseInt(line); j++) {
                if (Arreglo[i][j] != 0) {
                  System.out.print(Arreglo[i][j]+" ");   
                }
            }
        }
        System.out.println("");
        }
    }
}
