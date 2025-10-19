/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up3a1.simarroolivaresjavier;
import java.util.Scanner;

/**
 *
 * 
 * 10. La eficiencia de la instalación eléctrica puede medirse según su consumo eléctrico
 *     mensual en kWh. Si el consumo es menor a 100 kWh, se considera un consumo eficiente.
 *     Si se encuentra entre 100 y 300 kWh, se considera un consumo medio.
 *     Por último, si es mayor de 300 kWh, se considera un consumo elevado.
 *     Escribe un programa que lea por teclado el consumo mensual en kWh e imprima por
 *     pantalla el tipo de consumo.
 * 
 * 
 * @author 29160712r
 */

public class Ejercicio10 {

    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);

        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");        
        System.out.print("Introduce tu comsumo mensual en KWh ");
        double consumo = kl.nextDouble();
        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");        

        System.out.printf("\n\n\tMenor de 100KWh/mes ");
        if (consumo<100){
            System.out.print("<====================");
        }
        
        System.out.printf("\n\n\tMenor de 200KWh/mes ");
        if (consumo>100 && consumo<200){
            System.out.print("<====================");
        }
        
        System.out.printf("\n\n\tMenor de 300KWh/mes ");
        if (consumo>200 && consumo<300){
            System.out.print("<====================");
        }

        System.err.printf("\n\n\tMayor de 300KWh/mes ");
        if (consumo>300){
            System.err.print("<====================");
        }        

        System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");        
        System.out.printf("\n\nCon %.3fKWh al mes tu consumo  es ", consumo);
        
        if (consumo<100){
            System.out.println("eficaz");
        }else if 
        
    }
    
}
