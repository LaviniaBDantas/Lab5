package org.example;

public class Cinemateca {

    Amplificador amplificador=new Amplificador();
    Luzes luzes = new Luzes();
    Pipoqueira pipoqueira= new Pipoqueira();
    Player player=new Player();
    Projetor projetor= new Projetor();
    Telao telao= new Telao();

    public void iniciaSessao(int volume, String nomeFilme){
        System.out.println("\nBem vindo(a) a sessão de filme!");
        pipoqueira.liga();
        pipoqueira.fazPipoca();
        luzes.desliga();
        telao.abaixa();
        projetor.liga();
        amplificador.liga();
        amplificador.ajusta(volume);
        player.liga();
        player.escolheFilme(nomeFilme);
    }

    public void terminaSessao(){
        System.out.println("\nFim da sessão");
        pipoqueira.desliga();
        luzes.desliga();
        telao.levanta();
        projetor.desliga();
        amplificador.desliga();
        player.desliga();
    }

}
