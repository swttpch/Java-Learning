package arrays.twoDimensionalArrayList;

import java.util.ArrayList;

public class TwoDimensionalArrayList {

    public void execute() {

        // 2D ArrayList = uma lista de listas dinânica
        // você pode mudar o tamanho dessas listas enquanto roda o programa

        ArrayList<ArrayList<String>> mercado = new ArrayList(); // criação do ArrayList 2D

        ArrayList<String> listaCompras = new ArrayList(); // criação dos ArrayLists que vão dentro do 2D

        listaCompras.add("Massa");
        listaCompras.add("Ketchup");
        listaCompras.add("Requeijão");

        ArrayList<String> listaProdutos = new ArrayList();

        listaProdutos.add("Detergente");
        listaProdutos.add("Sabão em pó");
        listaProdutos.add("Desodorante");

        ArrayList<String> listaBebidas = new ArrayList();

        listaBebidas.add("Suco");
        listaBebidas.add("Água");

        mercado.add(listaCompras);                       // inserção dos ArrayLists dentro do ArrayList 2D
        mercado.add(listaProdutos);
        mercado.add(listaBebidas);

        System.out.println(mercado.get(2).get(1)); // mostrar o resultado
    }
}
