package Exercicio20;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAgencia(Agencia agencia) {
        agencias.add(agencia);
    }

    public Agencia buscarAgencia(int codigo) {
        for (Agencia agencia : agencias) {
            if (agencia.getCodigo() == codigo) {
                return agencia;
            }
        }
        return null;
    }
}
