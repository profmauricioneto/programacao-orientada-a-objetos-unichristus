package org.unichristus.unidade4.solid_aula.exemplo_ocp;

public class Onibus extends Veiculo {
    public Onibus(double valor) {
        super(valor);
    }

    @Override
    public double getValor() {
        return super.getValor()*1.5;
    }
}
