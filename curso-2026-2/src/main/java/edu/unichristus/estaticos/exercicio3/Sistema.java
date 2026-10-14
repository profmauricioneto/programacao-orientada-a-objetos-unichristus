package edu.unichristus.estaticos.exercicio3;

public class Sistema {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("mauricio", "mauricio@email.com");
        Usuario u2 = new Usuario("joaozinho", "joaozinho@email.com");
        Usuario u3 = new Usuario("mariazinha", "mariazinha@email.com");

        System.out.println("Total de Instancias: " + Usuario.getTotalUsuarios());
    }
}
