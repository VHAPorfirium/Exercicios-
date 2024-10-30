package Exercicio21;

import java.util.Arrays;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de funcionarios: ");
        int numerosFuncionarios = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[numerosFuncionarios];
        Integer[] horas = new Integer[numerosFuncionarios];
        Double[] salarios = new Double[numerosFuncionarios];

        Funcionario[] funcionario = new Funcionario[numerosFuncionarios];
        FuncionarioTercerizado[] funcionarioTercerizado = new FuncionarioTercerizado[numerosFuncionarios];

        for (int i = 0; i < numerosFuncionarios; i++) {
            System.out.println("Funcionario " + (i + 1) + ": ");
            System.out.print("Funcionario tercerizado? (S/N) ");
            char resposta = sc.next().charAt(0);
            sc.nextLine();

            if (resposta == 'S' || resposta == 's') {
                System.out.print("Nome: ");
                nome[i] = sc.nextLine();
                System.out.print("Horas trabalhadas: ");
                horas[i] = sc.nextInt();
                System.out.print("Valor por horas trabalhadas: ");
                salarios[i] = sc.nextDouble();

                System.out.print("Dispeza adicional: ");
                Double dispezaAdicional = sc.nextDouble();

                funcionarioTercerizado[i] = new FuncionarioTercerizado(nome[i], horas[i], salarios[i], dispezaAdicional);
            }
            else if (resposta == 'N' || resposta == 'n') {
                System.out.print("Nome: ");
                nome[i] = sc.nextLine();
                System.out.print("Horas trabalhadas: ");
                horas[i] = sc.nextInt();
                System.out.print("Valor por horas trabalhadas: ");
                salarios[i] = sc.nextDouble();

                funcionario[i] = new Funcionario(nome[i], horas[i], salarios[i]);
            }
            else {
                System.out.println("Erro! ");
            }
        }

        System.out.println();

        System.out.println("Pagamento: ");
        for (int i = 0; i < numerosFuncionarios; i++) {
            if (funcionarioTercerizado[i] != null) {
                System.out.println(funcionarioTercerizado[i].toString());
            } else if (funcionario[i] != null) {
                System.out.println(funcionario[i].toString());
            }
        }
        sc.close();
    }
}
