//Foi realizada uma pesquisa de algumas caracterısticas fısicas da populac¸ao de uma certa
// regiao, a qual coletou os seguintes dados referentes a cada habitante para serem analisados:
//• sexo (masculino e feminino)
//• cor dos olhos (azuis, verdes ou castanhos)
//• cor dos cabelos ( louros, castanhos, pretos)
//• idade
//Faca um algoritmo que determine e escreva:
//• a maior idade entre os habitantes
//• a menor idade entre os habitantes
//• a quantidade de indivıduos do sexo feminino cuja idade esta entre 18 e 35 anos inclusive
//e que tenham olhos verdes e cabelos louros.
//O final do conjunto de habitantes e reconhecido pelo valor -1 entrada como idade

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int idade, maior = 0, menor = Integer.MAX_VALUE;
        int quant = 0;

        String sexo;
        String olhos;
        String cabelo;

        System.out.println("Digite a idade (-1 para encerrar): ");
        idade = sc.nextInt();

        while (idade != -1){
            System.out.println("Escreva o sexo da pessoa (feminino/masculino): ");
            sexo = sc.next();
            System.out.println("Escreva a cor dos olhos da pessoa (azuis/verdes/pretos): ");
            olhos = sc.next();
            System.out.println("Escreva a cor do cabelo da pessoa (loiros/castanho/pretos): ");
            cabelo = sc.next();

            if(idade > maior){
                maior = idade;
            }
            if(idade < menor){
                menor = idade;
            }

            if(sexo.equalsIgnoreCase("feminino") && idade >= 18 && idade <= 35 && olhos.equalsIgnoreCase("verde") && cabelo.equalsIgnoreCase("loiro")){
                quant++;
            }

            System.out.println("Digite a idade (-1 para encerrar): ");
            idade = sc.nextInt();
        }
        System.out.println("Maior idade: " + maior);
        System.out.println("Menor idade: " + menor);
        System.out.println("O numero de pessoas com essas caracteristicas são: " + quant);
    }
}
