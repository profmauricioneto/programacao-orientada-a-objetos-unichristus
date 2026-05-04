package org.unichristus.unidade4.padroes_projeto.template_method.exemplo1;

public abstract class Compilador {
    public Compilador() {
        this.codigoFonte();
        this.compilarParaObjeto();
        this.executar();
    }

    public abstract void codigoFonte();
    public abstract void compilarParaObjeto();
    public abstract void executar();
}
