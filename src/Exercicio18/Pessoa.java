package Exercicio18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    protected String nome;
    protected int idade;
    protected String cpf;
    protected Date dataNascimento;
    protected String sexo;
    protected String email;
    protected String telefone;

    public Pessoa(String nome, int idade, String cpf, Date dataNascimento, String sexo, String email, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.email = email;
        this.telefone = telefone;
    }

    public String toString() {
        return "Dados dos moradores cadastrados: " + "\nNome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf + "\nData de nascimento: " +  " (" + sdf.format(dataNascimento) + ") " + "\nSexo: " + sexo + "\nEmail: " + email + "\nTelefone: " + telefone + "\n";
    }

}