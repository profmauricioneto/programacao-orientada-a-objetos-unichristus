package org.unichristus.lista_exercicios.resolucoes.questao3;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private String nomeSolicitante;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private boolean devolvido;

    public Emprestimo(String nomeSolicitante, Livro livro) {
        this.livro = livro;
        this.nomeSolicitante = nomeSolicitante;
        this.dataEmprestimo = LocalDate.now();
        this.devolvido = false;
    }

    public void devolver() {
        this.dataDevolucao = LocalDate.now();
        this.devolvido = true;
    }

    public boolean isDevolvido() {
        return devolvido;
    }
}
