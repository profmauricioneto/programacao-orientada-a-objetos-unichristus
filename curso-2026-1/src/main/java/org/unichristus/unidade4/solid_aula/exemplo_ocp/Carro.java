package org.unichristus.unidade4.solid_aula.exemplo_ocp;

public class Carro extends Veiculo {
    public Carro(double valor) {
        super(valor);
    }

    @Override
    public double getValor() {
        return super.getValor()*0.8;
    }
}
