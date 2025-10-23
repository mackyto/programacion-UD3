/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 1. Crea un programa que imprima los números del 1 al 15 utilizando un bucle
 *    for.
 * 
 * @author macky
 */

public class Ejercicio01 {
    
    public static void main(String[] args){
        
        for (int i = 1; i <= 15; i++){                                          // Inicia un bucle for contando de 1 a 15. 
            if (i < 10){System.out.print(" ");}                                 // Ajuste de posición numeros de un difgito.
            System.out.print("   " + i);                                        // Imprime los numeros en la misma linea dejando espacios.
            if (i%3 == 0){System.out.printf("\n------------------\n");}         // Salta de línea cada tres numeros con linea separatoria.
            
        }
        System.out.println();                                                   // Salto de linea para separar Build Suceful.
    }

}
