package projeto.pessoal.estudo_algoritimos;

import java.util.List;

public class BuscaBinaria {
    /*Com a pesquisa binária você chuta um número intermediário e elimina a metade dos números restantes de cada vez.
    Você só consegue aplicar esse algoritimo se a lista for ordenada. */
    public Integer buscaNumeroTentativas(List<String> numeros, int target){

        int esquerda = 0; // inicio
        int direita = numeros.toArray().length - 1; //chute maximo
        int medio = 0; //numero intermediário
        int tentativas = 0; //numero de tentativas
        //preciso achar o "chute" médio do array
        //preciso que o proximo número da "esquerda" seja um número DEPOIS do "chute" atual no array, caso ele for MAIOR
        //preciso que o proximo número da "direita" seja: um número ANTES do "chute" atual no array, caso ele for MENOR
        //repetir até achar o Target
        while(esquerda <= direita){
            medio = esquerda + ((direita - esquerda) >> 1);  //solução, pois usar: "(esquerda + direita) / 2" pode causar "Overflow" se esquerda + direita for maior que o limite de int.
            if(target == medio){
                return tentativas;
            } else if (target > medio ) {//target = 8, medio = 5, como o Target é maior que o medio, move-se o ponteiro da esquerda
                tentativas += 1;
                esquerda = medio + 1; //anda o ponteiro uma casa para direita e elimina os números anteriores a isso.
            }else if(target < medio){
                tentativas += 1;
                direita = medio -1;
            }
        }
        return -1;
    }
}