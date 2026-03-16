package org.unichristus.unidade2.polymorphism.exercicio01;

public class ImovelNovoCorretor extends ImovelNovo {
    private double porcentagem;

    public ImovelNovoCorretor(double preco, double adicional, double porcentagem) {
        super(adicional, preco);
        this.porcentagem = porcentagem;
    }
    @Override
    public double getPreco() {
        return super.getPreco()*(1 + porcentagem/100);
    }
}
