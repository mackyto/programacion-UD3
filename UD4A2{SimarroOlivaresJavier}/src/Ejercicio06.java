/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * 6. Crea un programa que inicialice una matriz de tamaño 5x5, la llene de 
 *    números aleatorios reales entre 0.0 y 1.0, y calcule la suma de pesos
 *    de su diagonal principal (https://es.wikipedia.org/wiki/Diagonal_principal).
 * 
 * @author javsimoli
 */

public class Ejercicio06 {
    
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";

    public static void main(String[] args){                                     // Declara el método main.
                
        double[][] matriz = new double[5][5];                                   // Declara la martriz de reales 5x5. 
        double traza = 0.00;
        
        for(int i = 0; i < matriz.length; i++){                                 // Bucle exterior selección de Array.  
                        
            for(int j = 0; j < matriz[i].length; j++){                          // Bucle anidado interior, carga de datos en el array seleccionado de la matriz.
                
                matriz[i][j] = Math.random();                                   // Carga datos en matriz aleatorios de 0.0 a 1.0.

            }

        }

        
        System.out.printf("\n\nmatriz");
        for (int i =0; i < matriz.length; i++){                                 // Bucle exterior impresión de Matriz (filas).
            System.out.printf("\t{");
            for (int j = 0; j < matriz[i].length; j++){                         // Bucle anidado interior (columnas). 
                if(i==j){System.out.print(ROJO);}else{System.out.print(RESET);} // Selector de color de la impresión
                System.out.printf("%f, ", matriz[i][j]);                        // Impresión de los valores seleccionados de la Matriz.
            }System.out.printf("\b\b}\n");}
        
        
        for (int i = 0; i < matriz.length; i++){                                // Bucle de calculo de la traza de la diagonal principal de la matriz cuadrada.

            traza += matriz[i][i];                                              // acumula los valores de la diagonal
        
        }
        System.out.println();System.out.println();        
        System.out.println(ROJO + "La traza de la diagonal principal es igual a " + traza);
        System.out.println();System.out.println();
    }
    
}
