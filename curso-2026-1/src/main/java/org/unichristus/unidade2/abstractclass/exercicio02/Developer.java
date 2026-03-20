package org.unichristus.unidade2.abstractclass.exercicio02;

public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void increaseSalary() {
        this.salary += 5000;
    }
}
