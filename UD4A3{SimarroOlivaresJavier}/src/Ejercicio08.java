/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * 8. Crea un programa que pida 20 números reales por teclado, los almacene en
 *    una lista, y calcule la media de los valores almacenados.
 * 
 * @author 29160712r
 */

public class Ejercicio08 {
    
    public static void main(String[] args){
        
        // Inicializa Instancia Scanner, Lista y variables.
        Scanner kl = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int acumulador = 0;
        
        // Bucle de carga de valores por teclado
        for (int i = 1; i <= 20; i++){
            System.out.println("Recistro número " + i);
            System.out.print("Introduce un valor entero ");
            lista.add(kl.nextInt());kl.nextLine();
        }
        
        // Bucle de cálculo de la media.
        for (int i = 0; i < lista.size(); i++){
            acumulador += lista.get(i);
            } acumulador/= lista.size();
        
            System.out.println("La media de la lista asciende a " + acumulador);

    kl.close();// Cierra la instancia Scanner
        
    }

}
