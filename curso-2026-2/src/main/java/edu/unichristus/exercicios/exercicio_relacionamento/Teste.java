package edu.unichristus.exercicios.exercicio_relacionamento;

public class Teste {
    public static void main(String[] args) {
        Sala sala202 = new Sala(40);
        Aluno aluno = new Aluno("123456789", sala202);
        sala202.addAluno(aluno);

        System.out.println(sala202.toString());

    }
}
