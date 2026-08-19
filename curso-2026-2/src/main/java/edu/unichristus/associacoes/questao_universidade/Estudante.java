package edu.unichristus.associacoes.questao_universidade;

public class Estudante {
    public String nomeEstudante;
    public String matricula;
    public Curso curso;

    public Estudante(String nomeEstudante, String matricula, Curso curso) {
        this.nomeEstudante = nomeEstudante;
        this.matricula = matricula;
        this.curso = curso;
    }
}
