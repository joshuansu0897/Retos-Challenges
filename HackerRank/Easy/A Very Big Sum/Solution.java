import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long suma=0;
        int[] Arreglo=new int [N];
        for (int i=0; i<N; i++){
            Arreglo[i]=in.nextInt();
        }
         for (int i=0; i<N; i++){
            suma=suma+Arreglo[i];
        }
        System.out.println(suma);
    }
}