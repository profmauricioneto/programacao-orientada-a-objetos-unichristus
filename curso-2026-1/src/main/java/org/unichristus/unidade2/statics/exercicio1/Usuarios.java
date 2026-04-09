package org.unichristus.unidade2.statics.exercicio1;

public class Usuarios {
    // atributo de classe
    private static int contador = 0;
    // atributos de instancia
    private int id;
    private String nome;
    // metodo de classe
    private static int incrementar() {
        return ++contador;
    }
    // os elementos instancia
    public Usuarios() {
        this.id = incrementar();
        this.nome = "";
    }

    public Usuarios(String nome) {
        this.id = incrementar();
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    @Override
    public String   toString() {
        return "Usuarios{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Usuarios user1 = new Usuarios("Fulaninho");
        Usuarios user2 = new Usuarios("Joãozinho");
        Usuarios user3 = new Usuarios("Zezinho");
        Usuarios user4 = new Usuarios("Rafaelzinho");

        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());
        System.out.println(user4.toString());

        System.out.println(Usuarios.contador);

    }
}
