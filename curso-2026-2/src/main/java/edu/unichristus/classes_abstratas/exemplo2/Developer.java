package edu.unichristus.classes_abstratas.exemplo2;

public class Developer extends Employee {
    private double increaseValue;

    public Developer(String name, double salary) {
        super(name, salary);
        this.increaseValue = 50;
    }

    @Override
    public double increaseSalary() {
        return (salary*(1+ increaseValue/100));
    }
}
