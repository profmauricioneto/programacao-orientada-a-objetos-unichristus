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
        return acervo.stream().filter(l -> l.getIsbn().equals(isbn)).findFirst();
//        for (Livro l: acervo) {
//            if (l.getIsbn().equals(isbn)) {
//                return l;
//            }
//        }
    }

    public List<Livro> buscarPorTitulo(String titulo) {
        return acervo.stream().filter(l -> l.getTitulo().equals(titulo)).toList();
    }

    public void exibirAcervo() {
        this.acervo.forEach(l -> System.out.println(l.toString()));
    }

    public static void main(String[] args) {

    }

}
