package Exercicio5;

import java.util.Scanner;

public class testeLivroAutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LivroAutor livroAutor = new LivroAutor();

        System.out.print("Titulo do livro: ");
        livroAutor.setTitulo(sc.nextLine());

        System.out.print("Autor: ");
        livroAutor.setAutor(sc.nextLine());

        System.out.print("Preço do livro: ");
        livroAutor.setPreco(sc.nextDouble());

        LivroAutor livroAutor2 = new LivroAutor(livroAutor.getTitulo(), livroAutor.getAutor(), livroAutor.getPreco());

        System.out.println();
        System.out.println("Dados do livro: ");
        System.out.println(livroAutor2);

        System.out.println();

        sc.nextLine();

        System.out.println("Deseja alterar o preço do livro? ");
        String opcao = sc.nextLine();

        if (opcao.equalsIgnoreCase("Sim")) {
            System.out.print("Novo preço: ");
            double novoPreco = sc.nextDouble();
            livroAutor2.alterarPreco(novoPreco);

            System.out.println();

            System.out.println("Dados do livro: ");
            System.out.println(livroAutor2);
            System.out.println("Dados do livro alterado com sucesso!");
        }
        else {
            System.out.println();
            System.out.println("Dados do livro: ");
            System.out.println(livroAutor2);
            System.out.println("Dados do livro não alterado.");
        }

        sc.close();

    }
}
