package org.unichristus.unidade2.interface_aula.exercicio01;

public class ContaCorrente implements IOperacoesBancarias, IOperacoesPessoais {
    protected double montante;
    protected int id;
    protected String nome;

    public ContaCorrente() {
        this.montante = 0;
        this.id = 0;
        this.nome = "";
    }

    public ContaCorrente(double montante) {
        this.montante = montante;
        this.id = 0;
        this.nome = "";
    }

    @Override
    public double saldo() {
        return montante;
    }

    @Override
    public void depositar(double valor) {
        this.montante += valor;
    }

    @Override
    public void saque(double valor) {
        if (montante < (valor + 0.05*valor)) {
            System.err.println("Saldo Insuficiente");
        } else {
            this.montante -= (valor + 0.05*valor);
        }
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
}
