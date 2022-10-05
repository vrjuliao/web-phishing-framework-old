package br.ufmg.app;

import br.ufmg.utils.Singleton;

public class Main {
    public static void main(String[] args) {
        int instancias = Integer.parseInt(args[0]);
        int timeout = Integer.parseInt(args[1]);
        String flag = args[2];
        int janela_requisicoes = Integer.parseInt(args[3]);
        int limite_requisicoes = Integer.parseInt(args[4]);
        Singleton.getInstance().setParameters(janela_requisicoes,limite_requisicoes);

        App aplicacao = new App(instancias,timeout,flag,limite_requisicoes);
        aplicacao.configurarCaminhos();
        aplicacao.obterArquivos();
        aplicacao.obterUrls();
        aplicacao.administrarProcessos();
    }
}