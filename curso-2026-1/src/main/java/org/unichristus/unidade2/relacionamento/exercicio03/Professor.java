package org.unichristus.unidade2.relacionamento.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    public String nome;
    public int idProfessor;
    public List<Disciplina> disciplinas;

    public Professor(String nome, int idProfessor) {
        this.nome = nome;
        this.idProfessor = idProfessor;
        disciplinas = new ArrayList<>();
    }

    public String getNomeProfessor() {
        return nome;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void mostrarDisciplinas() {
        for(Disciplina d: disciplinas) {
            System.out.println(d.nomeDisciplina);
        }
    }



}
