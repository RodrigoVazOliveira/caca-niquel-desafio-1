package br.dev.rvz;

/**
 *  rsponsavel pelo gerenciamento tde interafção com o usuário
 * */
public class Sistema {

    public void menuPrincipal() {
        IO.output("Bem vindo ao caça níquel!");
        IO.output("Desejamos uma boa sorte!!!");
        IO.output("Banana - 10 pontos, Morango - 20 pontos e Estrela - 40 pontos");
    }

    public void executarPrograma() {
        menuPrincipal();
        Jogo jogo = new Jogo();
        jogo.sortear();
        jogo.sortear();
        jogo.sortear();
        IO.output("Acertos: " + jogo.getAcertos());
        IO.output("A sua pontuação total foi: " + jogo.getPonto());
    }
}
