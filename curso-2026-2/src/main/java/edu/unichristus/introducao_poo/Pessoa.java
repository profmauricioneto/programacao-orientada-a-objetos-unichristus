package edu.unichristus.introducao_poo;

import java.util.Calendar;

public class Pessoa {
    public String nome;
    public int anoNascimento;
    public double altura;

    public Pessoa(String nome, int anoNascimento, double altura) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Altura: " + altura);
    }

    public int calcularIdade() {
        Calendar calendar = Calendar.getInstance();
        int anoAtual = calendar.get(Calendar.YEAR);
        return anoAtual - anoNascimento;
    }
}
