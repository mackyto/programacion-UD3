/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 2. Crea un programa que pida números de forma indefinida hasta que el
 *    usuario introduzca un 0, y sume aquellos que son positivos. Cuando
 *    el usuario introduzca el 0, muestra por pantalla el resultado de la suma.
 * 
 * 
 * @author javsimoli
 */

public class Ejercicio02 {
    
    public static final String ROJO = "\u001B[31m";                             //Definición de colors ANSI en constantes.
    public static final String RESET = "\u001B[0m";
    
    public static void main(String[] args){                                     // Define el método main.
        
        Scanner kl = new Scanner(System.in);                                    // Define la instancia kl Captura del teclado.
        int numero, resultado = 0;                                              // Inicializa la variable de carga y el acumulador.
        
        System.out.println("Para salir Pulsa '0' y obtenbras el resultado");
        System.out.println("Introduce un numero positivo entero ");
        
        do{                                                                     // Inicia el bucle do while
            
            numero = kl.nextInt();                                              // Carga el siguiente número ingresado por teclado.
            resultado += numero;                                                // Añade la carga anterior al acumulador.
                                        
        }while(numero != 0);                                                    // Repite hasta que la carga por teclado sea cero.

        System.out.println();
        System.out.println("El resultado es " + resultado);                     // Imprime el resultado.
        
    }
    
}
