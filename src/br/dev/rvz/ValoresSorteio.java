package br.dev.rvz;

/**
 * suas respectivas frutas sorteadas e seus respectivos pontos
 * */
public enum ValoresSorteio {

    BANANA(10), MORANGO(20), ESTRELA(40);

    private int ponto;

    ValoresSorteio(int ponto) {
        this.ponto = ponto;
    }
}