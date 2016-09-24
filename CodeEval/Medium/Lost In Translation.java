
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
        for (int i = 0; i < line.length(); i++) {
            switch(line.charAt(i)){
                case 'a':
                    System.out.print("y");
                    break;
                case 'b':
                    System.out.print("h");
                    break;
                case 'c':
                    System.out.print("e");
                    break;
                case 'd':
                    System.out.print("s");
                    break;
                case 'e':
                    System.out.print("o");
                    break;
                case 'f':
                    System.out.print("c");
                    break;
                case 'g':
                    System.out.print("v");
                    break;
                case 'h':
                    System.out.print("x");
                    break;
                case 'i':
                    System.out.print("d");
                    break;
                case 'j':
                    System.out.print("u");
                    break;
                case 'k':
                    System.out.print("i");
                    break;
                case 'l':
                    System.out.print("g");
                    break;
                case 'm':
                    System.out.print("l");
                    break;
                case 'n':
                    System.out.print("b");
                    break;
                case 'o':
                    System.out.print("k");
                    break;
                case 'p':
                    System.out.print("r");
                    break;
                case 'q':
                    System.out.print("z");
                    break;
                case 'r':
                    System.out.print("t");
                    break;
                case 's':
                    System.out.print("n");
                    break;
                case 't':
                    System.out.print("w");
                    break;
                case 'u':
                    System.out.print("j");
                    break;
                case 'v':
                    System.out.print("p");
                    break;
                case 'w':
                    System.out.print("f");
                    break;
                case 'x':
                    System.out.print("m");
                    break;
                 case 'y':
                    System.out.print("a");
                    break;
                 case 'z':
                    System.out.print("q");
                    break;
                default:
                    System.out.print(line.charAt(i));
                    break;
            }
        }
        System.out.println();
        }
    }
}