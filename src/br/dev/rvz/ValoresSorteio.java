package br.dev.rvz;

/**
 * suas respectivas frutas sorteadas e seus respectivos pontos
 * */
public enum ValoresSorteio {

    BANANA(10, 1), MORANGO(20, 2), ESTRELA(40, 3);

    private int ponto;
    private int numeroSorteio;

    ValoresSorteio(int ponto, int numeroSorteio) {
        this.ponto = ponto;
        this.numeroSorteio = numeroSorteio;
    }
}