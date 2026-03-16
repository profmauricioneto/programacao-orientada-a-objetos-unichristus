package org.unichristus.unidade2.polymorphism.exemplo1;

public class Cachorro extends Animal {

    public void latir() {
        System.out.println("Au au!");
    }

    @Override
    public void mover() {
        System.out.println("Doginho se movendo...");
    }
}
