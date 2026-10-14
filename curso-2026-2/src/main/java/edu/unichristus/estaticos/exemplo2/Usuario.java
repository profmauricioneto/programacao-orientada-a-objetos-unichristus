package edu.unichristus.estaticos.exemplo2;

public class Usuario {
    private static int QTD_INSTANCIA = 0;
    private int idInstancia;

    public Usuario() {
        this.idInstancia = Usuario.incremetarInstancia();
    }

    private static int incremetarInstancia() {
        return ++QTD_INSTANCIA;
    }

    public static int getQtdInstancia() {
        return QTD_INSTANCIA;
    }

    public static void main(String[] args) {
        Usuario user1 = new Usuario();
        System.out.println("Valor da Instancia de user1: " + user1.idInstancia);
        System.out.println("Quantidade atual de instancias: " + Usuario.getQtdInstancia());

        Usuario user2 = new Usuario();
        System.out.println("Valor da Instancia de user2: " + user2.idInstancia);
        System.out.println("Quantidade atual de instancias: " + Usuario.getQtdInstancia());

        Usuario user3 = new Usuario();
        System.out.println("Valor da Instancia de user3: " + user3.idInstancia);
        System.out.println("Quantidade atual de instancias: " + Usuario.getQtdInstancia());
    }

}
