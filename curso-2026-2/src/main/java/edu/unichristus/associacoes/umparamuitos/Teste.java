package edu.unichristus.associacoes.umparamuitos;

public class Teste {
    public static void main(String[] args) {
        Disciplina poo = new Disciplina("Programação orientada a Objetos", 123);
        Disciplina pe = new Disciplina("Programação Estruturada", 321);

        Professor mauricio = new Professor("Mauricio", 1);

        mauricio.addDisciplina(pe);
        mauricio.addDisciplina(poo);

        System.out.println("Nome Professor: " + mauricio.getNomeProfessor());
        System.out.println("Disciplinas associadas:");
        mauricio.mostrarTodasDisciplinas();

    }
}
