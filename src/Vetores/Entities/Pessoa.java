package Vetores.Entities;

public class Pessoa {

    private String name;
    private int idade;
    private double altura;
    private char genero;

    public Pessoa(String name, int idade, double altura) {
        this.name = name;
        this.idade = idade;
        this.altura = altura;
    }

    public Pessoa(double altura, char genero) {
        this.altura = altura;
        this.genero = genero;
    }

    public Pessoa(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public Pessoa(String name) {
        this.name = name;
    }

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
