package br.com.halph.agenda.activities;

/**
 * Created by Android on 07/02/2017.
 */

public class Contato {

    private String nome;

    private String telefone;

    private Boolean favorito;

    public Contato(String telefone, String nome, Boolean favorito) {
        this.nome = nome;
        this.favorito = favorito;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getFavorito() {
        return favorito;
    }

    public void setFavorito(Boolean favorito) {
        this.favorito = favorito;
    }
}
