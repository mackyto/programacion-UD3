/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * Crea un programa que defina una contraseña en una constante y le pida al
 * usuario que la introduzca. Si es correcta, mostrará un mensaje indicándolo.
 * Si no, tras tres intentos fallidos mostrará un mensaje de error.
 * 
 * @author 29160712r
 */
public class Ejercicio03 {
    
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);
        final String CONTRASEÑA = "hqxjt8Z%";
        String texto = "";
        
        for (int i = 1; i <= 3; i++){
            
            switch (i){
                    
                case 1:System.out.print("Por favor, introduzca la contraseña ");break;
                case 2:System.out.print("Segundo intento, por favor introduzca la contraseña ");break;
                case 3:System.out.printf("%sÚltimo intento, por favor introduzca, por ultima vez, la contraseña %s", ROJO, RESET);break;
            
            }
                
            if (CONTRASEÑA.equals(kl.nextLine())){
            
                System.out.println("Contraseña correcta");
                break;
                
            }else if (i == 3){System.err.println("¡¡¡MAL111 has Fallado todos los intentos");}            
            
        }

    }
    
}