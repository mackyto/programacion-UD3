import java.util.Scanner;

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
    
        System.out.println("Fin del programa");
            debug_test = 6;
        
    }
    
}
