package edu.unichristus.heranca.questao24;

import java.time.LocalDateTime;

public class Venda {
    private int codigo;
    public LocalDateTime data;
    private Cliente cliente;
    private Funcionario vendedor;

    public Venda(int codigo, Cliente cliente, Funcionario vendedor) {
        this.codigo = codigo;
        this.data = LocalDateTime.now();
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "{ Codigo: " + codigo + ", Data: " + data + ", Cliente: " + cliente.getNome() + ", Vendedor: " + vendedor.getNome() + "}";
    }
}
