//Questão 9
//Faça um programa que leia 6 números inteiros e mostre:
//Os números pares digitados;
//A soma dos números pares digitados;
//Os números ímpares digitados;
//A quantidade de números ímpares digitados.
//Exemplo:
//Vetor: [2, 4, 5, 6, 3, 7]
//RELATÓRIO
//Os números pares são:
//Número 2 na posição 1
//Número 4 na posição 2
//Número 6 na posição 4
//Soma dos pares = 12
//Os números ímpares são:
//Número 5 na posição 3
//Número 3 na posição 5
//Número 7 na posição 6
//Quantidade de ímpares = 3

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numList[] = new int[6];
        int somaPar = 0;
        int quantImpar = 0;

        System.out.println("Escreva 6 numeros inteiros: ");

        for(int i = 0; i < 6; i++){
            numList[i] = sc.nextInt();
        }

        System.out.println("\nOs numeros pares sao: ");
        for(int i = 0; i < 6; i++){
            if(numList[i] % 2 == 0){
                System.out.println("Numero " + numList[i] + " na posicao " + (i+1));
                somaPar += numList[i];
            }
        }
        System.out.println("Soma dos pares = " + somaPar);

        System.out.println("\nOs numeros impares sao: ");
        for(int i = 0; i < 6; i++){
            if(numList[i] % 2 != 0){
                System.out.println("Numero " + numList[i] + " na posicao " + (i+1));
                quantImpar++;
            }
        }
        System.out.println("A quantidade dos impares eh = " + quantImpar);
    }
}
