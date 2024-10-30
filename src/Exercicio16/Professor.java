package Exercicio16;

public class Professor extends Pessoa {

    protected String especializacao;

    public Professor(String nome, String cpf, int idade, String especializacao) {
        super(nome, cpf, idade);
        this.especializacao = especializacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

}
