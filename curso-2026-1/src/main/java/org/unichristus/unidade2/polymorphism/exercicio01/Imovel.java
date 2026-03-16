package org.unichristus.unidade2.polymorphism.exercicio01;

public class Imovel {
    protected double preco;
    protected String endereco;

    public Imovel(double preco) {
        this.preco = preco;
        this.endereco = "";
    }

    public double getPreco() {
        return preco;
    }

}
