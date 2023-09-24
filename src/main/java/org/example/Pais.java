package org.example;

public class Pais {
    private String nome;
    private String capital;

    public Pais(String nomePais, String capital) {
        this.nome = nomePais;
        this.capital = capital;
    }

    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }
}
