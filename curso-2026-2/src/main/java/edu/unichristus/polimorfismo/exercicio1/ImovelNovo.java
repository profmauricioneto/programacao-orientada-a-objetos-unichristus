package edu.unichristus.polimorfismo.exercicio1;

public class ImovelNovo extends Imovel {
    private double adicional;

    public ImovelNovo(double preco, double adicional) {
        super(preco);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    @Override
    public double calculoValorImovel() {
        return super.calculoValorImovel() + adicional;
    }
}
