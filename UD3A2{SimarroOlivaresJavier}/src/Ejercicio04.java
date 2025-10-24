/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 4. Crea un programa que calcule el factorial del número 7 utilizando un bucle
 *    (el que quieras)
 * 
 * @author macky
 */

public class Ejercicio04 {                                                      // Define la clase.

    public static void main(String[] args){                                     // Define el método main.
        
        final int BASE = 7;                                                     // Define la base del factorial.

        int factorial = 1;                                                      // Todos los factoriales comienxan con uno aunque podri saltarse este factor.
        for (int i = 2; i <= BASE; i++){                                        // Comienza el bucle for desde 2, que e el segundo factor, hasta base del factorial.
            factorial*=i;                                                       // se multiplica factorial por el nuevo factor.
        }                                                                       // Cierra el bucle for.
        System.out.printf("\n  %d! = %d\n\n",BASE,factorial);                   // Imprime el resultado con formato.
  
    }                                                                           // Cierra el método
    
}                                                                               // Cierra la clase
