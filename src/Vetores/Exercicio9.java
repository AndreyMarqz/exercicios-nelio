package Vetores;

import Vetores.Entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("Quantos pessoas você vai digitar?");
            n = sc.nextInt();

            if(n <= 0) {
                System.out.println("Digite um número positivo maior que 0!");
            }
        } while(n <= 0);

        Pessoa[] nomes = new Pessoa[n];
        Pessoa[] idades = new Pessoa[n];

        for(int i = 0; i < nomes.length; i++) {
            System.out.printf("Dados da %da pessoa: ", i + 1);
            System.out.println();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            nomes[i] = new Pessoa(nome);

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            idades[i] = new Pessoa(idade);

            System.out.println();

        }

        String maisVelho = "";
        int maiorIdade = 0;
        for(int i = 0; i < idades.length; i++) {
            if(idades[i].getIdade() > maiorIdade) {
                maisVelho = nomes[i].getName();
                maiorIdade = idades[i].getIdade();
            }
        }

        System.out.println("Pessoa mais velha do vetor: " + maisVelho);

        sc.close();
    }
}
