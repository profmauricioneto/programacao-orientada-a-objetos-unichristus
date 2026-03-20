package org.unichristus.unidade2.abstractclass.exercicio02;

public class Main {
    public static void main(String[] args) {
        Employee gerente = new Manager("Fulaninho", 4000);
        Employee dev = new Developer("Cicraninho", 3000);

        gerente.increaseSalary();
        dev.increaseSalary();

        System.out.println("Gerente: " + gerente.toString());
        System.out.println("Desenvolvedor: " + dev.toString());
    }
}
