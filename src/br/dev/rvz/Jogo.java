package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * responsavel por fazer a geraçaõ do jogo aleatorio
 *
 * */
public class Jogo {

    private int numeroAleatorio;
    private List<ValoresSorteio> acertos;
    private int ponto;

    public Jogo() {
        this.ponto = 0;
        acertos = new ArrayList<>();
    }

    public int sortear() {
        numeroAleatorio = new Random().nextInt(ValoresSorteio.values().length);
        acertos.add(ValoresSorteio.values()[numeroAleatorio]);
        return ValoresSorteio.values()[numeroAleatorio].ponto;
    }

    public int getPonto() {
        return ponto;
    }

    public void setPonto(int ponto) {
        this.ponto = ponto;
    }
}
