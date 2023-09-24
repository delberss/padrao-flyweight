package org.example;

public class Jogador {
    private String nome;
    private Pais pais;
    public Jogador(String nome, Pais pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public String obterJogador() {
        return "Jogador{" +
                "nome='" + this.nome + '\'' +
                ", país='" + pais.getNome() + '\'' +
                ", capital='" + pais.getCapital() + '\'' +
                '}';
    }
}
