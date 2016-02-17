import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int suma=0;
        int Arreglo[] = new int [N];
        for(int i =0; i<N; i++){
          Arreglo[i] = in.nextInt();  
        }   
        for (int i=0; i<N; i++){
            suma=Arreglo[i]+suma;
        }
        System.out.println(suma);
    }
}