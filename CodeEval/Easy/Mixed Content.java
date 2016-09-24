import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        String []sep=line.split(",");
        String letras="";
        String numeros="";
        for (int i = 0; i < sep.length; i++) {
            if(sep[i].codePointAt(0)<=57){
                numeros+=sep[i]+",";
            }else{
                letras+=sep[i]+",";
            }
        }
        String letras2="";
        for (int i = 0; i < letras.length()-1; i++) {
            letras2+=letras.charAt(i);
        }
        String numeros2="";
        for (int i = 0; i < numeros.length()-1; i++) {
            numeros2+=numeros.charAt(i);
        }
        if(numeros2.isEmpty()){
            System.out.println(letras2);
        }
        if (letras2.isEmpty()) {
            System.out.println(numeros2);
        }
        if (!(letras2.isEmpty()) && !(numeros2.isEmpty())) {
            System.out.println(letras2+"|"+numeros2);
        }
        }
    }
}