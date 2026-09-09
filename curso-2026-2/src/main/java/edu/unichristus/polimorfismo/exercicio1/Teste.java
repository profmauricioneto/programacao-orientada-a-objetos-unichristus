package edu.unichristus.polimorfismo.exercicio1;

public class Teste {
    public static void main(String[] args) {
        Imovel beiramar = new ImovelNovo(5000000, 500000);
        Imovel kennedy = new ImovelVelho(800000, 50000);
        Imovel alpha = new ImovelNovoCorretor(3000000, 50000, 4);

        System.out.println("Beiramar: " + beiramar.calculoValorImovel());
        System.out.println("Kennedy: " + kennedy.calculoValorImovel());
        System.out.println("Alpha: " + alpha.calculoValorImovel());
    }
}
