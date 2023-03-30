/*
Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13ր
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
¿Aún no lo entendiste? Recomendamos googlear división con restas
sucesivas.
 */
package Guia03_EstructurasDeControl;

import java.util.Scanner;

public class ActividadExtra09_DivisionConResta {

    public static void main(String[] args) {
        double dividendo, divisor, resultado;
        int cociente = 0; 
        Scanner entrada = new Scanner(System.in);
                
        System.out.println("Ingrese un número mayor a 1 para el dividendo: ");
        dividendo = entrada.nextDouble();
        
        System.out.println("Ingrese un número mayor a 1 para el divisor: ");
        divisor = entrada.nextDouble();
        
       do {
            dividendo = dividendo-divisor; 
        
        cociente++;
           
       }while(!(dividendo<divisor));

        System.out.println("El residuo es: "+dividendo);
        System.out.println("El cociente es: "+cociente);

    }
    
}
