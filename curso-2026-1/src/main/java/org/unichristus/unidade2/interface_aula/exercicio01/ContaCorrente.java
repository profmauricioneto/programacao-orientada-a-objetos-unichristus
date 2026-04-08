package org.unichristus.unidade2.interface_aula.exercicio01;

public class ContaCorrente implements IOperacoesBancarias{
    protected double montante;

    public ContaCorrente() {
        this.montante = 0;
    }

    public ContaCorrente(double montante) {
        this.montante = montante;
    }

    @Override
    public double saldo() {
        return montante;
    }

    @Override
    public void depositar(double valor) {
        this.montante += valor;
    }

    @Override
    public void saque(double valor) {
        if (montante < (valor + 0.05*valor)) {
            System.err.println("Saldo Insuficiente");
        } else {
            this.montante -= (valor + 0.05*valor);
        }
    }
}
