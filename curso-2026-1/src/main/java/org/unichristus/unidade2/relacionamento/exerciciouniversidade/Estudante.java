package org.unichristus.unidade2.relacionamento.exerciciouniversidade;

public class Estudante {
    public String nome;
    public String matricula;
    public Curso curso;

    public Estudante(String nome, String matricula, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
}
