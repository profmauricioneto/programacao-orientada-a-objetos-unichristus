package edu.unichristus.heranca.exercicio28;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.cpf = "";
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", salarioBase=" + salarioBase + ", cpf = " +  cpf + "}";
    }

}
