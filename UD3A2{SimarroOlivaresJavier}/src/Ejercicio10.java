/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 10. Vuelve a hacer el ejercicio 1 pero utilizando esta vez un bucle do…while.
 * 
 *  1. Crea un programa que imprima los números del 1 al 15 utilizando un bucle
 *     for.
 * 
 * @author macky
 */

public class Ejercicio10 {

    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    
    public static void main(String[] args){
    
        int contador = 1;

        do {
            
            if(contador<10){System.out.print(" ");}
            System.out.printf(" %d",contador);

            if(contador++ % 5 == 0){System.out.printf("\n%s-----------------%s\n",ROJO,RESET);}
            
        }while (contador<=15);
        
    }
    
}
