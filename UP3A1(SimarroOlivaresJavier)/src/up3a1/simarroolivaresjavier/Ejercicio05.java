/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up3a1.simarroolivaresjavier;
import java.util.Scanner;

/**
 *
 * 5. Implementa un programa que pida un número al usuario e imprima 
 *    por pantalla si un número es múltiplo de 
 * 
 *          2 - dividir por 2 resto cero.
 * 
 *          3 - dividir por tres resto cero.
 * 
 *          5 - dividir por cinco resto cero.
 * 
 *          o ninguno - todos los demas.
 * 
 * @author 29160712r
 */

public class Ejercicio05 {
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);
        
        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");
        System.out.print("Introduce tu numero entero ");
        int numero = kl.nextInt();
        
        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");
        System.out.printf("\n\nTu numero %d", numero);
        
        if (numero%2==0){
            System.out.print(" es un multiplo de dos");
        }
        if (numero%3==0){
            if (numero%2==0){
                System.out.print(" y");
            }
            System.out.print(" es multiplo de tres");
        }
        
        if (numero%5==0){
            if (numero%2==0 || numero%3==0){
                System.out.print(" y");
            }
            System.out.print(" es multiplo de cinco");
        }
        
        if (numero%2!=0 && numero%3!=0 && numero%5!=0){
            System.out.print(" no es multiplo de dos ni de tres ni de cinco");
        }
        System.out.printf(".\n\n\n");
        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");

    }
    
}
