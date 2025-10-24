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

public class Ejercicio03 {                                                      // Define la clase

    public static void main(String[] args){                                     // Define método main.

        int suma = 0;                                                           // Inicializa el acumulador con el valor inicial.

        for (int i = 1; i <= 20; i++){                                          // Define el bucle for de 1 a 20.

            System.out.print(i + " + ");                                        // Imprime los valoress horizontalmente y añade el formato suma.
            suma +=i;                                                           // Incrementa el acumulador con el valor del contador del bucle.
 
        }                                                                       // Cierra el bucle for.

        System.out.printf("\b\b= %d\n\n",suma);                                 // añade la suma (acumulador) y le da formato.

    }                                                                           // Cierra el método.

}                                                                               // Cierra la clase.
