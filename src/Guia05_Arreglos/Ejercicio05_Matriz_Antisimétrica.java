/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package Guia05_Arreglos;

import java.util.Scanner;

public class Ejercicio05_Matriz_Antisimétrica {
    private static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese la dimensión de la matriz: ");
        int n = entrada.nextInt();
        
        while (n <= 1) {
            System.out.println("Error. Ingrese un número mayor a 1: ");
            n = entrada.nextInt();     
        }
        
        int[][] matriz = new int [n][n];
        cargar(matriz); //funcion para cargar la matriz.
        comprobar(matriz); //funcion para comprobar la matriz si es antisimetrica.
        mostrar(matriz); //muestra los valores.
        
    }
    
//---------------------------funcion cargar ------------------------------------
    public static void cargar(int[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("Ingrese el valor para la posición [%d] [%d] ", i, j);  //printf cambia el formato de la lectura 
                matriz[i][j] = entrada.nextInt();
            }    
        }
    }  
//----------------------------funcion comprobar---------------------------------
    public static void comprobar(int[][]matriz){
     boolean log = true;   
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] != -matriz [j][i]){                  //acordate de agregar "menos" por la fórmula.
                    log = false; 
                }   
            }    
        } 
        
        if (log){
            System.out.println("La matriz es antisimétrica.");
        }else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }
//----------------------------funcion mostrar----------------------------------   
  public static void mostrar(int[][]matriz){
    System.out.println("Matriz con los números seleccionados: ");
      for (int i = 0; i < matriz.length; i++) {
          for (int j = 0; j < matriz.length; j++) {
              System.out.print("["+matriz[i][j]+"]");
            }
          System.out.println("");
        }
      
      System.out.println("Matriz traspuesta: ");
      
      for (int j = 0; j < matriz.length; j++) {
          for (int i = 0; i < matriz.length; i++) {
              System.out.print("["+matriz[i][j]+"]");
            }
          System.out.println("");
        }
  }
}
