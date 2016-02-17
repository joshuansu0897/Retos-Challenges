import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt(), linea1=0,linea2=0;
        int Arreglo[][]= new int [N][N];
        for (int i=0; i<N; i++){
           for (int j=0; j<N; j++){
               Arreglo[i][j]=in.nextInt();
           }
        }
        for (int i=0; i<N; i++){
            linea1=Arreglo[i][i]+linea1;
        }
        for (int i=0; i<N; i++){
            linea2=linea2+Arreglo[i][(N-1)-i];
        }
        int suma=0;
        suma=linea2-linea1;
        System.out.println(Math.abs(suma));
    }
}