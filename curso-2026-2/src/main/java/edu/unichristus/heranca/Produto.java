package edu.unichristus.heranca;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0;
    }

    public Produto() {
        this.nome = "";
        this.preco = 0;
    }

    public static void main(String[] args) {
        Produto boneco = new Produto("Boneco", 45);
    }
}
