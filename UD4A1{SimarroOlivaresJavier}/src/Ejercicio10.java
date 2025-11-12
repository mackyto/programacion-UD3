/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 10. Escribe un programa que lea por teclado la altura en centímetros de 10
 *     jugadores de un equipo de baloncesto, las almacene en un array, y luego
 *     lo recorra y calcule la altura media, la mínima y la máxima.
 * 
 * @author macky
 */

public class Ejercicio10 {
    
    public static final String RESET = "\u001B[0m";                             // Define colores ANSI en constantes.
    public static final String ROJO = "\u001B[31m";
    public static final String AZUL = "\u001B[34m";
    public static final String FONDO_GRIS = "\u001B[47m";
    
    public static void main(String[] args){                                     // Define el método main.
        
        Scanner kl = new Scanner(System.in);                                    // Inicia la instancia Scanner.
        
        double[] alturas = new double[10];                                      // Define el array y las variables.
        int indAltMax = 0, indAltMin = 0;
        double media = 0;
        
        
        for (int i = 0; i < alturas.length; i++){                               // Blucle de rellenado de datos del array.
            
            if(i%2 == 1){System.out.print(FONDO_GRIS);}                         // Colorea el fondo de las lineas impares.
            System.out.printf("Introdice la altura del jugador %d ", i+1);      // Solicita y carga los datos de altura en el array.
            alturas[i] = kl.nextDouble();
        }
        
        
        media = alturas[0];                                                     // Primer valor del aray, no recorrido por el bucle.
        for (int i =1; i < alturas.length; i++){                                // Bucle de busqueda del maximo minimo y media.
            if(alturas[indAltMin] > alturas[i]){indAltMin = i;}                 // Actualización del indice de altura mínima.
            if(alturas[indAltMax] < alturas[i]){indAltMax = i;}                 // Actualización del indice de máxima.
            media += alturas[i];                                                // Acumulación de alturas.
        }
        media /= alturas.length;                                                // División del acumulador para el calculo de la altura media.
        
        for (int i = 0; i < alturas.length; i++){                               // Bucle de impresión de aluras.
        
            if (i == indAltMin){System.out.print(ROJO);}                        // Color Rojo para el mas bajo.
            else if(i == indAltMax){System.out.print(AZUL);}                    // Color azul para el mas alto.
            System.out.printf("Jugador %d altura %.2f%s  ", i, alturas[i], RESET);
            
        }
        
            System.out.printf("\n\n%sLa altura máxima del jugador %d es %.2f", AZUL, indAltMax,alturas[indAltMax]);
            System.out.printf("\n\n%sLa altura mínima del jugador %d es %.2f", ROJO, indAltMin,alturas[indAltMin]);            
            System.out.printf("\n\n%sLa altura media de todos es  %.2f\n\n", RESET, media);       // Impresión de los resultados del ejercicio.
           
    kl.close();                                                                 // Cierra la instancia Scanner
        
    }
    
}
