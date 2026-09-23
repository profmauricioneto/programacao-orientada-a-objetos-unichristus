package edu.unichristus.resolucao_np1.questao4;

public class Aluno {
    private String nome;
    private String matricula;
    private Turma turma;

    public Aluno(String nome, String matricula, Turma turma) {
        this.nome = nome;
        this.matricula = matricula;
        this.turma = turma;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "nome aluno: " + nome + ", matricula: " + matricula;
    }
}
