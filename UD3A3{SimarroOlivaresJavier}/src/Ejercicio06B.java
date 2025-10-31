/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * Crea un programa que genere un número entero aleatorio (puedes usar la clase
 * Random o el método Math.random) y le pida al usuario que intente adivinarlo. 
 * Si se introduce un número fuera del rango (1 a 10), debe pasar a la siguiente
 * iteración.
 * 
 * @author javsimoli
 */

public class Ejercicio06B {
    
    public static void main(String[] args){
        
        Scanner kl = new Scanner(System.in);
        final int ADIVINA = (int)Math.round(Math.random()*10);
        int propuesta = 0, mensaje = 1;
        String texto = "";
        
        System.out.println("Prueba a adivinar un número");

        do {
            
            switch (mensaje){
                
                case 1: texto = "Introduce un número entero del 1 al 10: ";break;
                case 2: texto = "Lo vas a conseguir: ";break;
                case 3: texto = "Vuelve a intentarlo: ";break;
                case 4: texto = "Tu puedes: ";break;
                case 5: texto = "Te va a salir a la proxima: ";break;
                case 6: texto = "No te rindas campeón: ";break;
                case 7: texto = "Un fallo lo tiene cualquiera, sigue: ";break;
                case 8: texto = "¿Vas a dejarlo ahora?: ";break;
                case 9: texto = "Ya no queda nada: ";break;
                case 10: texto = "El premio está cerca: ";break;           
                case 11: texto = "Recuerda, un número entre 1 y 10: ";break;
                
            }

        System.out.print(texto+" "+mensaje);
                        
            mensaje = (int)Math.round(Math.random()*8)+2;
            
            propuesta = kl.nextInt();
            if (propuesta < 1 || propuesta > 10){mensaje = 11; continue;}
                
        }while(propuesta != ADIVINA);
        
    }
        
}
