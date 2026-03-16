package org.unichristus.unidade2.polymorphism.listaquestao05;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Venda {
    private int codigoVenda;
    public LocalDate data;
    private Funcionario funcionario;
    private Cliente cliente;

    public Venda(int codigoVenda, Funcionario funcionario, Cliente cliente) {
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.codigoVenda = codigoVenda;
        this.data = LocalDate.now();
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "codigoVenda=" + codigoVenda +
                ", data=" + data +
                ", funcionario=" + funcionario.getNome() +
                ", cliente=" + cliente.getNome() +
                '}';
    }
}
