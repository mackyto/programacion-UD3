/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up2a2.simarroolivaresjavier;
import java.util.Scanner; // Llamada a la clase Scanner.
import java.text.DecimalFormat; // Llamada a la clase DecimalFormat.

/**
 *
 * 9. Calcula el precio final de un producto con dos impuestos diferentes (IVA 21% e IGIC 7%).
 *    El usuario debe introducir el precio.
 * 
 * @author Javier Simarro Olivares
 */

public class Ejercicio09 {

    public static void main (String[] args){
        final int IVA=21,IGIC=7;
        Scanner keyld = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.err.println("Por favor introduce solo números con comas para decimales o dará error"); // Aviso de limitación de introducción de tipos.         
        System.out.print("Dame el precio total para calcular ");
        Double precio=keyld.nextDouble();
        System.out.println("El precio "+df.format(precio)+"€ al "+IVA+"% de IVA Estatal da el resultado de "+df.format(precio+precio*IVA/100)+"€");
        System.out.println("El precio "+df.format(precio)+"€ al "+IGIC+"% de IGIC Canario da el resultado de "+df.format(precio+precio*IGIC/100)+"€");
        
    }
    
}
