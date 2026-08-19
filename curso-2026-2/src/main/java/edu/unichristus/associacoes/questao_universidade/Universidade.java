package edu.unichristus.associacoes.questao_universidade;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    public String nomeUniversidade;
    public String descricao;
    public List<Curso> cursos;

    public Universidade(String nomeUniversidade) {
        this.nomeUniversidade = nomeUniversidade;
        this.descricao = "";
        cursos = new ArrayList<>();
    }

    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    public void addCurso(Curso c) {
        this.cursos.add(c);
    }

    public void mostrarCursosAssociados() {
        for(Curso c: cursos) {
            System.out.println(c.getNomeCurso());
        }
    }

    public int getTotalCursos() {
        return cursos.size();
    }

    public int getTotalEstudantesUniversidade() {
        int totalEstudantes = 0;
        for(Curso c: cursos) {
            totalEstudantes += c.getTotalEstudantesDoCurso();
        }
        return totalEstudantes;
    }
}
