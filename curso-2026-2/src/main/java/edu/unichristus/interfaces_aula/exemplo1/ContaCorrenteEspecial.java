package edu.unichristus.interfaces_aula.exemplo1;

public class ContaCorrenteEspecial extends ContaCorrente {
    private final double taxa = 0.99;
    public ContaCorrenteEspecial() {
        this.montante = 0;
    }
    public ContaCorrenteEspecial(double valor) {
        super(valor);
    }

    @Override
    public void sacar(double valor) throws Exception{
        if ((montante - (taxa*valor + valor)) >= 0) {
            this.montante -= taxa*valor;
        } else {
            throw new Exception("Montante insuficiente para a operação.");
        }
    }
}
