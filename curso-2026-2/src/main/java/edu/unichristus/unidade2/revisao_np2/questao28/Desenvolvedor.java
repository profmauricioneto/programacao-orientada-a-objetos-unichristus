package edu.unichristus.unidade2.revisao_np2.questao28;

public class Desenvolvedor extends Funcionario {
    private String linguagemProgramacao;
    private int horasExtras;
    private final double VALOR_HORA_EXTRA = 75;

    public Desenvolvedor(String nome, String cpf, int horasExtras) {
        super(nome, cpf);
        this.horasExtras = horasExtras;
        this.linguagemProgramacao = "";
    }

    public Desenvolvedor(String nome, String cpf, double salarioBase, int horasExtras) {
        super(nome, cpf, salarioBase);
        this.horasExtras = horasExtras;
        this.linguagemProgramacao = "";
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public String getLinguagemProgramacao() {
        return linguagemProgramacao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + horasExtras*VALOR_HORA_EXTRA;
    }
}
