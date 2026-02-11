package org.unichristus.unidade2.ExemploList;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    public List<Item> itens;
    public String codigo;
    public double valorTotal;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "codigo='" + codigo + '\'' +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
