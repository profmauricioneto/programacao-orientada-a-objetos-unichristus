package edu.unichristus.questoes_integradoras.jogo_rpg;

public abstract class Personagem implements Combatente {
    private static int totalPersonagens = 0;

    private int id;
    private String nome;
    protected final int VIDA_MAXIMA = 100;
    protected int vidaAtual;
    protected int ataque;
    protected int defesa;
    protected short nivel;

    public Personagem(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.vidaAtual = VIDA_MAXIMA;
        this.nivel = 1;
    }

    @Override
    public boolean estaVivo() {
        return vidaAtual > 0 ? true : false;
    }

    public void receberDano(int valor_dano) {
        if(estaVivo()) {
            vidaAtual = vidaAtual - valor_dano;
            System.out.println("Dano: " + valor_dano);
            System.out.println("Vida atual: " + vidaAtual);
        } else {
            System.out.println("Personagem morto!");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getStatus() {
        return "[nome: " + nome + " id: " + id + " vida atual: " + vidaAtual + " nível: " + nivel + "]";
    }

    public abstract String getHabilidadeEspecial();
}
