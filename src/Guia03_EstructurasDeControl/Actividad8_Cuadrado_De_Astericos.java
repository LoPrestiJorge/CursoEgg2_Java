/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package Guia03_EstructurasDeControl;

import java.util.Scanner;

public class Actividad8_Cuadrado_De_Astericos {
    public static void main(String args[]){
        int num, i, j; 
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del lado del cuadrado");
        num = entrada.nextInt();
        entrada.nextLine();
        
        for(i=1; i <= num; i++){
            for(j=1; j <= num; j++){
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("* ");
                } else { 
                    System.out.print("  ");
                }
            }
            System.out.println(); 
        }
            }
        }
        
        
        
    
    

