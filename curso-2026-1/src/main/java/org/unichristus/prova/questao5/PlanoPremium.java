package org.unichristus.prova.questao5;

public class PlanoPremium extends Plano {
    private double taxaAdicional;

    public PlanoPremium() {
        super();
        taxaAdicional = 30;
    }

    @Override
    public double calcularMensalidade() {
        return (valorBase + taxaAdicional);
    }
}
