/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up3a1.simarroolivaresjavier;
import java.util.Scanner;

/**
 *
 * 7. Desarrolla un programa que pida una nota entera entre 0 y 10 y muestre
 *    por pantalla su calificación textual:
 *
 *              a. 0-4: suspenso.
 * 
 *              b. 5: aprobado.
 * 
 *              c. 6: bien.
 * 
 *              d. 7-8: notable.
 * 
 *              e. 9-10: sobresaliente.
 *
 * @author 29160712r
 */

public class Ejercicio07 {
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);

        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");        
        
        System.out.printf("\tIntroduce tu nota ");               
        double nota = kl.nextDouble();
        int notaInt = (int)nota;

        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");

        if (nota==notaInt){
            System.out.printf("\n\n\tTu nota de %d corresponde a un", notaInt);
        }else{
            System.out.printf("\n\n\tTu nota de %.2f corresponde a un", nota);
        }
 
        switch(notaInt){
            case 0,1,2,3,4: System.out.print(" Suspenso");break;
            case 5:         System.out.print(" Aprobado");break;
            case 6:         System.out.print(" Bien");break;
            case 7,8:       System.out.print(" Notable");break;
            case 9,10:      System.out.print(" Sobresaliente");break;
            default:        System.out.print("a Mención Honorifica");break;           
        }

        System.out.printf(".\n\n\n–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––\n\n");
        
    } 
    
}
