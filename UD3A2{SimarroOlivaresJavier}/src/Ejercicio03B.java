/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 3. Crea un programa que imprima la suma de todos los números del 1 al 20
 *    utilizando un bucle for.
 * 
 * @author macky
 */

public class Ejercicio03B {                                                     // Define la clase.

    public static void main(String[] args){                                     // Define el método main.
        
        int suma = 0;                                                           // Crea e inicializa el acumulador.
        
        for (int i = 1; i <= 20; i++){                                          // Inicia el bucle for de uno a veinte.
            
            System.out.print("   ");                                            // Crea una tabulación
            if (i < 10){System.out.print(" ");}                                 // Se ajustan los numeros de un digito con un espacio a la izquierda.
            if (i < 100){                                                       // Como el resultado tiene tres digitos se ajustan las cifras de dos digitos.
                System.out.print(" ");                                          // añadiendo un espacio a la izquierda.
                if (i == 20){System.out.printf("\b+");}                         // Se añade el simbolo de operación 'suma' en la ultima linea.
            }                                                                   // cierra el if de menor de cien.
            System.out.println(i);                                              // Imprme los valores en una lista vertical
            suma +=i;                                                           // añade al acumulador el valor del índice del bucle.
            
        }                                                                       // Cierra el for.
        System.out.printf("  ------\n   %d\n\n",suma);                          // imprime la linea de operación y el resultado.
        
    }                                                                           // Cierra el método.
    
}                                                                               // Cierra la clase.
