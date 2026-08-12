package edu.unichristus.associacoes.umparaum;

public class Teste {
    public static void main(String[] args) {
        Disciplina poo = new Disciplina("Programação Orientada a Objetos", 1);
        Professor mauricio = new Professor("Mauricio Neto", 1234, poo);

        poo.addProfessor(mauricio);
        System.out.println("Nome da disciplina: " + poo.getNomeDisciplina());
        System.out.println("Nome do professor: " + poo.getNomeProfessor());
    }
}
