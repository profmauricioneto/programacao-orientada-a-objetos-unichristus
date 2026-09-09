package edu.unichristus.polimorfismo.exemplo2;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void imprimir() {
        System.out.println("Funcionario: " + getNome());
    }
}
