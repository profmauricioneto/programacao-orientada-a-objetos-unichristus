package org.unichristus.unidade4.padroes_projeto.template_method_redes_sociais;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a mensagem: ");
        String message = input.nextLine();

        System.out.println("Escolha a rede social [facebook/x]: ");
        String network = input.next();

        SocialNetwork sn;
        if (network.equalsIgnoreCase("facebook")) {
            sn = new FacebookNetwork("Mauricio", "teste");
            sn.postData(message);
        } else if (network.equalsIgnoreCase("x")) {
            sn = new XNetwork("Mauricio", "teste");
            sn.postData(message);
        } else {
            System.err.println("Erro na escolha da rede social.");
        }
    }
}
