package edu.unichristus.associacoes.reflexiva;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    public String nomeDisciplina;
    public int idDisciplina;
    public List<Disciplina> prerequisitos;
    public List<Disciplina> prerequisitosDe;

    public Disciplina (String nomeDisciplina, int idDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.idDisciplina = idDisciplina;
        prerequisitos = new ArrayList<>();
        prerequisitosDe = new ArrayList<>();
    }

    // ....
}
