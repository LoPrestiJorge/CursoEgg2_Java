/*
Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */
package Guia02_introJava;

import java.util.Scanner;

public class Actividad_4 {
    public static void main(String args[]){
        int grados, equivalencia;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de grados centígrados: ");
        grados = entrada.nextInt();
        
        equivalencia = 32 + (9 * grados/5);
        
        System.out.println("La equivalencia es: "+equivalencia+" grados Farenheit");
        
        
    }
    
    
}
