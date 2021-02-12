package br.dev.rvz;

import java.util.Scanner;

/**
 *  responsavel pela entrada e saida de dados no terminal
 * */
public class IO {
    public static Scanner input() {
        return new Scanner(System.in);
    }

    public static void output(String texto) {
        System.out.println(texto);
    }
}
