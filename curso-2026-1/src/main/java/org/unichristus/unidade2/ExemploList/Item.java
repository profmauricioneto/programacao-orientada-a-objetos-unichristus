package org.unichristus.unidade2.ExemploList;

public class Item {
    public Pedido pedido;
    public double valorUnitario;
    public String nomeItem;

    @Override
    public String toString() {
        return "Item{" +
                "valorUnitario=" + valorUnitario +
                ", nomeItem='" + nomeItem + '\'' +
                '}';
    }
}
