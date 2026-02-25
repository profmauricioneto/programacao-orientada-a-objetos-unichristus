package org.unichristus.unidade2.relacionamento.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    public String nomeDisciplina;
    public int codigo;
    public List<Professor> professores;

    public Disciplina(String nomeDisciplina, int codigo) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigo = codigo;
        professores = new ArrayList<>();
    }

    public int getCodigoDisciplina() {
        return codigo;
    }

    public void getNomeProfessores() {
        for(Professor p: professores) {
            System.out.println(p.nome);
        }
    }

    public void addProfessor(Professor professor) {
        professores.add(professor);
    }

    public int mostrarQuantidadeProfessores() {
        return professores.size();
    }

}
