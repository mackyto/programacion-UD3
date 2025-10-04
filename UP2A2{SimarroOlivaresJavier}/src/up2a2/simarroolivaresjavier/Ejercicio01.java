/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up2a2.simarroolivaresjavier;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *1. Crea un programa que calcule el IVA (21%) de un precio introducido por teclado
 *   y muestre tanto la base imponible como el total.
 * 
 * @author Javier Simarro Olivares
 */

public class Ejercicio01 {

    public static void main(String[] args){
        
        final int IVA = 21;
        Scanner keyld = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Indica el precio para calcular el IVA (21%)");
        System.err.println("Por favor introduce solo números con comas para decimales o dará error");
        Double cantidad=keyld.nextDouble();
        System.out.println("La cantidad de "+cantidad+" al  "+IVA+"% de IVA");
        System.out.println("Suma "+df.format(cantidad+(cantidad*IVA/100))+"€ de precio Final");        

    }

}
