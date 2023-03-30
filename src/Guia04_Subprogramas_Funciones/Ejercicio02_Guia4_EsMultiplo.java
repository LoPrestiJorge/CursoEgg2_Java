/*
 *Ejercicio 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
 */
package Guia04_Subprogramas_Funciones;

import java.util.Scanner;


public class Ejercicio02_Guia4_EsMultiplo {

 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        EsMultiplo(num1,num2);
  
    }
    public static void EsMultiplo(int num1, int num2){
        if (num1 % num2 == 0){
            System.out.println(num1+ " es multiplo de " + num2);
        }else{
            System.out.println(num1+ " no es multiplo de " + num2);
        }
            
    }
}