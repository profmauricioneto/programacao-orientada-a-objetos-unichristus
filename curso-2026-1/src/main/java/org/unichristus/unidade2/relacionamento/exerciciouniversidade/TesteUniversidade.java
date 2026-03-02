package org.unichristus.unidade2.relacionamento.exerciciouniversidade;

public class TesteUniversidade {
    public static void main(String[] args) {
        Universidade christus = new Universidade("Universidade Christus");

        Curso cc = new Curso("Ciencia da Computacao", 1, christus);
        Curso ads = new Curso("Analise e Desenvolvimento de Sistemas", 2, christus);
        christus.addCurso(cc);
        christus.addCurso(ads);

        Estudante fulano = new Estudante("Fulano da Silva", "12345", cc);
        Estudante beltrano = new Estudante("Beltrano da Silva", "54321", cc);
        cc.addEstudante(fulano);
        cc.addEstudante(beltrano);

        Estudante cicrano = new Estudante("Cicrano da Silva", "67890", ads);
        Estudante joaozinho = new Estudante("Joaozinho da Silva", "09876", ads);
        ads.addEstudante(cicrano);
        ads.addEstudante(joaozinho);

        System.out.println("Informações");
        christus.getNomeCursos();
        System.out.println("Quantidade de alunos da " + christus.getNomeUniversidade());
        System.out.println(christus.quantidadeEstudantesUniversidade());
    }
}
