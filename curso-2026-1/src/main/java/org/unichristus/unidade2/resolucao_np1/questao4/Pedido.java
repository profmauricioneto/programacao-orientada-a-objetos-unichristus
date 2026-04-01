package org.unichristus.unidade2.resolucao_np1.questao4;

public class Pedido {
    private int id;
    private String nome;
    private String endereco;
    private double valorTotal;

    public Pedido(int id, String nome, String endereco, double valorTotal) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String exibirResumo() {
        return "Pedido{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
