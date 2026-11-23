package edu.unichristus.unidade4.design_patterns.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton(){};

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            return instance;
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton sing1 = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance();
        if (sing1 == sing2) {
            System.out.println("Instancias Iguais!");
        } else {
            System.out.println("Instancias Diferentes");
        }
        System.out.println("Sing1 = " + sing1);
        System.out.println("Sing2 = " + sing2);
    }
}
