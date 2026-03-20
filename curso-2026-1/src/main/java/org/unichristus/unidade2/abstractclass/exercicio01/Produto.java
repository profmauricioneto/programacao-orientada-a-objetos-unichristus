package org.unichristus.unidade2.abstractclass.exercicio01;

public abstract class Produto {
    private int idProduto;
    protected double price;
    protected String name;

    public Produto(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public abstract void update(String name, double price);

    public abstract void showInformation();

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

}
