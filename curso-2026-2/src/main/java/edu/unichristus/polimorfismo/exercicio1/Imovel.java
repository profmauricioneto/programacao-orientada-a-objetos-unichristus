package edu.unichristus.polimorfismo.exercicio1;

public class Imovel {
    private double preco;
    protected String endereco;

    public Imovel(double preco) {
        this.preco = preco;
    }

    public double calculoValorImovel() {
        return preco;
    }
}
