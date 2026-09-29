package edu.unichristus.classes_abstratas.exemplo2;

public class Teste {
    public static void main(String[] args) {
        Employee gerente = new Manager("João", 4000);
        Employee desenvolvedor = new Developer("Maria", 4000);

        System.out.println(gerente.name + " - Salario: R$ " + gerente.increaseSalary());
        System.out.println(desenvolvedor.name + " - Salario: R$ " + desenvolvedor.increaseSalary());
    }
}
