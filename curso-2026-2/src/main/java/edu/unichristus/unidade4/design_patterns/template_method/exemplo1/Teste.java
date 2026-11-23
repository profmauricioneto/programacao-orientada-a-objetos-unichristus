package edu.unichristus.unidade4.design_patterns.template_method.exemplo1;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite qual compilador alvo [ios/android]: ");
        String comp = scan.next();

        Compilador compilador;
        if (comp.equalsIgnoreCase("ios")) {
            compilador = new CompiladorIOS();
        } else {
            compilador = new CompiladorAndroid();
        }
        compilador.compilarParaArquituraAlvo();
    }
}
