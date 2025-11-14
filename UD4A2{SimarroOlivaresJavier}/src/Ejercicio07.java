/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 7. Escribe un programa que cree una matriz de números enteros de tamaño 20x20
 *    y, mientras el usuario no introduzca por teclado el valor -1, se solicite
 *    que indique (en orden) la fila, la columna y el valor para dicha celda de
 *    la matriz (fila y columna empiezan en 0 y el valor debe ser un número >= 0). 
 *    Cuando el usuario introduzca -1, imprime por pantalla la matriz obtenida.
 * 
 * @author macky
 */
public class Ejercicio07 {
    
    public static final String RESET = "\u001B[0m";                             // Define colores ANSI en constantes.
    public static final String ROJO = "\u001B[31m";
    public static final String AZUL = "\u001B[34m";
    public static final String VERDE = "\u001B[32m";
    public static final String FONDO_GRIS = "\u001B[47m";
    
    public static void main(String[] args){                                     // Declara el método main.
        
        Scanner kl = new Scanner(System.in);                                    // Inincializa la instancia Scanner.
        
        int[][] numeros = new int[20][20];                                      // Declara las matrices.
        boolean[][] cambios = new boolean[20][20];        
        
        int linea = 0, columna = 0, data = 0;                                    // Declara e inicia las variables.
        
        for (int i = 0; i < numeros.length; i++){                               // carga la matriz numeros con una sucesión incremental de enteros.
            for (int j = 0; j < numeros[i].length; j++){
                numeros[i][j] = i + j;cambios[i][j] = false;
        }}     

        do{                                                                     // Bucle principal de actualización de datos.
            
            System.out.println("Para salir introduce '-1' en cualquier entrada del datos");
            System.out.println();
 
            System.out.print(VERDE + "Indica la Línea o Array de 1-20 ");        // Indica la fila, sale con -1
            linea = kl.nextInt();
            if(linea == -1){break;}
            
            System.out.print(VERDE + "Indica la Columna o Registro de 1-20 ");  // Indica la columna, sale con -1 
            columna = kl.nextInt();
            if(columna == -1){break;}
            
            do{                                                                 // Introduce el data desde -1 hasta 999 de lo contrario repite 
            System.out.print(AZUL + "Indica el valor del Registro <1000 ");
            data = kl.nextInt();
            if(data == -1){break;}
            }while (data < 0 || data > 999);
            
            numeros[--linea][--columna] = data;                                 // Actualiza la matriz de datos y la booleana de gestión de color
            cambios[linea][columna] = true;
        
        }while(true);                                                           // cierra el Bucle sin condición
        
        
        for (int i =0; i < numeros.length; i++){                                // Bucle exterior impresión de Matriz (filas).
        
            System.out.printf("\n\nmatriz[");
            if(i<10){System.out.print(" ");}
            System.out.printf("%d]{", i);
            
            for (int j = 0; j < numeros[i].length; j++){                         // Bucle anidado interior (columnas). 

                if (numeros[i][j] >= 0){                                         // Ajuste de tabulación dependiendo de la resolución del número.
                    System.out.print(" ");}                
                if (numeros[i][j] < 10 && numeros[i][j] > -10){
                    System.out.print(" ");}
                if (numeros[i][j] < 100 && numeros[i][j] > -100){
                    System.out.print(" ");}  
//                if (numeros[i][j] < 1000 && numeros[i][j] > -1000){
//                    System.out.print(" ");}
//                if (numeros[i][j] < 10000 && numeros[i][j] > -10000){
//                    System.out.print(" ");}
//                if (numeros[i][j] < 100000 && numeros[i][j] > -100000){
//                    System.out.print(" ");}
//                if (numeros[i][j] < 1000000 && numeros[i][j] > -1000000){
//                    System.out.print(" ");}
//                if (numeros[i][j] < 10000000 && numeros[i][j] > -10000000){
//                    System.out.print(" ");}
                
                if(cambios[i][j]){                                              // Controla el color de las modificadas
                    System.out.print(ROJO);
                }else{System.out.print(RESET);}
                
                System.out.printf("%d, ", numeros[i][j]);                       // Impresión de los valores seleccionados de la Matriz. 
                
            }
        
            System.out.printf("\b\b}\n\n");
            
        }
        
    }
    
    
}
