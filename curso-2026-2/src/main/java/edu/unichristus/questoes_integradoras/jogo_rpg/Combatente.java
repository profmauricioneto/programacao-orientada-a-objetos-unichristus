package edu.unichristus.questoes_integradoras.jogo_rpg;

public interface Combatente {
    public int atacar(Personagem personagem);
    public int defenfer(int valorAtaque);
    public boolean estaVivo();
}
