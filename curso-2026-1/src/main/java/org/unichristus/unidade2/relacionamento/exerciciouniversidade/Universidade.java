package org.unichristus.unidade2.relacionamento.exerciciouniversidade;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    public String nomeUniversidade;
    public String descricao;
    public List<Curso> cursos;

    public Universidade(String nomeUniversidade) {
        this.nomeUniversidade = nomeUniversidade;
        this.descricao = "";
        this.cursos = new ArrayList<>();
    }

    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    public void addCurso(Curso curso) {
        cursos.add(curso);
    }

    public void getNomeCursos() {
        System.out.println("Cursos da Universidade: " + getNomeUniversidade());
        for(Curso c: cursos) {
            System.out.println(c.getNomeCurso());
        }
    }

    public int getTotalCursos() {
        return cursos.size();
    }

    public int quantidadeEstudantesUniversidade() {
        int contadorEstudante = 0;
        for(Curso c: cursos) {
            contadorEstudante += c.quantidadeEstudantes();
        }
        return contadorEstudante;
    }
}
