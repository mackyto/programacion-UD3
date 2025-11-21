/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * 7. Escribe un programa que pida dos números a y b, cree una lista que
 *    almacene todos los valores entre ellos (incluidos) y, finalmente,
 *    los imprima por pantalla.
 * 
 * @author 29160712r
 */

public class Ejercicio07 {
    
    public static void main(String[] args){// Declara el método ain.
        
        // Inicializa la Lista la instancia Scanner y las variables.
        Scanner kl = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int numeroA = 0, numeroB = 0, cantidad = 0; 
        
        // Solicita el rango de números
        System.out.print("Introduce Un número entero ");
        numeroA = kl.nextInt();
        System.out.print("Inrtoduce un segúndo número entero. ");
        numeroB = kl.nextInt();
        
        // Calcula la distancia o tamaño de la lista
        cantidad = Math.abs(numeroA-numeroB);
        
        // Bucle para generar los valores.
        for (int i = 0; i <= cantidad; i++){
            // verifica el numero mas grande para sumar o restar.
            if(numeroA < numeroB){
                lista.add(numeroA++);
            }else{lista.add(numeroA--);}
        }
        
        // Bucle de impresión de lista.
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
            
        }
        
        kl.close();// Cierra la instancia Scanner.
        
    }
    
    
    
    
}
