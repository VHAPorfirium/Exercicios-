package Exercicio15;

public class testePedidoProduto {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        Produto produto1 = new Produto("Shampoo", 25.02);
        Produto produto2 = new Produto("Condicionador", 20.00);
        Produto produto3 = new Produto("Papel", 20.00);

        pedido.adicionarProduto(produto1);

        System.out.println(pedido);


    }
}
