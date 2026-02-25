package org.unichristus.unidade2.relacionamento.exercicio2;

public class TesteUmParaMuitos {
    public static void main(String[] args) {
        Professor mauricio = new Professor("Maurício", 1);

        Disciplina POO = new Disciplina("Programação Orientada a Objetos", 101);
        Disciplina progEstruturada = new Disciplina("Programação Estruturada", 102);
        Disciplina datavis = new Disciplina("Visualização de Dados", 103);

//       PROFESSOR --> DISCIPLINA
        mauricio.addDisciplina(POO);
        mauricio.addDisciplina(progEstruturada);
        mauricio.addDisciplina(datavis);

//       DISCIPLINA --> PROFESSOR
        POO.addProfessor(mauricio);
        progEstruturada.addProfessor(mauricio);
        datavis.addProfessor(mauricio);

        System.out.println("Nome do Professor: " + mauricio.getNomeProfessor());
        mauricio.getNomesDisciplinas();
    }
}
