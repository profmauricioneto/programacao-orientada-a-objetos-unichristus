package edu.unichristus.exercicios.exercicio_relacionamento;

import java.util.List;
import java.util.ArrayList;

public class Sala {
    private int qtdAlunos;
    private boolean projetor;
    private List<Aluno> alunos;


    public Sala(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
        this.projetor = false;
        this.alunos = new ArrayList<>();
    }

    public boolean temProjeto() {
        return projetor;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public String mostrarAlunosDaSala() {
        String totalAlunos = "";
        for(Aluno aluno: alunos) {
            totalAlunos += aluno.getMatricula() + "\n";
        }
        return totalAlunos;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " qtdAlunos = " + qtdAlunos + ", projetor = " + projetor + ", alunos = " + mostrarAlunosDaSala();
    }
}
