/*### Exercício 7: Estoque de Produtos ok/ok

**Descrição:**
Faça um programa para gerenciar um estoque de produtos.
Leia os dados de um produto (nome, quantidade em estoque, preço de compra, preço de venda).
Em seguida, mostrar os dados do produto. Permitir atualizar o preço de venda e calcular
o lucro potencial (preço de venda - preço de compra) e mostrar novamente os dados do produto.

**UML:**
```
+------------------------------+
|          Produto             |
+------------------------------+
| - nome: String               |
| - quantidadeEstoque: int     |
| - precoCompra: double        |
| - precoVenda: double         |
+------------------------------+
| + Produto(String, int, double, double) |
| + atualizarPrecoVenda(double): void    |
| + calcularLucro(): double              |
| + toString(): String                   |
+----------------------------------------+
```
 */
package Exercicio7;

public class EstoqueProduto {

    private String nome;
    private int quantidade;
    private double precoCompra;
    private double precoVenda;

    public EstoqueProduto() {

    }

    public EstoqueProduto(String nome, int quantidade, double precoVenda, double precoCompra) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoVenda = precoVenda;
        this.precoCompra = precoCompra;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoCompra() {
        return this.precoCompra;
    }
    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return this.precoVenda;
    }
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void atualizarPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double calcularLucro(){
        return precoVenda - precoCompra;
    }

    public String toString(){
        return "Nome: " + getNome() + "\nQuantidade: " + getQuantidade() + "\nLucro: " + calcularLucro();
    }
}
