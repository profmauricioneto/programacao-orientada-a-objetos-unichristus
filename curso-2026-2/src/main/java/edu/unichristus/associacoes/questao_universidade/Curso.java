package edu.unichristus.associacoes.questao_universidade;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    public String nomeCurso;
    public int codigo;
    public List<Estudante> estudantes;
    public Universidade universidade;

    public Curso(String nomeCurso, int codigo, Universidade universidade) {
        this.nomeCurso = nomeCurso;
        this.codigo = codigo;
        estudantes = new ArrayList<>();
        this.universidade = universidade;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void addEstudante(Estudante e) {
        this.estudantes.add(e);
    }

    public void mostrarEstudantesDoCurso() {
        for(Estudante e: estudantes) {
            System.out.println(e.nomeEstudante);
        }
    }

    public int getTotalEstudantesDoCurso() {
        return estudantes.size();
    }
}
