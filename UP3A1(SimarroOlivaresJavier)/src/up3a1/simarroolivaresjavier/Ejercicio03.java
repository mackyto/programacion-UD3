/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up3a1.simarroolivaresjavier;
import java.util.Scanner;

/**
 *
 * 3. Crea un programa que pida al usuario su edad e imprima por pantalla si es mayor o menor de edad.
 * 
 * @author 29160712r
 */

public class Ejercicio03 {
   
    public static void main (String[] args){
        
        Scanner kl = new Scanner(System.in);
        
        System.out.print ("Indica tu edad o año de nacimiento completo ");
        int edadAno = kl.nextInt();
        
        if (edadAno < 18 || edadAno > 1000 && !(edadAno < 2007)){
            System.out.println("Eres menor de edad");
        }else{
            System.out.println("Eres mayor de edad");
        }
    
    }
        
}