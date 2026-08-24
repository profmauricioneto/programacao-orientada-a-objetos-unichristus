package edu.unichristus.encapsulamento.questao_conta;

public class Teste {
    public static void main(String[] args) {
        Conta mauricioConta = new Conta(100);
        System.out.println("Valor atual da conta: " + mauricioConta.consultar());
        mauricioConta.depositar(200);
        System.out.println("Valor atual da conta: " + mauricioConta.consultar());
        mauricioConta.sacar(301);
        System.out.println("Valor atual da conta: " + mauricioConta.consultar());
    }
}
