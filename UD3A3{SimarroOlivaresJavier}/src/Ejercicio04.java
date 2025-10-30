/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 4. Crea un programa que pida una frase al usuario y cuente cuántas vocales
 *    hay en ella.
 * 
 * @author javsimoli
 */
public class Ejercicio04 {
    
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001b[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);
        
        int as = 0, es = 0, is = 0, os = 0, us = 0;

        System.out.print("Introduce tu frase: ");
        final String MENSAJE = kl.nextLine();

        System.out.println();System.out.println("--------------------------------");
        
        for (int i = 0; i < MENSAJE.length(); i++){
            
         //   System.out.println(i);
            
            if (Character.toLowerCase(MENSAJE.charAt(i)) == 'a'){
                System.out.printf("%s%c%s", ROJO, MENSAJE.charAt(i), RESET);
                as++;
            }else if(Character.toLowerCase(MENSAJE.charAt(i)) == 'e'){
                System.out.printf("%s%c%s", AZUL, MENSAJE.charAt(i), RESET);
                es++;
            }else if(Character.toLowerCase(MENSAJE.charAt(i)) == 'i'){
                System.out.printf("%s%c%s", VERDE, MENSAJE.charAt(i), RESET);
                is++;
            }else if(Character.toLowerCase(MENSAJE.charAt(i)) == 'o'){
                System.out.printf("%s%c%s", CYAN, MENSAJE.charAt(i), RESET);
                os++;
            }else if(Character.toLowerCase(MENSAJE.charAt(i)) == 'u'){
                System.out.printf("%s%c%s", AMARILLO, MENSAJE.charAt(i), RESET);
                us++;
            }else{
                System.out.print(MENSAJE.charAt(i));
            }
        
        }
        
        System.out.println();System.out.println("--------------------------------");
        
        if (as > 0) {
            System.out.printf("La frase contiene %d vocal", as);
            if (as>1){System.out.print("es");}
            System.out.printf(" '%sa%s'\n", ROJO, RESET);
        }else{System.out.println("La Frase no contiene vocales 'a'");}
                
        if (es > 0) {
            System.out.printf("La frase contiene %d vocal", es);
            if (es>1){System.out.print("es");}
            System.out.printf(" '%se%s'\n", AZUL, RESET);
        }else{System.out.println("La Frase no contiene vocales 'e'");}
        
        if (is > 0) {
            System.out.printf("La frase contiene %d vocal", is);
            if (is>1){System.out.print("es");}
            System.out.printf(" '%si%s'\n", VERDE, RESET);
        }else{System.out.println("La Frase no contiene vocales 'i'");}        

        if (os > 0) {
            System.out.printf("La frase contiene %d vocal", os);
            if (os>1){System.out.print("es");}
            System.out.printf(" '%so%s'\n", CYAN, RESET);
        }else{System.out.println("La Frase no contiene vocales 'o'");}        
        
        if (us > 0) {
            System.out.printf("La frase contiene %d vocal", us);
            if (us>1){System.out.print("es");}
            System.out.printf(" '%su%s'\n", AMARILLO, RESET);
        }else{System.out.println("La Frase no contiene vocales 'u'");}
        
        System.out.println("--------------------------------");
        System.out.printf("\nTotal contiene %d vocales\n", as+es+is+os+us);
        System.out.println();System.out.println("--------------------------------");

    }
    
}
