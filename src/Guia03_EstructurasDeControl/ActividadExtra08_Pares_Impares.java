/*
Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break
 */
package Guia03_EstructurasDeControl;

import java.util.Scanner;

public class ActividadExtra08_Pares_Impares {

    public static void main(String[] args) {
        int num, resto, multiplo;
        int contador = 0;
        int cantpar = 0; 
        int cantimpar = 0; 
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese numeros: ");
            num = entrada.nextInt();
               
               if (num%2==0){
                cantpar++;
                
            }else {
                cantimpar++;
            }
            contador++;
      
        }while(!(num%5 == 0 || num%5 == 5));
        
        System.out.println("La cantidad de números leídos es: "+contador);
        System.out.println("La cantidad de números pares es: "+cantpar);
        System.out.println("La cantidad de números impares es: "+cantimpar);
    }
}
          
    
            
        
            
        
        
    
   

    

