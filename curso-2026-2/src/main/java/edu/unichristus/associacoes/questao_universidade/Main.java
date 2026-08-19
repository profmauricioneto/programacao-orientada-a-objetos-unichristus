package edu.unichristus.associacoes.questao_universidade;

public class Main {
    public static void main(String[] args) {
        Universidade christus = new Universidade("Universidade Christus");

        Curso si = new Curso("Sistemas de Informação", 1, christus);
        Curso ads = new Curso("Analise e Desenvolvimento de Sistemas", 2, christus);
        Curso cc = new Curso("Ciência da Computação", 3, christus);

        Estudante joaozinho = new Estudante("Joaozinho", "123", si);
        Estudante mariazinha = new Estudante("Mariazinha", "321", si);
        Estudante fulaninho = new Estudante("Fulaninho", "456", ads);
        Estudante cicraninho = new Estudante("Cicraninho", "543", ads);
        Estudante beltraninho = new Estudante("Beltraninho", "987", cc);
        Estudante astolfo = new Estudante("Astolfo", "657", cc);

//        adicionando alunos em SI, ADS, CC
        si.addEstudante(joaozinho);
        si.addEstudante(mariazinha);

        ads.addEstudante(fulaninho);
        ads.addEstudante(cicraninho);

        cc.addEstudante(beltraninho);
        cc.addEstudante(astolfo);

//        adicionando cursos na universidade
        christus.addCurso(si);
        christus.addCurso(ads);
        christus.addCurso(cc);

        System.out.println("RELATORIO DA UNIVERSIDADE");
        System.out.println("Nome: " + christus.getNomeUniversidade());
        System.out.println("Quantidade de Cursos: " + christus.getTotalCursos());
        System.out.println("Quantidade Total de Alunos na Universidade: " + christus.getTotalEstudantesUniversidade());

    }
}
