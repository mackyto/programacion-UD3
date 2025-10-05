/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up2a3.simarroolivaresjavier;
import java.util.Scanner; // Lamma la libreria Scanner.
import java.text.DecimalFormat; // Llama la libreria DecimalFormat.

/**
 *
 * 1. Un restaurante te ha pedido una pequeña aplicación que calcule el total que debe pagar un cliente, incluyendo la propina.
 *    El usuario introduce el importe de la cuenta y el porcentaje de propina que desea dejar.
 *    El programa debe mostrar el importe total a pagar.
 *
 * 
 * @author Javier Simarro Olivares
 */

public class Ejercicio01 {

    public static void main(String[] args){ // Creamos el método

        Scanner keyld=new Scanner(System.in); // Se crea la instancia keyboard load (keyld) de la libreria Scanner.
        DecimalFormat df=new DecimalFormat("#.00"); // See crea la instancia df de la libreria Decimalform.
        System.out.println("Por favor introduce solo números con comas para decimales o dará error");  // Aviso de limitación de introducción de tipos.  
        System.out.print("Introduzca el importe total de la cuenta "); // Imprime mensaje solicitando el importe.
        double precioCuenta=keyld.nextDouble(); // Carga el valor introducido por teclado en la variable precioCuenta.
        System.out.print("Introduce el porcentaje de propina que se va a aplicar "); // Imprime el mensaje solicitando el porcentaje de propina a aplicar.
        double porcentajePropina=keyld.nextDouble(); // Carga el valor introducido por teclado en la variable porcentajePropina.
        System.out.println("La propina de una cuenta de "+precioCuenta+"€ de gasto con un porcentaje de propina de "+porcentajePropina+"%"); //Primera parte del mensaje de salida.
        System.out.println("da como resultado una propina de "+df.format(precioCuenta*porcentajePropina/100)+"€"); // Mensaje de salida final y calculo e impresión del procentaje de propina para los datos introducidos.
    
    }

}
