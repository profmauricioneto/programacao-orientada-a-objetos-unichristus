package edu.unichristus.unidade4.design_patterns.template_method.exemplo1;

public class CompiladorAndroid extends Compilador {
    @Override
    public void codigoFonte() {
        System.out.println("Código-Fonte Kotlin");
    }

    @Override
    public void compilarParaObjeto(){
        System.out.println("Criando código intermediário Android (bytecode)");
    }

    @Override
    public void executar(){
        System.out.println("Executando código Android");
    }
}
