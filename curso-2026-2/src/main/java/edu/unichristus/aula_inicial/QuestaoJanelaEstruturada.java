package edu.unichristus.aula_inicial;

import java.util.Scanner;

public class QuestaoJanelaEstruturada {
    public static void main(String[] args) {
        double largura, altura, area, perimetro;
        Scanner input = new Scanner(System.in);
        // entrada de dados
        System.out.println("Largura da Janela: ");
        largura = input.nextDouble();
        System.out.println("Altura da Janela: ");
        altura = input.nextDouble();

        // processamento
        area = largura * altura;
        perimetro = 2*(largura + altura);

        // saída de dados
        System.out.println("Area da Janela: " + area);
        System.out.println("Perimetro da Janela: " + perimetro);

    }
}
