/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 7. Crea un programa que imprima todos los números entre el 1 y el 150 y,
 *    para todos los múltiplos de 7.
 *    Imprima la palabra “Múltiplo” al lado del número.
 * 
 * @author macky
 */

public class Ejercicio07 {
    
    public static final String RESET= "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    
    public static void main(String[] args){
        
    for (int i = 1; i <= 150; i++){
        
        if (i<10){System.out.print(" ");}
        if (i < 100){System.out.print(" ");}
     
        if (i % 7 == 0){
            System.out.printf("%s%d%s Multiplo    ",ROJO,i,RESET);
        }else{System.out.printf("%d             ", i);}
        
        if (i % 9 == 0){System.out.println();}
    
        }    
    System.out.println();
    
    }
    
}
