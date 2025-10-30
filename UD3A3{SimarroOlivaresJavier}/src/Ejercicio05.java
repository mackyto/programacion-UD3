/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 5. Crea un programa que muestre un menú por pantalla donde ofrezca las opciones:
 *
 *          a. Pasar de euros a dólares.
 * 
 *          b. Pasar de metros a pies.
 * 
 *          c. Salir
 * 
 *    Se realizará la operación solicitada y se volverá a mostrar el menú hasta que el usuario elija la opción de salir.
 * 
 * @author 29160712r
 */
public class Ejercicio05 {
    
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";

    public static void main(String[] args){
    
        Scanner kl = new Scanner(System.in);
        
        final double EURODOLAR = 1.16, METROPIE = 3.28084;
        double euros = 0.0; metros = 0.0;
        
        do {
    
            System.out.printf("\tDe Metrica a Imperial Menú\n");
            System.out.println("-----------------------------------------------------");
            System.out.printf("\ta. Cambio de divisa de Euros a Dolares\n\n");
            System.out.printf("\tb. Cambio de Longitud de Metros a Pies\n\n");
            System.out.printf("\tc. Salir\n");
            System.out.println("-----------------------------------------------------");
    
            String opcion = kl.nextLine();
            
            switch (opcion){
                case "a": System.out.println("Introduce Euros ");
                        euros = kl.nextDouble();
                        System.out.printf("El resultado en dolares son %.2f$ ", euros*EURODOLAR);break;
                case "b":  System.out.println("Introduce Metros ");
                        metros = kl.nextDouble();
                        System.out.printf("El resultado en pies son %.2f$ ", metros*METROPIE);break;
    
            }        
        
        }while(opcion.equals("c"));
    
    }    
    
    
}
