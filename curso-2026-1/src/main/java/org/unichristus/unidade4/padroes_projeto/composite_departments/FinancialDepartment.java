package org.unichristus.unidade4.padroes_projeto.composite_departments;

public class FinancialDepartment implements Department {
    public FinancialDepartment() {}

    @Override
    public void printDepartmentName() {
        System.out.println(this.getClass().getSimpleName());
    }
}
