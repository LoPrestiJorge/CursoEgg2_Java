/*
Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 */
package Guia03_EstructurasDeControl;

//La sintaxis para substring es frase.substring(indice inicial, indice final)
//El indice final siempre es mayor a indice inicial. Si queres extraer la primera
//letra, no podes poner 0,0 como en pseintm sino que es 0,1 

import java.util.Scanner;

public class Actividad4_Substrings_Equals {
    public static void main(String args[]){
        String frase, letra; 
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese una frase con la primera letra en 'a': ");
        frase = entrada.nextLine();
        
        letra = frase.substring(0,1);
        
        if(letra.equals("a") || letra.equals("A") ){
            System.out.println("Correcto");
            
        }else {
            System.out.println("Incorrecto");
        }
        
    }
    
}