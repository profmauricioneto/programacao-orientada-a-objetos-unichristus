package edu.unichristus.interfaces_aula.exemplo1;

public interface OperacoesBancarias {
    public void depositar(double valor);
    public void sacar(double valor) throws Exception;
    public double saldo();
}
