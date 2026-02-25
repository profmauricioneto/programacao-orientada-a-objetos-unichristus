package org.unichristus.unidade2.relacionamento.exercicio2;

public class Disciplina {
    public String nomeDisciplina;
    public int codigo;
    public Professor professor;

    public Disciplina (String nomeDisciplina, int codigo) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigo = codigo;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public int getCodigo() {
        return codigo;
    }

    public void addProfessor(Professor professor) {
        this.professor = professor;
    }
}
