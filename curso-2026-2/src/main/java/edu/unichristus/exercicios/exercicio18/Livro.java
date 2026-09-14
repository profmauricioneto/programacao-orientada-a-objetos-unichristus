package edu.unichristus.exercicios.exercicio18;

import java.util.List;
import java.util.ArrayList;

public class Livro {
    private String titulo;
    private String isbn;
    private int anoPublicacao;
    private List<Autor> autores;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.isbn = "";
        this.anoPublicacao = 0;
        autores = new ArrayList<>();
    }
    public Livro(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.isbn = "";
        autores = new ArrayList<>();
    }

    public void adicionarAutor(Autor autor) {
        this.autores.add(autor);
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + ", isbn: " + isbn + ", ano de publicação: " + anoPublicacao + ", autores: " + autores;
    }
}
