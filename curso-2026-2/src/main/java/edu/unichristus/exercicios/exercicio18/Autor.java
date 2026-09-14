package edu.unichristus.exercicios.exercicio18;

public class Autor {
    private String nome;
    private String nascionalidade;
    private String dataNascimento;

    public Autor(String nome, String nascionalidade) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
        this.dataNascimento = "";
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "nome: " + nome + ", nascionalidade: " + nascionalidade + "data de nascimento: " + dataNascimento;
    }
}
