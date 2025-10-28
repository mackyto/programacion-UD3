/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 1. Pide al usuario un número entero del 1 al 10 e imprime por pantalla su
 *    tabla de multiplicar (también del 1 al 10). Comprueba si el número
 *    introducido es válido tras la introducción.
 * 
 * @author javsimoli
 */
public class Ejercicio01 {
    
    public static void main (String[] args){
        
        Scanner kl = new Scanner(System.in);
        int numero;
        
        do{
            
            System.out.println("\f");
            
            System.out.print("Introduzca un número entre el 1 y el 10 ");
            numero = kl.nextInt();
        }while( numero < 1 || numero > 10);
        
        System.out.printf("\n\t Tabla del %d\n",numero);
        System.out.printf("\t--------------\n");

        for (int x = 1; x <= 10; x++){
            
            System.out.printf("\t");
            if (numero < 10){System.out.print(" ");}
            System.out.printf("%d * ", numero);
            
            if (x < 10){System.out.print(" ");}
            System.out.printf("%d =", x);
            
            if (numero*x < 10){System.out.print(" ");}
            if (numero*x < 100){System.out.print(" ");}
            
            System.out.printf(" %d\n", numero*x);
                 
        }    
        
    }
    
}
