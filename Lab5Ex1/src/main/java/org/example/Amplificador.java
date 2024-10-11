package org.example;

public class Amplificador {
    int volume;
    public void liga() {
        System.out.println("Amplificador ligado");
    }

    public void ajusta(int v) {
        volume=v;
        System.out.println("Volume ajustado em "+v);
    }

    public void desliga() {
        System.out.println("Amplificador desligado");
    }
}
