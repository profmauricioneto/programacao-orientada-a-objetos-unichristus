package edu.unichristus.interfaces_aula.exemplo1;

public class ContaCorrente implements OperacoesBancarias {
    protected double montante;
    private final double taxa = 0.95;

    public ContaCorrente() {
        this.montante = 0;
    }

    public ContaCorrente(double montante) {
        this.montante = montante;
    }

    @Override
    public void depositar(double valor) {
        this.montante += valor;
    }

    @Override
    public void sacar(double valor) throws Exception {
        if ((montante - (taxa*valor + valor)) >= 0) {
            this.montante -= taxa*valor;
        } else {
            throw new Exception("Montante insuficiente para a operação.");
        }
    }

    @Override
    public double saldo() {
        return montante;
    }
}
