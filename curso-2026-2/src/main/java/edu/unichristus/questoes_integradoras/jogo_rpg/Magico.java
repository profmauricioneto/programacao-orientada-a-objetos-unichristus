package edu.unichristus.questoes_integradoras.jogo_rpg;

public interface Magico {
    public int lancarMagia(Personagem p);
    public int getMana();
    public void regenerarMana(int valorMana);
}
