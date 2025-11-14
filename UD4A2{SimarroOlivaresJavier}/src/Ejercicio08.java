/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * 8. Crea un programa que, dada una cadena de texto, compruebe si se trata de
 *    un palíndromo o no (https://es.wikipedia.org/wiki/Palíndromo), mostrando
 *    el resultado por pantalla.
 * 
 * Palindromos en Español
 * 1. aba 2. ababa 3. Abalaba 4. acá 5. acurruca 6. ada (s.c.) 7. Ada (s.p.) 8. aérea 9. agá 10. Aibofobia 11. aja 12. Alá 13. ala (s.) 14. ala (s.) 15. alábala 16. aléjela 17. alela 18. alélela 19. allá 20. ama (s.) 
 * 21. ama (v.) 22. Ana 23. ana (longitud) 24. ananá 25. anilina 26. Anna 27. ara (2) 28. arañara 29. arara (2) 30. arenera 31. arepera 32. arra 33. asá 34. asa (s.) 35. asa (v.) 36. ata 37. avá 38. aviva 39. aya 40. aza 
 * 41. azuza 42. Bob 43. dad 44. dallad 45. dañad 46. datad 47. debed 48. efe 49. eje 50. ele 51. elévele 52. elle 53. eme 54. ene 55. eñe 56. ere 57. erre 58. erré 59. ese 60. ése 
 * 61. gag 62. Hannah 63. kanak 64. Kayak 65. Lolol 66. Malayalam 67. Memmem 68. Menem 69. nadan 70. najan 71. narran 72. Neuquén 73. nomon 74. non 75. oídio 76. Ojo 77. Orejero 78. Oro 79. oró 80. Oruro 
 * 81. Oso 82. osó 83. Oto 84. Otto 85. ovo 86. ovó 87. oyó 88. pop 89. radar 90. rajar 91. rallar 92. rapar 93. rasar 94. rayar 95. recocer 96. reconocer 97. rever 98. rodador 99. rotor 100. sacas 
 * 101. Safas 102. sagas 103. sahas 104. sajas 105. salábalas 106. salas (s.) 107. salas (v.) 108. samas 109. sanas 110. sañas 111. sapas 112. satas 113. sayas 114. sebes 115. sedes 116. sejes 117. seles 118. selles 119. senes 120. sepes 
 * 121. seres 122. setes 123. sometemos. 124. Somos
 * 
 * @author macky
 */

public class Ejercicio08 {
    
    public static final String RESET = "\u001B[0m";
    public static final String AZUL = "\u001B[34m";
    
    public static void main(String[] args){                                     // Declara el método main.
        
        Scanner kl = new Scanner(System.in);                                    // inicia la instancia Scanner.
        
        System.out.println("Detección de palíndromos, escribe una frase:");     // Solicita y carga una frase.
        String frase = kl.nextLine();
        String[] palabras = frase.split(" ");                                   // Crea el array con las palabras y las booleanas de la posición en donde hay palíndromas.
        boolean[] palindromas = new boolean[palabras.length];
        int contador = 0;
        
        for (int i = 0; i < palabras.length; i++){                              // Bucle de recorrido de palabras.
            
            for (int j = 0; j < palabras[i].length()/2; j++){
                if (palabras[i].toLowerCase().charAt(j) != palabras[i].toLowerCase().charAt(palabras[i].length()-j-1)){
                    palindromas[i] = false; break;
                }else{palindromas[i]=true;}

            }
        
        }

        System.out.println();System.out.println();
        
        for (int i = 0; i < palabras.length; i++){                              // Bucle de impresión de la frase coloreando las palíndromas.
        
            if (palindromas[i]){
                System.out.print(AZUL);
                contador++;
            }else{System.out.print(RESET);}
            System.out.print(palabras[i] + " ");
        }

        System.out.println();System.out.println();
        
        if (contador == 0){                                                     // Impresión de resultados.
            System.out.println("No hay palabras palíndromas en la frase");
        }else{
            if (contador == 1){
                System.out.println("Hay una palabra palíndroma en la frase es:");
            }else{
                System.out.println("En la frase hay " + contador + " palabras palíndromas son:");
            }
            System.out.println();
            for (int i = 0; i < palabras.length; i++){                          
                if(palindromas[i]){
                    System.out.println(palabras[i]);
                }
            }
        
        }
        System.out.println();System.out.println();
        kl.close();                                                             // cierra micro
        
        
    }
    
}
