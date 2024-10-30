/*
### Exercício 4: Biblioteca e Livros OK/OK

**Descrição:**
Faça um programa para gerenciar uma biblioteca.
Leia os dados de um livro (título, autor, ano de publicação, número de exemplares). Em seguida, mostrar os dados do livro.
Permitir adicionar e remover exemplares e mostrar novamente os dados atualizados do livro.

**UML:**
```
+-----------------------------+
|          Livro              |
+-----------------------------+
| - titulo: String            |
| - autor: String             |
| - anoPublicacao: int        |
| - numeroExemplares: int     |
+-----------------------------+
| + Livro(String, String, int, int) |
| + adicionarExemplares(int): void  |
| + removerExemplares(int): void    |
| + toString(): String              |
+-----------------------------------+
*/
package Exercicio4;

public class BibliotecaLivros {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numeroExemplares;

    public BibliotecaLivros() {

    }

    public BibliotecaLivros(String titulo, String autor, int anoPublicacao, int numeroExemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numeroExemplares = numeroExemplares;
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

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumeroExemplares() {
        return numeroExemplares;
    }
    public void setNumeroExemplares(int numeroExemplares) {
        this.numeroExemplares = numeroExemplares;
    }

    public void adicionarExemplares(int numeroExemplaresAdicionar) {
        this.numeroExemplares += numeroExemplaresAdicionar;
    }

    public void removerExemplares(int numeroExemplaresRemover) {
        if (numeroExemplaresRemover > this.numeroExemplares) {
            System.out.println("Impossivel remover essa quantidade de livros no memento.");
            System.out.println("Numero de exeplares em falta! ");
        }
        else {
            this.numeroExemplares -= numeroExemplaresRemover;
        }
    }

    public String toString() {
        return "Informações: " + "\nTitulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nAno da publicação: " + getAnoPublicacao() + "\nNumero Exemplares: " + getNumeroExemplares();
    }

}
