package edu.unichristus.heranca.exercicio28;

public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;
    private int horasExtras;
    private final double VALOR_HORA_EXTRA = 300;

    public Desenvolvedor(String nome, double salarioBase, String linguagemPrincipal) {
        super(nome, salarioBase);
        this.linguagemPrincipal = linguagemPrincipal;
        this.horasExtras = 0;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + horasExtras*VALOR_HORA_EXTRA;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setHoraExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }
}
