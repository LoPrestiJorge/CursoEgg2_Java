/*
Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
package Guia04_Subprogramas_Funciones;

import java.util.Scanner;

public class Actividad01_FuncionCalculadora {

    public static void main(String[] args) {
        int num1, num2, opcion; 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número para la operación");
        num1 = entrada.nextInt();
        System.out.println("Ingrese otro número para la operación");
        num2 = entrada.nextInt();
        
         System.out.println("Seleccione la operación que desea realizar:"
                 + "\n 1 - Sumar"
                 + "\n 2 - Restar "
                 + "\n 3 - Multiplicar "
                 + "\n 4 - Dividir");
        opcion = entrada.nextInt(); 
       
         switch (opcion) {
            case 1:                     //Si tocas ctrl + shift + flecha para abajo reiteras la secuencia
                System.out.println("La suma es: "+suma(num1, num2));
                break;
            case 2:
                System.out.println("La resta es: "+resta(num1,num2));
                break;
            case 3:
                System.out.println("La multiplicación es: "+multiplicacion(num1, num2));
                break;
            case 4:
                System.out.println("La división es: "+division(num1, num2));
                break;
            default:
                System.out.println("No ingresaste una opción valida.");
      
        }
        
       
    }
    public static int suma(int num1, int num2){
        int sumar;
        sumar = num1 + num2; 
        return sumar;            
    }
    public static int resta(int num1, int num2){
        int resta;
        resta = num1 - num2; 
        return resta; 
    }
    public static int multiplicacion(int num1, int num2){
        int multiplicacion;
        multiplicacion = num1*num2;
        return multiplicacion;
    }
    public static double division(double num1, double num2){
        double division;
        if(num2==0){
            System.out.println("No se puede dividir por cero");
            return 0;
        }else {
            return num1/num2;      
        }
      
    }
}

/*public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = leer.nextInt();
        System.out.println("Seleccione la operación que desea realizar:\n 1 - Sumar\n 2 - Restar \n 3 - Multiplicar \n 4 - Dividir");
       
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: " + multiplicar(num1, num2));
                break;
            case 4:
                System.out.println("El resultado de la división es: " + dividir(num1, num2));
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        } else {
            return num1 / num2;
        }
    }
}
*/
