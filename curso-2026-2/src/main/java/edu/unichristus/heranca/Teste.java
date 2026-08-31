package edu.unichristus.heranca;

public class Teste {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        m.emitirSom();
        Cachorro c = new Cachorro();
        c.emitirSom();
        c.andar();
//        c.mamar();
    }
}
