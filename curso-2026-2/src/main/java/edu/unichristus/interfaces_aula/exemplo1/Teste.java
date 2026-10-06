package edu.unichristus.interfaces_aula.exemplo1;

public class Teste {
    public static void main(String[] args) {
        OperacoesBancarias contaComum = new ContaCorrente(1000);
        contaComum.depositar(500);
        System.out.println(contaComum.saldo());
        try {
            contaComum.sacar(1500);
        } catch(Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println(contaComum.saldo());
        }
    }
}
