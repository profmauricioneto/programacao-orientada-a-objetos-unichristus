package edu.unichristus.heranca;

public class Cachorro extends Mamifero {
    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    public void andar() {
        System.out.println("Andando como cachorro!");
    }
}
