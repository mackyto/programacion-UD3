/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 8. Crea un programa que pida una frase al usuario y detecte la presencia de
 *    palabras censuradas (“Uno”, “Catan”, “Trivial”). En caso de encontrar una
 *    de ellas, muestra un mensaje de advertencia.
 * 
 * @author 29160712r
 */

public class Ejercicio08 {
    
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);
        
        final String PALABRA1= "uno", PALABRA2 = "catan", PALABRA3= "trivial";
        
        System.out.printf("Danos tu opinión con una frase que no contenga las palabras %s%s, %s o %s%s:\n\n", ROJO, PALABRA1, PALABRA2, PALABRA3, RESET);
        String frase = kl.nextLine();
        
        System.out.println();System.out.print(ROJO);
                
                if(frase.contains(PALABRA1)){
                    
                    System.out.printf("¡¡¡ERROR!!! Has usado palabras prohibidas, como '%s'.", PALABRA1);
                
                }else if(frase.contains(PALABRA2)){
                    
                    System.out.printf("¡¡¡ERROR!!! Has usado palabras prohibidas, como '%s'.", PALABRA2);
                
                }else if(frase.contains(PALABRA3)){
                    
                    System.out.printf("¡¡¡ERROR!!! Has usado palabras prohibidas, como '%s'.", PALABRA3);
                
                }

                System.out.println();System.out.println();
                
    }
    
}

// Mensaje de Prueba: Dos cabras llenan la piscina de meados y uno no puede dejar de mirar como catan en un momento trivial