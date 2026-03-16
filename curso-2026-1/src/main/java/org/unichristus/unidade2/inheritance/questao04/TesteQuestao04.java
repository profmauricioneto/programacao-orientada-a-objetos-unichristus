package org.unichristus.unidade2.inheritance.questao04;

public class TesteQuestao04 {
    public static void main(String[] args) {
        Departamento rh = new Departamento(1);

        Pessoa p1 = new Pessoa(101, rh);
        Pessoa p2 = new Pessoa(102, rh);
        PessoaFisica pf1 = new PessoaFisica(201, "Joaozinho", rh);
    }
}
