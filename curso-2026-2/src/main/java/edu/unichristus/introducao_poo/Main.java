package edu.unichristus.introducao_poo;

public class Main {
    public static void main(String[] args) {

        Pessoa mauricio = new Pessoa("Mauricio Neto", 1990, 1.61);
        mauricio.imprimirInformacoes();
        System.out.println("Sua idade é: " + mauricio.calcularIdade());

//        Carro carroJoao = new Carro();
//        carroJoao.qtdPneus = 4;
//        carroJoao.qtdPortas = 4;
//        carroJoao.cor = "Vermelho";
//
//        carroJoao.cor = "Amarelo";
//
//        carroJoao.acelerar();
//        carroJoao.frear();
//        System.out.println("Quantidade de Pneus = " + carroJoao.qtdPneus);
//        System.out.println("Quantidade de Portas = " + carroJoao.qtdPortas);
//        System.out.println("Cor = " + carroJoao.cor);
    }
}
