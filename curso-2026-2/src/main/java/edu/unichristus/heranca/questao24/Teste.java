package edu.unichristus.heranca.questao24;

public class Teste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1234, "Astolfo");
        Funcionario vendedor = new Funcionario(001, "Alba");

        Venda venda = new Venda(0123, cliente, vendedor);
        cliente.addCompras(venda);
        vendedor.addVenda(venda);

        System.out.println(venda.toString());
    }
}
