package edu.unichristus.associacoes.muitosparamuitos;

public class Main {
    public static void main(String[] args) {
        Professor mauricio = new Professor("Mauricio Neto", 123);
        Professor tiago = new Professor("Tiago Sombra", 321);

        Disciplina poo = new Disciplina("Programação orientada a objetos", 1);
        Disciplina tcc = new Disciplina("TCC", 2);

        // adicionando professores a disciplinas
        tcc.addProfessor(mauricio);
        tcc.addProfessor(tiago);

        poo.addProfessor(mauricio);

        // adicionando disciplinas aos professores
        mauricio.addDisciplina(poo);
        mauricio.addDisciplina(tcc);

        tiago.addDisciplina(tcc);

        System.out.println("Professor: " + mauricio.nomeProfessor);
        mauricio.mostrarDisciplinas();

        System.out.println("");
        System.out.println("Professor: " + tiago.nomeProfessor);
        tiago.mostrarDisciplinas();


    }
}
