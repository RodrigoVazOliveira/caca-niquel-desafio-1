package br.dev.rvz;

/**
 *  rsponsavel pelo gerenciamento de pontos e interafção com o usuário
 * */
public class Sistema {

    private boolean run;
    private int opcao;

    public void menuPrincipal() {
        IO.output("1. Jogar\n2. Sair do jogo");
    }
    
}
