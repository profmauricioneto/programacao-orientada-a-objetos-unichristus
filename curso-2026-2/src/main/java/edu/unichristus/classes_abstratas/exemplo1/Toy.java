package edu.unichristus.classes_abstratas.exemplo1;

public class Toy extends Product {
    public Toy(String name, double price) {
        super(name, price);
    }

    @Override
    public void update(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showInformation() {
        System.out.println("Toy - name: " + name + " - Price: " + price);
    }
}
