package org.unichristus.unidade2.encapsulamento.exercicio01;

public class Conta {
    private double saldo;

    public Conta() {
        this.saldo = 0;
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double consultar() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo Insufiente!");
        }
    }
}
