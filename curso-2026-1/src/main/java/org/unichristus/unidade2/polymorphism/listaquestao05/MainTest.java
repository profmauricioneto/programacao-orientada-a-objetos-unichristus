package org.unichristus.unidade2.polymorphism.listaquestao05;

public class MainTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Astolfo");
        Funcionario funcionario = new Funcionario(101, "Astrogildo");

        Venda venda = new Venda(123, funcionario, cliente);

        System.out.println(venda.toString());
    }
}
