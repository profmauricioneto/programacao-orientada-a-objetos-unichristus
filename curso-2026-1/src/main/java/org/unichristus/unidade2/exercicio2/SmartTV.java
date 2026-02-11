package org.unichristus.unidade2.exercicio2;

public class SmartTV {
    public static void main(String[] args) {
        ControleSmartTV controle = new ControleSmartTV(10, 1);
        controle.exibirInformacoes();

        for (int i = 0; i < 10; i++) {
            controle.aumentarVolume();
        }
        controle.exibirInformacoes();

        controle.alterarCanal(10);
        System.out.println(controle.toString());
    }
}
