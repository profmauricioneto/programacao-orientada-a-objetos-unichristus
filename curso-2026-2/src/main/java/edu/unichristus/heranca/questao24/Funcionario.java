package edu.unichristus.heranca.questao24;

import java.util.List;
import java.util.ArrayList;

public class Funcionario extends Pessoa {
    protected double salario;
    private List<Venda> vendas;

    public Funcionario(int codigo, String nome) {
        super(codigo);
        this.nome = nome;
        this.vendas = new ArrayList<>();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void addVenda(Venda v) {
        this.vendas.add(v);
    }
}
