package br.dev.rvz;

/**
 *  rsponsavel pelo gerenciamento tde interafção com o usuário
 * */
public class Sistema {

    Jogo jogo;

    public Sistema() {
        this.jogo = new Jogo();
    }

    private void menuPrincipal() {
        IO.output("Bem vindo ao caça níquel!");
        IO.output("Desejamos uma boa sorte!!!");
        for(ValoresSorteio item : ValoresSorteio.values()) {
            System.out.print(item + ": " + item.ponto + " Pontos ");
        };
        IO.output("");
    }

    public void executarPrograma() {
        menuPrincipal();
        definirDificuldade();
        jogo.jogar();
        exbbirResultado();
    }

    /**
     * solicitado o grau de dificuldade ao usuário que é setado no jogo
     * */
    private void definirDificuldade() {
        IO.output("por favor, informe um nível de dificuldade ( maior que 3): ");
        jogo.setDificultade(IO.input().nextInt());
    }

    /**
     * responsavel por exibir as pontuaçãos para usuário
     * */
    private void exbbirResultado() {
        IO.output("Acertos: " + jogo.getAcertos());
        jogo.verificarBonus();
        IO.output("Pontos ganhos: " + jogo.getPonto());
        exibirBonus();
        IO.output("A sua pontuação total foi: " + jogo.getPonto() * jogo.getBonus());
    }

    /**
     * responsavel por exibir a mensagem correta se ouve bonus ou não
     * */
    private void exibirBonus() {
        if (jogo.getBonus() == 100) {
            IO.output("Parabéns! você acertou uma sequencia e ganhou bônus de: " + ((jogo.getPonto() * jogo.getBonus()) - jogo.getPonto()) + " pontos");
        } else {
            IO.output("Você não acertou uma sequência, lamentavel.");
        }
    }
}
