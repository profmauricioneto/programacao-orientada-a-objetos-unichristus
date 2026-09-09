package edu.unichristus.polimorfismo.exercicio1;

public class ImovelNovoCorretor extends ImovelNovo {
    private double porcCorretagem;

    public ImovelNovoCorretor(double preco, double adicional, double porcCorretagem) {
        super(preco, adicional);
        this.porcCorretagem = porcCorretagem;
    }

    @Override
    public double calculoValorImovel() {
        return super.calculoValorImovel() + super.calculoValorImovel()*porcCorretagem/100;
    }

}
