/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up2a2.simarroolivaresjavier;
import java.util.Scanner;
import java.text.DecimalFormat;
        
/**
 *3. Desarrolla un programa que solicite el importe de una cuenta en un restaurante
 *   y calcule tres opciones de propina: 10%, 15% y 20%.
 * 
 * @author 29160712r
 */

public class Ejercicio03 {
    
    public static void main(String[] args){
        
        Scanner keyld = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("La suma de la cuenta del restaurante es de ");
        System.err.println("Por favor introduce solo números con comas para decimales o dará error");
        Double suma = keyld.nextDouble();
        System.out.println("Al 10% de propina debes dar "+df.format(suma*0.1)+"€");
        System.out.println("Al 15% de propina, esta sube a "+df.format(suma*0.15)+"€");
        System.out.println("Al 20% de propina tiene un coste de "+df.format(suma*0.2)+"€");
        
    }
    
}
