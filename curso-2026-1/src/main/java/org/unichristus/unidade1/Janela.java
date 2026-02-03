package org.unichristus.unidade1;

import java.util.Scanner;

public class Janela {
    public static void main(String[] args) {
        double altura;
        double largura;
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor Altura: ");
        altura = scan.nextDouble();

        System.out.println("Valor Largura: ");
        largura = scan.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);

        double areaJanela = retangulo.calcularArea();
        double perimetroJanela = retangulo.calcularPerimetro();

        System.out.println("Area da Janela = " + areaJanela);
        System.out.println("Perímetro da Janela = " + perimetroJanela);
    }
}
