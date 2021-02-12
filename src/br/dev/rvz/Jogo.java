package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * responsavel por fazer a geraçaõ do jogo aleatorio
 * e gerenciar pontos
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
        gerenciar(ValoresSorteio.values()[numeroAleatorio], ValoresSorteio.values()[numeroAleatorio].ponto);
        return ValoresSorteio.values()[numeroAleatorio].ponto;
    }

    private void gerenciar(ValoresSorteio valoresSorteio, int ponto) {
        acertos.add(valoresSorteio);
        this.ponto += ponto;
    }

    public int getPonto() {
        return ponto;
    }

    public void setPonto(int ponto) {
        this.ponto = ponto;
    }

    public List<ValoresSorteio> getAcertos() {
        return acertos;
    }
}
