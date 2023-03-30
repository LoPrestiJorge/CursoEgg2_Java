/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
 */
package Guia02_introJava;

import java.util.Scanner;

public class Actividad_2 {
    public static void main(String args[]){
        String nombre; 
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        entrada.nextLine();
        
        System.out.println("¡Hola " + nombre+"!");
        
        
    }
    
}
