package org.unichristus.lista_exercicios.resolucoes.questao3;

import org.unichristus.unidade2.encapsulamento.testes.A;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String isbn;
    private int anoPublicacao;
    private List<Autor> autores;
    private List<Emprestimo> emprestimos;
    private Biblioteca biblioteca;

    public Livro(String titulo, int anoPublicacao, Autor autor, Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        this.emprestimos = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.isbn = "";
        this.adicionarAutor(autor);
    }

    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", autores=" + autores +
                ", emprestimos=" + emprestimos +
                ", biblioteca=" + biblioteca +
                '}';
    }
}
