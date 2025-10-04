/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up2a2.simarroolivaresjavier;
import java.util.Scanner;

/**
 * 
 * 6. Crea un programa que solicite nombre, apellidos y edad,
 *    y los muestre en una frase formateada.
 * 
 * @author Javier Simarro Olivares
 */

public class Ejercicio06 {

    public static void main (String[] args){
    
        System.out.print("Por favor indica tu nombre ");
        Scanner keyld = new Scanner(System.in);
        String frase="Tu nombre completo es "+keyld.nextLine()+" ";
        System.out.print("Ahora indica tu primer apellido ");
        frase+=keyld.nextLine()+" ";
        System.out.print("Continua con el ultimo apellido si lo tienes si no pusa 'ENTER' "); 
        frase+=keyld.nextLine();
        System.out.print("por ultimo añade tu edad ");
        frase+=" y tienes "+keyld.nextLine()+" años de edad.";
        System.out.println(frase);
        
    }
    
}
