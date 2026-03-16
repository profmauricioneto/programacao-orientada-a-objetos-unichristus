package org.unichristus.unidade2.polymorphism.exercicio01;

public class MainTest {
    public static void main(String[] args) {
        Imovel imovelBeiraMar = new ImovelNovo(50000, 500000);
        Imovel imovelGoodGarden = new ImovelVelho(20000, 300000);
        Imovel imovelDunas = new ImovelNovoCorretor(700000, 20000, 3);

        Imovel imoveis[] = {imovelBeiraMar, imovelDunas, imovelGoodGarden};
        for (int i = 0; i < imoveis.length; i++) {
            System.out.println(imoveis[i].getClass() + " - " + imoveis[i].getPreco());
        }
    }
}
