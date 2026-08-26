package edu.unichristus.heranca;

public class ExemploSobrecarga {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static double somar(double ...args) {
        double soma = 0;
        for(double values: args) {
            soma += values;
        }
        return soma;
    }

    public static void main(String[] args) {
        System.out.println(somar(1));
    }
}
