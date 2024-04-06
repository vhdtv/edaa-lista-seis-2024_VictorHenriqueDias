import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarPaisesApp {

    public static void main(String[] args) throws Exception {

        // Criando a lista de países
        List<Pais> listaPaises = new ArrayList<>();

        listaPaises.add(new Pais("Brasil"));
        listaPaises.add(new Pais("Argentina"));
        listaPaises.add(new Pais("Chile"));
        listaPaises.add(new Pais("Uruguai"));
        listaPaises.add(new Pais("Portugal"));
        listaPaises.add(new Pais("Bolívia"));
        listaPaises.add(new Pais("China"));
        listaPaises.add(new Pais("Estados Unidos"));
        listaPaises.add(new Pais("França"));
        listaPaises.add(new Pais("Japão"));
        listaPaises.add(new Pais("Coréia"));

        // Imprimindo a lista original
        System.out.println("Lista original:");
        for (Pais pais : listaPaises) {
            System.out.println(pais.getNome());
        }

        // Ordenando a lista por nome usando lambda
        Collections.sort(listaPaises, (pais1, pais2) -> pais1.getNome().compareTo(pais2.getNome()));

        // Imprimindo a lista ordenada
        System.out.println("\nLista ordenada por nome:");
        for (Pais pais : listaPaises) {
            System.out.println(pais.getNome());
        }
    }
}