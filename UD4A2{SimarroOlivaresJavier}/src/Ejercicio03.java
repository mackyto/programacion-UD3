/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 3. Escribe un programa que cree un array de enteros de tamaño indicado por
 *    el usuario, lo llene de forma incremental y, a continuación, cree una
 *    nueva copia del array desde la posición central (length/2)
 * 
 * @author macky
 */

public class Ejercicio03 {

    public static void main(String[] args){                                     // Declara el método main.
        
        Scanner kl = new Scanner(System.in);                                    // Declarala instancia Scanner.
        
        System.out.print("Indica el tamaño del array de enteros: ");            // Solicita y carga el tamaño del array.
        int tam = kl.nextInt();
        
        int[] vector = new int[tam];                                            // Declara el vector de enteros.
        
        for (int i = 0; i < vector.length; i++){                                // carga el vector con una sucesión incremental de enteros
            vector[i]=i;
        }     
        
        int[] newvec = new int[vector.length/2 + vector.length%2];              // Declara el vector copia.
        
        for (int i = 0; i < newvec.length; i++){                                // Bucle de copia de vector
            newvec[i] = vector[i+vector.length/2];
        }
        
        System.out.print("vector{");                                            // imprime el vector original
        for (int i = 0; i < vector.length; i++){
            System.out.printf("%d, ", vector[i]);
        }System.out.printf("\b\b}\n");System.out.println();
        
        System.out.print("newvec{");                                            // imprime el vector copiado
        for (int i = 0; i < newvec.length; i++){
            System.out.printf("%d, ", newvec[i]);
        }System.out.printf("\b\b}\n");System.out.println();       
        
    }
    
}
