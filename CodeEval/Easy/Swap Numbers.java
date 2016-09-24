import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        String []sep=line.split(" ");
        char palabra2='0';
        for (int i = 0; i < sep.length; i++) {
            palabra2=sep[i].charAt(sep[i].length()-1);
            sep[i]= sep[i].replaceFirst(String.valueOf(sep[i].charAt(sep[i].length()-1)), String.valueOf(sep[i].charAt(0)));
            sep[i]= sep[i].replaceFirst(String.valueOf(sep[i].charAt(0)), String.valueOf(palabra2));
            System.out.print(sep[i]+" ");
        }
        System.out.println();
        }
    }
}
