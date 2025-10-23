/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 5. Crea un programa que, utilizando bucles anidados, imprima el siguiente
 *    patrón:
 * 
 *    *****
 *    ****
 *    ***
 *    **
 *    *
 * 
 * @author macky
 */

public class Ejercicio05 {

    public static void main(String[] args){
        
        System.out.println();
        
        for (int i = 5; i > 0; i--){
            for (int j = i; j > 0; j--){System.out.print("*");}
            System.out.println();
        }
        
        System.out.println();

    }
    
}
