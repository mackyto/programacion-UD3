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
public class Ejercicio10B {
    
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String AZUL = "\u001B[34m"; 
    
    public static void main(String[] args){                                     // Declara el método main.
        
        Scanner kl = new Scanner(System.in);                                    // inicia la instancia Scanner.
        
        System.out.println("Escribe tu frase");                                 // solicita y carga el scripts.
        String frase = kl.nextLine();
        
        // reemplaza as por es... en todas las posibilidades.
        String resultado = frase.replace("as","es").replace("AS", "ES").replace("As", "Es").replace("aS", "eS");

        System.out.println();System.out.println();                              // imprime el resulda.
        System.out.println(resultado);
        
    }
    
}
