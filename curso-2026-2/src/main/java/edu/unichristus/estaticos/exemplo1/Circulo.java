package edu.unichristus.estaticos.exemplo1;

public class Circulo {

    public static final double PI = 3.1415;
    double x;
    double y;
    double raio;

    public double area() {
        return 3.1415*raio*raio;
    }

    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.raio = 3;
        double z = c.area();
        System.out.println(Circulo.PI);
        System.out.println(Math.E);
    }
}
