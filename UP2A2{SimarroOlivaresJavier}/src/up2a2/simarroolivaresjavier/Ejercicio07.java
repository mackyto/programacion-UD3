/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up2a2.simarroolivaresjavier;
import java.util.Scanner; // Llamada a la clase Scanner.
import java.text.DecimalFormat; // Llamada a la clase DecimalFormat.

/**
 *
 * 7. Desarrolla un programa que pida tres notas numéricas y calcule la media aritmética.
 * 
 * @author Javier Simarro Olivares
 */
public class Ejercicio07 {
    
    public static void main(String[] args){
    
        System.err.println("Por favor introduce solo números con comas para decimales o dará error"); // Aviso de limitación de introducción de tipos.
        System.out.println("Se va a calcular la nota media de tres notas con tres decimale y redondeo");
        System.out.print("Por favor introduce la primera nota ");
        Scanner keyld = new Scanner(System.in); // Se instansia el objeto keyboar-load (keyld) de entrada por teclado hasta salto de linea.
        DecimalFormat df = new DecimalFormat("#.00"); // Se formatea el número de decimales con redondeo en la instancia 'df'.
        double nota=keyld.nextDouble();
        System.out.print("Ahora introduce la segunda nota ");
        nota+=keyld.nextDouble();
        System.out.print("Finalmente la última nota ");
        nota+=keyld.nextDouble();
        System.out.println("La nota media resultante es "+df.format(nota/3.00));
    
    }
    
}
