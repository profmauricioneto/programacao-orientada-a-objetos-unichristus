package org.unichristus.unidade2.resolucao_np1.questao3;

public class Livro {
    private String titulo;
    private String isbn;
    private Autor autor;

    public Livro(String titulo, String isbn, Autor autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public String exibirInformacoes() {
        return "Livro {" +
                "titulo='" + titulo + '\'' +
                ", isbn ='" + isbn + '\'' +
                ", autor=" + autor.getNome() +
                " (" + autor.getNacionalidade() + " )"+
                '}';
    }
}
