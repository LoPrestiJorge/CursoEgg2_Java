/*
Crear un programa que dibuje una escalera de números, donde cada
línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
ingresa el número 3:
1
2
123
 */
package Guia03_EstructurasDeControl;

import java.util.Scanner;


public class ActividadExtra13_EscalerasdeNumeros {


    public static void main(String[] args) {
        int num, i, z;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número para la escalera");
        num = entrada.nextInt(); 
        for(i = 0; i<num;i++){
            for(z = 0; z <= i; z++){
                System.out.print(" "+(z+1));

            }
            
            System.out.println("");
        }
    }
    
}
