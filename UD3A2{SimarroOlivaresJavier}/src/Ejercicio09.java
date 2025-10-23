/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 9. Crea un programa que, utilizando bucles, muestre por pantalla la primera
 *    posición de la letra u en la frase del ejercicio 6.
 * 
 * 
 * @author macky
 */
public class Ejercicio09 {

    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    
    public static void main(String[] args){
        
        final String MENSAJE = "El jabalí juerguista jugaba con desparpajo al fútbol con su viejo amigo Jaime";
        boolean encontrada = false;
        int cuentaU = 0;
        int cuentaSp = 0;
        
        for (int i = 0; i < MENSAJE.length(); i++){
            
            if(MENSAJE.charAt(i)==' ' && !encontrada){cuentaSp++;}
            
            if (Character.toLowerCase(MENSAJE.charAt(i)) == 'u' && !encontrada){
                cuentaU = i+1;
                System.out.printf("%s%c%s",ROJO,MENSAJE.charAt(i),RESET);
                encontrada = true;
            }else{System.out.printf("%c",MENSAJE.charAt(i));}
              
        }

        System.out.printf("\n\nLa primera %s'u'%s esta en el caracter con la posicion %d contando los espacios, sin contarlos, en la posición %d\n\n",ROJO,RESET,cuentaU,cuentaU-cuentaSp);

    }
    
    
}
