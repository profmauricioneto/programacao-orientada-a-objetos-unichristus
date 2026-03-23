package org.unichristus.lista_exercicios.resolucoes.questao3;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private String nascionalidade;
    private String dataNascimento;
    private List<Livro> livrosPublicados;

    public Autor(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.nascionalidade = "";
        this.livrosPublicados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", nascionalidade='" + nascionalidade + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }
}
