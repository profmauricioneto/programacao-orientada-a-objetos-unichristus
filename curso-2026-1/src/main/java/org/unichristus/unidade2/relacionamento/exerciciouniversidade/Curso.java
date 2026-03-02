package org.unichristus.unidade2.relacionamento.exerciciouniversidade;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    public String nomeCurso;
    public long codigo;
    public List<Estudante> estudantes;
    public Universidade universidade;

    public Curso(String nomeCurso, long codigo, Universidade universidade) {
        this.nomeCurso = nomeCurso;
        this.codigo = codigo;
        estudantes = new ArrayList<>();
        this.universidade = universidade;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public long getCodigo() {
        return codigo;
    }

    public void addEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public void mostrarEstudantes() {
        System.out.println("Lista de Estudantes do curso: " + getNomeCurso());
        for(Estudante e: estudantes) {
            System.out.println(e.nome);
        }
    }

    public int quantidadeEstudantes() {
        return estudantes.size();
    }

}
