package edu.unichristus.estaticos.exercicio3;

public class Usuario {
    private static int TOTAL_USUARIOS = 0;

    private String nome;
    private String email;

    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
        incrementarInstancia();
    }

    private static void incrementarInstancia() {
        ++TOTAL_USUARIOS;
    }

    public static int getTotalUsuarios(){
        return TOTAL_USUARIOS;
    }
}
