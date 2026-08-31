package edu.unichristus.heranca.exemplo1;

public class Funcionario {
    private String nome;
    private double salario;
    private int dependentes;

    public Funcionario(String nome, double salario, int dependentes) {
        this.nome = nome;
        this.salario = salario;
        this.dependentes = dependentes;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.dependentes = 0;
    }

    public void exibirDados() {
        System.out.println("Nome Funcionario: " + nome);
        System.out.println("Salário Funcionario: " + salario);
        System.out.println("Quantidade de Dependentes: " + dependentes);
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
