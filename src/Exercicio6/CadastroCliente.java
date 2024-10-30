/*### Exercício 6: Cadastro de Clientes ok/OK

**Descrição:**
Faça um programa para gerenciar um cadastro de clientes.
Leia os dados de um cliente (nome, idade, email). Em seguida, mostrar os dados do cliente.
Permitir atualizar o email do cliente e mostrar novamente os dados atualizados.

**UML:**
        ```
        +----------------------+
        |        Cliente       |
        +----------------------+
        | - nome: String       |
        | - idade: int         |
        | - email: String      |
        +----------------------+
        | + Cliente(String, int, String) |
        | + atualizarEmail(String): void |
        | + toString(): String           |
        +--------------------------------+

 */
package Exercicio6;

public class CadastroCliente {

    private String nome;
    private int idade;
    private String email;

    public CadastroCliente() {

    }

    public CadastroCliente(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void alterarEmail(String alterarEmail) {
        this.email = alterarEmail;
    }

    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nEmail: " + getEmail();
    }
}
