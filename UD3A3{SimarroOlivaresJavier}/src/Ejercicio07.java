/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 7. Crea un programa que pida un número al usuario e implemente una cuenta
 *    atrás desde el 10 hasta el 0. Si el contador toma el valor introducido
 *    por el usuario, se detiene la cuenta atrás y la ejecución del programa.
 * 
 * @author 29160712r
 */
public class Ejercicio07 {

    public static void main(String[] args) throws InterruptedException {
        
        Scanner kl = new Scanner(System.in);
        int numero = 0;
        
        do{
            
            System.out.print("Introduzca un número entero de 1 a 10: ");
            numero = kl.nextInt();
            
        }while(numero < 0 || numero > 10);
        
        System.out.printf("\n\n");
        
        for (int i = 10; i >= 0; i--){
            

            
            System.out.printf("\t %d", i);
            Thread.sleep(1000);
            if (numero == i ){break;}


            
        }     
        
        System.out.printf("\n\n");
        
    }
    
}
