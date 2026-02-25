package org.unichristus.unidade2.relacionamento.exercicio03;

public class TesteMuitosParaMuitos {
    public static void main(String[] args) {
        Disciplina POO = new Disciplina("POO", 101);
        Disciplina datavis = new Disciplina("Visualização de Dados", 102);
        Disciplina algoritmos = new Disciplina("Algoritmos e Programação", 103);

        Professor mauricio = new Professor("Mauricio", 1);
        Professor tiago = new Professor("Tiago", 2);

//        DISCIPLINAS --> PROFESSOR
        POO.addProfessor(mauricio);
        datavis.addProfessor(mauricio);
        algoritmos.addProfessor(mauricio);
        algoritmos.addProfessor(tiago);

//        PROFESSORES --> DISCIPLINA
        mauricio.addDisciplina(POO);
        mauricio.addDisciplina(datavis);
        mauricio.addDisciplina(algoritmos);
        tiago.addDisciplina(algoritmos);

        System.out.println("Disciplinas Prof.:" + mauricio.getNomeProfessor());
        mauricio.mostrarDisciplinas();

        System.out.println("Disciplinas Prof.:" + tiago.getNomeProfessor());
        tiago.mostrarDisciplinas();

        System.out.println("Professor da Disciplina: " + algoritmos.nomeDisciplina);
        algoritmos.getNomeProfessores();
    }
}
