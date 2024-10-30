package Exercicio24;

import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta");
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();
        System.out.print("Limite de saque: ");
        double limiteSaque = sc.nextDouble();

        Conta acc1 = new Conta(numero, titular, saldo, limiteSaque);

        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");
        double valor = sc.nextDouble();

        try {
            acc1.sacar(valor);
            System.out.printf("Novo saldo: %.2f%n", acc1.getSaldo());
        }
        catch (ContaExcecoes e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
