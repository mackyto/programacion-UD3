/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 10. Pide al usuario una cadena de texto y verifica si contiene exactamente 8
 *     dígitos seguidos. Muestra “Válido” o “Inválido”.
 * 
 * @author 29160712r
 */
public class Ejercicio10 {
    
    public static void main(String[] args){
        
        // Definición de la instancia Scanner y las variables.
        Scanner kl = new Scanner(System.in);
        String cadena;
        
        // Captura una frase
        System.out.println("Introduce la frase de verificación");
        cadena = kl.nextLine();
        
        if (cadena.matches("[0-9]{8}")){
            System.out.println("Válido");
        }else{System.out.println("Inválido");}
        
    }
    
}
