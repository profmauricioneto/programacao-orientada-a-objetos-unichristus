package edu.unichristus.introducaopoo;

public class Carro {
    public int qtdPortas;
    public int qtdPneus;
    public String cor;

    public Carro() {
        System.out.println("Construtor sendo chamado...");
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void frear() {
        System.out.println("Freando...");
    }
}
