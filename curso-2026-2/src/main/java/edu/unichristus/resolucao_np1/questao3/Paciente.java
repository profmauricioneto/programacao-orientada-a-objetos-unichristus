package edu.unichristus.resolucao_np1.questao3;

public class Paciente {
    private String nome;
    private String cpf;
    private int pressaoSistolica;

    public Paciente(String nome, String cpf, int pressaoSistolica) {
        this.nome = nome;
        this.cpf = cpf;
        try {
            setPressaoSistolica(pressaoSistolica);
        }catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getPressaoSistolica() {
        return pressaoSistolica;
    }

    public void setPressaoSistolica(int pressaoSistolica) throws IllegalArgumentException {
        if (pressaoSistolica >= 60 && pressaoSistolica <= 300){
            this.pressaoSistolica = pressaoSistolica;
        } else {
            System.err.println("Fora da faixa esperada!.");
            throw new IllegalArgumentException("Fora da faixa esperada!");
        }
    }

    public String classificarPressao() {
        if (pressaoSistolica < 90){
            return "Baixa";
        } else if (pressaoSistolica >= 90 && pressaoSistolica <= 120){
            return "Normal";
        } else if (pressaoSistolica >= 120 && pressaoSistolica <= 139){
            return "Elevada";
        } else {
            return "Hipertensão";
        }
    }

    public String apresentarInformacoesPaciente() {
        return "Nome: " + nome + ", cpf: " + cpf + ", pressão sistólica: " +  pressaoSistolica;
    }
}
