//Uma pequena loja de artesanato possui apenas um vendedor e comercializa dez tipos de objetos.
// O vendedor recebe, mensalmente, salario de R$ 545,00, acrescido de 5% do valor total
//de suas vendas.
//O valor unitario dos objetos deve ser informado e armazenado em um vetor; a quantidade
//vendida de cada pec¸a deve ficar em outro vetor, mas na mesma posic¸ao. Crie um programa
//que receba os prec¸os e as quantidades vendidas, armazenando-os em seus respectivos vetores
//(ambos com tamanho dez). Depois, determine e mostre:
//• Um relatorio na tela contendo: quantidade vendida, valor unitario e valor total de cada
//objeto. Ao final, deverao ser mostrados o valor geral das vendas e o valor da comissao
//que sera paga ao vendedor;
//• O valor do objeto mais vendido e sua posicao no vetor (nao se preocupe com empates).

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] preco = new double[10];
        int[] quantidade = new int[10];

        double valorGeral = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Escreva o valor do produto: ");
            preco[i] = sc.nextDouble();
            System.out.println("Escreva a quantidade de produtos vendidos: ");
            quantidade[i] = sc.nextInt();
            valorGeral += (preco[i] * quantidade[i]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("\nObjeto " + (i + 1)
                    + "\nQuantidade vendida: " + quantidade[i]
                    + "\nValor unitario: " + preco[i]
                    + "\nValor total: " + (quantidade[i] * preco[i]));
        }

        double comissao = valorGeral * 0.05;
        double salarioFinal = 545 + comissao;

        System.out.println("\nValor geral das vendas: R$ " + valorGeral
                + "\nComissao: R$ " + comissao
                + "\nSalario final: R$ " + salarioFinal);

        int maisVendido = quantidade[0];
        int posicao = 0;

        for (int i = 1; i < 10; i++) {
            if (quantidade[i] > maisVendido) {
                maisVendido = quantidade[i];
                posicao = i;
            }
        }

        System.out.println("\nPosicao no vetor: " + posicao
                + "\nObjeto: " + (posicao + 1)
                + "\nQuantidade vendida: " + maisVendido
                + "\nValor do objeto: R$ " + preco[posicao]);

        sc.close();
    }
}
