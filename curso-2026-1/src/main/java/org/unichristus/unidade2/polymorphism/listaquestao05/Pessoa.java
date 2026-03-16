package org.unichristus.unidade2.polymorphism.listaquestao05;

public class Pessoa {
    private int codigoPessoa;
    protected String nome;

    public Pessoa(int codigoPessoa) {
        this.codigoPessoa = codigoPessoa;
        this.nome = "";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoPessoa() {
        return codigoPessoa;
    }

    public String getNome() {
        return nome;
    }
}
