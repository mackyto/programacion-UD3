/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 2. Crea un programa que pida números de forma indefinida hasta que el
 *    usuario introduzca un 0, y sume aquellos que son positivos. Cuando
 *    el usuario introduzca el 0, muestra por pantalla el resultado de la suma.
 * 
 * 
 * @author javsimoli
 */
public class Ejercicio02 {
    
    public static final String ROJO = "\u001B[31m";
    public static final String RESET = "\u001B[0m";
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);
        int numero, resultado = 0;
        
        System.out.println("Para salir Pulsa '0' y obtenbras el resultado");
        System.out.println("Introduce un numero positivo entero ");
        
        do{
            
            numero = kl.nextInt();
            
            System.out.printf("\t");
            
            if(numero > 0){
                resultado += numero;}
                                        
        }while(numero != 0);
        
        System.out.print(" + ");

        System.out.println(" = " + resultado);
        
        
    }
    
}
