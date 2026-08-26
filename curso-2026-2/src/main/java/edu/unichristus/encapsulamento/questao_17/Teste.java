package edu.unichristus.encapsulamento.questao_17;

public class Teste {
    public static void main(String[] args) {
        Produto chinelo = new Produto("Havianas de Pau!");
        try {
            chinelo.setPreco(100);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            chinelo.addQtdEstoque(20);
            chinelo.removerQtdEstoque(30);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(chinelo.toString());
    }
}
