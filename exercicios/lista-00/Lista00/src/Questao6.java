//Faca um programa para corrigir provas de multipla escolha. Cada prova tem 8 questoes e
//cada questao vale um ponto. O primeiro conjunto de dados a ser lido do usuario e o gabarito
//da prova. Os outros dados sao os numeros dos alunos e as respostas que deram as questoes.
//Existem dez alunos matriculados. Calcule e mostre:
//• O numero e a nota de cada aluno;
//• A porcentagem de aprovacao, sabendo-se que a nota mınima e 6
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] gabarito = new char[8];
        char[] respostas = new char[8];

        int aluno;
        int pnts;
        int aprovados = 0;

        System.out.println("Digite o gabarito da prova (8 questoes):");
        for (int i = 0; i < 8; i++) {
            gabarito[i] = Character.toUpperCase(sc.next().charAt(0));
        }

        for (int j = 0; j < 10; j++) {

            pnts = 0;

            System.out.println("\nDigite o numero do aluno:");
            aluno = sc.nextInt();

            System.out.println("Digite as respostas do aluno:");
            for (int i = 0; i < 8; i++) {
                respostas[i] = Character.toUpperCase(sc.next().charAt(0));
            }

            for (int i = 0; i < 8; i++) {
                if (respostas[i] == gabarito[i]) {
                    pnts++;
                }
            }

            System.out.println("O aluno " + aluno + " tirou nota " + pnts);

            if (pnts >= 6) {
                aprovados++;
            }
        }

        double porcentagem = (aprovados * 100.0) / 10;

        System.out.println("\nQuantidade de aprovados: " + aprovados);
        System.out.println("Porcentagem de aprovacao: " + porcentagem + "%");

        sc.close();
    }
}
