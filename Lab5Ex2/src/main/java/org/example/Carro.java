package org.example;

public class Carro {
    Motor motor = new Motor();
    Cinto cinto = new Cinto();
    Porta porta = new Porta();
    Farol farol = new Farol();
    Radio radio = new Radio();

    public void dirigirCarro(){
        System.out.println("\nIniciando a corrida\n");
        motor.ligar();
        porta.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar();
    }
    public void finalizarCorrida(){
        System.out.println("\nFinalizando a corrida\n");
        motor.desligar();
        porta.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
    }
}
