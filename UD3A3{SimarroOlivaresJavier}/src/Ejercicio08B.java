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

public class Ejercicio08B {
    
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);
        
        final String PALABRA1= "uno", PALABRA2 = "catan", PALABRA3= "trivial";
        String palabra = "";
        
        System.out.printf("Danos tu opinión con una frase que no contenga las palabras %s%s, %s o %s%s:\n\n", ROJO, PALABRA1, PALABRA2, PALABRA3, RESET);
        String frase = kl.nextLine(); System.out.println(ROJO);
        
        for (int i = 0; i < frase.length(); i++){
            
            char caracter = Character.toLowerCase(frase.charAt(i));
            
            if (caracter!= ' ' && caracter!= '.' && caracter!= ',' || i == frase.length()-1 && caracter!= '.' && caracter!= ',' ){palabra += caracter;}
            
            if (caracter == ' ' || i == frase.length()-1){
                
                if(palabra.equals(PALABRA1)){
                    
                    System.out.printf("¡¡¡ERROR!!! Has usado palabras prohibidas, como '%s'.", PALABRA1);
                    break;
                
                }else if(palabra.equals(PALABRA2)){
                    
                    System.out.printf("¡¡¡ERROR!!! Has usado palabras prohibidas, como '%s'.", PALABRA2);
                    break;
                
                }else if(palabra.equals(PALABRA3)){
                    
                    System.out.printf("¡¡¡ERROR!!! Has usado palabras prohibidas, como '%s'.", PALABRA3);
                    break;
                
                }
                
                palabra = "";
                
            }
            
        }

        System.out.println(RESET);System.out.println();
                
    }
    
}

// Mensaje de Prueba: Dos cabras llenan la piscina de meados y uno no puede dejar de mirar como catan en un momento trivial