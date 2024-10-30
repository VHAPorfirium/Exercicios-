package Exercicio14;

import java.util.ArrayList;

public class Empresa {

    private String nome;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public Empresa(String nome, ArrayList<Funcionario> funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nDados dos Funcionarios: \n" + funcionarios.toString();
    }
}
