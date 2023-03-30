/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
 */
package Guia03_EstructurasDeControl;

import java.util.Scanner;


public class Actividad2_Eureka {
    public static void main(String args[]){
        String frase;
        
        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("Ingrese una palabra: ");
        frase = entrada.nextLine();
        
        if(frase.equals("eureka")){
            System.out.println("Correcto");
            
        }else {
            System.out.println("Incorrecto");
        }
        
    }
    
    
}
