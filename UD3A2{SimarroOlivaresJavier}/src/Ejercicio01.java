/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 1. Crea un programa que imprima los números del 1 al 15 utilizando un bucle
 *    for.
 * 
 * @author macky
 */

public class Ejercicio01 {
    
    public static void main(String[] args){
        
        for (int i = 1; i <= 15; i++){
            if (i < 10){System.out.print(" ");}
            System.out.print("   " + i);
            if (i%3 == 0){System.out.printf("\n------------------\n");}
            
        }
        System.out.println();
    }

}
