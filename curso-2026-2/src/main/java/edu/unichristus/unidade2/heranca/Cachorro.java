package edu.unichristus.unidade2.heranca;

public class Cachorro extends Mamifero {
    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    public void andar() {
        System.out.println("Andando como cachorro!");
    }
}
