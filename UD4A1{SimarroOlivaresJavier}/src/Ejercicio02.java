/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 2. Escribe un programa que lea el precio de 15 productos por teclado, 
 *    los almacene en un array, y sume todos los valores almacenados
 * 
 * 
 * @author javsimoli
 */
public class Ejercicio02 {
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);
        
        double[] precios = new double[15];
        
        System.out.println("Se va a intruducir 15 precios de 15 productos");
        
        for(int i = 0; i >= precios.length; i++){
            do{
                System.out.printf("Introduce el precio del articulo %d = ", i);
                precios[i] = kl.nextDouble();
            }while(precios[i] < 0)
                
     
        }
        
            
        kl.close();
        
    }
    
    
}
