package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("Quantos números você vai digitar?");
            n = sc.nextInt();

            if(n <= 0) {
                System.out.println("Digite um número positivo maior que 0!");
            }
        } while(n <= 0);

        double[] vetor = new double[n];
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número para ser inserido no vetor: ");
            vetor[i] = sc.nextDouble();
        }

        double maiorNumero = vetor[0];
        int posicao = 0;
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] > maiorNumero) {
                maiorNumero = vetor[i];
                posicao = i;
            }
        }

        System.out.println("Maior valor dentro do vetor: " + maiorNumero);
        System.out.println("Posição do maior valor dentro do vetor: " + posicao);

        sc.close();;
    }
}
