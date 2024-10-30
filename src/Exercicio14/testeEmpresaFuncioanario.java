package Exercicio14;

import java.util.Scanner;

public class testeEmpresaFuncioanario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome da empresa: ");
        String nomeEmpresa = sc.nextLine();

        Empresa empresa = new Empresa(nomeEmpresa);

        System.out.print("Deseja cadastrar um funcionario? ");
        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.print("Nome do funcionario: ");
            String nome = sc.nextLine();

            System.out.print("Matricula: ");
            int matricula = sc.nextInt();

            System.out.print("Salario: ");
            double salario = sc.nextDouble();

            Funcionario funcionario = new Funcionario(nome, matricula, salario);

            empresa.adicionarFuncionario(funcionario);

        }

        System.out.println(empresa);

        sc.close();
    }
}
