package org.unichristus.unidade4.padroes_projeto.template_method.exemplo1;

public class IOSCompilador extends Compilador {
    @Override
    public void codigoFonte() {
        System.out.println("Pegando código-fonte swift.");
    }

    @Override
    public void compilarParaObjeto() {
        System.out.println("Gerando arquivos intermediários do IOS.");
    }

    @Override
    public void executar() {
        System.out.println("Executando código swift!");
    }
}
