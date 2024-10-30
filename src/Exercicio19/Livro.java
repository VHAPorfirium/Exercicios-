package Exercicio19;

public class Livro {

    private String titulo;
    private int codigo;
    private Pessoa autor;
    private String editora;
    private String edicao;
    private int ano;
    private String local;
    private String genero;

    public Livro(String titulo, int codigo, Pessoa autor, String editora, String edicao, int ano, String local, String genero) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        this.ano = ano;
        this.local = local;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Pessoa getAutor() {
        return autor;
    }
    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String toString() {
        return "Código: " + codigo + "\n" +
                "Título: " + titulo + "\n" +
                "Gênero: " + genero + "\n" +
                "Referência: " + getAutor() + " " + titulo + ". " + edicao + ", " + local + ", " + editora + ", " + ano + ".";
    }


}
