package edu.unichristus.unidade2.revisao_np2.questao28;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Gerente Tio Paulo", "1", 10000, 500);
        Funcionario dev1 = new Desenvolvedor("Desenvolvedor Magnum", "1234567", 10000, 2);
        Funcionario dev2 = new Desenvolvedor("Desenvolvedor Bia", "654321", 10000, 5);

        Funcionario func[] = {gerente, dev1, dev2};

        for (Funcionario f: func) {
            System.out.println(f.calcularSalario());
        }
    }
}
