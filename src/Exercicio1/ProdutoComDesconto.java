/*
### Exercício 1: Produto com Desconto OK/OK

**Descrição:**
Faça um programa para ler os dados de um produto (nome, preço e desconto). Em seguida, mostrar os dados do produto (nome e preço com desconto). Em seguida, aplicar um novo desconto ao produto com base em uma porcentagem dada e mostrar novamente os dados do produto.

**UML:**
```
+--------------------+
|      Produto       |
+--------------------+
| - nome: String     |
| - preco: double    |
| - desconto: double |
+--------------------+
| + Produto(String, double, double) |
| + calcularPrecoComDesconto(): double |
| + aplicarDesconto(double): void |
| + toString(): String              |
+-----------------------------------+
```
 */
package Exercicio1;

public class ProdutoComDesconto {

    private String nome;
    private double preco;
    private double desconto;

    ProdutoComDesconto() {

    }
    ProdutoComDesconto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double calcularPrecoComDesconto() {
        return this.preco - (this.preco * this.desconto / 100);
    }

    public void aplicarDesconto(double novoDesconto) {
        this.desconto = novoDesconto;
    }


    public String toString(){
        return "Nome: " + getNome() + "\nPreço com desconto: R$ " + calcularPrecoComDesconto();
    }
}