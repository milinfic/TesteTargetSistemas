/*
2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores 
(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, 
ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
 */
package Testes;

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
