import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        String num[] = line.split(" ");

        for (int i = 1; i <= Integer.parseInt(num[2]); i++) {
            if ((i % Integer.parseInt(num[0]) == 0)&&(i % Integer.parseInt(num[1]) == 0)) {
                System.out.print("FB"+" ");
            } else {
                if (i % Integer.parseInt(num[0]) == 0) {
                    System.out.print("F" + " ");
                }
                if (i % Integer.parseInt(num[1]) == 0) {
                    System.out.print("B" + " ");
                }
            }
            if ((i % Integer.parseInt(num[0]) >= 1) && (i % Integer.parseInt(num[1]) >= 1)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        }
    }
}
