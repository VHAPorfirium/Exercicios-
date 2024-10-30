package Exercicio4;

import java.util.Scanner;

public class testeBiblioteLivros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BibliotecaLivros biblioteca = new BibliotecaLivros();

        System.out.print("Titulo: ");
        biblioteca.setTitulo(sc.nextLine());

        System.out.print("Autor: ");
        biblioteca.setAutor(sc.nextLine());

        System.out.print("Ano de publicação: ");
        biblioteca.setAnoPublicacao(sc.nextInt());

        System.out.print("Numero de exemplares na biblioteca: ");
        biblioteca.setNumeroExemplares(sc.nextInt());
        sc.nextLine();

        BibliotecaLivros biblioteca1 = new BibliotecaLivros(biblioteca.getTitulo(), biblioteca.getAutor(), biblioteca.getAnoPublicacao(), biblioteca.getNumeroExemplares());

        System.out.println("Deseja adicionar ou remover exemplares? ");
        String op = sc.nextLine();

        if (op.equalsIgnoreCase("adicionar")) {
            System.out.println("Deseja adicionar quantos exemplares? ");
            int numeroExemplaresAdicionar = sc.nextInt();
            biblioteca1.adicionarExemplares(numeroExemplaresAdicionar);

            System.out.println("Exemplares adicionados com sucesso!");
            System.out.println();

            System.out.println(biblioteca1);
        }
        if (op.equalsIgnoreCase("remover")) {
            System.out.println("Deseja remover quantos exemplares? ");
            int numeroExemplaresRemover = sc.nextInt();
            biblioteca1.removerExemplares(numeroExemplaresRemover);

            System.out.println("Exemplares removidados com sucesso!");
            System.out.println();

            System.out.println(biblioteca1);

        }

        sc.close();
    }

}
