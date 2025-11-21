/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * 9. Escribe un programa que lea 10 números enteros, los almacene en una lista,
 *    y luego pida al usuario que introduzca otro número entero. El programa
 *    deberá devolver la posición de la primera ocurrencia en la lista del
 *    último número introducido por el usuario.
 * 
 * @author 29160712r
 */
public class Ejercicio09 {
    
    public static void main(String[] args){ //Declara el método main.
        
        Scanner kl = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int seleccion = 0, ocurrencia = 0;
        
        // Bucle de carga de valores por teclado
        for (int i = 1; i <= 10; i++){
            System.out.println("Recistro número " + i);
            System.out.print("Introduce un valor entero ");
            lista.add(kl.nextInt());kl.nextLine();
            System.out.println("Quedan " + (10-i));
        }
        
        // introducción del valor de busqueda.
        System.out.println("Introduzca el número a buscar en la Lista ");
        seleccion = kl.nextInt(); 
        
        
        // Bucle de busqueda de la primera ocurrencia.
        for (int i = 0; i < lista.size(); i++){
            if (seleccion == lista.get(i)){
                System.out.println("La primera ocurrencia de la lista está en la posición " + (i+1));
                break;
            }else if (i == lista.size()-1){
                System.out.println("No hay Ocurrencias en esta lista");}
                    
        }
        
        kl.close();// Cierra la instancia Scanner. 
        
    }
    
}
