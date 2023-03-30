/*
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido.
 */
package Guia05_Arreglos;

import java.util.Scanner;

public class Ejercicio02_BuscarNumeroVector {

    public static void main(String[] args) {
        int n, numBuscado, contador;
        contador = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        n = entrada.nextInt();
        int vector[] = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10 + 0);
            System.out.print("[" + vector[i] + "]");
        }

        System.out.println("Ingrese el número a buscar entre 0-10: ");
        numBuscado = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            if (vector[i] == numBuscado) {
                System.out.println("El número " + numBuscado + " esta en la posicion " + (i + 1));
                contador++;
            }           
        }
        
        if (contador > 0) {
                System.out.println("el numero " + numBuscado + "está repetido" + contador + "veces");
            } else {
                System.out.println("El numero " + numBuscado + " no ha sido encontrado :(");
            }
        
        for (int i = 0; i < n; i++) {
            System.out.println("[" + vector[i] + "]");
        }
    }
}

        
      
        
        
