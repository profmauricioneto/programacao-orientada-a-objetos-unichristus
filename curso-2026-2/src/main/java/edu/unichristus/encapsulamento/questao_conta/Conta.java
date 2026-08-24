package edu.unichristus.encapsulamento.questao_conta;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double consultar() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
}
