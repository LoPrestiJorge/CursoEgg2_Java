/*
Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
 */
package Guia05_Arreglos;

import java.util.Scanner;

public class Extra05_sumaDeMatrices {
    public static void main(String[] args) {
        int n, m;
        int suma = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la fila de la matriz: ");
        n = entrada.nextInt();
        
        System.out.println("Ingrese el tamaño de la columna de la matriz: ");
        m = entrada.nextInt();
        
        int matriz[][] = new int [n][m];
        
        //llenamos la matriz.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz [i][j] = (int) (Math.random()*10);
            }          
        }
        
        //sumamos los valores 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += matriz[i][j];
            }          
        }
        System.out.println("La suma es: "+suma);
        //mostramos la matriz en pantalla
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("\t"+matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
