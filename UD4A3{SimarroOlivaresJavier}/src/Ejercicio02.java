/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * 2. Escribe un programa que lea 15 valores reales por teclado, los almacene
 * en una lista, y sume todos los valores almacenados.
 * 
 * @author macky
 */

public class Ejercicio02 {
    
    public static void main(String[] args){                                     // Declara el método.
        
        Scanner kl = new Scanner(System.in);                                    // inicia las variables e intancias.
        ArrayList<Double> numeros = new ArrayList<>();
        double acumulador = 0.00;
        
        // Bucle de introducir datos
        do{
            
           System.out.print("Introduce tu numero ");
           numeros.add(kl.nextDouble());
             
        }while (numeros.size() < 15);                                           // Limite del bucle.......................................
        
        for (int i = 0; i < numeros.size(); i++){                               // Bucle de operación.
        
        acumulador += numeros.get(i);                                           // Suma al acumulador con el registro indexado.
        
        } 
        
        System.out.println(acumulador);                                         // Imprime el resultado.
        
        // Cierra la instancio Scanner.
        kl.close();
        
    }
    
    
}
