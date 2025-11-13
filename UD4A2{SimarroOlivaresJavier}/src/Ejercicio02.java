/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * 2. Escribe un programa que cree un array de números enteros con los valores
 *    iniciales 0, 4, 2, 6, 8, 3, ordénalo utilizando el método correspondiente
 *    y muestra todos los elementos del array por pantalla.
 * 
 * @author macky
 */

public class Ejercicio02 {

//    public static final String RESET = "\u001B[0m";
//    public static final String ROJO = "\u001B[31m";
//    public static final String AZUL = "\u001B[34m";
//    public static final String FONDO_GRIS = "\u001B[47m";
            
    public static void main(String[] arg){                                      // Declara el metodo main.
        
        int[] datos = {0,4,2,6,8,3};                                            // Inincia el vector con valores deordenados.

        System.out.printf("datos{");                                            // Imprime el vector desordenada.
        for (int i = 0; i < datos.length; i++){
            System.out.printf("%d, ", datos[i]);
        }System.out.printf("\b\b} Ordenación original.\n"); 
        
        Arrays.sort(datos);                                                     // Ordena de forma ascendente los valores del vector

        System.out.printf("datos{");                                            // Imprime el vector ordenado.
        for (int i = 0; i < datos.length; i++){
            System.out.printf("%d, ", datos[i]);
        }System.out.printf("\b\b} Ordenados por orden ascendente.\n\n");
    
    }
            
}
