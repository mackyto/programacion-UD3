/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package up3a1.simarroolivaresjavier;
import java.util.Scanner;

/**
 *
 * 1. Escribe un programa que indique si el número introducido por el usuario es positivo,
 *    negativo o cero.
 * 
 * @author 29160712r
 */

public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner kl = new Scanner(System.in);
        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");
        
        System.out.print("Introduzca su numero entero ");
        int numero = kl.nextInt();
        System.out.printf("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––\n\n\n");
    
        if (numero > 0){
            System.out.println("El número " + numero + ", es un numero positivo.");
        }else if (numero < 0){
            System.out.println("El numero " + numero + ", es un numero negativo.");
        }else{
            System.out.println("El numero " + numero + ", es cero.");
        }  
        System.out.printf("\n\n–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––\n\n");

    }
    
}
