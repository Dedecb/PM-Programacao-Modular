//Intersecao de vetores –  Faca um programa que leia dois vetores de inteiros representando
//o numero de matrıcula de n alunos matriculados respectivamente em Programac¸ao e Mode_
//lagem. Em seguida, o programa devera imprimir o numero de matriculas dos alunos que estao
//matriculados simultaneamente nas duas UCs (ou seja, calcular a intersec¸ao dos dois vetores).
//O valor de n e lido pelo teclado.

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o n de alunos matriculados: ");
        n = sc.nextInt();
        int[] programacao = new int[n];
        int[] modelagem = new int[n];

        System.out.println("Escreva a matricula dos alunos que fazem Programacao: ");
        for(int i = 0; i < n; i++){
            programacao[i] = sc.nextInt();
        }
        System.out.println("Escreva a matricula dos alunos que fazem Modelagem: ");
        for(int i = 0; i < n; i++){
            modelagem[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (programacao[i] == modelagem[j]) {
                    System.out.println("O aluno: " + programacao[i] + " faz Programacao e Modelagem");
                }
            }
        }
    }
}
