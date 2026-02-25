package org.unichristus.unidade2.relacionamento.exercicio1;

public class TesteUmPorUm {
    public void testeAplicacao() {
        Professor mauricio = new Professor("Mauricio", 1);

        Disciplina POO = new Disciplina("Programação Orientada a Objetos", 101, mauricio);

        System.out.println("Nome da Disciplina: " + POO.getNomeDisciplina());
        System.out.println("Nome do Professor: " + POO.getNomeProfessor());
    }

    public static void main(String[] args) {
        TesteUmPorUm teste = new TesteUmPorUm();
        teste.testeAplicacao();
    }
}
