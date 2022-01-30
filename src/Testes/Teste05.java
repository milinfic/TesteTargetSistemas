/*
 5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de 
sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;
 */
package Testes;

import java.util.Scanner;

public class Teste05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        
        System.out.println(texto);
        
        String[] vetor = texto.split("");
        
        texto = "";
        
        for (int i = vetor.length - 1; i >= 0; i--) {
            texto = texto + vetor[i];
        }
        
        System.out.println(texto);        
        
    }
    
}
