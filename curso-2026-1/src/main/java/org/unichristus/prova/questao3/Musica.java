package org.unichristus.prova.questao3;

public class Musica implements Reproduzivel {
    private String titulo;
    private String artista;
    private static int totalReproducoes;

    @Override
    public void reproduzir() {
        System.out.println("Titulo da Musica: " + titulo);
        totalReproducoes++;
    }

    public static int getTotalReproducoes() {
        return totalReproducoes;
    }
}
