package Exercicio20;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private String cpf;
    private List<ContaBancaria> contas;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void adicionarConta(ContaBancaria conta) {
        this.contas.add(conta);
    }

    public List<ContaBancaria> listarContas() {
        return contas;
    }

    public ContaBancaria buscarConta(int numero) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numero) {
                return conta;
            }
        }
        return null;
    }
}

