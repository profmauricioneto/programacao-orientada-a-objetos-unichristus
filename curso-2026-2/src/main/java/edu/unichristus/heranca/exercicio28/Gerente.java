package edu.unichristus.heranca.exercicio28;

public class Gerente extends Funcionario {
    private double bonus;
    private int numFuncionariosSob;

    public Gerente(String nome, double salarioBase, double bonus, int numFuncionariosSob) {
        super(nome, salarioBase);
        this.bonus = bonus;
        this.numFuncionariosSob = numFuncionariosSob;
    }

}
