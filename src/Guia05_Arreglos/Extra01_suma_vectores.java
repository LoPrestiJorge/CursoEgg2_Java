/*
Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */
package Guia05_Arreglos;

import java.util.Scanner;

public class Extra01_suma_vectores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la dimensión del vector: ");
        int n = entrada.nextInt();
        int sumaVector = 0;
        
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Ingrese el valor para la posicion [%d] ",i);
            vector[i] = entrada.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
          sumaVector += vector[i];      
        }
        
        System.out.println("La suma de los valores del vector es: "+sumaVector);
    }
}
