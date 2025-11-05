/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 1. Escribe un programa que permita a los jueces de una competición
 *    almacenar 10 puntuaciones (números reales) y después se impriman
 *    todas ellas por pantalla. No se puede hacer a la vez la introducción
 *    y la impresión por pantalla, deben ser bucles separados
 * 
 * @author javsimoli
 */
public class Ejercicio01 {

    public static final String FONDO_GRIS = "\u001B[47m";
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String NEGRO = "\u001B[30m";
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);
        
        double[] calificaciones = new double[10];
        String[] numeral = new String[]{"Primer","Segundo","Tercero","Cuarto","Quinto","Sexto","Septimo","Octavo","Noveno","Decimo"};
        
        for (int i = 0; i < calificaciones.length; i++){
            
            if (i%2 == 0){System.out.print(FONDO_GRIS);}
            
            System.out.printf("Introduce la calificacion del %s participante %s\n", numeral[i], RESET);
            calificaciones[i] = kl.nextDouble();
            
        }
        System.out.println("_________________________________________________________");
        System.out.println();
                 
        for (int i = 0; i < calificaciones.length; i++){
           
            if (i%2 == 0){System.out.print(FONDO_GRIS);}
           
            System.out.printf("El %s Participante a obtenido %s%.1f%s Puntos%s\n", numeral[i], ROJO, calificaciones[i], NEGRO, RESET);
           
        }
        
        System.out.println("_________________________________________________________");
        System.out.println();
                 
    }
    
    
    
}
