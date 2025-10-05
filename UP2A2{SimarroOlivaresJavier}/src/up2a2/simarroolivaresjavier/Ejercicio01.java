/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up2a2.simarroolivaresjavier;
import java.util.Scanner; // Llamada a la clase Scanner.
import java.text.DecimalFormat; // Llamada a la clase DecimalFormat.

/**
 * 
 * 1. Crea un programa que calcule el IVA (21%) de un precio introducido por teclado
 *    y muestre tanto la base imponible como el total.
 * 
 * @author Javier Simarro Olivares
 */

public class Ejercicio01 {

    public static void main(String[] args){
        
        final int IVA = 21;  // Asigna el valor de la constante para el IVA.
        Scanner keyld = new Scanner(System.in); // Se instansia el objeto keyboar-load (keyld) de entrada por teclado hasta salto de linea.
        DecimalFormat df = new DecimalFormat("#.00"); // Se formatea el número de decimales con redondeo en la instancia 'df'.
        System.out.println("Indica el precio para calcular el IVA (21%)"); // Mensaje de solicitud.
        System.err.println("Por favor introduce solo números con comas para decimales o dará error"); // Aviso de limitación de introducción de tipos.  
        Double cantidad=keyld.nextDouble(); // Carga la cantidad introducida por teclado.
        System.out.println("La cantidad de "+cantidad+" al  "+IVA+"% de IVA"); // Imprime el mensaje de salida.
        System.out.println("Suma "+df.format(cantidad+(cantidad*IVA/100))+"€ de precio Final"); // Imprime el resultado con el formato 'df'.

    }

}
