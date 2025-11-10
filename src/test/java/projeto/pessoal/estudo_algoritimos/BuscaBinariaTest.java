package projeto.pessoal.estudo_algoritimos;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class BuscaBinariaTest {

    BuscaBinaria buscaBinaria = new BuscaBinaria();

    List<String> nomes;

    @Test
    void calculaNumeroDeTentativasParaUmaListaDe128Nomes() {

        nomes = preencheLista(128);

        Integer tentativas = buscaBinaria.buscaNumeroTentativas(nomes, 127);

        assertEquals(7, tentativas);
    }

    @Test
    void calculaNumeroDeTentativasParaUmaListaDe258Nomes() {

        nomes = preencheLista(258);

        Integer tentativas = buscaBinaria.buscaNumeroTentativas(nomes, 257);

        assertEquals(8, tentativas);
    }

    public List<String> preencheLista(int tamanho) {
        return IntStream.rangeClosed(1, tamanho)
                .mapToObj(i -> "Nome" + i)
                .collect(Collectors.toList());

    }

}