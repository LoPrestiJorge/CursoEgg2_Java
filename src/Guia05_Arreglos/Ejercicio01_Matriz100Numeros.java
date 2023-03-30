/*
Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
package Guia05_Arreglos;

public class Ejercicio01_Matriz100Numeros {
    public static void main(String[] args) {
int[] vector = new int[100];
        
        for(int i=0; i<100; i++){
            vector[i] = (i+1);
        }
        
        for (int i = 99; i > -1; i--) {
            System.out.println("["+ vector[i]+ "]");
        }
    }
}

