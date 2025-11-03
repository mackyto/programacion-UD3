/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 10. Crea un mensaje que pida al usuario elegir entre opciones de transporte
 * 
 *          1: Coche. 
 *          2: Bici.
 *          3: Transporte público.
 *          4: A pie. 
 * 
 *     y muestra un mensaje relacionado con el impacto ambiental de cada opción.
 * 
 * @author 29160712r
 */

public class Ejercicio10 {
    
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String AZUL = "\u001B[34m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);
    
        System.out.println("Test de Uso Responsable del transporte");
        System.out.println();
        System.out.println("Tienes que ir a un comercio en tu ciudad, está a 3Km ");
        System.out.println("de tu casa y tienes menos de una hora para ir y volver");
        System.out.println("¿Que medio de transporte usarías?");
        System.out.println();
        System.out.printf("\ta. Ir a pie.\n\n");
        System.out.printf("\tb. Ir en bicicleta.\n\n");
        System.out.printf("\tc. Ir en tranporte público.\n\n");
        System.out.printf("\td. Ir en automóvil.\n\n");        
        
        char seleccion = kl.nextLine().charAt(0); System.out.println();
        
        switch (seleccion){
            case 'a':System.out.printf("%sNo genera CO2, consume menos aire que ningún otro medio, pero no llegaras a tiempo.\n", AZUL);break;
            case 'b':System.out.printf("%sNo genera CO2, consume mas aire que ir a pie pero podras llegar y volver a tiempo, esta es la opción ideal.\n", VERDE);break;
            case 'c':System.out.printf("%sGenera  67 litros de CO2  por Km y persona pero es mas rapido y seguro que la bicicleta, no es la opció ideal.\n", AMARILLO);break;
            case 'd':System.out.printf("%sGenera 150 litros de CO2  por Km y persona es el transporte mas rapido pero es el menos conveniente de todos.\n", ROJO);break;
            
        }
                
        System.err.printf("\n\n%sRecuerda que con indices de PM2.5 superiores a 50 es dañino para la salud ir en bicicleta o andando, es mucho mas seguro el coche o el autobus.\n\n", RESET);
        
        
    }
    
}
