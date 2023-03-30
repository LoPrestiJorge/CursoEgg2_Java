/*
Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
 */
package Guia03_EstructurasDeControl;

import java.util.Scanner;


public class Actividad3_funcion_Lenght {
    public static void main(String args[]){
        String frase;
        int cant;
        System.out.println("Ingrese una palabra de 8 letras: ");
        Scanner entrada = new Scanner(System.in);
        frase = entrada.nextLine();
        
        cant = frase.length();
        
        if(cant == 8){
            System.out.println("CORRECTO");
            
        }else
            System.out.println("INCORRECTO");
        
        
    }
    
}
