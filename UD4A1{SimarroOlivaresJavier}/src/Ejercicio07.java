/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 7. Escribe un programa que pida dos números a y b, cree un array que almacene
 *    todos los valores entre ellos (incluidos) y, finalmente, los imprima por
 *    pantalla.
 * 
 * @author macky
 */

public class Ejercicio07 {
    
    public static final String RESET = "\u001B[0m";                             // Define colores ANSI.
    public static final String ROJO = "\u001B[31m";
    public static final String FONDO_GRIS = "\u001B[47m";
    
    public static void main(String[] args){                                     // Inicia el étodo main.
        
        Scanner kl = new Scanner(System.in);                                    // Inicia la instancia Scaner.
        
        System.out.println("Introduce dos números enteros como límite de los valores del array"); 
        System.out.print("El primer valor = ");int num1 = kl.nextInt();         
        System.out.print("El segundo valor = ");int num2 = kl.nextInt();        // Solicita y carga los dos numeros limite del rango.

        int[] datos = new int[1+Math.abs(num1-num2)];                           // Define el array y su tamaño.
        
        for(int i = 0 ;i < datos.length; i++){                                  // Bucle de llenado de datos del array.
        datos[i] = num1;                                                        // Usa el primer marcador para rellenar el array.
        if(num1 <= num2){num1++;}else{num1--;}                                  // Incrementa o decrementa el marcador en base a los valores del rango.
        }
        
        for (int i = 0; i < datos.length; i++){                                 // bucle de impresión del array.
            System.out.print(datos[i] + " // ");
        }
               
        kl.close();                                                             // Cierra la instancia Scanner.
    
    }
    
}
