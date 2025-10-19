/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up3a1.simarroolivaresjavier;
import java.util.Scanner;

/**
 *
 * 8. Crea un programa que muestre al usuario un menú con las opciones
 * 
 *         1 sumar
 *         2 restar
 *         3 multiplicar
 *         4 dividir
 *         5 salir
 * 
 *    Cuando el usuario elija la opción (usa un número para identificarlas), 
 *    pide dos números y realiza la operación si es posible.
 *    Utiliza un switch-case.
 * 
 * 
 * @author 29160712r
 */

public class Ejercicio08 {
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);
        double resultado = 0;
        String simbolo = "";
        
        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");                
        System.out.printf("\n\t\t1.- Sumar.\n\t\t2.- Restar.\n\t\t3.- Multiplicar");
        System.out.printf("\n\t\t4.- Dividir.\n\t\t5.- Salir.\n\n");
        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");        
        
        System.out.printf("\n");
        System.out.print("Introduce el primer operando ");
        double numero = kl.nextDouble();

        System.out.print("Introduce el segundo operando ");
        double operando = kl.nextDouble();
        
        System.out.print("Seleccione la operacion 1-5 ");
        int operacion = kl.nextInt();
        System.out.printf("\n");
        
        switch (operacion){
            case 1: resultado = numero + operando; simbolo = "+" ;break;
            case 2: resultado = numero - operando; simbolo = "-" ;break;
            case 3: resultado = numero * operando; simbolo = "*" ;break;
            case 4: resultado = numero / operando; simbolo = "/" ;break;
            case 5: break;
            default: System.out.println("sorpresa");break;
        }
        
        System.out.printf("\n");
        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");
        
        if (operacion<5){      
            System.out.printf("\n\n\t\t%f %s %f = %f\n\n\n",numero, simbolo, operando, resultado);        
            System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");        

        }
        
    }
    
    
}
