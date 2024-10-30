/*
### Exercício 3: Conta Bancária OK/OK

**Descrição:**
Faça um programa para ler os dados de uma conta bancária (número da conta, nome do titular e saldo).
Em seguida, permitir depósitos e saques na conta.
Mostrar o saldo atualizado após cada operação.

**UML:**
```
+---------------------------+
|        ContaBancaria      |
+---------------------------+
| - numero: int             |
| - titular: String         |
| - saldo: double           |
+---------------------------+
| + ContaBancaria(int, String, double) |
| + depositar(double): void             |
| + sacar(double): void                 |
| + toString(): String                  |
+---------------------------------------+
*/
package Exercicio3;

public class ContaBancaria {

    private String numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria() {

    }

    public ContaBancaria(String numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo Insuficiente");
        }
        else {
            this.saldo -= valor;
        }
    }

    public String toString(){
        return "Numero conta: " + this.numeroConta + "\nTitular: " + this.nomeTitular + "\nSaldo: " + this.saldo;
    }


}
