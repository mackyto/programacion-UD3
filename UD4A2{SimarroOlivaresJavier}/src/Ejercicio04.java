/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 4. Escribe un programa que cree un array de String con los valores iniciales
 *    “A”, “B”, “C” y “D”, los concatene en una sola variable de tipo String y
 *    los imprima por pantalla.
 * 
 * @author javsimoli
 */

public class Ejercicio04 {

    public static void main(String[] args){                                     // Declara el método main.
        
        String[] vector = {"A", "B", "C", "D"};                                 // Inicia el vector con datos del ejercicio.
        String texto = "";
        
        for (int i = 0; i< vector.length; i++){                                 // Bucle de inflado de String.
             texto = texto.concat(vector[i]);
        }
        
        System.out.printf("vector{");                                           // Imprime el array de String vector.
        for (int i = 0; i < vector.length; i++){
            System.out.printf("%s, ", vector[i]);
        }System.out.printf("\b\b}\n\n");
        
        System.out.printf("texto\"%s\"\n\n", texto);                            // Imprime la variable String resultante.
          
    }
    
}
