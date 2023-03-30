/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package Guia03_EstructurasDeControl;

import java.util.Scanner;

public class ActividadExtra02_Asignacion_valores {
    public static void main(String[] args) {
        int a,b,c,d;
        int e = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor para a: ");
        a = leer.nextInt();
        System.out.println("Ingrese un valor para b: ");
        b = leer.nextInt();
        System.out.println("Ingrese un valor para c: ");
        c = leer.nextInt();
        System.out.println("Ingrese un valor para d: ");
        d = leer.nextInt();
       
       e = b; 
       b = c;
       c = a;
       a = d;
       d = e; 
       
        System.out.println("Los valores iniciales a: "+c+" b: "+e+" c: "+b+" d: "+a);
        System.out.println("Los valores finales a: "+a+" b: "+b+" c: "+c+" d: "+d);
       
              
    }
    
}
