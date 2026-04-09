package org.unichristus.unidade2.statics.exemplo1;

import java.lang.Math;

public class Circulo {
    public double x;
    public double y;
    public double raio;

    public double area() {
        return 3.1415*raio*raio;
    }

    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.raio = 3;
        double z = c.area();
        System.out.println(z);
    }
}
