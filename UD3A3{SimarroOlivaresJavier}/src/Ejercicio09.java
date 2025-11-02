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
    
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);
        double nota = 0.00;
        String color = RESET, espacio = "";
        
        System.out.print("Indique cuantas notas va a introducir: ");
        int cantidad = kl.nextInt();

        System.out.println("Introduzca las notas de 0 a 10, con o sin decimales. Se calcularan un máximo de tres decimales");

        for(int i = cantidad; i>=1; i--){
            
            System.out.printf("Introduce la nota (quedan %d) ", i);
            nota += kl.nextDouble();
            
        }
        
        nota/=cantidad;
        
        if(nota < 5){color = ROJO;}
        else if (nota < 6){color = AMARILLO;}
        else if (nota < 7){color = AZUL;}
        else if (nota < 9){color = VERDE;}
        else if (nota <=10){color = MAGENTA;}
        
        if(nota < 10){espacio = " ";}
        
        System.out.println();
        System.out.println("Nota Media");
        System.out.println(" ________");
        System.out.println("|        |");
        System.out.printf("| %s%.3f%s %s|\n",color, nota, RESET, espacio);
        System.out.println("|________|");
        System.out.println();
        
    }
    
}
