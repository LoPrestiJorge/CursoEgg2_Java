/*
Ejercicio 11
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package Guia04_Subprogramas_Funciones;

import java.util.Scanner;

public class Ejercicio01_Guia4_CambioCaracteres {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();

         String codificado = codificar(frase);
        System.out.println("La secuencia codificada es " + codificado + ".");
    }
    public static String codificar(String frase){
        String palcod = "";
        for (int i = 0; i < frase.length(); i++) {
            char letra= frase.toLowerCase().charAt(i);
            switch (letra) {
                case 'a':
                    palcod += "@";
                    break;
                case 'e':
                    palcod += "#";
                    break;
                case 'i':
                    palcod += "$";
                    break;
                case 'o':
                    palcod += "%";
                    break;
                case 'u':
                    palcod += "*";
                    break;
                default:
                    palcod += letra ;
                 
            }
              
        }
        return palcod;  
    }
}