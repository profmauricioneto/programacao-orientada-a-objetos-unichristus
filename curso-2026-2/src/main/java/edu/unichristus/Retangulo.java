package edu.unichristus;

public class Retangulo {
    public double altura;
    public double largura;

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2*(largura + altura);
    }
}
