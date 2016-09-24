import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
        String[] sep = line.split(" ");
        for (int i = 0; i < sep.length; i++) {
            if (sep[i].length() == 5) {
                switch (sep[i]) {
                    case ".----":
                        System.out.print("1");
                        break;
                    case "..---":
                        System.out.print("2");
                        break;
                    case "...--":
                        System.out.print("3");
                        break;
                    case "....-":
                        System.out.print("4");
                        break;
                    case ".....":
                        System.out.print("5");
                        break;
                    case "-....":
                        System.out.print("6");
                        break;
                    case "--...":
                        System.out.print("7");
                        break;
                    case "---..":
                        System.out.print("8");
                        break;
                    case "----.":
                        System.out.print("9");
                        break;
                    case "-----":
                        System.out.print("0");
                        break;
                }
            } else {
                switch (sep[i]) {
                    case ".-":
                        System.out.print("A");
                        break;
                    case "-...":
                        System.out.print("B");
                        break;
                    case "-.-.":
                        System.out.print("C");
                        break;
                    case "-..":
                        System.out.print("D");
                        break;
                    case ".":
                        System.out.print("E");
                        break;
                    case "..-.":
                        System.out.print("F");
                        break;
                    case "--.":
                        System.out.print("G");
                        break;
                    case "....":
                        System.out.print("H");
                        break;
                    case "..":
                        System.out.print("I");
                        break;
                    case ".---":
                        System.out.print("J");
                        break;
                    case "-.-":
                        System.out.print("K");
                        break;
                    case ".-..":
                        System.out.print("L");
                        break;
                    case "--":
                        System.out.print("M");
                        break;
                    case "-.":
                        System.out.print("N");
                        break;
                    case "---":
                        System.out.print("O");
                        break;
                    case ".--.":
                        System.out.print("P");
                        break;
                    case "--.-":
                        System.out.print("Q");
                        break;
                    case ".-.":
                        System.out.print("R");
                        break;
                    case "...":
                        System.out.print("S");
                        break;
                    case "-":
                        System.out.print("T");
                        break;
                    case "..-":
                        System.out.print("U");
                        break;
                    case "...-":
                        System.out.print("V");
                        break;
                    case ".--":
                        System.out.print("W");
                        break;
                    case "-..-":
                        System.out.print("X");
                        break;
                    case "-.--":
                        System.out.print("Y");
                        break;
                    case "--..":
                        System.out.print("Z");
                        break;
                    default:
                        System.out.print(" ");
                        break;
                }
            }

        }
        System.out.println();
        }
    }
}