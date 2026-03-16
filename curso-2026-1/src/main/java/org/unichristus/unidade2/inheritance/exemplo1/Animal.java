package org.unichristus.unidade2.inheritance.exemplo1;

public class Animal {
    public int quantidadePatas;
    public String pelagem;

    public Animal(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
        this.pelagem = "";
    }

    public Animal(int quantidadePatas, String pelagem) {
        this.quantidadePatas = quantidadePatas;
        this.pelagem = pelagem;
    }

    protected void mover() {
        System.out.println("Animal se movendo...");
    }
}
