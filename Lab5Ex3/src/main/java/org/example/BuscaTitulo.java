package org.example;

import java.util.ArrayList;

public class BuscaTitulo implements IBuscaTitulo{
    static ArrayList<ITitulo> base = new ArrayList<>();
    @Override
    public ITitulo buscar(String nome) {
        for (ITitulo t:base){
            if (t.getNome() == nome){
                return t;
            }
        }
        //quando nao acha retorna nulo
        return null;
    }
}
