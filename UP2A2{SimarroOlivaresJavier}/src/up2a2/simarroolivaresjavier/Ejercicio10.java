/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up2a2.simarroolivaresjavier;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * 10. Lee un número decimal por teclado y conviértelo en un porcentaje.
 * 
 * @author Javier Simarro Olivares
 */

public class Ejercicio10 {
    
    public static void main(String[] args){
    
        Scanner keyld =new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("00");
        System.err.println("Por favor introduce solo números o dará error");
        System.out.print("Por favor introduce los decimalesl 0,");
        String texNumero ="0."+keyld.nextLine();
        Double numero =Double.parseDouble(texNumero);
        System.out.println("El tanto porcien del numero decimal sin redondeo es "+(int)(numero*100)+"%");
        System.out.println("El tanto porcien del numero decimal redondeado es "+df.format(numero*100)+"%");
    
    }
    
}
