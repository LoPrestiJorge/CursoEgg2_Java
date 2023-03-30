package Guia02_introJava;

/*
Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */


import java.util.Scanner;

public class Actividad_5 {
    public static void main(String args[]){
        int num, doble, triple, raiz;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese un número: ");
        num = entrada.nextInt();
        
        doble = num * 2;
        triple = num * 3;
        raiz = (int) Math.sqrt(num);
        
        System.out.println("El doble es: "+doble+" el triple es: "+triple+" La raiz es: "+raiz);
                
        
                
 
    }
    
}
