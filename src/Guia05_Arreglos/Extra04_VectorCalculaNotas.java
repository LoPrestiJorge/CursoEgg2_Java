/*
Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
 */
package Guia05_Arreglos;

import java.util.Scanner;

public class Extra04_VectorCalculaNotas {
    private static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        double [] vector = new double [10];
        cargar(vector);
        calcular(vector);
        mostrar(vector);
    }
    
    //funcion para cargar las notas.
    public static void cargar(double[]vector){
        double examen1, examen2, tp1, tp2; 
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la nota del primer trabajo práctico del alumno "+(i+1)+": "); 
            tp1 = entrada.nextDouble(); 
            
            System.out.println("Ingrese la nota del segundo trabajo práctico del alumno "+(i+1)+": "); 
            tp2 = entrada.nextDouble(); 
            
            System.out.println("Ingrese la nota del primer examen del alumno "+(i+1)+": "); 
            examen1 = entrada.nextDouble(); 
            
            System.out.println("Ingrese la nota del segundo examen del alumno "+(i+1)+": "); 
            examen2 = entrada.nextDouble(); 
            
            vector[i] = ((tp1*0.10)+(tp2*0.15)+(examen1*0.25)+(examen2*0.50));
            }
    }
    
    //función para calcular los aprobados y desaprobados. 
    public static void calcular(double[] vector){
        int aprobados = 0;
        int desaprobados = 0; 
        
        for (int i = 0; i < 10; i++) {
            if (vector[i] >= 7){
                aprobados++;
            }else
                desaprobados++;
        }
      
        System.out.println("La cantidad de aprobados es: "+aprobados+"\n"
        +"La cantidad de desaprobados es: "+desaprobados);
    }
    
    public static void mostrar(double[]vector){
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno: "+i+" tiene un promedio de: "+vector[i]);
            
        }
    }
}

//--------------------------------------------------------------------------
//otra forma de hacerlo:

/*
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double[][] notas = new double[10][4]; // vector para guardar las notas de los alumnos
        double[] promedios = new double[10]; // vector para guardar los promedios de los alumnos

        // Pedimos las notas de cada alumno
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese las notas del alumno " + (i+1) + ":");
            for (int j = 0; j < 2; j++) {
                System.out.print("Nota del Trabajo Practico " + (j+1) + ": ");
                notas[i][j] = leer.nextDouble();
            }
            for (int j = 2; j < 4; j++) {
                System.out.print("Nota del integrador " + (j-1) + ": ");
                notas[i][j] = leer.nextDouble();
            }

            // Calculamos el promedio del alumno
            promedios[i] = 0.1*notas[i][0] + 0.15*notas[i][1] + 0.25*notas[i][2] + 0.5*notas[i][3];
        }

        // Contamos la cantidad de aprobados y desaprobados
        int aprobados = 0;
        int desaprobados = 0;
        for (int i = 0; i < 10; i++) {
            if (promedios[i] >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        // Mostramos los resultados por pantalla
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }

}

*/