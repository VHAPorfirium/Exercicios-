package Exercicio22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o número de produtos: ");
        int numeroProdutos = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[numeroProdutos];
        Double[] preco = new Double[numeroProdutos];

        Produto[] produto = new Produto[numeroProdutos];
        ProdutoImportado[] produtoImportado = new ProdutoImportado[numeroProdutos];
        ProdutoUsado[] produtoUsado = new ProdutoUsado[numeroProdutos];

        for (int i = 0; i < numeroProdutos; i++) {
            System.out.println("Produto " + (i + 1) + ": ");
            System.out.print("Comum / Usado / Importado (C/U/I): ");
            char resposta = sc.next().charAt(0);
            sc.nextLine();

            if (resposta == 'C' || resposta == 'c') {
                System.out.print("Nome: ");
                nome[i] = sc.nextLine();
                System.out.print("Preço: ");
                preco[i] = sc.nextDouble();
                sc.nextLine();

                produto[i] = new Produto(nome[i], preco[i]);

            } else if (resposta == 'U' || resposta == 'u') {
                System.out.print("Nome: ");
                nome[i] = sc.nextLine();
                System.out.print("Preço: ");
                preco[i] = sc.nextDouble();
                sc.nextLine();

                System.out.print("Data de fabricação (dd/MM/yyyy): ");
                String dataString = sc.nextLine();

                Date dataFabricacao = null;
                try {
                    dataFabricacao = sdf.parse(dataString);
                } catch (ParseException e) {
                    System.out.println("Formato de data inválido. Use o formato dd/MM/yyyy.");
                    e.printStackTrace();
                    continue;
                }

                produtoUsado[i] = new ProdutoUsado(nome[i], preco[i], dataFabricacao);

            } else if (resposta == 'I' || resposta == 'i') {
                System.out.print("Nome: ");
                nome[i] = sc.nextLine();
                System.out.print("Preço: ");
                preco[i] = sc.nextDouble();
                System.out.print("Taxa: ");
                Double taxa = sc.nextDouble();
                sc.nextLine();

                produtoImportado[i] = new ProdutoImportado(nome[i], preco[i], taxa);
            }
        }

        System.out.println("Produtos: ");
        for (int i = 0; i < numeroProdutos; i++) {
            if (produto[i] != null) {
                System.out.println(produto[i].etiquetaPreco());
            } else if (produtoImportado[i] != null) {
                System.out.println(produtoImportado[i].etiquetaPreco());
            } else if (produtoUsado[i] != null) {
                System.out.println(produtoUsado[i].etiquetaPreco());
            }
        }

        sc.close();
    }
}

