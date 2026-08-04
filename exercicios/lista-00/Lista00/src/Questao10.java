`//Elabore um programa que preencha uma matriz 12 x 4 com os valores das vendas de uma loja,
//em que cada linha representa um mes do ano e cada coluna representa uma semana do mes.
//O programa devera calcular e mostrar:
//• O total vendido em cada mes do ano, mostrando o nome do mes por extenso;
//• O total vendido em cada semana durante todo o ano;
//• O total vendido pela loja no ano.

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int mesSemana[][] = new int[12][4];

        String meses[] = {
                "Janeiro", "Fevereiro", "Marco", "Abril",
                "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("Escreva o valor recebido na semana " + (j + 1) + " do mes " + (i + 1));
                mesSemana[i][j] = sc.nextInt();
            }
        }

        int totalAno = 0;

        System.out.println("\nTotal vendido em cada mes:");

        for(int i = 0; i < 12; i++){
            int totalMes = 0;

            for(int j = 0; j < 4; j++){
                totalMes += mesSemana[i][j];
            }

            System.out.println(meses[i] + " = " + totalMes);
            totalAno += totalMes;
        }

        System.out.println("\nTotal vendido em cada semana:");

        for(int j = 0; j < 4; j++){
            int totalSemana = 0;

            for(int i = 0; i < 12; i++){
                totalSemana += mesSemana[i][j];
            }

            System.out.println("Semana " + (j + 1) + " = " + totalSemana);
        }

        System.out.println("\nTotal vendido pela loja no ano = " + totalAno);
    }
}