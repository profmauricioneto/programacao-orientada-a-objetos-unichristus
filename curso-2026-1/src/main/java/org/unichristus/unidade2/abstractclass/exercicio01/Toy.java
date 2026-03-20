package org.unichristus.unidade2.abstractclass.exercicio01;

public class Toy extends Produto {
    public Toy(String name, double price) {
        super(price, name);
    }

    @Override
    public void update(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showInformation() {
        System.out.println("Nome do Produto: " + name + " Preco: " + price);
    }
}
