package org.unichristus.unidade4.padroes_projeto.composite_departments;

public class ClientRelationDepartment implements Department {
    @Override
    public void printDepartmentName() {
        System.out.println(this.getClass().getSimpleName());
    }
}
