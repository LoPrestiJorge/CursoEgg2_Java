/*
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Guia05_Arreglos;

import java.util.Scanner;


public class Ejercicio03_CalculodeDigitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n; 
        int unDigito = 0;
        int dosDigitos = 0;
        int tresDigitos = 0;
        int cuatroDigitos = 0;
        int cincoDigitos = 0;
        
        System.out.println("Ingrese el tamaño del vector: ");
        n = entrada.nextInt();
        int vector[] = new int[n];
        
        for (int i = 0; i < n; i++) {
          vector[i] = (int) (Math.random()*9999+1);
            System.out.println("["+vector[i]+"]");
        }
        
        for (int i = 0; i < n; i++) {
            if (vector[i] <= 9){
                unDigito++;
            }else if (vector[i] >= 10 && vector[i]<100) {
                dosDigitos++;
            }else if (vector[i] >= 100 && vector[i]<1000){
                tresDigitos++;
            }else if (vector[i] >= 1000 && vector[i]<10000){
                cuatroDigitos++;
            }else if (vector[i] >= 10000 && vector[i]<100000){
                cincoDigitos++;           
            }
        }
        System.out.println("La cantidad de digitos:\n"
        +"Numeros de un dígito: " +unDigito +"\n" 
        +"Numeros de dos dígitos: "+dosDigitos+"\n"
        +"Numeros de tres dígitos: "+tresDigitos+"\n"
        +"Numeros de cuatro dígitos: "+cuatroDigitos+"\n"
        +"Numeros de cinco dígitos: "+cincoDigitos+"\n");
    } 
}

/*
int[] vector = new int[5];
        int unDigito = 0;
        int dosDígitos = 0;
        int tresDigitos = 0;
        int cuatroDigitos = 0;
        int cincoDigitos = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 9999 + 1);

            System.out.println("[" + vector[i] + "]");
        }
        for (int i = 0; i < vector.length; i++) {

            if (vector[i] <= 9) {
                unDigito++;
            }
            if (vector[i] > 9 && vector[i] <99) {
                dosDígitos++;
            }
            if (vector[i] > 99 && vector[i] <999) {
                tresDigitos++;
            }
            if (vector[i] > 999 && vector[i] <9999) {
                cuatroDigitos++;
            }
            if (vector[i] > 9999 && vector[i] <99999) {
                cincoDigitos++;
            }
        }
            System.out.println("hay " + unDigito + " números de un dígito, y " + dosDígitos + " números de dos dígitos " 
                    + tresDigitos + " numeros de tres digitos " + cuatroDigitos + " numeros de cuatro digitos " + cincoDigitos + " numeros de cinco digitos");
        }
    }
*/


//int length = String.valueOf(number).length();