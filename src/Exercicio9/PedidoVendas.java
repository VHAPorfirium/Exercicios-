/*
### Exercício 9: Pedido de Venda OK/OK

**Descrição:**
Faça um programa para gerenciar pedidos de venda.
Leia os dados de um pedido (número do pedido, data, valor total).
Em seguida, mostrar os dados do pedido. Permitir aplicar um desconto de 10% se for avista
no valor total do pedido e mostrar novamente os dados do pedido.

**UML:**
```
+------------------------------+
|            Pedido            |
+------------------------------+
| - numeroPedido: int          |
| - data: String               |
| - valorTotal: double         |
+------------------------------+
| + Pedido(int, String, double) |
| + aplicarDesconto(double): void |
| + toString(): String            |
+---------------------------------+
```
*/
package Exercicio9;

public class PedidoVendas {

    private int numeroPedido;
    private String data;
    private double valorTotal;

    public PedidoVendas() {

    }

    public PedidoVendas(int numeroPedido, String data, double valorTotal) {
        this.numeroPedido = numeroPedido;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void aplicarDesconto() {
        valorTotal *= 0.90;
    }

    public String toString() {
        return "Numero do pedido: " + getNumeroPedido() + "\nData: " + getData() + "\nValor: R$" + getValorTotal();
    }
}
