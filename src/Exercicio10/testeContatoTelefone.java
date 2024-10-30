package Exercicio10;

import java.util.Scanner;

public class testeContatoTelefone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContatoTelefone ct = new ContatoTelefone();

        System.out.print("Nome: ");
        ct.setNome(sc.nextLine());

        System.out.print("Telefone: ");
        ct.setTelefone(sc.nextLine());

        System.out.print("Email: ");
        ct.setEmail(sc.nextLine());

        ContatoTelefone ct2 = new ContatoTelefone(ct.getNome(), ct.getTelefone(), ct.getEmail());

        System.out.println();

        System.out.println("Dados do contato: ");
        System.out.println(ct2);

        System.out.println();

        System.out.println("Deseja alterar o telefone? ");
        String opcao = sc.nextLine();

        if (opcao.equalsIgnoreCase("Sim")) {
            System.out.println("Novo telefone: ");
            String novoTelefone = sc.nextLine();
            ct2.atualizarTelefone(novoTelefone);

            System.out.println();
            System.out.println("Telefone atualizado com sucesso!");
            System.out.println("Dados do contato: ");
            System.out.println(ct2);
        }
        else {
            System.out.println("Contato sem alteração!");
            System.out.println("Dados do contato: ");
            System.out.println(ct2);
        }

        sc.close();

    }
}
