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

public class Ejercicio08C {
    
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);
        
        final String PALABRA1= "uno", PALABRA2 = "catan", PALABRA3= "trivial";
        int contaChar1 = 0, contaChar2 = 0, contaChar3 = 0;
        int contaPalabra1 = 0, contaPalabra2 = 0, contaPalabra3 = 0;
        
        System.out.printf("Danos tu opinión con una frase que no contenga las palabras %s%s, %s o %s%s:\n\n", ROJO, PALABRA1, PALABRA2, PALABRA3, RESET);
        String frase = kl.nextLine();
        
        for (int i = 0; i < frase.length(); i++){
            
            char caracter = Character.toLowerCase(frase.charAt(i));
           
            if (caracter == PALABRA1.charAt(contaChar1)) {

                if (++contaChar1 == PALABRA1.length()){contaPalabra1++; contaChar1 = 0;}
            
            }else{contaChar1 = 0;}
            
            
            if (caracter  == PALABRA2.charAt(contaChar2)) {

                if (++contaChar2 == PALABRA2.length()){contaPalabra2++; contaChar2 = 0;}                

            }else{contaChar2 = 0;}
            
            
            if (caracter == PALABRA3.charAt(contaChar3)) {
            
                if (++contaChar3 == PALABRA3.length()){contaPalabra3++; contaChar3 = 0;}
            
            }else{contaChar3 = 0;}
                        
        }            
        
        System.out.println();
        
        if (contaPalabra1 != 0){
            System.out.printf("%s¡¡¡ERROR!!! Has utilizado la palabra '%s' %d vez", ROJO,PALABRA1,contaPalabra1);
            if (contaPalabra1 > 1){System.out.println("es");}else{System.out.println();}
        }
            
        if (contaPalabra2 != 0){
            System.out.printf("%s¡¡¡ERROR!!! Has utilizado la palabra '%s' %d vez", ROJO,PALABRA2,contaPalabra2);
            if (contaPalabra2 > 1){System.out.println("es");}else{System.out.println();}
        } 
        
        if (contaPalabra3 != 0){
            System.out.printf("%s¡¡¡ERROR!!! Has utilizado la palabra '%s' %d vez", ROJO,PALABRA3,contaPalabra3);
             if (contaPalabra3 > 1){System.out.println("es");}else{System.out.println();}
        }

        System.out.println();
        
        if(contaPalabra1 == 0 && contaPalabra2 == 0 && contaPalabra3 == 0){System.out.println("Gracias por tu opinión");}
        
    }
    
}
