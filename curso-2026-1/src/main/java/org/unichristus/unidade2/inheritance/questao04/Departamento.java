package org.unichristus.unidade2.inheritance.questao04;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private int idDepartamento;
    public String descricao;
    List<Pessoa> pessoas;

    public Departamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
        this.descricao = "Descrição não definida";
        this.pessoas = new ArrayList<>();
    }

    protected int getIdDepartamento() {
        return idDepartamento;
    }
}
