/*
### Exercício 5: Livro e Autor OK/OK

**Descrição:**
Faça um programa para ler os dados de um livro (título, autor e preço).
Em seguida, mostrar os dados do livro e permitir alterar o preço do livro com base em uma porcentagem dada.
Mostrar novamente os dados do livro após a alteração.

**UML:**
```
+----------------------+
|        Livro         |
+----------------------+
| - titulo: String     |
| - autor: String      |
| - preco: double      |
+----------------------+
| + Livro(String, String, double) |
| + alterarPreco(double): void    |
| + toString(): String            |
+---------------------------------+
```
 */
package Exercicio5;

public class LivroAutor {
    private String titulo;
    private String autor;
    private double preco;

    public LivroAutor() {

    }

    public LivroAutor(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public String toString() {
        return  "Titulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nPreço: " + getPreco();
    }


}
