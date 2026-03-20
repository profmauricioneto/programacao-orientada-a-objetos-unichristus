package org.unichristus.unidade2.abstractclass.exercicio01;

public class Ball extends Produto {
    public Ball(String name, double price) {
        super(price, name);
    }

    @Override
    public void update(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showInformation() {
        System.out.println("Produto: " + name + " Preco: " + price) ;
    }
}
