package org.unichristus.unidade4.padroes_projeto.template_method.exemplo1;

public class AndroidCompilador extends Compilador {
    @Override
    public void codigoFonte() {
        System.out.println("Pegando código-fonte kotlin.");
    }

    @Override
    public void compilarParaObjeto() {
        System.out.println("Gerando arquivos intermediários do Android.");
    }

    @Override
    public void executar() {
        System.out.println("Executando código Kotlin!");
    }
}
