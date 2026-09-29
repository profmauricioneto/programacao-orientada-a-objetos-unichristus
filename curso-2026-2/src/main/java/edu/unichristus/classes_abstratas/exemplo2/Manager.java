package edu.unichristus.classes_abstratas.exemplo2;

public class Manager extends Employee {
    private double increaseValue;

    public Manager(String name, double salary) {
        super(name, salary);
        this.increaseValue = 30;
    }

    @Override
    public double increaseSalary() {
        return (salary*(1+ increaseValue/100));
    }
}
