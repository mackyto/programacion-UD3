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

public class Ejercicio09B {                                                     // Define la clase.

    public static final String RESET = "\u001B[0m";                             // Define el código ANSI de los colores originales de la interface SHELL.
    public static final String ROJO = "\u001B[31m";                             // Define el código ANSI para el color del texto de la interface SHELL.
    
    public static void main(String[] args){                                     // Define el metodo
        
        final String MENSAJE = "El jabalí juerguista jugaba con desparpajo al fútbol con su viejo amigo Jaime";   // Define la frase cargandola en la constante MENSAJE.
        final char CARACTER = 'u';                                              // Define el caracter a buscar cargandolo en la constante CARACTER.
        boolean encontrada = false;                                             // Define la boleana que se usará como bandera para el programa sepa que ya se encontro CARACTER.
        int cuentaU = 0;                                                        // Inicia el contador de posición del caracter a buscar.
        int cuentaSp = 0;                                                       // Inicia el contador de los espacios que aparecen hasta el CARACTER encontrado.
        
        for (int i = 0; i < MENSAJE.length(); i++){                             // Inincia el bucle for principal desde cero hasta la longitud de MEMSAJE menos uno.
            
            if(MENSAJE.charAt(i)==' ' && !encontrada){cuentaSp++;}              // Cuenta los espacios mientras no se haya encontrado Caracter
            
            if (Character.toLowerCase(MENSAJE.charAt(i)) == CARACTER && !encontrada){   //  Busca CARACTER en MENSAJE mientras no se haya encontrado CARACTER.
    
                cuentaU = i+1;                                                  // Si coincide CARACTER con charAt(i) en minuscula se assigna a cuentaU el valor del contador del bucle mas uno.
                System.out.printf("%s%c%s",ROJO,MENSAJE.charAt(i),RESET);       // Imprime el CARACTER en rojo a ontinuación horizontalmente y se rsetea el color de la interface.
                encontrada = true;                                              // Una vez encontrado CARACTER se actualiza encontrada a verdadero.
            
            }else{System.out.printf("%c",MENSAJE.charAt(i));}                   // En el caso que el caracter al que apunta i no sea caracter imprimirlo de forma inmediatamente contigua de forma horizontal
              
        }                                                                       // Cierra el bucle principal.

        if (cuentaU == 0){                                                      // Para verificar si existe el CARACTER se verifica si cuentaU esta en su valor de inicio, pues para cualquier posición de CARACTER cuentaU estará en cualquier otro valor
            System.out.printf("%s\n\nNo se ha encontrado ninguna '%c'", ROJO, CARACTER);   // Si cuentaU esta en estado original se Imprime la primera parte del mensaje de que no esta en MENSAJE
            System.out.printf(" en este mensaje%s\n\n", RESET);                 // Impresión de la segunda parte del mensaje.
        
        }else{System.out.printf("\n\nLa primera %s'%c'%s esta en el caracter ",ROJO,CARACTER,RESET);   // Cierraa el if comienza el abre el else para cualquier otro valor de cuentaU se imprime la primera parte del mensaje de respuesta
        System.out.printf("con la posicion %d contando los espacios, ",cuentaU);                       // Impresión del la segunda parte del MENSAJE.
        System.out.printf("sin contarlos, en la posición %d\n\n", cuentaU-cuentaSp);                   // Impresión del la tercera parte del MENSAJE.
        }                                                                       // Cierra el else.
        
    }                                                                           // cierra el método.
    
}                                                                               // Cierra la clase.
