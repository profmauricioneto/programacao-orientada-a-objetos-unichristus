package org.unichristus.unidade4.padroes_projeto.composite_departments;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {
    private List<Department> departments;
    public HeadDepartment() {
        departments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        System.out.println(this.getClass().getSimpleName());
        for (Department d: departments) {
            d.printDepartmentName();
        }
    }

    public void addDepartment(Department dep) {
        this.departments.add(dep);
    }

    public void removeDepartment(Department dep) {
        this.departments.remove(dep);
    }
}
