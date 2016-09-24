
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int none = 0;
            for (int i = 0; i < line.length(); i++) {
             switch (line.charAt(i)) {
                case 'a':
                    System.out.print("0");
                    none = none + 1;
                    break;
                case 'b':
                    System.out.print("1");
                    none = none + 1;
                    break;
                case 'c':
                    System.out.print("2");
                    none = none + 1;
                    break;
                case 'd':
                    System.out.print("3");
                    none = none + 1;
                    break;
                case 'e':
                    System.out.print("4");
                    none = none + 1;
                    break;
                case 'f':
                    System.out.print("5");
                    none = none + 1;
                    break;
                case 'g':
                    System.out.print("6");
                    none = none + 1;
                    break;
                case 'h':
                    System.out.print("7");
                    none = none + 1;
                    break;
                case 'i':
                    System.out.print("8");
                    none = none + 1;
                    break;
                case 'j':
                    System.out.print("9");
                    none = none + 1;
                    break;
                case '0':
                    System.out.print("0");
                    none = none + 1;
                    break;
                case '1':
                    System.out.print("1");
                    none = none + 1;
                    break;
                case '2':
                    System.out.print("2");
                    none = none + 1;
                    break;
                case '3':
                    System.out.print("3");
                    none = none + 1;
                    break;
                case '4':
                    System.out.print("4");
                    none = none + 1;
                    break;
                case '5':
                    System.out.print("5");
                    none = none + 1;
                    break;
                case '6':
                    System.out.print("6");
                    none = none + 1;
                    break;
                case '7':
                    System.out.print("7");
                    none = none + 1;
                    break;
                case '8':
                    System.out.print("8");
                    none = none + 1;
                    break;
                case '9':
                    System.out.print("9");
                    none = none + 1;
                    break;
            }
        }
        System.out.println("");
        if (none == 0) {
            System.out.println("NONE");
        }

        }
    }
}