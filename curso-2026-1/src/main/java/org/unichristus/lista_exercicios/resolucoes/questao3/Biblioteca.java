package org.unichristus.lista_exercicios.resolucoes.questao3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Biblioteca {
    private String nome;
    private List<Livro> acervo;
    private List<Emprestimo> emprestimos;

    public Biblioteca(String nome) {
        this.emprestimos = new ArrayList<>();
        this.acervo = new ArrayList<>();
        this.nome = nome;
    }

    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    public Emprestimo emprestarLivro(String nomeSolicitante, Livro livro) {
        return new Emprestimo(nomeSolicitante, livro);
    }

    public Optional<Livro> buscarPorISBN(String isbn) {
        return acervo.stream().filter(l -> isbn.equals(l.getIsbn())).findFirst();
    }

    public List<Livro> buscarPorTitulo(String titulo) {
        return acervo.stream().filter(l -> titulo.equals(l.getTitulo())).toList();
    }

    public void exibirAcervo() {
        this.acervo.forEach(l -> System.out.println(l.toString()));
    }

    public static void main(String[] args) {
        Biblioteca bibliotecaPOO = new Biblioteca("Biblioteca Programação Orientada a Objetos");

        Autor token = new Autor("J.R.R. Token", "01/01/1850");
        Autor lovecraft = new Autor("H.P. Lovecraft", "01/01/1920");

        Livro senhorDosAneis = new Livro("O Senhor dos Anéis", 1920, token, bibliotecaPOO);
        Livro necromicon = new Livro("Necronomicon", 1950, lovecraft, bibliotecaPOO);

        bibliotecaPOO.adicionarLivro(senhorDosAneis);
        bibliotecaPOO.adicionarLivro(necromicon);

        senhorDosAneis.setIsbn("12345678");
        necromicon.setIsbn("87654321");

        Emprestimo emprestimo = new Emprestimo("Joãozinho", senhorDosAneis);
        emprestimo.devolver();

        System.out.println(bibliotecaPOO.buscarPorISBN("12345678"));

    }

}
