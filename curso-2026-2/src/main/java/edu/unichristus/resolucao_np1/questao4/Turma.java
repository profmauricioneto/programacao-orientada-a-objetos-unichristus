package edu.unichristus.resolucao_np1.questao4;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String codigo;
    private String disciplina;
    private List<Aluno> alunos;

    public Turma(String codigo, String disciplina) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }

    public void matricularAluno(Aluno a) {
        this.alunos.add(a);
    }

    public int retornarTotalAlunos() {
        return alunos.size();
    }

    public void listarAlunos() {
//        for(Aluno aluno: alunos) {
//            System.out.println(aluno.getNome());
//        }
        alunos.forEach(aluno -> System.out.println(aluno.getNome()));
    }

}
