/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * 3. Escribe un programa que lea un número entero A y a continuación, 
 *    lea A números por teclado, almacene sus valores en una lista, 
 *    e imprima por pantalla todos los valores introducidos.
 * 
 * @author javsimoli
 */

public class Ejercicio03B {

    
    // Declaración del método main.
    public static void main(String[] args){
        
        // Define la instancia ylas variables necesarias para completar el ejercicio poropuesto.
        Scanner kl = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        
        // Solicita el primer parametro (Cantidad de registros).
        System.out.print("Define el número de elementos de la línea ");
        int cantidad = kl.nextInt();
        
        // Bucle de introducción de datos.
        for (int i = 0; i < cantidad; i++){
            System.out.print("Introduce el valor para el elemento " + i + " ");
            lista.add(kl.nextInt());
        }
               
                // Inicia las variables necesarias y el iterador
        int i = 0;
        Iterator tamano = lista.iterator();       
        
        // Bucle de impresión de valores de la lista
         do{System.out.println(lista.get(i++));}while (tamano.hasNext());
        
        kl.close();
         
    }

    
}
