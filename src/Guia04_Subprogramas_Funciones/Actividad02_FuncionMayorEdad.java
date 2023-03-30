/*
Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
package Guia04_Subprogramas_Funciones;

import java.util.Scanner;

public class Actividad02_FuncionMayorEdad {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String respuesta;
  
      while(true){
          String nombre = datos();
          int edadPer = edad();
        
         if (edadPer<18){
            System.out.println("Es menor de edad.");
        }else{
            System.out.println("Es mayor de edad.");
        } 
       
          System.out.println("Quiere seguir otro dato (SI/NO)");
          respuesta = entrada.nextLine();
          if (respuesta.equalsIgnoreCase("No")){
              break; 
          }else{
              System.out.println("El sistema seguirá operando...");
          }
       
     
     }  
       
        
   }
    
    public static String datos(){
       Scanner entrada = new Scanner(System.in);
       String nombre;
       System.out.println("Ingrese el nombre de la persona: "); 
       nombre = entrada.nextLine();
       return nombre; 
    }
    public static int edad(){
        Scanner entrada = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese la edad de la persona");
        edad = entrada.nextInt();
        return edad;
    }
       
        
    
}

/*
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        while (true) {
            String NombrePersona = Nombre();
            int EdadPersona = Edad();
            if (EdadPersona<18){
                System.out.println("La persona es menor de edad.");
            }else{
                System.out.println("La persona es mayor de edad.");
            }
            System.out.println("¿Desea ingresar otro dato? Si/No");
            String respuesta = leer.nextLine();
            if (respuesta.equalsIgnoreCase("No")){
                break;
            } 
        }
        
    }
    public static String Nombre(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = leer.nextLine();
        return nombre;
    }
    
    public static int Edad(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la edad de la persona:");
        int edad = leer.nextInt();
        return edad;
    }
    
}
*/