package edu.unichristus.polimorfismo.exemplo2;

public class Teste {
    public static void main(String[] args) {
        Pessoa f1 = new Funcionario("Arex", 1000);
        Funcionario f2 = (Funcionario )f1;
        f2.imprimir();
    }
}
