package org.unichristus.unidade2.polymorphism.exercicio01;

public class ImovelVelho extends Imovel {
    private double desconto;

    public ImovelVelho(double desconto, double preco) {
        super(preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    @Override
    public double getPreco() {
        return super.getPreco() - desconto;
    }
}
