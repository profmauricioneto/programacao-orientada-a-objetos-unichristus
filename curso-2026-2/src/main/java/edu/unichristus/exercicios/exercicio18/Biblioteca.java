package edu.unichristus.exercicios.exercicio18;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    private String nomeBiblioteca;
    private List<Livro> acervo;
    private List<Emprestimo> emprestimos;

    public Biblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
        acervo = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.acervo.add(livro);
    }

    public Emprestimo adicionarEmprestimo(String nomeSolicitante, String titulo, int anoPublicacao) {
        try {
            Livro livro = buscarPeloTitulo(titulo);
            Emprestimo emprestimo = new Emprestimo(nomeSolicitante, livro);
            return emprestimo;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Livro buscarPeloTitulo(String titulo) throws Exception {
        for(Livro livro : acervo) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        System.err.println("Erro ao encontrar o título: " + titulo);
        throw new Exception();
    }

    public void exibirAcervo() {
        acervo.forEach(livro -> System.out.println(livro));
    }
}
