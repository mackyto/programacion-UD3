/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up2a2.simarroolivaresjavier;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * 2. Convierte una temperatura en grados Celsius a Kelvin, utilizando la fórmula apropiada,
 * partiendo de la temperatura dada por el usuario.
 * 
 * @author Javier Simarro Olivares
 */

public class Ejercicio02 {

    public static void main(String[] args){

        System.out.println("Indica una temperatura en grados celsius para calcular su valor en fahrenheit");
        System.err.println("Por favor introduce solo números con comas para decimales o dará error");
        Scanner keyld = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");
        Double celsius =  keyld.nextDouble();
        System.out.println(celsius+"º Celsius son "+df.format((celsius*9/5)+32)+"º Fahrenheit");
        
    }
  
}
