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

public class Ejercicio09B {                                                     // Define la clase

    public static final String RESET = "\u001B[0m";                             // Define el código ANSI de los colores originales de la interface SHELL.
    public static final String ROJO = "\u001B[31m";                             // Define el código ANSI para el color del texto de la interface SHELL.
    
    public static void main(String[] args){                                     // Define el metodo
        
        final String MENSAJE = "El jabalí juerguista jugaba con desparpajo al fútbol con su viejo amigo Jaime";
        final char CARACTER = 'u';
        boolean encontrada = false;
        int cuentaU = 0;
        int cuentaSp = 0;
        
        for (int i = 0; i < MENSAJE.length(); i++){
            
            if(MENSAJE.charAt(i)==' ' && !encontrada){cuentaSp++;}
            
            if (Character.toLowerCase(MENSAJE.charAt(i)) == CARACTER && !encontrada){
    
                cuentaU = i+1;
                System.out.printf("%s%c%s",ROJO,MENSAJE.charAt(i),RESET);
                encontrada = true;
            
            }else{System.out.printf("%c",MENSAJE.charAt(i));}
              
        }

        if (cuentaU == 0){
            System.out.printf("%s\n\nNo se ha encontrado ninguna '%c'", ROJO, CARACTER);
            System.out.printf(" en este mensaje%s\n\n", RESET);
        
        }else{System.out.printf("\n\nLa primera %s'%c'%s esta en el caracter ",ROJO,CARACTER,RESET);
        System.out.printf("con la posicion %d contando los espacios, ",cuentaU);
        System.out.printf("sin contarlos, en la posición %d\n\n", cuentaU-cuentaSp);
        }
        
    }
    
}
