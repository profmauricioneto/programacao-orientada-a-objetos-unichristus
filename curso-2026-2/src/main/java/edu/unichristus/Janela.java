package edu.unichristus;

import java.util.Scanner;

public class Janela {
    public static void main(String[] args) {
        double largura, altura;
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.println("Largura da Janela: ");
        largura = input.nextDouble();
        System.out.println("Altura da Janela: ");
        altura = input.nextDouble();

        Retangulo ret = new Retangulo();
        ret.largura = largura;
        ret.altura = altura;

        System.out.println("Area da Janela: " + ret.calcularArea());
        System.out.println("Perímetro da Janela: " + ret.calcularPerimetro());
    }
}
