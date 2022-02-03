/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteRibeiraoPreto;

import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class Teste05 {
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
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
