
package TesteRibeiraoPreto;

/**
 *
 * @author Paulo
 */
public class Teste03 {

    /*
    3) Descubra a lógica e complete o próximo elemento:
    a) 1, 3, 5, 7, ___
    b) 2, 4, 8, 16, 32, 64, ____
    c) 0, 1, 4, 9, 16, 25, 36, ____
    d) 4, 16, 36, 64, ____
    e) 1, 1, 2, 3, 5, 8, ____
    f) 2,10, 12, 16, 17, 18, 19, ____
     */

    public static void main(String[] args) {
        System.out.println("Questão A:");
        int n = 1;
        System.out.print(n);
        for (int i = 0; i < 4; i++) {
            System.out.print(" - " + (n = n + 2));
        }

        System.out.println("\n****************************");
        System.out.println("Questão B:");
        System.out.print(n = 2);
        for (int i = 0; i < 6; i++) {
            System.out.print(" - " + (n = n * 2));
        }

        System.out.println("\n****************************");
        System.out.println("Questão C:");
        for (int i = 0; i < 8; i++) {
            System.out.print(i * i);
            if (i < 7) {
                System.out.print(" - ");
            }
        }
        
        System.out.println("\n****************************");
        System.out.println("Questão D:");
        for (int i = 0; i <= 8; i = i+2) {
            System.out.print(i * i);
            if (i < 7) {
                System.out.print(" - ");
            }
        }

        System.out.println("\n****************************");
        System.out.println("Questão E:");
        int vetor[] = new int[2];
        int coringa;
        vetor[0] = 0;
        vetor[1] = 1;
        for (int i = 0; i < 7; i++) {            
            coringa = vetor[1] + vetor[0];
            System.out.print(vetor[1]);
            if (i < 6) {
                System.out.print(" - ");
            }
            vetor[0] = vetor[1];
            vetor[1] = coringa;
        }
        
        System.out.println("\n****************************");
        System.out.println("Questão F:");
        /*********************************************************
        Esse não tem como fazer uma lógica de programação (pelo menos que eu sei), 
        por a lógica ser o valor da primeira letra de cada número
        ou seja, D
        dois, dez, doze, dezesseis, etc ... duzentos
        *********************************************************/
        System.out.println("2 - 10 - 12 - 16 - 17 - 18 - 19 - 200");

    }

}
