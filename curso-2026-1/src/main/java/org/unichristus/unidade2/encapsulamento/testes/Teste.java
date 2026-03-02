package org.unichristus.unidade2.encapsulamento.testes;

public class Teste {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        System.out.println("Objeto A = " + objA.getA());
        objA.setA(222);
        System.out.println("Objeto A = " + objA.getA());
        System.out.println("B = " + objB.b);
        objB.setB(333);
        System.out.println("B = " + objB.getB());

    }
}
