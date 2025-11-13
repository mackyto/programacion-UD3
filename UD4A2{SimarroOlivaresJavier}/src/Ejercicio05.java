/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 5. Crea un programa que inicialice una matriz de tamaño 5x5 y lea por 
 *    teclado cada uno de sus elementos (números enteros).
 * 
 * @author javsimoli
 */

public class Ejercicio05 {

    public static void main(String[] args){                                     // Declara el método main.
        
        Scanner kl = new Scanner(System.in);                                    // Inicia la instancia Scanner.
        
        int[][] matriz = new int[5][5];                                         // Declara la martriz de enteros 5x5. 
        
        for(int i = 0; i < matriz.length; i++){                                 // Bucle exterior selección de Array.  
            
            System.out.println("Se procede a completar la linea " + (i+1) + " de la matriz.");
            
            for(int j = 0; j < matriz[i].length; j++){                          // Bucle anidado interior, carga de datos n el array seleccionado de la matriz.
                
                System.out.printf("Para el array %d en la columna %d dame su valor en número entero ", i+1, j+1);
                matriz[i][j] = kl.nextInt();                                    // Carga datos en matriz desde el teclado.
                
            }

        }
        
                
        System.out.printf("\n\nmatriz");
        
        for (int i =0; i < matriz.length; i++){                                 // Bucle exterior impresión de Matriz (filas).
        
            System.out.printf("\t{");
            
            for (int j = 0; j < matriz[i].length; j++){                         // Bucle anidado interior (columnas). 

                if (matriz[i][j] >= 0){                                         // Ajuste de tabulación dependiendo de la resolución del número.
                    System.out.print(" ");}                
                if (matriz[i][j] < 10 && matriz[i][j] > -10){
                    System.out.print(" ");}
                if (matriz[i][j] < 100 && matriz[i][j] > -100){
                    System.out.print(" ");}  
                if (matriz[i][j] < 1000 && matriz[i][j] > -1000){
                    System.out.print(" ");}
                if (matriz[i][j] < 10000 && matriz[i][j] > -10000){
                    System.out.print(" ");}
                if (matriz[i][j] < 100000 && matriz[i][j] > -100000){
                    System.out.print(" ");}
                if (matriz[i][j] < 1000000 && matriz[i][j] > -1000000){
                    System.out.print(" ");}
                if (matriz[i][j] < 10000000 && matriz[i][j] > -10000000){
                    System.out.print(" ");}
                
                System.out.printf("%d, ", matriz[i][j]);                        // Impresión de los valores seleccionados de la Matriz. 
                
            }
        
            System.out.printf("\b\b}\n\n");
            
        }
        
        kl.close();                                                             // Cierra la instancia scanner.
        
    }
    
}
