package org.unichristus.unidade4.padroes_projeto.template_method.exemplo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String compiladorAlvo;
        Compilador compilador;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o compilador alvo [IOS/ANDROID]: ");
        compiladorAlvo = scan.next();

        if (compiladorAlvo.equalsIgnoreCase("ios")) {
            compilador = new IOSCompilador();
        } else if (compiladorAlvo.equalsIgnoreCase("android")) {
            compilador = new AndroidCompilador();
        } else {
            System.out.println("Compilador alvo inválido!");
        }

    }
}
