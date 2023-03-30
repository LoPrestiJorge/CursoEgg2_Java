package Guia02_introJava;
//Escribir un programa que pida dos números enteros por teclado y calcule
//la suma de los dos. El programa deberá después mostrar el resultado de

import java.util.Scanner;



public class Actividad_1 {
    public static void main(String refs[]){
        int num1, num2, suma;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        num1 = entrada.nextInt();
        entrada.nextLine(); 
        
        System.out.println("Ingrese otro número: ");
        num2 = entrada.nextInt();
        
        suma = num1 + num2;
        
        System.out.println("La suma es: "+suma);
        
        
    }
    
}
