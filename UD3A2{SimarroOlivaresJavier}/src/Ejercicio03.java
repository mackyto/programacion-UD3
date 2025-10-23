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

public class Ejercicio03 {

    public static void main(String[] args){
        
        int suma = 0;
        
        for (int i = 1; i <= 20; i++){
            
            System.out.print(i + " + ");
            suma +=i;
            
        }
        System.out.printf("\b\b= %d\n\n",suma);
        
    }
    
}
