/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 6. Crea un programa que, utilizando un bucle y el método charAt de la clase String 
 *    (https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#charAt(int)), 
 *    cuente el número de veces que aparece el carácter ‘j’ en la frase 
 *    “El jabalí juerguista jugaba con desparpajo al fútbol con su viejo amigo Jaime”
 * 
 * 
 * charAt
 * 
 * public char charAt​(int index)
 * 
 * Returns the char value at the specified index. An index ranges from 0 to length() - 
 * 1. The first char value of the sequence is at index 0, the next at index 1, and so on, as for array indexing.
 * If the char value specified by the index is a surrogate, the surrogate value is returned.
 * 
 * Specified by:
 *    charAt in interface CharSequence
 * 
 * Parameters:
 *    index - the index of the char value.
 * 
 * Returns:
 *    the char value at the specified index of this string. The first char value is at index 0.
 *
 * Throws:
 *    IndexOutOfBoundsException - if the index argument is negative or not less than the length of this string. 
 *  
 * 
 * 
 * length
 * 
 * public int length()  
 * 
 * Returns the length of this string. The length is equal to the number of Unicode code units in the string.   
 * 
 * Specified by:
 * length in interface CharSequence
 * 
 * Returns:
 * the length of the sequence of characters represented by this object.
 * 
 * @author macky
 */

public class Ejercicio06 {                                                      // Define la clase.
    
    public static final String RESET = "\u001B[0m";                             // Define el código ANSI de los colores originales de la interface SHELL.
    public static final String ROJO = "\u001B[31m";                             // Define el código ANSI para el color del texto de la interface SHELL.
    
    public static void main(String[] args){                                     // Define el método.
        
        final String MENSAJE = "El jabalí juerguista jugaba con desparpajo al fútbol con su viejo amigo Jaime";  //Se define el mensage como constante.
        int contadorJotas=0;                                                    // Inicializa el contador de otas.
        
        for (int i = 0; i< MENSAJE.length(); i++){                              // Inicia el bucle for desde 0 que es el primer char del mensaje hasta la longitud del mensaje menos uno (mientras sea menor no menor o igual) que es el rango valido de chars del mensaje.            
            if (Character.toLowerCase(MENSAJE.charAt(i)) == 'j'){               // Comprueba si el char en minuscula corresponde con la j minuscula.
                contadorJotas++;                                                // Si la comparacion a sido verdadera incrementa el contador de jotas.
                System.out.printf("%s%c%s",ROJO,MENSAJE.charAt(i),RESET);       // Imprime el char en este caso una j en rojo y vuelve a reponer los colores de la interface
            }else{System.out.print(MENSAJE.charAt(i));}                         // Si el char no es j se imprime aqui horizontalmente en color normal.y cierra el condicional y el else

        }                                                                       // Cierra el bucle for
        System.out.printf("\n------------------------------------------------------------------------------\n");  // Formatea el espacio visual saltando de linea y añadiendo un separador. 
        System.out.println("El mensaje contiene " + contadorJotas + " jotas en total");                           // Imprime la respuesta formateada.
        System.out.println("----------------------------------------");         // Incluye un separador final y un salyo de linea.
        
    }                                                                           // Cierra el método.

}                                                                               // Cierra la clase
