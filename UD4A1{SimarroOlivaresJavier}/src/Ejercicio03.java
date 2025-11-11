/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 3. Escribe un programa que lea un número entero A que representará el número
 *    de registros bancarios a almacenar, y a continuación, lea A números por
 *    teclado, almacene sus valores en el array, e imprima por pantalla todos
 *    los registros.
 * 
 * @author macky
 */

public class Ejercicio03 {

    public static final String RESET = "\u001B[0m";                             // define Colores ANSI
    public static final String ROJO = "\u001B[31m";
    public static final String FONDO_GRIS = "\u001B[47m";

    public static void main(String[] args){                                     // Inicia el método main
        
        Scanner kl = new Scanner(System.in);
        
        System.out.printf("%sPor fabor indique el número de registros a tratar %s", ROJO, RESET);
        int cantidad = kl.nextInt();
        double[] registro = new double[cantidad];                               // Obtiene el tamaño del array y lo inicia
        
        for (int i = 0; i < cantidad;){
            
            if(i%2 != 0){System.out.print(FONDO_GRIS);}
            System.out.printf("Introduzca el registro %d, quedan %d ", ++i, cantidad-i);
            registro[i-1] = kl.nextDouble();
            
        }
        
        System.out.println();System.out.println();
        
        for (int i = 0; i < cantidad; i++){
            
//           if (registro[i]<10){System.out.print(" ");}
//           if (registro[i]<100){System.out.print(" ");}  
//           if (registro[i]<1000){System.out.print(" ");}
//           if (registro[i]<10000){System.out.print(" ");}
//           if (registro[i]<100000){System.out.print(" ");}
//           if (registro[i]<1000000){System.out.print(" ");}
//           if (registro[i]<10000000){System.out.print(" ");}

            System.out.printf(" %f€ \\\\", registro[i]);
            
        }
        
    kl.close();                                                                 // cierra la instancia kl
        
    }


    
}
