/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.util.ArrayList;

/**
 * 
 * 1. Escribe un programa que pida 10 números reales por teclado, los guarde en
 *    una lista, e imprima todos los valores almacenados.
 * 
 * @author javsimoli
 */
public class Ejercicio01 {
    
    public static void main(String[] args){                                     // Declaración del metodo.
        
        Scanner kl = new Scanner(System.in);                                    // inicia instancia Scanner
        
        ArrayList<Integer> numeros =  new ArrayList<>();                        // Declara el array list
        
        // Bucle de rellenado de datos
        do{                 
            
            System.out.print("Introduce un numero ");
            numeros.add(kl.nextInt());
            
            
        }while(numeros.size() < 10);
        //Termina al llegar a 10 numeros en la lista
        
        // Bucle de impresión de datos
        for(int i = 0; i< numeros.size(); i++){
            
            System.out.println(numeros.get(i));
            
        }

        // cierra la instancia Scanner
        kl.close();
        
    }
   
}
