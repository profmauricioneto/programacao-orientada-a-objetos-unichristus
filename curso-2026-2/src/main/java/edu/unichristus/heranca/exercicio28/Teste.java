package edu.unichristus.heranca.exercicio28;

public class Teste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gertrudes", 5000, 10);
        System.out.println(gerente.getNome());
        System.out.println(gerente.calcularSalario());
        System.out.println("--------------------------");
        Desenvolvedor dev = new Desenvolvedor("Josimar", 5000, "Cobol");
        System.out.println(dev.getNome());
        dev.setHoraExtras(4);
        System.out.println(dev.calcularSalario());
        System.out.println("--------------------------");
        Vendedor vendedor = new Vendedor("Plínio", 5000, 0.75);
        System.out.println(vendedor.getNome());
        vendedor.setTotalVendas(2000);
        System.out.println(vendedor.calcularSalario());
        System.out.println("--------------------------");

    }
}
