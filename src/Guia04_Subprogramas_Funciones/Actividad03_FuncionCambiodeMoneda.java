/*
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 */
package Guia04_Subprogramas_Funciones;

import java.util.Scanner;

public class Actividad03_FuncionCambiodeMoneda {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad en euros: ");
        double euros = entrada.nextDouble();
        System.out.println("Ingrese el tipo de divisa: ");
        String divisa = entrada.next();
        ConDiv(euros, divisa);

    }
    
    public static void ConDiv(double euros, String divisa){
        double result;
        String msg;    
        switch (divisa.toLowerCase()) {
            case "libras":
                result = euros*0.86;
                msg = "libras";
                break;
            case "dolares":
                result = euros*1.28611;
                msg = "dolares";
                break;
            case "yenes":
                result = euros*129.852;
                msg = "yenes";
                break;
            default:
                System.out.println("Comando inválido.");
                return;        
        } 
         System.out.println("Los euros ingresados son equivalentes a: "+result+" "+msg);
        
    }
        
}



/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de euros");
        double euros = sc.nextDouble();
        System.out.println("Introduce la divisa a convertir");
        String divisa = sc.next();
        convDiv(euros, divisa);
    }

    public static void convDiv(double euros, String divisa) {
        double result = 0;
        String msg = "";
        switch (divisa.toLowerCase()) {
            case "libras":
                result = euros * 0.86;
                msg = "libras";
                break;
            case "dolares":
                result = euros * 1.28611;
                msg = "dolares";
                break;
            case "yenes":
                result = euros * 129.852;
                msg = "yenes";
                break;
            default:
                System.out.println("Comando invalido");
                return;
        }
        System.out.println("euros son equivalentes a " + resu
*/