/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
    
    public static final String RESET = "\u001B[0m";                             // Define colores ANSI
    public static final String ROJO = "\u001B[31m";
    public static final String FONDO_GRIS = "\u001B[47m";        
    
    public static void main(String[] args){                                     // Inicia el método main.
        
        Scanner kl = new Scanner(System.in);                                    // Define la instancia Scanner.
        int[] matriz = new int[10];
        char seleccion = '';
        
        for(int i=0;i<matriz.length;i++){matriz(i)=()int(Math.random()*1000000);} // LLena los espacios del array con valores de hasta un millón
        
        do{                                                                     // Bucle principal del menú.
        
            
        }while(seleccion != 'c');
        
    }
    
    
}
