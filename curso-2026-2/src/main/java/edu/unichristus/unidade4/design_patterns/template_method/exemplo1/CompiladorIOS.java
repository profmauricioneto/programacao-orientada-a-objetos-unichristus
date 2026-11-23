package edu.unichristus.unidade4.design_patterns.template_method.exemplo1;

public class CompiladorIOS extends Compilador {
    @Override
    public void codigoFonte() {
        System.out.println("Código-Fonte Swift");
    }

    @Override
    public void compilarParaObjeto(){
        System.out.println("Criando código intermediário IOS");
    }

    @Override
    public void executar(){
        System.out.println("Executando código IOS");
    }
}
