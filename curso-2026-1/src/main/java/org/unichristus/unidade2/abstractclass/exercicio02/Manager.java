package org.unichristus.unidade2.abstractclass.exercicio02;

public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void increaseSalary() {
        this.salary += 2000;
    }
}
