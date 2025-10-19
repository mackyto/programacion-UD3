/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up3a1.simarroolivaresjavier;
import java.util.Scanner;

/**
 *
 * 6. Crea un programa que pida al usuario tres números enteros e imprima
 *    por pantalla el menor de ellos. Utiliza estructuras if-else if-else.
 * 
 * @author 29160712r
 */
public class Ejercicio06 {
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);

        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");        

        System.out.print ("Introduce un numero entero ");
        int numero1 = kl.nextInt();

        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");        
        
        System.out.print ("Introduce un segundo numero entero ");
        int numero2 = kl.nextInt();

        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");        
        
        System.out.print ("Introduce un tercer numero entero ");
        int numero3 = kl.nextInt();

        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");
        System.out.printf("\n\n");
        
        System.out.print("El mas pequeño de los tres es ");
        
        if (numero1<numero2 && numero1<numero3){
            System.out.println(numero1);
        }else if (numero2<numero3){
            System.out.println(numero2);
        }else{
            System.out.println(numero3);
        }

        System.out.printf("\n\n");
        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");
        System.out.printf("\n\n");
        
    }
    
}
