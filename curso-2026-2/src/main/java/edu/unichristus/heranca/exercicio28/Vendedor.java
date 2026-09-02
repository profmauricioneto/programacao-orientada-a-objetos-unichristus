package edu.unichristus.heranca.exercicio28;

public class Vendedor extends Funcionario {
    private double totalVendas;
    private double percentualComissao;

    public Vendedor(String nome, double salarioBase, double percentualComissao) {
        super(nome, salarioBase);
        this.percentualComissao = percentualComissao;
        this.totalVendas = 0;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + totalVendas*percentualComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }
}
