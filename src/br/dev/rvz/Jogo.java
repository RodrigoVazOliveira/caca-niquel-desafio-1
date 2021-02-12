package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * responsavel por fazer a geraçaõ do jogo aleatorio
 * e gerenciar pontos e dificultade
 * */
public class Jogo {

    private List<ValoresSorteio> acertos;
    private int ponto;
    private int dificultade;
    private int bonus;

    public Jogo() {
        this.ponto = 0;
        acertos = new ArrayList<>();
    }

    public void jogar() {
        if (dificultade <= 3) {
            sortear();
            sortear();
            sortear();
        } else {
            for (int i = 0; i < dificultade; i++) {
                sortear();
            }
        }
    }

    private void sortear() {
        int numeroAleatorio = new Random().nextInt(ValoresSorteio.values().length);
        gerenciar(ValoresSorteio.values()[numeroAleatorio], ValoresSorteio.values()[numeroAleatorio].ponto);
    }

    private void gerenciar(ValoresSorteio valoresSorteio, int ponto) {
        acertos.add(valoresSorteio);
        this.ponto += ponto;
    }

    public void verificarBonus() {
        ValoresSorteio valoresSorteio = acertos.get(0);
        int sizeAcerto = 0;
        for (ValoresSorteio item: acertos) {
            if (valoresSorteio.equals(item)) {
                sizeAcerto++;
            }
        }
        if (sizeAcerto == acertos.size()) {
           bonus = 100;
        } else {
            bonus = 1;
        }
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

    public int getDificultade() {
        return dificultade;
    }

    public void setDificultade(int dificultade) {
        this.dificultade = dificultade;
    }

    public int getBonus() {
        return bonus;
    }
}
