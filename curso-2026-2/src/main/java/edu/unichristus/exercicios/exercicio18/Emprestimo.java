package edu.unichristus.exercicios.exercicio18;

import java.time.LocalDate;

public class Emprestimo {
    private String nomeSolicitante;
    private LocalDate dataEmprestimo;
    private LocalDate dataVencimento;
    private boolean devolvido;
    private Livro livro;

    public Emprestimo(String nomeSolicitante, Livro livro) {
        this.nomeSolicitante = nomeSolicitante;
        this.dataEmprestimo = LocalDate.now();
        this.dataVencimento = LocalDate.now().plusDays(20);
        this.devolvido = false;
        this.livro = livro;
    }

    public void devolver() {
        this.devolvido = true;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public Livro getLivro() {
        return livro;
    }
}
