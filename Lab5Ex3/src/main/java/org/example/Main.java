package org.example;

import static org.example.BuscaTitulo.base;

//Problema: Um site de filmes/séries em que as buscas, muitas vezes são as mesmas,
// precisa ser otimizado, salvando o cache das buscas recorrentes.
public class Main {
    public static void main(String[] args) {

        System.out.println("Padrao Proxy!");

        Filme meuFilme = new Filme("Frances Ha!", "Frances se joga de cabeça em seus sonhos, mesmo que a realidade possível seja bem pobre. Ela quer muito mais do que tem e leva a vida com uma alegria inexplicável e muita leveza.");
        base.add(meuFilme);

        BuscaTitulo buscaTitulo=new BuscaTitulo();
        BuscaTituloProxy buscaTituloProxy=new BuscaTituloProxy(buscaTitulo);
        ITitulo tituloEncontrado= buscaTituloProxy.buscar("Frances Ha!");

        System.out.println(tituloEncontrado.getDescricao()); //Na primeira busca, ele encontra na base

        ITitulo tituloEncontrado2=buscaTituloProxy.buscar("Frances Ha!");

        System.out.println(tituloEncontrado2.getDescricao()); //Na segunda busca, ele encontra no proxy
    }
}