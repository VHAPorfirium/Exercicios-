package Exercicio20;

import java.util.ArrayList;
import java.util.List;

public class Agencia {

    private int codigo;
    private List<Cliente> clientes;

    public Agencia(int codigo) {
        this.codigo = codigo;
        this.clientes = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }
}
