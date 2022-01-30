/*
3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, 
faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;
 */
package Testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste03 {

    /*********************************************************************************
     variáveis publicas para respostas do teste 
    *********************************************************************************/
    public static Double menorValor = 0.00;
    public static Double maiorValor = 0.00;
    public static Double media;
    public static int qtdefaturamentoSuperiorMedia = 0;
    public static int diaMenor, diaMaior;
    
    /*********************************************************************************
     método para leitura de dados do arquivo, pegando apenas o valor
    *********************************************************************************/
    
    public static List dados() {
        List<Double> lista = new ArrayList<>();
        String path = "\\dados.json";
        Double teste = 0.00;
        int i = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linha = br.readLine();
            while (linha != null) {
                String[] texto = linha.split(":");
                if (texto.length > 1) {
                    if (i == 1) {
                        teste = Double.parseDouble(texto[1]);
                        lista.add(teste);
                        i = -1;
                    }
                    i++;
                }
                linha = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lista;
    }
    
    /*********************************************************************************
     método para pegar a média de faturamento mensal
    *********************************************************************************/

    public static void media(List<Double> lista) {
        Double total = 0.0;
        int qtde = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) != 0.0) {
                total = total + lista.get(i);
                qtde++;
            }
        }
        media = total / qtde;
    }
    
    /*********************************************************************************
     método para pegar os valores solicitados para respostas, menor e maior valor e
     quantidade de dias que possuem faturamento maior do que a média mensal
    *********************************************************************************/

    public static void respostas(List<Double> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (menorValor > lista.get(i) && lista.get(i) != 0.0) {
                menorValor = lista.get(i);
                diaMenor = i + 1;
            }
            if (maiorValor < lista.get(i) && lista.get(i) != 0.0) {
                maiorValor = lista.get(i);
                diaMaior = i + 1;
            }
            if (lista.get(i) > media) {
                qtdefaturamentoSuperiorMedia++;
            }
        }

        System.out.println("Menor valor => Dia: " + diaMenor + " Valor: " + String.format("R$ %.2f", menorValor) );
        System.out.println("Maior valor => Dia: " + diaMaior + " Valor: " + String.format("R$ %.2f", maiorValor) );
        System.out.println("Quantidade de dias no mês superior ao faturamento médio mensal: " + qtdefaturamentoSuperiorMedia);
    }

    public static void main(String[] args) {
        List<Double> lista = dados();
        media(lista);        
        
        menorValor = lista.get(0);
        maiorValor = lista.get(0);

        respostas(lista);
        
        
        System.out.println("\n\n***********************************************************");
        System.out.println("\nMétodo mais elegante para pegar os valores solicitados.");  
        
        Double media = lista.stream().filter(p -> p != 0.0).mapToDouble(Double::doubleValue).average().orElse(0.0);     
        System.out.println(String.format("Menor Valor: R$ %.2f", lista.stream().filter(p -> p != 0.0).min(Comparator.naturalOrder()).get()));   
        System.out.println(String.format("Maior Valor: R$ %.2f", lista.stream().max(Comparator.naturalOrder()).get()));
        System.out.println("Quantidade de dias no mês superior ao faturamento médio mensal: " + lista.stream().filter(p -> p > media).count());
        
    }

}
