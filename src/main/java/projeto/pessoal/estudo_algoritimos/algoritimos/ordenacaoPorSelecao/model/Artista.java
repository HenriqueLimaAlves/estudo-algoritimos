package projeto.pessoal.estudo_algoritimos.algoritimos.ordenacaoPorSelecao.model;

import java.util.Objects;

public class Artista {
    private String nome;
    private int plays;

    public Artista(String nome, int plays) {
        this.nome = nome;
        this.plays = plays;
    }

    public String getNome() {
        return nome;
    }

    public int getPlays() {
        return plays;
    }

    public void incrementarPlay() {
        this.plays++;
    }

    @Override
    public String toString() {
        return nome + " - " + plays + " plays";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artista artista = (Artista) o;
        return plays == artista.plays && Objects.equals(nome, artista.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, plays);
    }
}
