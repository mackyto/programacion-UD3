/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author javsimoli
 */
public class BucleIteraciones {
    public static void main(String[] args){
        
        int debug_test = 1;
        Scanner sc = new Scanner(System.in);
            debug_test = 2;
        
        System.out.print("¿Cuantas iteraciones quieres hacer?");
            debug_test = 3;
        
        int numIteraciones = sc.nextInt();
            debug_test = 4;
        
        // Bucle 10 iteraciones o las que indique el usuario
        for(int i=1; i <= numIteraciones; i++){
            
            System.out.println("Iteración número: " + i);
                debug_test = 5;
            
        }
    
        System.out.println("");
            debug_test = 6;
        
        
    }
    
    
}
