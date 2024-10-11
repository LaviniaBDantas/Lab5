package org.example;

public class Player {
    String nomeFilme;
    public void liga() {
        System.out.println("Player ligado");
    }

    public void escolheFilme(String nomeFilme) {
        this.nomeFilme=nomeFilme;
        System.out.println("Reproduzindo "+nomeFilme);
    }

    public void desliga() {
        System.out.println("Player desligado");
    }
}
