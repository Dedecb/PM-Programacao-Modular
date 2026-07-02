//Faca um programa para ler dois vetores X e Y, com n e m elementos respectivamente, e calcular
// um vetor uniao Z. Note que elementos presentes tanto em X como em Y deverao ser
//incluıdos apenas uma vez em Z. Os valores de n e m sao lidos pelo teclado.

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o tamanho do vetro X: ");
        int n = sc.nextInt();
        int[] x = new int[n];
        System.out.println("Escreva os " + n + " valores do vetor X: ");
        for(int i = 0; i < n ; i++){
            x[i] = sc.nextInt();
        }

        System.out.println("Escreva o tamanho do vetro Y: ");
        int m = sc.nextInt();
        int[] y = new int[m];
        System.out.println("Escreva os " + m + " valores do vetor Y: ");
        for(int i = 0; i < m ; i++){
            y[i] = sc.nextInt();
        }

        int[] z = new int[n + m];
        int k = 0;

        for(int i = 0; i < n; i++) {
            z[k] = x[i];
            k++;
        }
        for(int i = 0; i < m; i++) {
            boolean existe = false;
            for (int j = 0; j < k; j++) {
                if (y[i] == z[j]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                z[k] = y[i];
                k++;
            }
        }


        System.out.println("Os elementos do vetor Z sao: ");
        for (int i = 0; i < k; i++) {
            System.out.print(z[i] + " ");
        }
    }
}
