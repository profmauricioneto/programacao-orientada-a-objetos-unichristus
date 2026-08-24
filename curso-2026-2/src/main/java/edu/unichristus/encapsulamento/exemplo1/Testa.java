package edu.unichristus.encapsulamento.exemplo1;

public class Testa {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
//        System.out.println("Valor de a = " + objA.getA());
////        objA.a = 300;
//        objA.setA(300);
//        System.out.println("Valor de a = " + objA.getA());
        System.out.println("Valor de b = " + objA.b);
        objB.setB(400);
        System.out.println("Valor de b = " + objB.getB());
        System.out.println("Valor de a = " + objB.getA());
    }
}
