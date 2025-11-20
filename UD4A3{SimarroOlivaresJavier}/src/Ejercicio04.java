/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * 4. Escribe un programa que cree una lista de números reales y almacene 100
 *    números reales aleatorios entre 0.0 y 1.0. Puedes utilizar la función
 *    Math.random(). Después, pide al usuario un número entre 0.0 y 1.0 e 
 *    indica cuántos números de la lista son estrictamente mayores que el 
 *    introducido.
 * 
 * @author 29160712r
 */
public class Ejercicio04 {
    
    public static void main(String[] args){        
        
        // Inicializaciones, Instancia Scanner y ArrayList.
        Scanner kl = new Scanner(System.in);
        ArrayList<Double> lista = new ArrayList<>();
        double numero = 0;
        int cantidad = 0;
        
        // Bucle Recarga 100 numeros aleatorios de 0 -- .99999999.
        for (int i = 0; i < 100; i++){lista.add(Math.random());}

        // Introduce un número por teclado de 0 a 0.9999999 que usará de comparador para buscar elementos de mayor magnitud.
        System.out.print("Introduze un número decimal menor que cero ");
        do{numero = kl.nextDouble();}while(numero < 0 || numero >= 1);
        
        // Bucle contador de magnitudes superiores a número.
        for (int i = 0; i < lista.size(); i++){if(lista.get(i)>numero){cantidad++;}
        }
        
        // Imprime el resultado.
        System.out.println("El numero de elementos extrictamente mayores de " + numero + " es " + cantidad);
        
        // Cierra la instancia Scanner.
        kl.close();
        
    }   
    
}
