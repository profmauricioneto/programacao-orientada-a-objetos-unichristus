package org.unichristus.unidade2.inheritance.questao04;

public class Pessoa {
    private int idPessoa;
    protected String nome;
    private Departamento departamento;

    public Pessoa(int idPessoa, Departamento departamento) {
        this.idPessoa = idPessoa;
        this.departamento = departamento;
    }

    protected int getIdPessoa() {
        return idPessoa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
