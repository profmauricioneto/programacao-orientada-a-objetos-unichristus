package org.unichristus.unidade4.padroes_projeto.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        if (s1 == s2) {
            System.out.println("Instancias iguais");
        } else {
            System.out.println("Instancias distintas");
        }
    }
}
