package org.example;
public class Serie implements ITitulo{
    private String nome;
    private String descricao;
    private Integer qtdEps;

    public Serie(String nome, String descricao){
        this.nome=nome;
        this.descricao=descricao;
    }
    @Override
    public String getDescricao() {
        return descricao+ "Quantidade episódios: "+qtdEps;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
