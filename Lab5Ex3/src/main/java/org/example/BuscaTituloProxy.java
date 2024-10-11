package org.example;

import java.util.ArrayList;

public class BuscaTituloProxy implements IBuscaTitulo {
    private IBuscaTitulo base;
    ArrayList<ITitulo> cache= new ArrayList<>();

    public BuscaTituloProxy(IBuscaTitulo base){
        this.base=base;
    }

    @Override
    public ITitulo buscar(String nome) {
        for (ITitulo t:cache){
            if (t.getNome()==nome){
                System.out.println("Encontrado no cache");
                return t;
            }
        }
        //se n encontrar, tenta buscar na base
        ITitulo titulo = base.buscar(nome);
        //se encontrar na base, salva no cache
        if (titulo!=null){
            System.out.println("Encontrado na base");
            cache.add(titulo);
        }
        return titulo;
    }
}
