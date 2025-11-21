/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * 6. Escribe un programa que cree una lista de 10 enteros y muestre un menú 
 *    con tres opciones:
 * 
 *           a. Imprimir valores de la lista.
 *           b. Introducir valor
 *           c. Salir
 *
 *    Si el usuario escribe por teclado ‘a’, el programa deberá mostrar los
 *    valores almacenados en la lista. Si escribe ‘b’, el programa debe leer un
 *    valor n y una posición p y guardar el valor n en la posición p de la
 *    lista, sustituyendo el valor existente. Por último, si escribe ‘c’, 
 *    el programa debe terminar (no terminará antes de que suceda esto).
 * 
 * @author macky
 */

public class Ejercicio06 {
    
    public static void main(String[] args){
        
        // Inicialización de Variables e Instancias
        Scanner kl = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        char opcion = ' ';
        int orden = 0, valor = 0;
        
        // Bucle de carga de Lista
        for (int i = 0; i < 10; i++){lista.add((int)(Math.random()*10000));}
        
        // Bucle de Repetición de Código.
        do{
  
            // Imprimir Ménu.
            System.out.println("Selecciona una opción");
            System.out.println();
            System.out.println("    a.- Imprimir Lista");
            System.out.println();
            System.out.println("    b.- Cambiar un valor");
            System.out.println();
            System.out.println("    c.- Salir");
            System.out.println();
        
            // Introducción de Opción.
            opcion = kl.nextLine().toLowerCase().charAt(0);
        
            
            switch(opcion){
                
                // Impresión de la Lista.
                case 'a':
                    for(int i = 0; i < lista.size(); i++){
                        System.out.println((i+1) + "  " + lista.get(i));
                    };break;

                // Cambio de Valor de registro
                case 'b':
                    
                    // Escoge el número de orden
                    do{
                        System.out.print("Introduce el número de orden: ");
                        orden = kl.nextInt()-1;
                        kl.nextLine(); // Limpiar el buffer después de nextInt()
                    }while(orden < 0 || orden >= lista.size());
                    
                    // Cambip de valor de registro.
                        System.out.print("Introduce el valor a guardar: ");
                        valor = kl.nextInt();
                    kl.nextLine(); // Limpiar el buffer después de nextInt()
                
                    // Operación y aviso.
                    lista.set(orden, valor);
                    System.out.println("Valor cambiado correctamente.");break;

                // Salida del bucle.    
                case 'c':
                System.out.println("Saliendo del programa...");break;

                // Opción incorrecta.
                default:
                System.out.println("Opción no válida. Intente nuevamente.");
        }
        
            System.out.println();
        
        }while(opcion != 'c');// Opción de Salida.
            
        kl.close();// cierra la instancia Scanner.
        
    }
}
