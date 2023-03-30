/*
Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package Guia03_EstructurasDeControl;

import java.util.Scanner;

public class ActividadExtra10_Adivinacion {

    public static void main(String[] args) {
        int num1, num2, num3; 
        Scanner entrada = new Scanner(System.in);
        num1 = (int)(Math.random()*10+0);
        num2 = (int)(Math.random()*10+0); 
       do {
           System.out.println("Ingrese el valor para adivinar: ");
           num3 = entrada.nextInt();
           System.out.println(num1*num2);
       }while(!(num1*num2==num3));
       
        System.out.println("¡Adivinaste!");
        
 
    }
    
}
