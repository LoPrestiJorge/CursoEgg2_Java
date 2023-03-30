/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package Guia02_introJava;

import java.util.Scanner;

public class Actividad_3 {
    public static void main(String args[]){
        String frase, mayus, minus;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        frase = entrada.nextLine();
        entrada.nextLine();
        
        frase = frase.toUpperCase();
        frase = frase.toLowerCase();
        
        System.out.println("La frase mayuscula: "+frase.toUpperCase());
        System.out.print("La frase en minuscula: "+frase.toLowerCase());
        entrada.nextLine();
    } 

    private static String toUpperCase(String frase) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static String toLowerCase(String frase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
