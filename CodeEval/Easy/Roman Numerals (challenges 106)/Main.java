
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line ="";
        String numeracion = "";
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int line2 = Integer.parseInt(line);
            while((!(line2 <= 0)) && (line2 < 4000)){
             if (line2 >= 1000) {
                numeracion = numeracion + "M";
                line2 = line2 - 1000;
            } else {
                if (line2 >= 900) {
                    numeracion = numeracion + "CM";
                    line2 = line2 - 900;
                }
                if (line2 >= 500) {
                    numeracion = numeracion + "D";
                    line2 = line2 - 500;
                } else {
                    if (line2 >= 400) {
                        numeracion = numeracion + "CD";
                        line2 = line2 - 400;
                    }
                    if (line2 >= 100) {
                        numeracion = numeracion + "C";
                        line2 = line2 - 100;
                    } else {
                        if (line2 >= 90) {
                            numeracion = numeracion + "XC";
                            line2 = line2 - 90;
                        }
                        if (line2 >= 50) {
                            numeracion = numeracion + "L";
                            line2 = line2 - 50;
                        } else {
                            if (line2 >= 40) {
                                numeracion = numeracion + "XL";
                                line2 = line2 - 40;
                            }
                            if (line2 >= 10) {
                                numeracion = numeracion + "X";
                                line2 = line2 - 10;
                            } else {
                                if (line2 == 9) {
                                    numeracion = numeracion + "IX";
                                    line2 = line2 - 9;
                                }
                                if (line2 >= 5 && line2 > 0) {
                                    numeracion = numeracion + "V";
                                    line2 = line2 - 5;
                                } else {
                                    if (line2 == 4) {
                                        numeracion = numeracion + "IV";
                                        line2 = line2 - 4;
                                    }
                                    if (line2 > 0) {
                                        numeracion = numeracion + "I";
                                        line2 = line2 - 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
        }
        
        for (int i = 0; i < numeracion.length(); i++) {
            System.out.print(numeracion.charAt(i));
        }
        System.out.println();
        numeracion="";
        line="";
    }
    }
}