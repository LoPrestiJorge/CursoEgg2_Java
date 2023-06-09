/*
Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
¿Qué son los números primos?
Básicamente, un número primo es un número natural que tiene solo dos
divisores o factores: 1 y el mismo número. Es decir, es primo aquel
número que se puede dividir por uno y por el mismo número.
El primer número primo es 2, y hay 25 números primos entre 1 y 100,
ellos son: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,
71, 73, 79, 83, 89 y 97.
 */
package Guia04_Subprogramas_Funciones;

import java.util.Scanner;

public class Actividad04_Funcion_NumeroPrimo {


    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = entrada.nextInt();
        
        boolean resultado = retorno(num);
        
        if(resultado){
            System.out.println(num+" es un número primo.");
        }else{
            System.out.println(num+" no es un número primo.");
        }
                
        System.out.println("");
 
    }
    public static boolean retorno(int num){
        boolean result;
        
        if (num <= 1){
           return false; 
        }else {
            for (int i = 2; i <= num/2; i++) {
                if (num%i == 0){
                    return false; 
                }
            }
            return true;  
        }
              
    }
}
/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar un numero");
        int num1 = sc.nextInt();
        boolean resultado = retorno(num1);
        if (resultado) {
            System.out.println(num1 + " es un número primo");
        } else {
            System.out.println(num1 + " no es un número primo");
        }
    }

    public static boolean retorno(int num1) {
        boolean result;
        if (num1 <= 1) {
            return false;
        } else {
            for (int i = 2; i <= num1 / 2; i++) {
                if (num1 % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
*/

/*
public static boolean result(int num) {
        if (num <= 1) {
            return false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int num = leer.nextInt();
        if (result(num)) {
            System.out.println(num + " es un número primo");
        } else {
            System.out.println(num + " no es un número primo");
        }
    }
}
*/