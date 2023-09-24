package org.example;

import java.util.ArrayList;
import java.util.List;
public class Clube {
    private List<Jogador> jogadores = new ArrayList<>();

    public void contratarJogador(String nomeJogador, String nomePais, String capital) {
        Pais pais = PaisFactory.getNacionalidade(nomePais, capital);
        Jogador jogador = new Jogador(nomeJogador, pais);
        jogadores.add(jogador);
    }

    public List<String> obterJogadores() {
        List<String> saida = new ArrayList<String>();
        for (Jogador jogador : this.jogadores) {
            saida.add(jogador.obterJogador());
        }
        return saida;
    }
}
