import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        if (Integer.parseInt(line)<0 || Integer.parseInt(line)>100) {
            System.out.println("This program is for humans");
        } else if(Integer.parseInt(line)>=0 && Integer.parseInt(line)<=2){
            System.out.println("Still in Mama's arms");
        } else if (Integer.parseInt(line)>=3 && Integer.parseInt(line)<=4){
            System.out.println("Preschool Maniac");
        } else if (Integer.parseInt(line)>=5 && Integer.parseInt(line)<=11){
            System.out.println("Elementary school");
        } else if (Integer.parseInt(line)>=12 && Integer.parseInt(line)<=14){
            System.out.println("Middle school");
        } else if (Integer.parseInt(line)>=15 && Integer.parseInt(line)<=18){
            System.out.println("High school");
        } else if (Integer.parseInt(line)>=19 && Integer.parseInt(line)<=22){
            System.out.println("College");
        } else if (Integer.parseInt(line)>=23 && Integer.parseInt(line)<=65){
            System.out.println("Working for the man");
        } else if (Integer.parseInt(line)>=66 && Integer.parseInt(line)<=100){
            System.out.println("The Golden Years");
        }
        }
    }
}
