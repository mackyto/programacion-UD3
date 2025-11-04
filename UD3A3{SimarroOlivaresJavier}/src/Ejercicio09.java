/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 9. Crea un programa que pida al usuario que indique cuántas notas va a
 *    introducir y, a continuación, lea ese número de notas entre 0 y 10.
 *    Tras ello, debe imprimir por pantalla la nota media.
 * 
 * @author 29160712r
 */
public class Ejercicio09 {                                                      // Define la clase.
    
    public static final String RESET = "\u001B[0m";                             // Colores ANSI de terminal, definidos en constantes.
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    
    public static void main(String[] args){                                     // Define el método main.
        
        Scanner kl = new Scanner(System.in);                                    // Define instancia escaner las variables y las inicia.
        double nota = 0.00, dato = 0.00;
        String color = RESET, espacio = "";
        
        System.out.print("Indique cuantas notas va a introducir: ");            // solicita can tidad de notas lo carga en cantidad.
        int cantidad = kl.nextInt();

        System.out.print("Introduzca las notas de 0 a 10, con o sin decimales.");
        System.out.println(" Se incluyen un máximo de tres decimales");         // Mensaje de aclaración de tipo de entrada de datos (nota).

        
        for(int i = cantidad; i>=1; i--){                                       // Inicio de bucle cantidad de notas decremental para apuntador de resto.
            
            do{
            
                System.out.printf("Introduce la nota (quedan %d) ", i);         // Solicita la nota y comprueba que esta en el rango la guarda en dato.
                dato = kl.nextDouble();
            
            }while(dato < 0 || dato > 10);
            
            nota += dato;                                                       // Acumula las notas válidas en nota.
            
        }                                                                       // Cierra el bucle.
        
        nota/=cantidad;                                                         // Obtención e la nota media.
        
        if(nota < 5){color = ROJO;}                                             // Esquema de color de la impreión de la nota en base a su calificación.
        else if (nota < 6){color = AMARILLO;}                                   // Atraves de la variable de cadena espacio.
        else if (nota < 7){color = AZUL;}
        else if (nota < 9){color = VERDE;}
        else if (nota <=10){color = MAGENTA;}
        
        if(nota < 10){espacio = " ";}                                           // Ajuste de tabula para notas de un digito.
        
        System.out.println();                                                   // Cuadro de impresión del resultado de Nota Media Final
        System.out.println("Nota Media");
        System.out.println(" ________");
        System.out.println("|        |");
        System.out.printf("| %s%.3f%s %s|\n",color, nota, RESET, espacio);
        System.out.println("|________|");
        System.out.println();
        
    }                                                                           // Cierra el metodo.
    
}                                                                               // Cierra la clase.
