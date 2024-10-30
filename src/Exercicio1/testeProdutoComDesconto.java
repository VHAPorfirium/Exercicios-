package Exercicio1;

import java.util.Scanner;

public class testeProdutoComDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProdutoComDesconto produto = new ProdutoComDesconto();

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        produto.setNome(nome);

        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        produto.setPreco(preco);

        System.out.print("Desconto: ");
        double desconto = sc.nextDouble();
        produto.setDesconto(desconto);

        produto = new ProdutoComDesconto(nome, preco, desconto);

        System.out.println(produto);

        System.out.print("Novo desconto:");
        double novoDesconto = sc.nextDouble();
        produto.aplicarDesconto(novoDesconto);

        System.out.println(produto);

        sc.close();
    }
}