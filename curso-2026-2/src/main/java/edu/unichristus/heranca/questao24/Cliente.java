package edu.unichristus.heranca.questao24;

import java.util.List;
import java.util.ArrayList;

public class Cliente extends Pessoa {
    private String email;
    private List<Venda> compras;

    public Cliente(int codigo, String nome) {
        super(codigo);
        this.nome = nome;
        this.email = "";
        this.compras = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addCompras(Venda v) {
        this.compras.add(v);
    }
}
