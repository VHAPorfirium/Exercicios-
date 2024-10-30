package Exercicio10;

public class ContatoTelefone {

    private String nome;
    private String telefone;
    private String email;

    public ContatoTelefone() {

    }
    public ContatoTelefone(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void atualizarTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString(){
        return "Nome: " + getNome() + "\nTelefone: " + getTelefone() + "\nEmail: " + getEmail();
    }
}
