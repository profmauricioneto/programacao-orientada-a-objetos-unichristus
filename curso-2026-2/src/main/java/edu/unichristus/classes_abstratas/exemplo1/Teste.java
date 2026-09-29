package edu.unichristus.classes_abstratas.exemplo1;

public class Teste {
    public static void main(String[] args) {
        Product p = new Toy("Brinquedo", 100);
        p.update("Max Steel", 300);
        p.showInformation();
    }
}
