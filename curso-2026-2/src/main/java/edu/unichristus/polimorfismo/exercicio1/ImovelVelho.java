package edu.unichristus.polimorfismo.exercicio1;

public class ImovelVelho extends Imovel {
    private double desconto;

    public ImovelVelho(double preco, double desconto) {
        super(preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    @Override
    public double calculoValorImovel() {
        return super.calculoValorImovel() - desconto;
    }
}
