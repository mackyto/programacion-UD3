/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 9. Crea un programa que, utilizando bucles, muestre por pantalla la primera
 *    posición de la letra u en la frase del ejercicio 6.
 * 
 * 
 * @author macky
 */

public class Ejercicio09 {                                                      // Define la clase.

    public static final String RESET = "\u001B[0m";                             // Define el código ANSI de los colores originales de la interface SHELL.
    public static final String ROJO = "\u001B[31m";                             // Define el código ANSI para el color del texto de la interface SHELL.
    
    public static void main(String[] args){                                     // Define el método.
        
        final String MENSAJE = "El jabalí juerguista jugaba con desparpajo al fútbol con su viejo amigo Jaime";   // Define la frase como constante.
        final char CARACTER = 'u';                                              // Define el char de busqueda, en este caso una 'u' minuscula
        int cuentaU = 0;                                                        // Inincializa el contador de caracteres hasta encontrara el char.
        int cuentaSp = 0;                                                       // Inincializa el contador de espacios entre palabras.
        
        for (int i = 0; i < MENSAJE.length(); i++){                             // Inicia el bucle for (busca CARACTER) desde cero primer char hasta la longitud menos uno.
            
            if(MENSAJE.charAt(i)==' '){cuentaSp++;}                             // Compara el char señalado por el contador del bucle con un espacio para incrementar el contador de espacios si fuera uno.
            
            if (Character.toLowerCase(MENSAJE.charAt(i)) == CARACTER){          // Compara el char en minuscula señalado, con CARACTER para comprobar si se ha encontrado la 'u'.
    
                System.out.printf("%s%c%s",ROJO,MENSAJE.charAt(i),RESET);       // Imprimir el caracter encontrado en rojo y se resetean los colores del interface.
                cuentaU = ++i;                                                  // Carga el contador con la posición del caracter encontrado con el valor del contador del bucle mas uno.
                break;                                                          // Como se ha encontrado el caracter buscado se sale del bucle inmediatamente con break.
            
            }else{System.out.printf("%c",MENSAJE.charAt(i));}                   // Imprime los caractere que no corresponden al buscado para ver el mensage impreso conpleto.
              
        }                                                                       // cierra el bucle for (busca CARACTER).

        if(cuentaU == 0){                                                       // Se comprueba si cuentaU a sodo modificado, de no ser lo, es por que no se ha encontrado el caracter. 
            System.out.printf("%s\n\nNo se ha encontrado ninguna '%s' en este mensaje%s\n\n", ROJO, CARACTER, RESET);   // Imprime en ROJO el mensaje que no hay CARACTER en MENSAJE.
        }else{                                                                  // cierra if (no hay CARACTER) abre else.
            for (int i = cuentaU; i < MENSAJE.length(); i++){                   // Inici el segundo bucle for (termina MENSAJE) comienza por la posición de 'u' mas uno hasta la longitud del MENSAJE menos uno.
                System.out.printf("%c",MENSAJE.charAt(i));                      // Imprime los caracteres del MENSAJE continuos de forma horizontal.
            }                                                                   // Cierra el bucle for (Termina MENSAJE).
            System.out.printf("\n\nLa primera %s'%c'%s esta en el caracter con la posicion %d contando los espacios, sin contarlos, en la posición %d.\n\n",ROJO,CARACTER,RESET,cuentaU,cuentaU-cuentaSp);   // imprime la solución solicitada formateada.
        }                                                                       // Cierra el else de haber encontrado el CARACTER. 

    }                                                                           // Cierra el método.
    
}                                                                               // Cierra la clase.
