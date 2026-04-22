package org.unichristus.unidade4.solid_aula.exemplo_ocp;

public class Veiculo {
    private String tipoVeiculo;
    private double valor;

    public Veiculo(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
