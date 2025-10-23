/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 3. Crea un programa que imprima la suma de todos los números del 1 al 20
 *    utilizando un bucle for.
 * 
 * @author macky
 */

public class Ejercicio03B {

    public static void main(String[] args){
        
        int suma = 0;
        
        for (int i = 1; i <= 20; i++){
            
            System.out.print("   ");
            if (i < 10){System.out.print(" ");}
            if (i < 100){
                System.out.print(" ");
                if (i == 20){System.out.printf("\b+");}
            }
            System.out.println(i);
            suma +=i;
            
        }
        System.out.printf("  ------\n   %d\n\n",suma);
        
    }
    
}
