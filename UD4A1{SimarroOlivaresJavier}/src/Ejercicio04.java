/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 4. Escribe un programa que, para una simulación científica, cree un array de
 *    tamaño 100 y almacene en cada una de sus posiciones un número real
 *    aleatorio entre 0.0 y 1.0. Puedes utilizar la función Math.random().
 *    Después, pide al usuario un número entre 0.0 y 1.0 e indica cuántos
 *    números del array son estrictamente mayores que el introducido.
 * 
 * @author macky
 */

public class Ejercicio04 {

    public static final String RESET = "\u001B[0m";                             // Define colores ANSI
    public static final String ROJO = "\u001B[031m";
    public static final String FONDO_GRIS = "\u001B[47m";
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);                                    // Define la instancia Scanner kl
        
        double[] matriz = new double[100];                                      // Define el array matriz[100]
        int contador = 0;
        
        for (int i = 0; i < 100; i++){matriz[i] = Math.random();}               // Rellena el array matriz[100] con cifras aleatorias de 0 a 1
        
        System.out.print("Indica el valor de corte hasta tres decimales 0.000 a 1 = ");
        double corte = kl.nextDouble();                                         // Valor de corte 
        
        for (int i = 0; i < matriz.length; i++){                                // Cálculo de los indices de rango superior en contador.
        
            if (matriz[i] > corte){contador++;}
        
        }
        
        System.out.printf("\n\n%s%sEl total de valores", FONDO_GRIS, ROJO);     // Impresion de resultados con formato.
        System.out.printf(" de la matriz superiores a %.3f", corte);
        System.out.printf(" son %d que equivale al %d%%\n\n", contador, contador);
        
        kl.close();                                                             // cierra la instancia
        
    }
    
}
