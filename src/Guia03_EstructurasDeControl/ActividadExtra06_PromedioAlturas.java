/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package Guia03_EstructurasDeControl;

import java.util.Scanner;

public class ActividadExtra06_PromedioAlturas {
    public static void main(String[] args) {
        int cantPersona, i;
        double altura;
        double promedioBajo = 0;
        double promedioAlto = 0;
        int contadorBajo = 0;
        int  contadorAlto = 0; 
                
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas para determinar el promedio de estatura: ");
        cantPersona = entrada.nextInt();
        
        for(i = 0; i < cantPersona; i++){
            System.out.println("Ingrese la altura de la persona "+(i+1));
            altura = entrada.nextDouble();
            
            if(altura < 1.60){
               promedioBajo = promedioBajo + altura; 
               contadorBajo++;
            }else {
               promedioAlto = promedioAlto + altura;
                contadorAlto++;
            }
         
        }
        
        System.out.println("El promedio debajo de 1.60 metros es: "+ (promedioBajo/contadorBajo));
        System.out.println("El promedio debajo de 1.60 metros es: "+ (promedioAlto/contadorAlto));
    }
}
