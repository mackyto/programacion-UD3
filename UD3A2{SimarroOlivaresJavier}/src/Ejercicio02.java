/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 2.  Crea un programa que imprima los números del 3 al 9 utilizando un bucle
 *     for.
 * 
 * 
 * @author macky
 */

public class Ejercicio02 {

    public static void main(String[] args){
        
        for (int i = 2; i <= 10; i++){
            if (i > 9){break;}
            if (i < 3){continue;}
            
            System.out.print("  " + i);
            
            if (i % 5 == 0){System.out.printf("\n-----------------\n");}
        }
        System.out.printf("\n-----------------\n\n");
    }
    
}
