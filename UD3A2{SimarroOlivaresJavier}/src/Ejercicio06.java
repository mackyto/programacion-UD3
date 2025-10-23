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

public class Ejercicio06 {
    
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    
    public static void main(String[] args){
        
        final String MENSAJE = "El jabalí juerguista jugaba con desparpajo al fútbol con su viejo amigo Jaime";
        int longitud = MENSAJE.length(),contadorJotas=0;
        
        for (int i = 0; i< longitud; i++){
            
            if (Character.toLowerCase(MENSAJE.charAt(i)) == 'j'){
                contadorJotas++;
                System.out.printf("%s%c%s",ROJO,MENSAJE.charAt(i),RESET);
            }else{System.out.print(MENSAJE.charAt(i));}   

        }
        System.out.println();System.out.println("------------------------------------------------------------------------------");
        System.out.println("El mensaje contiene " + contadorJotas + " de jotas en total");
        System.out.println("----------------------------------------");
        
    }

}
