import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        String []sep=line.split(" ");
        for (int i = 0; i < sep.length; i++) {
            for (int j = 0; j < sep[i].length(); j++) {
                if (j==0) {
                    System.out.print(String.valueOf(sep[i].charAt(j)).toUpperCase());
                } else{
                    System.out.print(sep[i].charAt(j));
                }
            }
            System.out.print(" ");
        }
        System.out.println();
        }
    }
}
