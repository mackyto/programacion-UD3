/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up3a1.simarroolivaresjavier;
import java.util.Scanner;

/**
 *
 * 2. Implementa un programa que pida un número entero al usuario e indique si es par o impar.
 * 
 * @author 29160712r
 */

public class Ejercicio02 {
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);
        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");

        System.out.print("Introduce tu numero entero ");
        int numero = kl.nextInt();
        System.out.printf("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––\n\n\n");
        
        System.out.print("Tu numero " + numero);
        
        if (numero%2 != 0){
            System.out.println(" es Impar");
        }else{
            System.out.println(" es Par");
        }
        System.out.printf("\n\n–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––\n\n");
        
        
        
    }
}
