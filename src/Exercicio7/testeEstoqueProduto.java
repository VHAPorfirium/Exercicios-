package Exercicio7;

import java.util.Scanner;

public class testeEstoqueProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EstoqueProduto estoqueProduto = new EstoqueProduto();

        System.out.print("Nome produto: ");
        estoqueProduto.setNome(sc.nextLine());

        System.out.print("Quantidade: ");
        estoqueProduto.setQuantidade(sc.nextInt());

        System.out.print("Preço de venda: ");
        estoqueProduto.setPrecoVenda(sc.nextDouble());

        System.out.print("Preço de compra: ");
        estoqueProduto.setPrecoCompra(sc.nextDouble());

        System.out.println(estoqueProduto);

        sc.nextLine();

        System.out.println("Deseja alterar o valor de venda do produto? (Sim/Não)");
        String opcao = sc.nextLine();

        if (opcao.equalsIgnoreCase("Sim")) {
            System.out.print("Novo valor: ");
            double novoPrecoVenda = sc.nextDouble();
            estoqueProduto.atualizarPrecoVenda(novoPrecoVenda);

            System.out.println();

            System.out.println(estoqueProduto);
            System.out.println("Valor atualizado com sucesso!");
        }
        else {
            System.out.println("Valores mantido o mesmo, sem mudança. ");
        }

        sc.close();

    }
}
