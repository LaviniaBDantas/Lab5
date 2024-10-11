package org.example;
public class Filme implements ITitulo{
    private String nome;
    private String descricao;

    public Filme(String nome, String descricao){
        this.nome=nome;
        this.descricao=descricao;
    }
    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
