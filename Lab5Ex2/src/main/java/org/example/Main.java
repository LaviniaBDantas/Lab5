package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Padrão fachada carro!");

        Carro meuCarro=new Carro();

        meuCarro.dirigirCarro();
        meuCarro.finalizarCorrida();
    }
}