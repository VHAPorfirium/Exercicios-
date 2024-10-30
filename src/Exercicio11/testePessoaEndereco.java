package Exercicio11;

import java.util.Scanner;

public class testePessoaEndereco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Rua: ");
        String rua = sc.nextLine();

        System.out.print("Numero: ");
        int numero = sc.nextInt();

        sc.nextLine();

        System.out.print("Cidade: ");
        String cidade = sc.nextLine();

        System.out.print("Estado: ");
        String estado = sc.nextLine();

        Pessoa pessoa1 = new Pessoa(nome, new Endereco(rua, numero, cidade, estado));

        System.out.println();
        System.out.println("Dados: ");
        System.out.println(pessoa1);

        sc.close();
    }
}
