package projeto.pessoal.estudo_algoritimos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import projeto.pessoal.estudo_algoritimos.algoritimos.PilhaFilasERecursao.Pilha;

@SpringBootApplication
public class EstudoAlgoritimosApplication {

	public static void main(String[] args) {
            SpringApplication.run(EstudoAlgoritimosApplication.class, args);

            Pilha pilha = new Pilha();

            for(int i = 1; !pilha.isFull(); i++){
                pilha.push(i);

                System.out.println(pilha.top() + 1);
            }

            while(!pilha.isEmpty()){

                int e = pilha.pop();

                System.out.println("Desempilhando " + e);

            }

	}




}
