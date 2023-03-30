/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05_Arreglos;

import java.util.Scanner;

public class ActividadGuia05_NombreDeEquipo {
    public static void main(String[] args) {
        String[] equipo = new String[6];
        for (int i = 0; i < 6; i++) {
            
            System.out.println("Ingrese el nombre nro " + (i+1) + " de su equipo:");
            Scanner leer = new Scanner(System.in);
            String nombre; nombre = leer.nextLine();
            equipo[i] = nombre;
        }
        System.out.println("\nLos nombres del quipo son: \n");
        
        for (int j = 0; j < 6; j++) {
            
            System.out.println("El nombre del integrante nro " + (j+1) + " es " + equipo[j] + "\n");
            
            }
    }
    
}
