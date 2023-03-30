/*
Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú: El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
                                  menu 
                                 1.Sumar
                                 2.Restar
                                 3.Multiplicar
                                 4.Dividir
                                 5.Salir
                                Elija opción:

 */
package Guia03_EstructurasDeControl;

import java.util.Scanner;


public class Actividad6_Switch {
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion;
        boolean salir = false;
        
        do {
            System.out.print("Introduzca el primer número: ");
            num1 = leer.nextInt();
            System.out.print("Introduzca el segundo número: ");
            num2 = leer.nextInt();
            System.out.println("    MENU    ");
            System.out.println("1: sumar");
            System.out.println("2: restar");
            System.out.println("3: multiplicar");
            System.out.println("4: dividir");
            System.out.println("5: salir");
            System.out.print("Elija una opción: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                    } else {
                        System.out.println("El resultado de la división es: " + ((double) num1 / num2));
                    }
                    break;
                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    String respuesta = leer.next();
                    if (respuesta.equalsIgnoreCase("S")) {
                        salir = true;
                        System.out.println("Adiós!");
                    }
                   
            }
        } while (!salir);
        
        leer.close();
    }
}
  

