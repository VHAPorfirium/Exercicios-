package Exercicio24;

public class Conta {

    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }
    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        validarSaque(valor);
        this.saldo -= valor;
    }

    private void validarSaque(double valor) {
        if (valor > getLimiteSaque() && valor > getSaldo() + getLimiteSaque()) {
            throw new ContaExcecoes("Erro de saque: A quantia excede o limite de saque");
        }
        if (valor > getSaldo() && valor > getLimiteSaque()) {
            throw new ContaExcecoes("Erro de saque: Saldo insuficiente");
        }
    }

}
