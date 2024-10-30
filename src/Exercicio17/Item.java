package Exercicio17;

public class Item {

    protected String titulo;
    protected int ano;
    protected int tempoDuracao;
    protected String comentarios;

    public Item(String titulo, int ano, int tempoDuracao, String comentarios) {
        this.titulo = titulo;
        this.ano = ano;
        this.tempoDuracao = tempoDuracao;
        this.comentarios = comentarios;
    }

    public String toString() {
        return "Dados comuns: \n" + "Titulo: " + titulo + "\nAno: " + ano + "\nTempo de duração: " + tempoDuracao + "\nComentarios: " + comentarios + "\n";
    }

}
