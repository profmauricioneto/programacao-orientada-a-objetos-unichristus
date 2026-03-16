package org.unichristus.unidade2.inheritance.exemplo1;

public class Pato extends Animal {

    public Pato(int quantidadePatas) {
        super(quantidadePatas);
    }

    public Pato(int quantidadePatas, String pelagem) {
        super(quantidadePatas, pelagem);
    }

    @Override
    public void mover() {
        System.out.println("Pato andando...");
    }

    public void voar() {
        System.out.println("Pato voando...");
    }

    public static void main(String[] args) {
        Pato p = new Pato(2, "Penas");
        p.mover();
        p.voar();
//        Animal animal = new Animal();
//        animal.mover();
    }
}
