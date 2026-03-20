package org.unichristus.unidade2.abstractclass.exercicio01;

public class Main {
    public static void main(String[] args) {
        Produto bolaQuadradaDoKiko = new Ball("Bola Quadrada do Kiko", 100);
        Produto maxSteel = new Toy("Boneco MaxSteel", 200);

        bolaQuadradaDoKiko.showInformation();
        maxSteel.showInformation();

        maxSteel.update("Action Figure MaxSteel", 350);
        maxSteel.showInformation();
    }
}
