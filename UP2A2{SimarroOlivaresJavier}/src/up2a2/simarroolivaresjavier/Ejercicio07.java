/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up2a2.simarroolivaresjavier;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * 7. Desarrolla un programa que pida tres notas numéricas y calcule la media aritmética.
 * 
 * @author Javier Simarro Olivares
 */
public class Ejercicio07 {
    
    public static void main(String[] args){
    
        System.err.println("Por favor introduce solo números con comas para decimales o dará error");
        System.out.println("Se va a calcular la nota media de tres notas con tres decimale y redondeo");
        System.out.print("Por favor introduce la primera nota ");
        Scanner keyld=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.000");
        double nota=keyld.nextDouble();
        System.out.print("Ahora introduce la segunda nota ");
        nota+=keyld.nextDouble();
        System.out.print("Finalmente la última nota ");
        nota+=keyld.nextDouble();
        System.out.println("La nota media resultante es "+df.format(nota/3.00));
    
    }
    
}
