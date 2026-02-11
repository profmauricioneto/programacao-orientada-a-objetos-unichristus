package org.unichristus.unidade2.exercicio2;

public class ControleSmartTV {
    public int volume;
    public int canal;

    public ControleSmartTV(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public void aumentarVolume() {
        this.volume++;
    }

    public void diminuirVolume() {
        this.volume--;
    }

    public void aumentarCanal() {
        this.canal++;
    }

    public void diminuirCanal() {
        this.canal--;
    }

    public void alterarCanal(int canal) {
        this.canal = canal;
    }

    public void exibirInformacoes() {
        System.out.println("Canal atual: " + this.canal);
        System.out.println("Volume atual: " + this.volume);
    }

    @Override
    public String toString() {
        return "ControleSmartTV{" +
                "volume=" + volume +
                ", canal=" + canal +
                '}';
    }
}
