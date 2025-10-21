/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up3a1.simarroolivaresjavier;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * 4. Basándote en el ejercicio anterior, crea un programa que pida al usuario su edad 
 *    y lo clasifique en:
 * 
 *      Menor de edad (menor de 18 años).
 * 
 *      Adulto (entre 18 y 64 años).
 *
 *      Anciano (más de 65 años).
 * 
 * 
 * @author 29160712r
 */

public class Ejercicio04B {

    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);
        final int AÑO = LocalDate.now().getYear();
        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");
        
        System.out.print("Introduce tu edad o año de nacimiento completo ");
        int edadAño = kl.nextInt();
        
        if (edadAño>1000){
            edadAño = AÑO - edadAño;
        }
        
        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");
        
        System.out.printf("\n\nCon la edad de %d años eres ", edadAño);
        
        if (edadAño<18){
            System.out.print("menor de edad");
        }else if(edadAño<65){
            System.out.print("adulto");
        }else{
            System.out.print("anciano");
        }
        
        System.out.printf(".\n\n\n");
        System.out.printf("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––\n\n");
        
    }

    
}
