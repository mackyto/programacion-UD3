/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 8. Crea un programa que pida 20 números reales por teclado, que representarán
 *    las notas del alumnado de un módulo en un examen, los almacene en un array,
 *    y calcule la media de los valores almacenados
 * 
 * @author macky
 */

public class Ejercicio08 {

    public static final String RESET = "\u001B[0m";                             // Define colores ANSI.
    public static final String ROJO = "\u001B[31m";
    public static final String FONDO_GRIS = "\u001B[47m";
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);                                    // Inicia la instancia Scaner.
        
        double[] notas = new double[10];                                        // Define el array para las notas.
        double acumulador = 0;
        
        System.out.println("Se van a introducir 20 notas del 0 al 10");         // Informción del proceso

        for(int i = 0; i < notas.length; i++){                                      // Bucle de rellenado de notas
            
            if(i%2 == 1){System.out.print(FONDO_GRIS);}                         // Sombrea linea si, linea no
            System.out.printf("Introduce la nota %d ", (i+1));
            notas[i]= kl.nextDouble();
            
        }
            
        for(int i = 0; i < notas.length; i++){acumulador += notas[i];}          // Bucle para recorrer las notas y sumarlas
        acumulador /= notas.length;                                             // Calcula la media 
        
        System.out.println();System.out.println();
        if (acumulador < 5){System.out.print(RESET + ROJO);}
        System.out.printf("La nota media de la clase es %.2f\n\n", acumulador);
        
        kl.close();                                                             // Cierra la instancia Scanner.
        
    }


    
}
