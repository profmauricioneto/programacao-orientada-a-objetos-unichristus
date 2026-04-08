package org.unichristus.unidade2.interface_aula.exercicio01;

public class ContaCorrenteEspecial extends ContaCorrente {
    public ContaCorrenteEspecial() {
        super();
    }

    public ContaCorrenteEspecial(double montante) {
        super(montante);
    }

    @Override
    public void saque(double valor) {
        if (montante < (valor + 0.01*valor)) {
            System.err.println("Saldo Insuficiente");
        } else {
            this.montante -= (valor + 0.01*valor);
        }
    }
}
