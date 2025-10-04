/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package up2a2.simarroolivaresjavier;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * 
 * 5. Calcula el descuento aplicado a un precio original, mostrando el porcentaje de descuento real.
 *    El usuario debe introducir el precio original y el que pagó finalmente.
 * 
 * @author Javier Simarro Olivares
 */
public class Ejercicio05 {

    public static void main(String[] args){
    
        System.err.println("Por favor introduce solo números con comas para decimales o dará error");
        System.out.print("Indica el precio original del producto ");
        Scanner keyld = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.000");
        Double precioOriginal = keyld.nextDouble();
        System.out.print("Ahora indica cual fue el precio final ");
        Double precioFinal = keyld.nextDouble();
        System.out.println("El descuento aplicado a sido del "+df.format((precioOriginal-precioFinal)*100/precioOriginal)+"%");
        
    }
    
}
