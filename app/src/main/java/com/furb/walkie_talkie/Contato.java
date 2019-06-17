package com.furb.walkie_talkie;

public class Contato {

    private String nome;
    private String fotoUrl;

    public Contato(String nome, String fotoUrl) {
        this.nome = nome;
        this.fotoUrl = fotoUrl;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }
}
