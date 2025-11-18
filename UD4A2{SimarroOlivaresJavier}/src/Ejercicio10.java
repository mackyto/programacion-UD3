/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 10. Crea un programa que lea por teclado una cadena de texto y sustituya 
 *     todas las apariciones de la cadena “as” por “es”, e imprima el resultado
 *     por pantalla
 * 
 * @author macky
 */
public class Ejercicio10 {
    
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String AZUL = "\u001B[34m"; 
    
    public static void main(String[] args){                                     // Declara el método main.
        
        Scanner kl = new Scanner(System.in);                                    // inicia la instancia Scanner.
        String[][] reemplazos = {{"as","AS","As","aS"}, {"es","ES","Es","eS"}};
        
        System.out.println("Escribe tu frase: ");                                 // solicita y carga el scripts.
        String frase = kl.nextLine();
        String resultado = "";
        
        // reemplaza as por es... en todas las posibilidades.
        for (int i = 0; i < reemplazos[0].length; i++){

            resultado = frase.replace(reemplazos[0][i],reemplazos[1][i]);
            frase = resultado;
          
        }
        
        System.out.println();System.out.println();                              // imprime el resulda.
        System.out.println(resultado);        
        System.out.println();System.out.println();

    }
    
}
//El Astro viene hasta LAS maScotas 

// AS As as aS