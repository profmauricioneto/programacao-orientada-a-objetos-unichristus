package edu.unichristus.classes_abstratas.exemplo1;

public abstract class Product {
    public String name;
    public double price;
    public int idProduto;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.idProduto = 0;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public abstract void update(String name, double price);
    public abstract void showInformation();
}
