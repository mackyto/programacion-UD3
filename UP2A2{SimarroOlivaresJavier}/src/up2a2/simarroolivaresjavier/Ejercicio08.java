/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up2a2.simarroolivaresjavier;
import java.util.Scanner; // Llamada a la clase Scanner.

/**
 *
 * 8. Convierte una cantidad de bytes introducida por el usuario a megabytes.
 * 
 * @author Javier Simarro Olivares
 */

public class Ejercicio08 {
    
    public static void main(String[] args){
        
//      1 megabyte (1 MB) = 2 elevadoa 20 bytes = 1048576 bytes = 1048576 B    
        System.err.println("Por favor introduce solo números o dará error"); // Aviso de limitación de introducción de tipos.
        System.out.print("Introduce el valor en bytes (Palabras de 8 bits) ");
        Scanner keyld = new Scanner(System.in); // Se instansia el objeto keyboar-load (keyld) de entrada por teclado hasta salto de linea.
        final double CONVERSION = 1048576;
        Double bytes = keyld.nextDouble();
        System.out.println(bytes+"bytes equivalen a "+(int)(bytes/CONVERSION)+"MB");
        System.out.println(bytes/CONVERSION+"MBytes con decimales");
    }

}
