package org.example;
import java.util.HashMap;
import java.util.Map;
public class PaisFactory {
    private static Map<String, Pais> paises = new HashMap<>();

    public static Pais getNacionalidade(String nome, String capital) {
        Pais pais = paises.get(nome);
        if (pais == null) {
            pais = new Pais(nome, capital);
            paises.put(nome, pais);
        }
        return pais;
    }

    public static int getTotalPaises() {
        return paises.size();
    }
}
