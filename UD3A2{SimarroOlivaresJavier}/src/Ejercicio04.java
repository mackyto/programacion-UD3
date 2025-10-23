/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 4. Crea un programa que calcule el factorial del número 7 utilizando un bucle
 *    (el que quieras)
 * 
 * @author macky
 */

public class Ejercicio04 {

    public static void main(String[] args){
        
        final int BASE = 7;

        int factorial = 1;        
        for (int i = 2; i <= BASE; i++){
            factorial*=i;
        }
        System.out.printf("\n  %d! = %d\n\n",BASE,factorial);
  
        
    }
    
}
