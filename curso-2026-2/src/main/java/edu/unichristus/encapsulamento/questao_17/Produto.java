package edu.unichristus.encapsulamento.questao_17;

public class Produto {
    private String nome;
    private double preco;
    private int qtdEstoque;
    private String codigoBarras;

    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0;
        this.qtdEstoque = 0;
        this.codigoBarras = "";
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws Exception {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            throw new Exception("Preço Inválido!");
        }
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) throws Exception {
        if (qtdEstoque >= 0) {
            this.qtdEstoque = qtdEstoque;
        } else {
            throw new Exception("Quantidade não pode ser Negativo.");
        }
    }

    public void addQtdEstoque(int qtdEstoque) throws Exception {
        if (qtdEstoque >= 0) {
            this.qtdEstoque += qtdEstoque;
        } else {
            throw new Exception("Quantidade não pode ser negativa.");
        }
    }

    public void removerQtdEstoque(int qtdEstoque) throws Exception {
        if (qtdEstoque > this.qtdEstoque) {
            throw new Exception("Não é possível remover esta quantidade.");
        } else {
            this.qtdEstoque -= qtdEstoque;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "|" + "Preco: " + preco + "|" + "Quantidade: " + qtdEstoque;
    }
}
