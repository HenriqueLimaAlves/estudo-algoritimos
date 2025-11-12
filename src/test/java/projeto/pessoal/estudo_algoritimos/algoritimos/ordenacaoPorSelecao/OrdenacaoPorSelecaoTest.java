package projeto.pessoal.estudo_algoritimos.algoritimos.ordenacaoPorSelecao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import projeto.pessoal.estudo_algoritimos.algoritimos.ordenacaoPorSelecao.model.Artista;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.mockito.ArgumentMatchers.eq;

class OrdenacaoPorSelecaoTest {

    OrdenacaoPorSelecao ordenacaoPorSelecao = new OrdenacaoPorSelecao();

    List<Artista> listaDeArtistas =  new ArrayList<>();

    @BeforeEach
    public void setUp() {
        listaDeArtistas.add(new Artista("Meshuggah", 234));
        listaDeArtistas.add(new Artista("Jinger", 200));
        listaDeArtistas.add(new Artista("Gaerea", 100));
        listaDeArtistas.add(new Artista("Mastodon", 50));
        listaDeArtistas.add(new Artista("Periphery", 55));
        listaDeArtistas.add(new Artista("Rivers Of Nihil", 15));
        listaDeArtistas.add(new Artista("Gojira", 1445));
        listaDeArtistas.add(new Artista("Spiritbox", 140));
        listaDeArtistas.add(new Artista("Slipknot", 145));
        listaDeArtistas.add(new Artista("Sleep Token", 245));
        listaDeArtistas.add(new Artista("Sepultura", 545));
        listaDeArtistas.add(new Artista("Opeth", 645));
    }

    @Test
    void ordenaListaTopTen() {
        List<Artista> ordenada = new ArrayList<>();
        ordenada.add(new Artista("Gojira", 1445));
        ordenada.add(new Artista("Opeth", 645));
        ordenada.add(new Artista("Sepultura", 545));
        ordenada.add(new Artista("Sleep Token", 245));
        ordenada.add(new Artista("Meshuggah", 234));
        ordenada.add(new Artista("Jinger", 200));
        ordenada.add(new Artista("Slipknot", 145));
        ordenada.add(new Artista("Spiritbox", 140));
        ordenada.add(new Artista("Gaerea", 100));
        ordenada.add(new Artista("Periphery", 55));

        List<Artista> topTen = ordenacaoPorSelecao.ordenaListaTopTen(listaDeArtistas);

        Assertions.assertEquals(ordenada, topTen);

    }

    @Test
    void input125EGaranteQueTenha10ItensOrdenados() {

        List<Artista> listaCompleta = preencheListaDeArtistas(125);

        List<Artista> topTenEsperado = listaCompleta.stream()
                .sorted(Comparator.comparingInt(Artista::getPlays).reversed())
                .limit(10)
                .toList();


        List<Artista> topTen = ordenacaoPorSelecao.ordenaListaTopTen(listaCompleta);

        Assertions.assertEquals(10, topTen.size());
        Assertions.assertEquals(topTenEsperado, topTen);

    }

    @Test
    void Input1000EGaranteQueTenha10ItensOrdenados() {

        List<Artista> listaCompleta = preencheListaDeArtistas(1000);

        List<Artista> topTenEsperado = listaCompleta.stream()
                .sorted(Comparator.comparingInt(Artista::getPlays).reversed())
                .limit(10)
                .toList();


        List<Artista> topTen = ordenacaoPorSelecao.ordenaListaTopTen(listaCompleta);

        Assertions.assertEquals(10, topTen.size());
        Assertions.assertEquals(topTenEsperado, topTen);

    }

    public List<Artista> preencheListaDeArtistas(int tamanho) {
        return IntStream.rangeClosed(1, tamanho)
                .mapToObj(i -> new Artista("Artista" + i, (int) (Math.random() * 1000)))
                .collect(Collectors.toList());
    }

}