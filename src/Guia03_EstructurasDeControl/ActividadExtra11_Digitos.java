/*
Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.
 */
package Guia03_EstructurasDeControl;

import java.util.Scanner;


public class ActividadExtra11_Digitos {


    public static void main(String[] args) {
        int num, resultado, z;
        int contador = 0;

   
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el número a separar");
        num = entrada.nextInt();

    if(num>=1000000){
          z = 1000000; 
        while (z>=1){
               
               resultado = num/z;
               num = num - (resultado*z); //asi vas eliminando el digito que ya contaste.
               z = z/10;  //asi afectar el divisor porque ya no dividimos por 1000000 sino 100000.
               contador++;
           }
           
       } else if(num>=100000){
           z = 100000;          //Tenes que reducir el divirsor al ser un número mas pequeño. 
           while (z>=1){
               resultado = num/z;
               contador++;
               num = num - (resultado*z); //asi vas eliminando el digito que ya contaste.
               z = z/10;  //asi afectas al divisor porque ya no dividimos por 1000000 sino 100000.
           }
       }else if(num>=10000){
           z = 10000;
           while (z>=1){
               resultado = num/z;
               contador++;
               num = num - (resultado*z); //asi vas eliminando el digito que ya contaste.
               z = z/10;  //asi afectar el divisor porque ya no dividimos por 1000000 sino 100000.
    }
       }else if(num>=1000){
           z = 1000;
           while (z>=1){
               resultado = num/z;
               contador++;
               num = num - (resultado*z); //asi vas eliminando el digito que ya contaste.
               z = z/10;  //asi afectar el divisor porque ya no dividimos por 1000000 sino 100000.
    }
    }else if(num>=100){
         z = 100;
           while (z>=1){
               resultado = num/z;
               contador++;
               num = num - (resultado*z); //asi vas eliminando el digito que ya contaste.
               z = z/10;  //asi afectar el divisor porque ya no dividimos por 1000000 sino 100000.
    }
  }else if(num>=10){
        z = 10;
           while (z>=1){
               resultado = num/z;
               contador++;
               num = num - (resultado*z); //asi vas eliminando el digito que ya contaste.
               z = z/10;  //asi afectar el divisor porque ya no dividimos por 1000000 sino 100000.
    }
}else {
      contador++;
  }
  
        System.out.println("La cantidad de dígitos es: "+contador);
}
}
   