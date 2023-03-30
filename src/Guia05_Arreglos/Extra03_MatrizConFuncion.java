/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 */
package Guia05_Arreglos;

import java.util.Scanner;

public class Extra03_MatrizConFuncion {
    private static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Ingrese la dimensión del vector: ");
        int n = entrada.nextInt();
        int [] vector = new int [n];
        
        cargar(vector);
        mostrar(vector);     
    }
    
    //funcion para llenar el vector
    public static void cargar(int [] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*10);
        }
    }
    
    //funcion para mostrar el vector
    public static void mostrar(int[]vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");
            
        }
    }
}
