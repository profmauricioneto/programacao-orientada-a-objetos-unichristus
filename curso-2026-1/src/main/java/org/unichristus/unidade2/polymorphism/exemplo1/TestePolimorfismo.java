package org.unichristus.unidade2.polymorphism.exemplo1;

public class TestePolimorfismo {
    public static void main(String[] args) {
        Animal doginho = new Cachorro();
        doginho.mover();

        Cachorro dog2 = new Cachorro();
        dog2.latir();
        dog2.mover();
    }
}
