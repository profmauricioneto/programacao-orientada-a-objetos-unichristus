package org.unichristus.unidade2.inheritance.questao04;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(int id, String nome, Departamento departamento) {
        super(id, departamento);
        setNome(nome);
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
