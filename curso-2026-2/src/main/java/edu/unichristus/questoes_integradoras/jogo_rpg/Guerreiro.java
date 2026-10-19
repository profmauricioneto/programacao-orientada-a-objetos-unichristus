package edu.unichristus.questoes_integradoras.jogo_rpg;

public class Guerreiro extends Personagem {
    private int armadura;
    private int raiva;

    public Guerreiro(String nome, int id, int ataque, int defesa) {
        super(nome, id, ataque, defesa);
        this.armadura = 0;
        this.raiva = 0;
    }

    public Guerreiro(String nome, int id, int ataque, int defesa, int armadura, int raiva) {
        super(nome, id, ataque, defesa);
        this.armadura = armadura;
        this.raiva = raiva;
    }

    @Override
    public int atacar(Personagem p) {
        if (p.defender() - frenesi() > 0) {
            p.receberDano(0);
        } else {
            int dano = p.defender() - frenesi();
            p.receberDano(dano);
        }
    }

    @Override
    public int defender() {
        return defesa*armadura;
    }

    @Override
    public String getHabilidadeEspecial() {
        return "RAAAAGGGEEEEEE!!";
    }

    public int frenesi() {
        return (1 + raiva)*ataque;
    }
}
