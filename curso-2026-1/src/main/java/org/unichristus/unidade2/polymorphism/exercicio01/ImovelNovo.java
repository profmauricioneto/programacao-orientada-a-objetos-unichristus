package org.unichristus.unidade2.polymorphism.exercicio01;

public class ImovelNovo extends Imovel {
    private double adicional;

    public ImovelNovo(double adicional, double preco) {
        super(preco);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    @Override
    public double getPreco() {
        return super.getPreco() + adicional;
    }
}
