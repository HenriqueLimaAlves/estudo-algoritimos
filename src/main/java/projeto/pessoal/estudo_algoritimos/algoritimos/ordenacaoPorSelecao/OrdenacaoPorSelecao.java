package projeto.pessoal.estudo_algoritimos.algoritimos.ordenacaoPorSelecao;

import projeto.pessoal.estudo_algoritimos.algoritimos.ordenacaoPorSelecao.model.Artista;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPorSelecao {
    /* Algorítimo não muito perfomático em O(n²), Percorre todos os elementos do array e
    ordena do maior para o menor a partir do número de plays do artista.

Passos:
    1.ª encontrar o maior/menor elemento dentro do array
    2.ª instanciar uma nova lista alvo, e percorrer conforme o tamanho desejado
    3.ª preencher a lista nova com o valor do maior/menor indice que foi encontrado no passo 1
    4.ª remover da lista BASE o ítem maior/menor do index que já foi adicionado na nova lista */
    public List<Artista> ordenaListaTopTen(List<Artista> listaArtistas){

        List<Artista> listaTopTen = new ArrayList<>(); // cria uma lista vazia onde será adicionada o top10 ordenado

        for(int i = 0; listaTopTen.size() < 10 ; i++){//cria um loop para preencher o top 10, onde ele percorrerá enquanto listaTopTen for menor que 10

            int indiceMaior = encontraIndiceMaiorDePlays(listaArtistas); // encontra o indice maior com base nas plays do artista

            if(indiceMaior != i){
                listaTopTen.add(listaArtistas.get(indiceMaior));
                listaArtistas.remove(indiceMaior);
            }
        }

        return listaTopTen;
    }

    private int encontraIndiceMaiorDePlays(List<Artista> plays){// retorna o maior indice dentro do array

        int maiorPlayIndice = 0;

        for (int i = 0; i < plays.size(); i++){// percorre enquanto o index for menor que o tamanho da lista de plays do artista

            if(plays.get(i).getPlays() > plays.get(maiorPlayIndice).getPlays()){// compara a play do indice atual com a do maior indice encontrado até o momento
                maiorPlayIndice = i; // caso a play do indice atual for maior que a registrada no maiorPlayIndice, maiorPlayIndice passa a ser o indice atual
            }
        }
        return maiorPlayIndice;
    }
}
