/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 1. Escribe un programa que lea por teclado el nombre de 10 cartas y su 
 *    probabilidad (la suma de todas las probabilidades debe ser 1).
 *
 *    Utiliza dos arrays: 
 * 
 *       uno para representar el nombre
 *       otro para la probabilidad. 
 * 
 *    Las posiciones de ambos deben corresponderse. A continuación, saca un
 *    número aleatorio entre 0.0 y 1.0 y muestra por pantalla qué carta ha
 *    tocado (habrá tocado la carta que, al sumar las probabilidades acumuladas,
 *    esta suma sea mayor o igual que el número aleatorio. Por ejemplo, si la
 *    primera carta tiene una probabilidad del 0.2, la segunda del 0.3, la 
 *    tercera del 0.1 y el número aleatorio es 0.55, la carta que habrá tocado 
 *    será la tercera, puesto que la suma de las probabilidades de la primera 
 *    y la segunda carta no llegan al número obtenido aleatoriamente)
 * 
 * @author javsimoli
 */

public class Ejercicio01 {

    public static final String RESET = "\u001B[0m";                             // Define colores ANSI en constantes.
    public static final String ROJO = "\u001B[31m";
    public static final String AZUL = "\u001B[34m";
    public static final String FONDO_GRIS = "\u001B[47m";

    public static void main(String[] args){                                     // Define método main.

        Scanner kl = new Scanner(System.in);                                    // Inicia la instancia Scanner.

        double[] probabilis = new double[10];                                    // Define los arrays necesarios.
        String[] nombres = new String[10];
        int proba = 0, probaAcum;

        for (int i = 0; i < nombres.length; i++){                               // Bucle de escritura de datos del nombre.
            if(i%2 == 1){System.out.print(FONDO_GRIS);}
            System.out.printf("Rellena el nombre de la carta %d ",i+1);
            nombres[i] = kl.nextLine();
        }

        System.out.printf("\n\n\n");

        do{                                                                     // Bucle de repetición probabilidad menor que uno. 

            probaAcum = 0;

            for (int i =0; i < probabilis.length; i++){                         // Bucle de escritura de array de probabilidades.

                do{                                                             // Bucle de repetición probabilidades sobre pasadas.
                    if (probaAcum > 100){probaAcum -= proba;}                   // Recupereción de valor anterior ante repetición por exeso.
                    if(i%2 == 1){System.out.print(FONDO_GRIS);}
                    System.out.printf("Asigna la probabilidad de aparecer de la carta %s registro %d. La probabilidad restante es %d%% ", nombres[i], i+1, 100-probaAcum);
                    proba = kl.nextInt();
                    probaAcum += proba;

                }while(probaAcum > 100);                                        // Condición de repetición por sobre pasar valor de probabilidad.

                probabilis[i]=proba;probabilis[i]/=100;                         // Recarga la matriz.            

            }

        }while(!(probaAcum == 100));                                            // Condición de repetición por defecto de valor de probabilidad.

//        for (int i = 0; i < probabilis.length; i++)                           // Imprime el array de probabilidades.
//        {System.out.printf("%f %s ",probabilis[i],nombres[i]);}

        double elecion = Math.random(), acum = 0;                               // Carga la selección aleatoria.
        int i = 0;                                                              // inicialización de variables.

        do{                                                                     // Bucle en busca de la carta escogida.

            acum += probabilis[i++];                                            //

        }while(elecion  >=  acum);                                              // Condicion de salida superada probabilidad.

        System.out.printf("\n\nLa carta ganadora es %s con la probabilidad de %f y un acumulado de %f\n\n", nombres[--i], elecion, acum);
        System.out.println();                                                   // Imprime los resultados.

        kl.close();                                                             // Cierra la instancia Scanner.
        
    }

}