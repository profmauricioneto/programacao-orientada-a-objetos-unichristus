package org.unichristus.unidade1;

public class Retangulo {
    public double largura;
    public double altura;

    public Retangulo(double largura, double altura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularArea() {
        return altura * largura;
    }

    public double calcularPerimetro() {
        return (2*largura) + (2*altura);
    }
}
