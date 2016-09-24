import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        String []separados =line.split(" ");
        int []todos= new int [separados.length];
        for (int i = 0; i < separados.length; i++) {
            for (int j = i+1; j < separados.length; j++) {
                if (Integer.parseInt(separados[i])==Integer.parseInt(separados[j])) {
                    todos[i]=Integer.parseInt(separados[i]);
                    break;
                }
            }
        }
        for (int i = 0; i < todos.length; i++) {
            for (int j = i+1; j < todos.length; j++) {
                if (todos[i]==todos[j]) {
                    todos[j]=0;
                }
            }
        }
        for (int i = 0; i < todos.length; i++) {
            if (!(todos[i]==0)) {
                System.out.print(todos[i]+" ");
            }
        }
        System.out.println();
        }
    }
}
