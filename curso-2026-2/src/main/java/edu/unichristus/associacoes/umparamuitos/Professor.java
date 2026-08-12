package edu.unichristus.associacoes.umparamuitos;

import java.util.List;
import java.util.ArrayList;

public class Professor {
    public String nomeProfessor;
    public int idProfessor;
    public List<Disciplina> disciplinas = new ArrayList<>();

    public Professor(String nomeProfessor, int idProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.idProfessor = idProfessor;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void addDisciplina(Disciplina d) {
        disciplinas.add(d);
    }

    public void mostrarTodasDisciplinas() {
        for (Disciplina d: disciplinas) {
            System.out.println(d.getNomeDisciplina());
        }
    }

}
