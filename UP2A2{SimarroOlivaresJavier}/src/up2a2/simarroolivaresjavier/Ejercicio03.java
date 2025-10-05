/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up2a2.simarroolivaresjavier;
import java.util.Scanner; // Llamada a la clase Scanner.
import java.text.DecimalFormat; // Llamada a la clase DecimalFormat.
        
/**
 * 
 * 3. Desarrolla un programa que solicite el importe de una cuenta en un restaurante
 *    y calcule tres opciones de propina: 10%, 15% y 20%.
 * 
 * @author Javier Simarro Olivares
 */

public class Ejercicio03 {
    
    public static void main(String[] args){ 
        
        Scanner keyld = new Scanner(System.in); // Se instansia el objeto keyboar-load (keyld) de entrada por teclado hasta salto de linea.
        DecimalFormat df = new DecimalFormat("#.00"); // Se formatea el número de decimales con redondeo en la instancia 'df'.
        System.err.println("Por favor introduce solo números con comas para decimales o dará error"); // Aviso de limitación de introducción de tipos.
        System.out.print("La suma de la cuenta del restaurante es de "); // Imprime la petición de entrada requerida, el valor de la cuenta euros y centimos tipo Double
        Double suma = keyld.nextDouble(); // Carga la variable tipo Double 'suma', con el valor introdicido por teclado hasta el retorno de carro 'ENTER'.
        System.out.println("Al 10% de propina debes dar "+df.format(suma*0.1)+"€"); // Imprime mensaje y valor de la propina al 10%
        System.out.println("Al 15% de propina, esta sube a "+df.format(suma*0.15)+"€"); // Imprime mensaje y valor de la propina al 15%
        System.out.println("Al 20% de propina tiene un coste de "+df.format(suma*0.2)+"€"); // Imprime mensaje y valor de la propina al 20%
        
    }
    
}
