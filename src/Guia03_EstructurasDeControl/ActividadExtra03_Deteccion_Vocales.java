/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 */
package Guia03_EstructurasDeControl;

import java.util.Scanner;


public class ActividadExtra03_Deteccion_Vocales {
    
    public static void main(String[] args) {
        String letra;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese una letra: ");
        letra = entrada.nextLine();
        
        if(letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")){
            System.out.println("La letra es vocal.");
        }else{
            System.out.println("La letra no es vocal.");
        }
       
    }
    
}
