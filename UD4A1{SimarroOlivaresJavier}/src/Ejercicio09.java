/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 9. Escribe un programa que pida tres números enteros: el valor inicial i, el
 *    incremento a, y la longitud n. Crea un array de dicha longitud y almacena
 *    en cada una de las posiciones el resultado de incrementar el valor 
 *    inicial i n veces, aplicando el incremento a cada vez
 * 
 * @author macky
 */
public class Ejercicio09 {

    public static final String RESET = "\u001B[0m";                             // Define Colores ANSI en constantes.
    public static final String ROJO = "\u001B[31m";
    public static final String FONDO_GRIS = "\u001B[47m";
    
    public static void main(String[] args){                                     // Define el método main.
        
        Scanner kl = new Scanner(System.in);                                    // Incia la instancia Scaner.
        
        System.out.print("Indica el origen entero de la secuencia ");           // solicita los datos origen salto y cantidad.
        int origen = kl.nextInt();
         
        System.out.print("Indica el salto entre cada eiemento de la secuencia ");
        int salto = kl.nextInt();
         
        System.out.print("Indica la cantidad de valores de la secuencia ");
        int cantidad = kl.nextInt();
        
        int[] datos = new int[cantidad];                                        // Define el array.
                
        for (int i = 0; i < cantidad; i++){                                     // Bucle de rellenado de datos.
            datos[i] = origen + salto * i;
        }
        
        for(int i = 0; i < cantidad; i++){System.out.print(datos[i] + " // " );}// Imprime los datos del array.
        
        kl.close();                                                             // cierra la instancia Scanner.
        
    }
            
            
}
