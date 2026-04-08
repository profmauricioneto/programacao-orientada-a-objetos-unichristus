package org.unichristus.unidade2.interface_aula.exemplo1;

public class Carro implements Iveiculo {
    public String cor;

    @Override
    public void acelerar() {
        System.out.println("Nova Implementação de Acelerar!");
        System.out.println("rum rum rum!");
    }

    @Override
    public void frear() {
        System.out.println("Carro frenando!");
    }

    public static void main(String[] args) {
        Iveiculo v = new Carro();
        v.acelerar();
    }
}

