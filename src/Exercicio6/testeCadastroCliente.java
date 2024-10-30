package Exercicio6;

import java.util.Scanner;

public class testeCadastroCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CadastroCliente cadastro = new CadastroCliente();

        System.out.print("Digite o nome do cliente: ");
        cadastro.setNome(sc.nextLine());

        System.out.print("Idade: ");
        cadastro.setIdade(sc.nextInt());

        sc.nextLine();

        System.out.print("Email: ");
        cadastro.setEmail(sc.nextLine());

        CadastroCliente cadastro2 = new CadastroCliente(cadastro.getNome(), cadastro.getIdade(), cadastro.getEmail());

        System.out.println();

        System.out.println("Dados do cliente: ");
        System.out.println(cadastro2);

        System.out.println();

        System.out.println("Deseja alterar o email do cliente? ");
        String op = sc.nextLine();

        if (op.equalsIgnoreCase("Sim")) {
            System.out.print("Email: ");
            String alterarEmail = sc.nextLine();
            cadastro2.alterarEmail(alterarEmail);

            System.out.println("Dados do cliente atualizado com sucesso!: ");
            System.out.println(cadastro2);
        }
        else {
            System.out.println(cadastro2);
        }

        sc.close();

    }
}
