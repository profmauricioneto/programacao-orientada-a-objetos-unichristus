package edu.unichristus.polimorfismo.exemplo1;

public class Onibus extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Onibus acelerando...");
    }

    public void passarMarcha() {
        System.out.println("Onibus passando Marcha...");
    }
}
