package org.unichristus.unidade2.exercicio1;

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

    public void apresentarInformacoes() {
        System.out.println("nome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Altura: " + altura);
    }

    public int calcularIdade() {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        return anoAtual - anoNascimento;
    }
}
