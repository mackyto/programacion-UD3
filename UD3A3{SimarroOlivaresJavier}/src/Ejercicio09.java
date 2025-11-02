/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 9. Crea un programa que pida al usuario que indique cuántas notas va a
 *    introducir y, a continuación, lea ese número de notas entre 0 y 10.
 *    Tras ello, debe imprimir por pantalla la nota media.
 * 
 * @author 29160712r
 */
public class Ejercicio09 {
    
    public static final String RESET = "";
    public static final String ROJO = "\u001B[31m";
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);
        double nota = 0.00;
        
        System.out.print("Indique cuantas notas va a introducir: ");
        int cantidad = kl.nextInt();

        System.out.println("Introduzca las notas de 0 a 10, con o sin decimales. Se calcularan un máximo de tres decimales");

        for(int i = cantidad; i>=1; i--){
            
            System.out.printf("Introduce la nota (quedan %d) ", i);
            nota += kl.nextDouble();
            
        }
        
        System.out.println();
        System.out.println("Nota Media");
        System.out.println(" ________");
        System.out.println("|        |");
        System.out.printf("| %.3f  |\n", nota/cantidad);
        System.out.println("|________|");
        System.out.println();
        
    }
    
}
