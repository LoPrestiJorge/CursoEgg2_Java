/*
Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
 */
package Guia03_EstructurasDeControl;

import java.util.Scanner;


public class ActividadExtra05_ObraSocial {
    public static void main(String[] args) {
        String letra;
        double monto;
        final String opcion1 = "a";
        final String opcion2 = "b";
        final String opcion3 = "c";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tipo de socio (a/b/c): ");
        letra = entrada.nextLine();
        
        System.out.println("Ingrese el monto del tratamiento: ");
        monto = entrada.nextDouble();
        
        switch (letra){
            case opcion1: 
                System.out.println("El total a pagar es: "+(monto - (monto*0.5)));
            break; 
            
            case opcion2: 
                System.out.println("El total a pagar es: "+(monto - (monto*0.35)));
            break; 
            
            case opcion3: 
                System.out.println("El total a pagar es: "+monto);
            break; 
            
                
        }
    }
}
