/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * Crea un programa que lea por teclado una cadena de texto e imprima su hash.
 * 
 * @author macky
 */
public class Ejercicio09 {
    
    public static void main(String[] args){                                     
        
        Scanner kl = new Scanner(System.in);     
        
        System.out.println("Introduce tu frase");
        String frase = kl.nextLine();
        
        int hash = frase.hashCode();
                
        System.out.println(hash);
        
        
    }
    
}
