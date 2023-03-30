/*
Crear un programa que dado un número determine si es par o impar.
 */
package Guia03_EstructurasDeControl;

import java.util.Scanner;

public class Actividad1_Par_Impar {
    public static void main(String args[]){
        int num, resultado; 
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        num = entrada.nextInt();
        
        resultado = num % 2; 
        
        if(resultado == 0){
            System.out.println("Es un número par.");
            
        }else{
        System.out.println("Es un numero impar.");
    }
        
       
        
    }
    
}
