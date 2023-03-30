/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package Guia05_Arreglos;

import java.util.Scanner;

public class Ejercicio06_Cuadradomágico {
   public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        
        // Llenar la matriz
        System.out.println("Ingresa los valores para llenar la matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        
        // Imprimir la matriz
        System.out.println("El cuadrado ingresado es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }
        
        // Verificar si es un cuadrado mágico
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            int sumaColumna = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
                if (i == j) {
                    sumaDiagonal1 += matriz[i][j];
                }
                if (i == 2 - j) {
                    sumaDiagonal2 += matriz[i][j];
                }
            }
            if (sumaFila != sumaColumna) {
                System.out.println("No es un cuadrado magico.");
                return;
            }
        }
        if (sumaDiagonal1 != sumaDiagonal2) {
            System.out.println("No es un cuadrado magico.");
            return;
        }
        System.out.println("Es un cuadrado mágico.");
    }

} 
 
    /*   
    private static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[][]matriz = new int [3][3];
        
        cargar(matriz);
        comprobar(matriz);
        mostrar(matriz);
    }
    //----------------------funcion de carga---------------------------------
    
    public static void cargar(int[][]matriz){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Ingrese el valor para la posición [%d][%d] ",i,j);
                matriz[i][j] = entrada.nextInt();
            }
            System.out.println("");
        }
    }
    
    //-----------------------funcion comprobar------------------------------
    
    public static void comprobar(int[][]matriz){
        int sumaFila = 0;
        int sumaColumna = 0; 
        int diagonalPrincipal[] = new int[matriz.length];
        int diagonalSecundaria[] = new int[matriz.length];
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;
        int cont = 0;
        int cont1 = 0;
                
        
        
        //suma de las columnas y filas, uso de vectores para las diagonales.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
                     
                if (sumaFila == sumaColumna){
                    cont++;
                }
                
                if (i==j){
                    diagonalPrincipal[i] = matriz[i][j];
                }
                
                if ((i+j) == matriz.length - 1){                //Asi se ingresa los valores de una diagonal secundaria.                        
                    diagonalSecundaria[i]= matriz[i][j];
                }    
            }      
        } 
        
        System.out.println("La suma de las filas: "+sumaFila+"\n"
                +"La suma de las columnas: "+sumaColumna);
        
        //suma de las diagonales
        for (int i = 0; i < diagonalPrincipal.length; i++) {
            sumaDiagonalPrincipal += diagonalPrincipal[i];    
        }
        
        for (int i = 0; i < diagonalSecundaria.length; i++) {
            sumaDiagonalSecundaria += diagonalSecundaria[i];
        }
        
        if (sumaDiagonalPrincipal == sumaDiagonalSecundaria){
            cont1++;
        }
    
       System.out.println("La suma de la diagonal principal: "+sumaDiagonalPrincipal+"\n"
                +"La suma de la diagonal secundaria: "+sumaDiagonalSecundaria);
            
        if (cont == 3 && cont1 == 1){
            System.out.println("Es un cuadrado mágico.");
        }else {
            System.out.println("No es un cuadrado mágico.");
        }             
    }
//-----------------------------función mostrar---------------------------------
public static void mostrar (int[][]matriz){
        
    System.out.println("La matriz con los valores ingresados. ");
    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t"+matriz[i][j]);
                
            } 
            System.out.println("");
        }
    
    }    
}

*/