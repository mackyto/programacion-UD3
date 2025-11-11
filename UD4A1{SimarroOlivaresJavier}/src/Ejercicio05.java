/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 5. Escribe un programa que mida la frecuencia de un número y, para ello,
 *    cree un array de enteros de tamaño 100 y almacene en cada posición un
 *    valor entero aleatorio entre 1 y 10 (1 + Math.random()*10)).
 *    A continuación, debe leer un valor N y contar el número de veces que
 *    aparece N en el array, e imprimirlo por pantalla.
 * 
 * @author macky
 */

public class Ejercicio05 {

    public static final String RESET = "\u001B[0m";                             // Define colores ANSI en constamtes.
    public static final String ROJO = "\u001B[31m";
    public static final String FONDO_GRIS = "\u001B[47m";
    
    public static void main(String[] args){                                     // Inicia el método main.
        
        Scanner kl = new Scanner(System.in);                                    // Define la instancia Scanner

        int[] matriz = new int[100];
        int contadorN = 0, n = 0;
        
        for(int i = 0; i < matriz.length; i++){                                 // Carga el array matriz con valores enteros aleatorios de 1 a 10.
            matriz[i] = (int)(1+Math.random()*10);
        }
        
        do{                                                                     // Carga el numero solicitado N con rango limitado de 1 a 10.
            System.out.print("Introduce el valor de N entre 1 y 10 = ");
            n = kl.nextInt();
        }while(n < 1 || n > 10);
    
        for (int i = 0; i < matriz.length; i++){                                // comprueba cuantas veces se repitre N en el array, estadisticamente alrededor del 10%,
            if (matriz[i] == n){contadorN++;}
        }
 
        System.out.printf("\n\n%s%sEl número %d se", ROJO, FONDO_GRIS, n);          // imprime el resultado.
        System.out.printf(" repite %d veces en el array\n\n", contadorN);
        
    }
    
    
    
}
