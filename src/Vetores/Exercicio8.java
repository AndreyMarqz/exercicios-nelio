package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

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

        double soma = 0;
        int qtdPares = 0;
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0) {
                soma += vetor[i];
                qtdPares += 1;
            }
        }

        double media = soma / qtdPares;

        if(soma > 0){
            System.out.println("Média do números pares do vetor = " + media);
        } else {
            System.out.println("Nenhum número par.");
        }

        sc.close();
    }
}
