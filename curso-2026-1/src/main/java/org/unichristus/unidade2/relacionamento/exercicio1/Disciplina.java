package org.unichristus.unidade2.relacionamento.exercicio1;

public class Disciplina {
    public String nomeDisciplina;
    public int codigo;
    public Professor professor;

    public Disciplina(String nomeDisciplina, int codigo, Professor professor) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigo = codigo;
        this.professor = professor;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNomeProfessor() {
        return professor.nome;
    }
}
