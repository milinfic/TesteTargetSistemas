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
public class Teste02 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[2];
        int coringa;
        int valor;
        boolean x = true;

        vetor[0] = 0;
        vetor[1] = 1;

        System.out.print("Digite um número inteiro positivo: ");
        valor = sc.nextInt();

        while (x = true) {
            if (valor == 0 || valor == 1) {
                System.out.println("Número pertence a sequência Fibonacci");
                break;
            }

            coringa = vetor[1] + vetor[0];
            vetor[0] = vetor[1];
            vetor[1] = coringa;

            if (valor == vetor[1]) {
                System.out.println("Número pertence a sequência Fibonacci");
                break;
            }
            if (vetor[1] > valor) {
                System.out.println("Número não pertence a sequência Fibonacci");
                break;
            }

        }

    }

}
