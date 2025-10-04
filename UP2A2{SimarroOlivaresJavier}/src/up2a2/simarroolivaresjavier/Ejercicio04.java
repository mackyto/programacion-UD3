/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up2a2.simarroolivaresjavier;
import java.util.Scanner;

/**
 * 
 * 4. Lee por teclado el número de alumnos de un curso y el máximo de alumnos por grupo.
 *    Calcula el número de grupos que corresponde a dicho número de alumnos.
 * 
 * @author Javier Simarro Olivares
 */
public class Ejercicio04 {
    
    public static void main (String[] args){

        Scanner keyld = new Scanner(System.in);
        System.err.println("Por favor introduce solo números enteros o dará error");
        System.out.print("Introduce el número de alumnos totales del curso ");
        int alumnos = keyld.nextInt();
        System.out.print("Introduce el numero máximo de alumnos por grupo ");
        int grupos = keyld.nextInt();
        System.out.println("El número total es de "+(alumnos/grupos+(alumnos%grupos!=0 ? 1:0))+" grupos"+(alumnos%grupos==0 ? " completos":", al último grupo le faltan "+(grupos-(alumnos%grupos))+" alumnos"));
    
    }
    
}
