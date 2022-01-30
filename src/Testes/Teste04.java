/*
 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

SP – R$67.836,43
RJ – R$36.678,66
MG – R$29.229,88
ES – R$27.165,48
Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação 
que cada estado teve dentro do valor total mensal da distribuidora.
 */
package Testes;

import java.util.Arrays;

public class Teste04 {
    
    public static void main(String[] args) {
        Double total = 0.00;
        String[] estado = {"SP", "RJ", "MG", "ES", "Outros"};
        double[] valor =  
            {
                67836.43 ,
                36678.66 ,
                29229.88 ,
                27165.48 ,
                19849.53
            };
        
//        for (int i = 0; i < valor.length; i++) {
//            total = total + valor[i];
//        }
        
        total = Arrays.stream(valor).sum();
        
        
        for (int i = 0; i < valor.length; i++) {
            double percentual = valor[i]*100/total;
            System.out.println(estado[i]+ " = " + String.format("%.2f", percentual) + "%");
            
        }        
        
    }
    
}
