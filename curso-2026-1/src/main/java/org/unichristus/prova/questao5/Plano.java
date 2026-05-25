package org.unichristus.prova.questao5;

public class Plano {
    protected double valorBase;
    private static int totalPlanos;

    public Plano() {
        this.valorBase = 50;
        totalPlanos++;
    }

    public double calcularMensalidade() {
        return valorBase;
    }
}
