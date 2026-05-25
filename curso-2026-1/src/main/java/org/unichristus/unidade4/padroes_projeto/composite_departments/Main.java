package org.unichristus.unidade4.padroes_projeto.composite_departments;

public class Main {
    public static void main(String[] args) {
        Department d1 = new FinancialDepartment();
        SalesDepartment sales = new SalesDepartment();
        HeadDepartment head = new HeadDepartment();
        head.addDepartment(d1);
        head.addDepartment(sales);

        Department sac = new SACDepartment();
        Department clientRelationship = new ClientRelationDepartment();
        sales.addDepartment(sac);
        sales.addDepartment(clientRelationship);


        head.printDepartmentName();
    }
}
