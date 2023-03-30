/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package Guia03_EstructurasDeControl;

import java.util.Scanner;

public class ActividadExtra01_Equivalente_Dias_Horas {
    
    public static void main(String[] args) {
        int min, dia, horas;  
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los minutos: ");
        min = leer.nextInt();
        leer.nextLine();
        
        dia = min / 1440;
        horas = (min % 1440)/60;
        
        System.out.println("El equivalente es: ");
        System.out.println("Dias: "+dia + " Horas: "+horas);
        
    }
    
}
