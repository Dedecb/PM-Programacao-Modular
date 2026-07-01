import java.util.Scanner;

//1. Fatorial – Fac¸a um programa que leia um valor inteiro x e calcule seu fatorial.O fatorial (!)
//e dado pela seguinte formula:
//3! = 3 ∗ 2 ∗ 1
//4! = 4 ∗ 3 ∗ 2 ∗ 1
//5! = 5 ∗ 4 ∗ 3 ∗ 2 ∗ 1
public class Questao1 {
    public static void main(String[] args){
            int x, fat = 1;
            System.out.println("Escreva um valor interiro para descobrir seu fatorial:");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            for(int i = 1; i <= x; i++){
                fat *= i;
            }
            System.out.println("O fatorias de " +x+ " eh: " + fat);
    }
}
