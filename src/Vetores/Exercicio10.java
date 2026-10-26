package Vetores;

import Vetores.Entities.Aluno;
import Vetores.Entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("Quantos alunos serão digitados?");
            n = sc.nextInt();

            if(n <= 0) {
                System.out.println("Digite um número positivo maior que 0!");
            }
        } while(n <= 0);

        sc.nextLine();

        Aluno[] aluno = new Aluno[n];

        for(int i = 0; i < aluno.length; i++) {
            System.out.printf("Digite o nome do %dº aluno: ", i + 1);
            System.out.println();
            String nome = sc.nextLine();


            System.out.printf("Digite a 1ª nota do aluno %s: ", nome);
            System.out.println();
            double nota1 = sc.nextDouble();

            sc.nextLine();

            System.out.printf("Digite a 2ª nota do aluno %s: ", nome);
            System.out.println();
            double nota2 = sc.nextDouble();

            sc.nextLine();

            aluno[i] = new Aluno(nome, nota1, nota2);

            System.out.println();

        }

        System.out.println("Alunos aprovados:");
        for(int i = 0; i < aluno.length; i++) {
            double media = (aluno[i].getNota1() + aluno[i].getNota2()) / 2;
            if(media >= 6) {
                System.out.println(aluno[i].getNome());
            }
        }

        sc.close();
    }
}
