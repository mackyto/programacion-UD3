/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt  to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java            to edit this template
 */

import java.util.Scanner;

/**
 *
 * 6. Escribe un programa que cree un array de 10 enteros y muestre un menú con
 *    tres opciones:
 *          a. Imprimir valores del array.
 *          b. Introducir valor
 *          c. Salir
 *    Si el usuario escribe por teclado ‘a’, el programa deberá mostrar los
 *    valores almacenados en el array. Si escribe ‘b’, el programa debe leer un
 *    valor n y una posición p y guardar el valor n en la posición p del array.
 *    Por último, si escribe ‘c’, el programa debe terminar (no terminará antes
 *    de que suceda esto).  
 * 
 * @author macky
 */

public class Ejercicio06 {
    
    public static final String RESET = "\u001B[0m";                             // Define colores ANSI.
    public static final String ROJO = "\u001B[31m";
    public static final String FONDO_GRIS = "\u001B[47m";        
    
    public static void main(String[] args){                                     // Inicia el método main.
        
        Scanner kl = new Scanner(System.in);                                    // Define la instancia Scanner.

        int[] datos = new int[10];                                              // Definición e inicialización de variables.
        String select = "";
        int valor = 0, posicion = 0;
        
        for(int i = 0; i < datos.length; i++){                                  // LLena los espacios del array con valores de hasta un millón.
            datos[i]=(int)(Math.random()*1000000);
        }
        
        do{                                                                     // Comienza el bucle principal del menú.
            
            System.out.println(select);                                               // Impresión del menú.
            System.out.println("a.- Revisar valores del array");
            System.out.println();
            System.out.println("b.- Cambiar un registro del array");
            System.out.println();
            System.out.println("c.- Salir");
            do{select = kl.nextLine().toLowerCase();}while(select.equals(""));  // Al salir de la opción 'b' el usuario puede estar pulsando 'ENTER' todavia
                                                                                // se crea una condición para evitar una pulsación fantasma.
            
            switch(select){
                
                case "a":                                                       // Selección 'a', bucle de impresión del array.
                    for(int i = 0; i < datos.length; i++){
                    System.out.print(datos[i] + " // ");}
                    System.out.println();System.out.println();
                    break;
                
                case "b":                                                       // Selección 'b', cambia un valor introduce valor y posición.
                    System.out.println("Introduzca el valor ");
                    valor = kl.nextInt();
                    System.out.println("Marca la posición de 1 al " + datos.length + " ");
                    do{
                        posicion = kl.nextInt() - 1;
                    }while(posicion < 0 || posicion >= datos.length);
                    System.out.println(posicion);
                    datos[posicion] = valor;
                    break;
                    
                case "c":                                                       // Selección 'c', salir del bucle (no hace nada)
                    break;
                
                default:                                                        // Caso no definido, error de entrada de datos mala selección
                    System.out.println(ROJO + "Error de selección" + RESET);
                    break;

            }
            
        }while(!select.equals("c"));                                            // Fin del bucle principal 
            
        kl.close();                                                             // Cierra la instancia scanner.
        
    }
    
    
}
