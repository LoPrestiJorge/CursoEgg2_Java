/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */
package Guia03_EstructurasDeControl;

import java.util.Scanner;


public class Actividad5_Limitepositivo_Suma {
    public static void main(String args[]){
        int limite, num;
        int suma = 0;
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Ingrese un valor límite: ");
        limite = entrada.nextInt();
        entrada.nextLine();
        
        while(suma <= limite) {
            System.out.println("Ingrese un número para la suma");
            num = entrada.nextInt();
            suma = suma + num; 
            
        }
        
                
        
    }
    
}
