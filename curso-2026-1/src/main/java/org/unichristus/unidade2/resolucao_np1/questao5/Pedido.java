package org.unichristus.unidade2.resolucao_np1.questao5;

public class Pedido {
    private int numero;
    private double valorTotal;
    private Cliente cliente;

    public Pedido(int numero, double valorTotal, Cliente cliente) {
        this.numero = numero;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String exibirResumo() {
        return "Pedido{" +
                "numero=" + numero +
                ", valorTotal=" + valorTotal +
                ", cliente=" + cliente.getNome() +
                '}';
    }
}
