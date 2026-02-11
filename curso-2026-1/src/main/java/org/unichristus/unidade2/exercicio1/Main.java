package org.unichristus.unidade2.exercicio1;

public class Main {
    public static void main(String[] args) {
        Pessoa mauricio = new Pessoa("Mauricio", 1990, 1.61);

//        mauricio.nome = "Mauricio";
//        mauricio.anoNascimento = 1990;
//        mauricio.altura = 1.61;

        mauricio.apresentarInformacoes();
        System.out.println("Sua idade atual é: " + mauricio.calcularIdade());
    }
}
