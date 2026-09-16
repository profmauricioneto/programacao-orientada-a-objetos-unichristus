package edu.unichristus.exercicios.exercicio_relacionamento;

public class Aluno {
    private String matricula;
    private boolean ativo;
    private Sala sala;

    public Aluno(String matricula, Sala sala) {
        this.matricula = matricula;
        this.sala = sala;
        this.ativo = true;
    }
    public void cancelarMatricula() {
        this.ativo = false;
    }

    public String getMatricula() {
        return matricula;
    }
}
