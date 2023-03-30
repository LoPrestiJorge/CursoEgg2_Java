/*
Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
 */
package Guia03_EstructurasDeControl;

import java.util.Scanner;

public class ActividadExtra07_VersionDoWhile {

    public static void main(String[] args) {
        int contador = 1;
        double cantNum, num, valorMax, valorMin, promedio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números");
        cantNum = entrada.nextDouble();
        System.out.println("Ingrese el valor del número "+contador);
                num = entrada.nextDouble();
                valorMax=num; 
                valorMin=num;
                promedio=num;
                contador++;
        
         do {
             if (contador > 1 && contador <=cantNum){
                System.out.println("Ingrese el valor del número "+contador);
                    num = entrada.nextDouble();
                    promedio = promedio + num;
                    
                 
                if(num>valorMax){
                    valorMax = num; 
                   
                }else if (num<valorMin){
                    valorMin = num;
                   
                }else {
                    
                }
                contador++;
        }
             
         }while(contador<=cantNum); 
        System.out.println("El valor máximo es: "+valorMax);
        System.out.println("El valor mínimo es: "+valorMin);
        System.out.println("El promedio de los números es: "+(promedio/(contador-1)));
    }
    
}
