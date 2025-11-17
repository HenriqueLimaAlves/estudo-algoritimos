package projeto.pessoal.estudo_algoritimos.algoritimos.PilhaFilasERecursao;

public class Recursao {

    public static void funcaoRecursiva(int i){

        System.out.println(i);

        if (i <= 0){
            return;
        }

        funcaoRecursiva(i-1);
    }
}
