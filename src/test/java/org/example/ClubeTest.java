package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClubeTest {
    @Test
    void deveRetornarJogadores() {
        Clube clube = new Clube();
        clube.contratarJogador("Messi", "Argentina", "Buenos Aires");
        clube.contratarJogador("Neymar", "Brasil", "Brasília");
        clube.contratarJogador("Vinícius Júnior", "Brasil", "Brasília");
        clube.contratarJogador("Cristiano Ronaldo", "Portugal", "Lisboa");

        List<String> saida = Arrays.asList(
                "Jogador{nome='Messi', país='Argentina', capital='Buenos Aires'}",
                "Jogador{nome='Neymar', país='Brasil', capital='Brasília'}",
                "Jogador{nome='Vinícius Júnior', país='Brasil', capital='Brasília'}",
                "Jogador{nome='Cristiano Ronaldo', país='Portugal', capital='Lisboa'}");

        assertEquals(saida, clube.obterJogadores());
    }

    @Test
    void deveRetornarTotalPaises() {
        Clube clube = new Clube();
        clube.contratarJogador("Messi", "Argentina", "Buenos Aires");
        clube.contratarJogador("Neymar", "Brasil", "Brasília");
        clube.contratarJogador("Vinícius Júnior", "Brasil", "Brasília");
        clube.contratarJogador("Cristiano Ronaldo", "Portugal", "Lisboa");

        assertEquals(3, PaisFactory.getTotalPaises());
    }

}