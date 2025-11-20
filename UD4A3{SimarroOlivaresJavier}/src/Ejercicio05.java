
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 5. Escribe un programa que cree una lista de enteros y almacene 100 enteros
 *    aleatorios entre 1 y 10 (1 + Math.random()*10) o clase Random).
 *    A continuación, debe leer un valor N y contar el número de veces que
 *    aparece N en la lista, e imprimirlo por pantalla.
 * 
 * @author macky
 */
public class Ejercicio05 {
    
    public static void main(String[] args){        
        
        // Inicializaciones, Instancia Scanner y ArrayList.
        Scanner kl = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int numero = 0, cantidad = 0;
        
        // Bucle Recarga 100 numeros aleatorios de 0 -- .99999999.
        for (int i = 0; i < 100; i++){lista.add(1 + (int)(Math.random()*10));}

        // Introduce un número por teclado de 0 a 0.9999999 que usará de comparador para buscar elementos de mayor magnitud.
        System.out.print("Introduze un número entero entre 1 y 10 ");
        do{numero = kl.nextInt();}while(numero < 1 || numero > 10);
        
        // Bucle contador de magnitudes superiores a número.
        for (int i = 0; i < lista.size(); i++){
            if(lista.get(i)== numero){cantidad++;}
        }
        
        // Imprime el resultado.
        System.out.println("El numero total de elementos con el valor de " + numero + " en la lista es " + cantidad);
        
        // Cierra la instancia Scanner.
        kl.close();
        
    }      
    
}
