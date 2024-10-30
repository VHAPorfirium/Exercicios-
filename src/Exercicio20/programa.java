package Exercicio20;

import java.util.List;

public class programa {
    public static void main(String[] args) {

        Banco banco = new Banco("Banco Central");

        Agencia agencia1 = new Agencia(101);
        Agencia agencia2 = new Agencia(102);

        banco.adicionarAgencia(agencia1);
        banco.adicionarAgencia(agencia2);

        Cliente cliente1 = new Cliente("Maria Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("João Souza", "987.654.321-00");

        agencia1.adicionarCliente(cliente1);
        agencia2.adicionarCliente(cliente2);

        ContaBancaria conta1 = new ContaBancaria(1001, 500.0, "Corrente");
        ContaBancaria conta2 = new ContaBancaria(1002, 1000.0, "Poupança");

        cliente1.adicionarConta(conta1);
        cliente2.adicionarConta(conta2);

        System.out.println("Banco: " + banco.getNome());

        Agencia agenciaBuscada = banco.buscarAgencia(101);
        if (agenciaBuscada != null) {
            System.out.println("Agência 101 encontrada.");

            Cliente clienteBuscado = agenciaBuscada.buscarCliente("123.456.789-00");
            if (clienteBuscado != null) {
                System.out.println("Cliente encontrado: " + clienteBuscado.getNome());

                for (ContaBancaria conta : clienteBuscado.listarContas()) {
                    System.out.println("Conta Número: " + conta.getNumeroConta() +
                            " | Tipo: " + conta.getTipo() +
                            " | Saldo: " + conta.consultar());
                }

                System.out.println("\nDepositando R$ 200,00 na conta 1001.");
                conta1.depositar(200.0);
                System.out.println("Novo saldo: " + conta1.consultar());

                System.out.println("Tentando sacar R$ 800,00 da conta 1001.");
                conta1.sacar(800.0);
                System.out.println("Saldo após saque: " + conta1.consultar());
            }
        }
    }
}
