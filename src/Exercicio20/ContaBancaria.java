package Exercicio20;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    private String tipo;

    public ContaBancaria(int numeroConta, double saldo, String tipo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double consultar() {
        return this.saldo;
    }

}
