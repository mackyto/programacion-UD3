/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up2a2.simarroolivaresjavier;
import java.util.Scanner; // Llamada a la clase Scanner.

/**
 * 
 * 6. Crea un programa que solicite nombre, apellidos y edad,
 *    y los muestre en una frase formateada.
 * 
 * @author Javier Simarro Olivares
 */

public class Ejercicio06 {

    public static void main (String[] args){
    
        System.out.print("Por favor indica tu nombre "); // Imprime mensaje solicitaando el nombre.
        Scanner keyld = new Scanner(System.in); // Se instansia el objeto keyboar-load (keyld) de entrada por teclado hasta salto de linea.
        String frase="Tu nombre completo es "+keyld.nextLine()+" "; // Carga la variable de cadena frase con la entrada por teclado hasta el retorno de carro y la primera parte del mensaje.
        System.out.print("Ahora indica tu primer apellido "); // Imprime mensaje solicitando primer apellido.
        frase+=keyld.nextLine()+" "; // Añade el valor introducido por teclado a la variable frase mas un espacio de separación de palabras. 
        System.out.print("Continua con el ultimo apellido si lo tienes si no pusa 'ENTER' "); // Solicita el segundo o ultimo apellido y sugiere no introducir ninguno si no se tiene.
        String apellido=keyld.nextLine(); // Introduce el volor introducido por teclado en la variable intermedia apellido.
        frase+=apellido; // añade el valor d apellido a frase esta puede contener una cadena vicía o el segundo apellido
        System.out.print("por ultimo añade tu edad "); // Ahora imprime la última solicitud para la edad.
        frase+=(apellido=="" ? "":" ")+"y tienes "+keyld.nextLine()+" años de edad."; // Añade un espacio o no en base del valor de apellido, suma el formato del mensaje mas la edad introducida por teclado
        System.out.println(frase);  // Imprime la variable frase con el mensaje formateado.
        
    }
    
}
