package edu.unichristus.heranca.exercicio28;

public class Gerente extends Funcionario {
    private double bonus;
    private int numFuncionariosSob;
    private final double BONUS = 1000;

    public Gerente(String nome, double salarioBase, int numFuncionariosSob) {
        super(nome, salarioBase);
        this.numFuncionariosSob = numFuncionariosSob;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + BONUS;
    }

    public double getBonus() {
        return BONUS;
    }

    public int getNumFuncionariosSob() {
        return numFuncionariosSob;
    }
}
