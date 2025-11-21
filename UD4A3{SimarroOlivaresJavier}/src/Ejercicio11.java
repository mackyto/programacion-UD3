/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 11. Pide una dirección de correo electrónico por teclado y comprueba si
 *     tiene un formato válido usando una expresión regular básica.
 *     Muestra el resultado.
 * 
 * @author 29160712r
 */
public class Ejercicio11 {
    
        public static void main(String[] args){
        
        // Definición de la instancia Scanner y las variables.
        Scanner kl = new Scanner(System.in);
        String cadena;
        
        // Captura una frase
        System.out.println("Introduce una dirección de correo electrónico:");
        cadena = kl.nextLine();
        
        if (cadena.matches("[a-zA-Z0-9]*@[a-zA-Z0-9]*\\.[a-z]{2,3}")){
            System.out.println("Cuenta de correo válida.");
        }else{System.out.println("Dirección inválida.");}
        
    }
    
}
