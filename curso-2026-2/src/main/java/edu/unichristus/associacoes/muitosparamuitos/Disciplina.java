package edu.unichristus.associacoes.muitosparamuitos;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    public String nomeDisciplina;
    public int idDisciplina;
    public List<Professor> professores;

    public Disciplina(String nomeDisciplina, int idDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.idDisciplina = idDisciplina;
        professores = new ArrayList<>();
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void addProfessor(Professor p) {
        this.professores.add(p);
    }

    public void mostrarProfessores() {
        for(Professor p: professores) {
            System.out.println(p.getNomeProfessor());
        }
    }
}
