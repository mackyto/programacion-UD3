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
public class Ejercicio04B {                                                     // Define la clase.
    
    public static final String RESET = "\u001B[0m";                             // Lista de colores ANSI para impresión en CONSTANTES tipo String.
    public static final String ROJO = "\u001b[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    
    public static void main(String[] args){                                     // Define el método main.
        
        Scanner kl = new Scanner(System.in);                                    // Define la instancia kl Scanner(System.in).
        
        int as = 0, es = 0, is = 0, os = 0, us = 0;                             // Inicializa los contadores.
        String color = RESET;

        System.out.print("Introduce tu frase: ");                               // Solicita la frase y la carga como Constante en MENSAJE.
        final String MENSAJE = kl.nextLine();

        System.out.println();                                                   // Ajusta el formato de impresión.
        System.out.println("--------------------------------");
        
        for (int i = 0; i < MENSAJE.length(); i++){                             // Inicia el bucle desde cero hasta la lonjitud de MENSAJE menos uno.
                        
            switch (Character.toLowerCase(MENSAJE.charAt(i))){                  // Inicia la seleción SWITCH con el char en minusculas del caracter
                                                                                // al que apunta el contador del bucle for 
                case 'a': as++; color = ROJO; break;
                case 'e': es++; color = AZUL; break;
                case 'i': is++; color = VERDE; break;
                case 'o': os++; color = CYAN; break;
                case 'u': us++; color = AMARILLO; break;
                default: color = RESET;
            }
        
            System.out.printf("%s%c%s", color,MENSAJE.charAt(i),RESET);         // Imprime el caracter seleccionado por el contador del bucle i.
            
        }
        
        System.out.println();                                                   // Ajuste de formato de salida.
        System.out.println("--------------------------------");
        
        if (as > 0) {                                                           // Imprime el numero de vocales 'a' si las hay, si no, imprime
            System.out.printf("La frase contiene %d vocal", as);                // que no hay.
            if (as>1){System.out.print("es");}
            System.out.printf(" '%sa%s'\n", ROJO, RESET);
        }else{System.out.println("La Frase no contiene vocales 'a'");}
                
        if (es > 0) {                                                           // Imprime el numero de vocales 'e' si las hay, si no, imprime
            System.out.printf("La frase contiene %d vocal", es);                // que no hay.
            if (es>1){System.out.print("es");}
            System.out.printf(" '%se%s'\n", AZUL, RESET);
        }else{System.out.println("La Frase no contiene vocales 'e'");}
        
        if (is > 0) {                                                           // Imprime el numero de vocales 'i' si las hay, si no, imprime
            System.out.printf("La frase contiene %d vocal", is);                // que no hay.
            if (is>1){System.out.print("es");}
            System.out.printf(" '%si%s'\n", VERDE, RESET);
        }else{System.out.println("La Frase no contiene vocales 'i'");}        

        if (os > 0) {                                                           // Imprime el numero de vocales 'o' si las hay, si no, imprime
            System.out.printf("La frase contiene %d vocal", os);                // que no hay.
            if (os>1){System.out.print("es");}
            System.out.printf(" '%so%s'\n", CYAN, RESET);
        }else{System.out.println("La Frase no contiene vocales 'o'");}        
        
        if (us > 0) {                                                           // Imprime el numero de vocales 'u' si las hay, si no, imprime
            System.out.printf("La frase contiene %d vocal", us);                // que no hay.
            if (us>1){System.out.print("es");}
            System.out.printf(" '%su%s'\n", AMARILLO, RESET);
        }else{System.out.println("La Frase no contiene vocales 'u'");}
        
        System.out.println("--------------------------------");                 // Ajusta el formato e imprime el total de vocales.
        System.out.printf("\nTotal contiene %d vocales\n", as+es+is+os+us);
        System.out.println();
        System.out.println("--------------------------------");

    }
    
}
