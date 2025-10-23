/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 8. Utilizando un bucle while, crea un programa que imprima todos los
 *    números impares entre -15 y 15
 * 
 * @author macky
 */
public class Ejercicio08 {
    
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    
    public static void main(String[] args){
        
        int numero = -15;
        System.out.println(ROJO);
        
        do {
            if (numero == 1){System.out.println(RESET + "\n---------------------------------------");}
            if (numero > -10 && numero < 0){System.out.print(" ");}
            if (numero > 0 && numero < 10){System.out.print("  ");}
            if (numero > 9){System.out.print(" ");}
            System.out.printf("%d  ",numero);
            numero+=2;
        }while (numero <=15);
    System.out.printf("\n\n");
    }
    
}
