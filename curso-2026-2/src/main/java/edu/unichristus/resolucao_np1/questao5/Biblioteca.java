package edu.unichristus.resolucao_np1.questao5;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nomeBiblioteca;
    private List<Livro> acervo;

    public Biblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
        this.acervo = new ArrayList<>();
    }

    public void adicionarLivro(Livro l) {
        this.acervo.add(l);
    }

    public void buscarPorAutor(String autor) {
        boolean encontrou = false;
        for (Livro l: acervo) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                encontrou = true;
                System.out.println("Livro Encontrado.");
                System.out.println(l.toString());
            }
        }
        if (!encontrou) {
            System.out.println("Livro Não Encontrado no acervo");
        }
    }

    public int getTotalLivros() {
        return acervo.size();
    }

    public void listarAcervo() {
        for(Livro l: acervo) {
            System.out.println(l.toString());
        }
    }
}
