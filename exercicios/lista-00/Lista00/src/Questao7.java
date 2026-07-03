// Faca um programa que receba a temperatura media de cada mes do ano, armazenando-as em ˆ
//um vetor. Calcule e mostre a maior e a menor temperatura do ano e em que mes ocorreram
//(mostrar o mes por extenso: 1 – janeiro, 2 – fevereiro…). Desconsidere empates

import java.util.Scanner;

public class Questao7 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double[] temperatura = new double[12];
        String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        double maiorTemp = temperatura[0];
        double menorTemp = temperatura[0];

        int mesMaior = 0;
        int mesMenor = 0;

        for(int i = 0; i < 12; i++){
            System.out.println("Escreva a temperatura de " + meses[i] + ": ");
            temperatura[i] = sc.nextDouble();
        }

        for (int i = 1; i < 12; i++) {

            if (temperatura[i] > maiorTemp) {
                maiorTemp = temperatura[i];
                mesMaior = i;
            }

            if (temperatura[i] < menorTemp) {
                menorTemp = temperatura[i];
                mesMenor = i;
            }
        }
        System.out.println("Esse foi o mes com a maior temperatura: " + meses[mesMaior]);
        System.out.println("Esse foi o mes com a maior temperatura: " + meses[mesMenor]);
    }

}
