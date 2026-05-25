package org.unichristus.unidade4.padroes_projeto.composite_departments;

public class SACDepartment implements Department {
    @Override
    public void printDepartmentName() {
        System.out.println(this.getClass().getSimpleName());
    }
}
