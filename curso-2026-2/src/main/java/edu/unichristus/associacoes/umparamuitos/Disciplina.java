package edu.unichristus.associacoes.umparamuitos;

public class Disciplina {
    public String nomeDisciplina;
    public int idDisciplina;
    public Professor professor;

    public Disciplina(String nomeDisciplina, int idDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.idDisciplina = idDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }
}
