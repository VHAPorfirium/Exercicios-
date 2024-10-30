package Exercicio15;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<Produto> produtos = new ArrayList<>();
    private double total;

    public Pedido() {

    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public String toString() {
        return produtos.toString();
    }

}
