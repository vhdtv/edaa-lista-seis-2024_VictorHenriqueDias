import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaPessoa {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("João", 25));
        pessoas.add(new Pessoa("Maria", 30));
        pessoas.add(new Pessoa("Pedro", 20));
        pessoas.add(new Pessoa("Ana", 22));
        pessoas.add(new Pessoa("Daniel", 31));
        pessoas.add(new Pessoa("Lucas", 18));

        Collections.sort(pessoas, (p1, p2) -> p1.getIdade().compareTo(p2.getIdade()));

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}