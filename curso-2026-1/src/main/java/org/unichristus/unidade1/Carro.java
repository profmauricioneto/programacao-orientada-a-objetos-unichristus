package org.unichristus.unidade1;

public class Carro {
    int qtdPneus;
    int qtdPortas;
    String cor;

    public Carro() {
        System.out.println("Instancia do Carro foi Criada! Construtor funcionando!");
    }

    void acelerar() {
        System.out.println("Acelerando...");
    }
    void frear() {
        System.out.println("Frenando...");
    }
}
