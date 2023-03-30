/*
Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
 */
package Guia05_Arreglos;

import java.util.Scanner;

public class Extra02_VectoresEquivalentes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores (tienen que ser iguales): ");
        int n = entrada.nextInt();
        int [] vector1 = new int[n];
        int [] vector2 = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Ingrese los valores del vector 1 para la posicion: [%d] ",i);
            vector1[i] = entrada.nextInt();    
        }
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Ingrese los valores del vector 2 para la posicion: [%d] ",i);
            vector2[i] = entrada.nextInt();   
        }
        
        boolean iguales = true;
        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]){
                iguales = false;
                break;
            }
    
        }
        
        if (iguales){
            System.out.println("Los vectores son iguales.");
        }else {
            System.out.println("Los vectores son distintos.");
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print("["+vector1[i]+"]");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print("["+vector2[i]+"]");    
        }
    }
}
