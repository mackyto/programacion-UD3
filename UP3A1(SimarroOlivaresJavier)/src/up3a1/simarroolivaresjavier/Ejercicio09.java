/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up3a1.simarroolivaresjavier;
import java.util.Scanner;

/**
 *
 * 9. Escribe un programa que pida al usuario un número del 1 al 7 y
 *    muestre por pantalla el día correspondiente, donde 1 = lunes.
 *    Utiliza la estructura más adecuada.
 * 
 * @author 29160712r
 */
public class Ejercicio09 {
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);
        
        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");
        System.out.print("Introduce un numero entero del 1 al 7: ");
        int diaSemana = kl.nextInt();
        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");
        System.out.printf("El numero %d es el ", diaSemana);

        switch(diaSemana){
            
            case 1: System.out.println("Lunes");break;
            case 2: System.out.println("Martes");break;
            case 3: System.out.println("Miercoles");break;
            case 4: System.out.println("Jueves");break;
            case 5: System.out.println("Viernes");break;
            case 6: System.out.println("Sabado");break;
            case 7: System.out.println("Domingo");break;

        }

        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");
        
    }
    
}
