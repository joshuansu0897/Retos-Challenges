import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
        line=line.replace(" | ", "A");
        String cadena = null;
        String separado[]=line.split("A");
        String numeros[]=separado[0].split(" ");
        int X=0;
        while(X < Integer.parseInt(separado[1])){
        for (int i = 0; i < numeros.length; i++) {
            if (Integer.parseInt(String.valueOf(numeros[i])) > Integer.parseInt(String.valueOf(numeros[i+1]))) {
                String guarda=numeros[i+1];
                numeros[i+1]=numeros[i];
                numeros[i]=guarda;
                break;
            }
        }
        X++;
        }
        for (int i = 0; i < numeros.length; i++) {
            if (i==(numeros.length-1)) {
                System.out.println(numeros[i]);
            }else{
                System.out.print(numeros[i]+" ");
            }
        }
            
        }
    }
}
