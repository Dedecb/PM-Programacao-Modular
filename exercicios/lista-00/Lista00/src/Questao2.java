//Fac¸a um programa que le 3 valores inteiros (x,y,z), guarde-os em um vetor e faca o seguinte:
//- Calcula o maior dentre tres numeros.
//- Calcula o menor dentre tres numeros.
//- Diz se o numero x esta dentro do intervalo [y, z];
//- Diz se o numero x esta fora do intervalo [y, z];
//- Testa se x e divisıvel por y e por z

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int maior, menor;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva os valores de x, y e z: ");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        maior = numeros[0];
        menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (maior < numeros[i]) {
                maior = numeros[i];
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            if (menor > numeros[i]) {
                menor = numeros[i];
            }
        }
        System.out.println("O maior numero eh: " + maior + " e o menor eh: " + menor);

        if (numeros[0] >= numeros[1] && numeros[0] <= numeros[2]) {
            System.out.println(numeros[0] + " esta entre " + numeros[1] + " e " + numeros[2]);
        } else {
            System.out.println(numeros[0] + " esta fora dos numeros entre " + numeros[1] + " e " + numeros[2]);
        }

        if (numeros[0] % numeros[1] == 0 && numeros[0] % numeros[2] == 0) {
            System.out.println(numeros[0] + " eh divisivel por " + numeros[1] + " e por " + numeros[2]);
        } else {
            System.out.println(numeros[0] + " nao eh divisivel por " + numeros[1] + " e por " + numeros[2]);
        }
    }
}