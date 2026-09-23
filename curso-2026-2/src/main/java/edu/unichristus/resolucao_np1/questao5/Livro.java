package edu.unichristus.resolucao_np1.questao5;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private Biblioteca biblioteca;

    public Livro(String titulo, String autor, Biblioteca biblioteca) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = 0;
        this.biblioteca = biblioteca;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoPublicacao;
    }
}
