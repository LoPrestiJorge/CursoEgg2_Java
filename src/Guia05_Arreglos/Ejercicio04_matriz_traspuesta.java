/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
2
 */
package Guia05_Arreglos;

import java.util.Scanner;

public class Ejercicio04_matriz_traspuesta {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int)(Math.random()*(10+0));
            }
        }
        
        System.out.println("Matriz con los números aleatorios: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                System.out.print("["+ matriz[i][j]+"]");
            }
            System.out.println("");
        }

        System.out.println("Matriz traspuesta: ");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                
                System.out.print("["+ matriz[i][j]+"]");
            }
            System.out.println("");
        }
    } 
}
