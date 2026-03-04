package org.unichristus.unidade2.encapsulamento.exercicio01;

public class TesteMain {
    public static void main(String[] args) {
        Conta contaJoao = new Conta();
        Conta contaMauricio = new Conta(30000);
        System.out.println("Saldo atual: " + contaMauricio.consultar());
        contaMauricio.depositar(1000);
        System.out.println("Saldo atual: " + contaMauricio.consultar());
        contaMauricio.sacar(30000);
        System.out.println("Saldo atual: " + contaMauricio.consultar());
        contaMauricio.sacar(1001);
    }
}
