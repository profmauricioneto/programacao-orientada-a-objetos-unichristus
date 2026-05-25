package org.unichristus.prova.questao4;

public class Entrega implements CalcularFrete {
    private double peso;
    private Destinatario destinatario;

    @Override
    public double calcularFrete() {
        return peso*10;
    }
}
