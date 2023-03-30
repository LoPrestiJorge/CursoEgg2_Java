/*
Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */
package Guia03_EstructurasDeControl;

import java.util.Scanner;

public class Actividad7_Substring_Length_Equals {
       
 public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String entrada;
        int correcto = 0;
        int incorrecto = 0;

        while (true) {
            System.out.print("Ingrese una cadena: ");
            entrada = leer.nextLine();

            if (entrada.equals("&&&&&")) {
                break;
            }

            if (entrada.length() == 5 && entrada.charAt(0) == 'X' && entrada.charAt(4) == 'O') {
                correcto++;
            } else {
                incorrecto++;
            }
        }

        System.out.println("Ingresos correctos: " + correcto);
        System.out.println("Ingresos incorrectos: " + incorrecto);
    }
}
  
    

