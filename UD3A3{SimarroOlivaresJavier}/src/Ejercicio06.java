/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * Crea un programa que genere un número entero aleatorio (puedes usar la clase
 * Random o el método Math.random) y le pida al usuario que intente adivinarlo. 
 * Si se introduce un número fuera del rango (1 a 10), debe pasar a la siguiente
 * iteración.
 * 
 * @author javsimoli
 */

public class Ejercicio06 {
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);
        final int ADIVINA = (int)Math.round(Math.random()*10);
        int propuesta = 0;
        
        System.out.println("Prueba a adivinar un número");
        System.out.print("Introduce un número entero del 1 al 10 ");
        
        do {
        
            propuesta = kl.nextInt();
            if (propuesta < 1 || propuesta > 10){continue;}
        
            
        }while(propuesta != ADIVINA);
        
    }
    
    
    
}
