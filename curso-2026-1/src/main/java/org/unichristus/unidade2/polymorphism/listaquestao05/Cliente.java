package org.unichristus.unidade2.polymorphism.listaquestao05;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private String email;
    private List<Venda> compras;

    public Cliente(int codigo, String nome) {
        super(codigo);
        this.nome = nome;
        this.email = "";
        this.compras = new ArrayList<>();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void addCompra(Venda compra) {
        this.compras.add(compra);
    }
}
