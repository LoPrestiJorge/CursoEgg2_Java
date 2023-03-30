/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias
 */
package Guia03_EstructurasDeControl;

import java.util.Scanner;


public class ActividadExtra14_MediaEdadHijos {

    public static void main(String[] args) {
        int familias, i, y, cantHijos, edad, suma;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la cantidad de familias: ");
        familias = entrada.nextInt();
        
        for(i = 0; i < familias; i++){
            System.out.println("Ingrese la cantidad de hijos de la familia "+(i+1));
            cantHijos= entrada.nextInt();
            suma = 0;
            
            for(y = 0; y < cantHijos; y++){
                System.out.println("Ingrese la edad para el hijo "+(y+1));
                edad = entrada.nextInt();
                suma = suma + edad;
                System.out.println("La media edad de los hijos de la familia "+(i+1)+" es: "+(suma/cantHijos));
            }
            System.out.println(""); 
        }

    }
    
}
