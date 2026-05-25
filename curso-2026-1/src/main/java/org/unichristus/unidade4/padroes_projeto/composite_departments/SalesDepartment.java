package org.unichristus.unidade4.padroes_projeto.composite_departments;

import java.util.ArrayList;
import java.util.List;

public class SalesDepartment implements Department {
    private List<Department> departmentsSales;
    public SalesDepartment() {
        departmentsSales = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        System.out.println(this.getClass().getSimpleName());
        for(Department d: departmentsSales) {
           d.printDepartmentName();
        }
    }

    public void addDepartment(Department dep) {
        this.departmentsSales.add(dep);
    }

    public void removeDepartment(Department dep) {
        this.departmentsSales.remove(dep);
    }
}
