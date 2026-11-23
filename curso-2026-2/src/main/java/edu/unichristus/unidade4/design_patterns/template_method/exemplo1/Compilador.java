package edu.unichristus.unidade4.design_patterns.template_method.exemplo1;

public abstract class Compilador {

    public void compilarParaArquituraAlvo() {
        codigoFonte();
        compilarParaObjeto();
        executar();
    }

    public abstract void codigoFonte();
    public abstract void compilarParaObjeto();
    public abstract void executar();
}
