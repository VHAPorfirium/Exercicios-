package Exercicio3;

import java.util.Scanner;

public class testeContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();

        System.out.print("Numero conta: ");
        String numeroConta = sc.nextLine();

        System.out.print("Titular: ");
        String titular = sc.nextLine();

        System.out.print("Saldo atual: ");
        conta.setSaldo(sc.nextDouble());

        ContaBancaria conta2 = new ContaBancaria(numeroConta, titular, conta.getSaldo());

        System.out.println(conta2);

        System.out.println("MENU: ");
        System.out.println("1 - Saque");
        System.out.println("2 - Deposito");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.print("Valor a sacar: ");
            conta2.sacar(sc.nextDouble());

            System.out.println();

            System.out.println(conta2);

        }
        if (opcao == 2) {
            System.out.print("Valor a depositar: ");
            conta2.depositar(sc.nextDouble());

            System.out.println();

            System.out.println(conta2);

        }

        sc.close();

    }
}
