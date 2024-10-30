package Exercicio18;

import java.util.Date;

public class Moradores extends Pessoa{

    private char bloco;
    private int Apartamento;
    private int codigoAcesso;

    public Moradores(String nome, int idade, String cpf, Date dataNascimento, String sexo, String email, String telefone, char bloco, int Apartamento, int codigoAcesso) {
        super(nome, idade, cpf, dataNascimento, sexo, email, telefone);
        this.bloco = bloco;
        this.Apartamento = Apartamento;
        this.codigoAcesso = codigoAcesso;
    }

    public char getBloco() {
        return bloco;
    }
    public void setBloco(char bloco) {
        this.bloco = bloco;
    }

    public int getApartamento() {
        return Apartamento;
    }
    public void setApartamento(int Apartamento) {
        this.Apartamento = Apartamento;
    }

    public int getCodigoAcesso() {
        return codigoAcesso;
    }
    public void setCodigoAcesso(int codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
    }

    public String toString(){
        return super.toString() + "\nDados do Morador: " + "\nBloco: " + getBloco() + "\nApartamento: " + getApartamento() + "\nCodigo Acesso: " + getCodigoAcesso();
    }

}
