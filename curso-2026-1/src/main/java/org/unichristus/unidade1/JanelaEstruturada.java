package org.unichristus.unidade1;

import java.util.Scanner;

public class JanelaEstruturada {
    public static void main(String[] args) {
        double largura;
        double altura;
        double area;
        double perimetro;
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor Altura: ");
        altura = scan.nextDouble();

        System.out.println("Valor Largura: ");
        largura = scan.nextDouble();

        area = largura * altura;
        System.out.println("Area = " + area);

        perimetro = 2*largura + 2*altura;
        System.out.println("Perimetro = " + perimetro);
    }
}
