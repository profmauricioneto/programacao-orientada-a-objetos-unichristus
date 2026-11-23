package edu.unichristus.unidade2.revisao_np2.questao28;

public class Gerente extends Funcionario {
    private double bonus;
    private int numFuncionarios;

    public Gerente(String nome, String cpf, double bonus) {
        super(nome, cpf);
        this.bonus = bonus;
        this.numFuncionarios = 0;
    }
    public Gerente(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
        this.numFuncionarios = 0;
    }

    public double getBonus() {
        return bonus;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}
